package com.phimentel.awespecialistajpa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@DiscriminatorValue("boleto")
@Entity
//@Table(name = "pagamentos_boleto")
public class PagamentoBoleto extends Pagamento {

    @Column(name = "codigo_barras")
    private String codigoBarras;
}
