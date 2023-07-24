package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@IdClass(ItemPedidoId.class)
@Entity
@Table(name = "itens_pedido")
public class ItemPedido {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "pedido_id")
    private Long pedidoId;

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "produto_id")
    private Long produtoId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido_id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id", insertable = false, updatable = false)
    private Produto produto;

    @Column(name = "preco_produto")
    private BigDecimal precoProduto;

    private Integer quantidade;
}
