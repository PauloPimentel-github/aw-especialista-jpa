package com.phimentel.awespecialistajpa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

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

    private Integer pedidoId;

    private String xml;

    private Date dataEmissao;
}
