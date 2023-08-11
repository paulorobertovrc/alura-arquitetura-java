package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

        protected Desconto proximo;

        public Desconto(Desconto proximo) {
            this.proximo = proximo;
        }

        protected BigDecimal calcular(Orcamento orcamento) {
                if(deveAplicarDesconto(orcamento)) {
                        return efetuarCalculo(orcamento);
                }

                return proximo.calcular(orcamento);
        }

        protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
        public abstract boolean deveAplicarDesconto(Orcamento orcamento);

}
