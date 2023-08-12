package loja.orcamento.situacao;

import loja.DomainException;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("A situação atual do projeto não permite que seja APROVADO!");
    }
    public void reprovar(Orcamento orcamento) {
        throw new DomainException("A situação atual do projeto não permite que seja REPROVADO!");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainException("A situação atual do projeto não permite que seja FINALIZADO!");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
