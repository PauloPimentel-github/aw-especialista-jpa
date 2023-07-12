package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "produtos")
public class Produto {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    @OneToMany(mappedBy = "produto")
    private Set<ItemPedido> itens;
}
