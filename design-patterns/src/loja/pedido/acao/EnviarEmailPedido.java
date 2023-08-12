package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoPosPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail com os dados do pedido...");
        System.out.println(pedido);
        System.out.println();
    }

}
