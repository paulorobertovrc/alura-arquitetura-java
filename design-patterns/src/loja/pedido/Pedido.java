package loja.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;

        System.out.println("Pedido gerado com sucesso!");
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", data=" + data +
                ", orcamento=" + orcamento +
                '}';
    }

}
