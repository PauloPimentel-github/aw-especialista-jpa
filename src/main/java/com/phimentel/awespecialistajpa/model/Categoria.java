package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "categorias",
        uniqueConstraints = { @UniqueConstraint(name = "unq_nome", columnNames = { "nome" }) })
public class Categoria extends EntidadeBaseLong {

    @Column(length = 100, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_pai_id", foreignKey = @ForeignKey(name = "fk_categoria_categoriapai"))
    private Categoria categoriaPai;

    @OneToMany(mappedBy = "categoriaPai")
    private Set<Categoria> categorias;

    @ManyToMany(mappedBy = "categorias")
    private Set<Produto> produtos;
}
