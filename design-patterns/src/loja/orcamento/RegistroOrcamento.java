package loja.orcamento;

import loja.DomainException;
import loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private final HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {

        if (!orcamento.isFinalizado()) {
            throw new DomainException("O orçamento não foi finalizado!");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
            "valor", orcamento.getValor(),
            "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }

}
