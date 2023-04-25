package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.StatusPagamento;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "pagamentos_boleto")
public class PagamentoBoleto {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private Integer pedidoId;

    private StatusPagamento statusPagamento;

    private String codigoBarras;
}
