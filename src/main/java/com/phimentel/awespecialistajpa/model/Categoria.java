package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "categorias")
public class Categoria extends EntidadeBaseLong {

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_pai_id")
    private Categoria categoriaPai;

    @OneToMany(mappedBy = "categoriaPai")
    private Set<Categoria> categorias;

    @ManyToMany(mappedBy = "categorias")
    private Set<Produto> produtos;
}
