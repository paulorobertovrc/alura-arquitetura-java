package loja;

import loja.desconto.CalculadoraDescontos;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 2);

        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));
    }

}
