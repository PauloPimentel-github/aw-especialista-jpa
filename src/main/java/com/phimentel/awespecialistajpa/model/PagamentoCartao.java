package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@DiscriminatorValue("cartao")
@Entity
//@Table(name = "pagamentos_cartao")
public class PagamentoCartao extends Pagamento {

    @Column(name = "numero_cartao")
    private String numeroCartao;
}
