package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.GeneroCliente;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "genero_cliente")
    private GeneroCliente generoCliente;
}
