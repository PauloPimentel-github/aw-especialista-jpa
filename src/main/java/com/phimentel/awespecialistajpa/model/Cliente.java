package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.GeneroCliente;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String nome;

    @Transient
    private String primeiroNome;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero_cliente")
    private GeneroCliente generoCliente;

    @ElementCollection
    @CollectionTable(name = "cliente_contato",
            joinColumns = @JoinColumn(name = "cliente_id"))
    @MapKeyColumn(name = "tipo")
    @Column(name = "descricao")
    private Map<String, String> contatos;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    @PostLoad
    public void configurarPrimeiroNome() {
        if (nome != null && !nome.isBlank()) {
            int index = nome.indexOf(" ");
            if (index > -1) {
                this.primeiroNome = nome.substring(0, index);
            }
        }
    }
}
