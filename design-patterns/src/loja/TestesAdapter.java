package loja;

import loja.http.JavaHttpClient;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }

}
