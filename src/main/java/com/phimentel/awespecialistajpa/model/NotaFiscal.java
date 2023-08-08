package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "notas_fiscal")
public class NotaFiscal extends EntidadeBaseLong {

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "pedido_id", nullable = false, foreignKey = @ForeignKey(name = "fk_nota_fiscal_pedido"))
    private Pedido pedido;

    @Lob
    @Column(nullable = false)
    private byte[] xml;

    @Column(name = "data_emissao", nullable = false)
    private Date dataEmissao;
}
