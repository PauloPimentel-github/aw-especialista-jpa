package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.GeneroCliente;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@SecondaryTable(name = "cliente_detalhe",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "cliente_id"),
        foreignKey = @ForeignKey(name = "fk_cliente_detalhe_cliente"))
@Entity
@Table(name = "clientes",
        uniqueConstraints = { @UniqueConstraint(name = "unq_cpf", columnNames = { "cpf" }) },
        indexes = { @Index(name = "idx_nome", columnList = "nome") })
public class Cliente extends EntidadeBaseLong {

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 11, nullable = false)
    private String cpf;

    @Transient
    private String primeiroNome;

    @Enumerated(EnumType.STRING)
    @Column(table = "cliente_detalhe", name = "genero_cliente", length = 30, nullable = false)
    private GeneroCliente generoCliente;

    @Column(name = "data_nascimento", table = "cliente_detalhe")
    private LocalDate dataNascimento;

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
