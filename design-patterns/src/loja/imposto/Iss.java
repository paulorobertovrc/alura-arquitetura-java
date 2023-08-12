package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Iss extends Imposto {

    public Iss(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
