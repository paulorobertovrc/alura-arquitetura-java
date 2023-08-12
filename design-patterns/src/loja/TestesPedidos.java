package loja;

import loja.pedido.GerarPedidoHandler;
import loja.pedido.GerarPedido;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = BigDecimal.valueOf(Double.parseDouble(args[1]));
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(/* dependências */);
        handler.executar(gerador);
    }

}
