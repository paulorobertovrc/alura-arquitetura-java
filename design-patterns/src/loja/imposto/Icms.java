package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Icms extends Imposto {

    public Icms(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
