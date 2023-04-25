package com.phimentel.awespecialistajpa.model;

import com.phimentel.awespecialistajpa.model.enums.StatusPagamento;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "pagamentos_cartao")
public class PagamentoCartao {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private Integer pedidoId;

    private StatusPagamento statusPagamento;

    private String numero;
}
