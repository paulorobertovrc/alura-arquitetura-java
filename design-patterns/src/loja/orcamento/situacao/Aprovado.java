package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return new BigDecimal("0.02");
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
