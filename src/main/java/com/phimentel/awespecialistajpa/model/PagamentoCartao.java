package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.StatusPagamento;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "pagamentos_cartao")
public class PagamentoCartao {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento")
    private StatusPagamento statusPagamento;

    private String numero;
}
