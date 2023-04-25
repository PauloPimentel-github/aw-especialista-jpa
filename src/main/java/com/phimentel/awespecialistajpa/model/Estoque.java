package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "estoques")
public class Estoque {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private Integer quantidade;

    private Integer produtoId;
}
