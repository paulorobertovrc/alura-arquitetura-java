package loja;

import loja.pedido.GerarPedido;
import loja.pedido.GerarPedidoHandler;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.LogPedido;
import loja.pedido.acao.SalvarPedidoBanco;

import java.math.BigDecimal;
import java.util.List;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = BigDecimal.valueOf(Double.parseDouble(args[1]));
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                List.of(new SalvarPedidoBanco(),
                        new EnviarEmailPedido(),
                        new LogPedido())
        );

        handler.executar(gerador); // Facade
    }

}
