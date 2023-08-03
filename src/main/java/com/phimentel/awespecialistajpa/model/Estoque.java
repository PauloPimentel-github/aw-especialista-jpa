package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "estoques")
public class Estoque extends EntidadeBaseLong{

    private Integer quantidade;

    @OneToOne(optional = false)
    @JoinColumn(name = "produto_id")
    private Produto produto;
}
