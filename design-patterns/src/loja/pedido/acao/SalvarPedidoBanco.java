package loja.pedido.acao;

import loja.pedido.Pedido;

public class SalvarPedidoBanco implements AcaoPosPedido {

    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados...");
        System.out.println(pedido);
        System.out.println();
    }

}
