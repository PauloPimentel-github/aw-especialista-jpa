package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "produtos")
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;
}
