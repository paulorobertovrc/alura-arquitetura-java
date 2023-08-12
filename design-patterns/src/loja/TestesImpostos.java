package loja;

import loja.imposto.CalculadoraImpostos;
import loja.imposto.Icms;
import loja.imposto.Iss;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        System.out.println(calculadora.calcular(orcamento, new Iss(null)));
        System.out.println(calculadora.calcular(orcamento, new Icms(null)));

        System.out.println(calculadora.calcular(orcamento, new Iss(new Icms(null))));
        System.out.println(calculadora.calcular(orcamento, new Icms(new Iss(null))));
    }

}
