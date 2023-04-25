package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.GeneroCliente;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String nome;

    @Column(name = "genero_cliente")
    private GeneroCliente generoCliente;
}
