package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.StatusPagamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@DiscriminatorColumn(name = "tipo_pagamento", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table(name = "pagamento")
public abstract class Pagamento extends EntidadeBaseLong {

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "pedido_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pagamento_pedido"))
    private Pedido pedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento", length = 30, nullable = false)
    private StatusPagamento statusPagamento;
}
