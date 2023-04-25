package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "notas_fiscal")
public class NotaFiscal {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    private String xml;

    @Column(name = "data_emissao")
    private Date dataEmissao;
}
