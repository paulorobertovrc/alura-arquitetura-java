package loja;

import loja.desconto.CalculadoraDescontos;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundoOrcamento = new Orcamento();
        segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento terceiroOrcamento = new Orcamento();
        terceiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));
    }

}
