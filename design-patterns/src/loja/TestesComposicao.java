package loja;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);
        orcamentoNovo.aprovar();

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);

        System.out.println(proxy.getValor());
    }

}
