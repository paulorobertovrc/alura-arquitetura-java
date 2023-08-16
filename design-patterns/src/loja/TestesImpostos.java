package loja;

import loja.imposto.CalculadoraImpostos;
import loja.imposto.Icms;
import loja.imposto.Iss;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        System.out.println("ISS: " + calculadora.calcular(orcamento, new Iss(null)));
        System.out.println("ICMS: " + calculadora.calcular(orcamento, new Icms(null)));

        System.out.println("ISS + ICMS: " + calculadora.calcular(orcamento, new Iss(new Icms(null))));
        System.out.println("ICMS + ISS: " + calculadora.calcular(orcamento, new Icms(new Iss(null))));
    }

}
