package loja.pedido;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoPosPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcaoPosPedido> acoes;

    public GerarPedidoHandler(List<AcaoPosPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GerarPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executar(pedido));
    }

}
