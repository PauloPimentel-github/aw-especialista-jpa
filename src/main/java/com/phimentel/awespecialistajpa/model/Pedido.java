package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.StatusPedido;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido extends EntidadeBaseLong {

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pedido_cliente"))
    private Cliente cliente;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    @OneToOne(mappedBy = "pedido")
    private NotaFiscal notaFiscal;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pedido", length = 30, nullable = false)
    private StatusPedido statusPedido;

    @Column(name = "data_criacao", updatable = false, nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_ultima_atualizacao", insertable = false)
    private LocalDateTime dataUltimaAtualizacao;

    @Embedded
    private EnderecoEntregaPedido enderecoEntregaPedido;

    @OneToMany(mappedBy = "pedido")
    private Set<ItemPedido> itens;

    @OneToOne(mappedBy = "pedido")
    private Pagamento pagamento;
}
