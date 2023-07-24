package com.phimentel.awespecialistajpa.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPedidoId implements Serializable {

    @EqualsAndHashCode.Include
    private Long pedidoId;

    @EqualsAndHashCode.Include
    private Long produtoId;
}
