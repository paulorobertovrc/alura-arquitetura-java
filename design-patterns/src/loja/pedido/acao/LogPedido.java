package loja.pedido.acao;

import loja.pedido.Pedido;

public class LogPedido implements AcaoPosPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("[LOG]Pedido gerado: " + pedido);
    }

}
