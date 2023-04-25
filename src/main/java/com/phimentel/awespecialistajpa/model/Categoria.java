package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "categorias")
public class Categoria {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String nome;

    @Column(name = "categoria_pai_id")
    private Long categoriaPaiId;
}
