package loja.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    // construtor com injeção de dependências
    public GerarPedidoHandler(/* ... */) {
        // ...
    }

    public void executar(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Pedido gerado com sucesso!");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Data: " + pedido.getData());
        System.out.println("Valor: " + pedido.getOrcamento().getValor());
        System.out.println("Quantidade de itens: " + pedido.getOrcamento().getQuantidadeItens());
    }

}
