package loja.orcamento;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.Finalizado;
import loja.orcamento.situacao.Situacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
    private BigDecimal valor;
    private Situacao situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public void adicionarItem(Orcavel item) {
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }

    public void aplicarDescontoAdicional() {
        BigDecimal valorDescontoAdicional = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoAdicional);
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "valor=" + valor +
                ", quantidadeItens=" + itens.size() +
                ", situacao=" + situacao +
                '}';
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }
}
