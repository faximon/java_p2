package br.com.alura.desafios.aula4;

import br.com.alura.desafios.aula4.ConversorMoedas.ConversorMoeda;

public class TesteConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println("O valor em reais é: R$ " + conversor.converterDolarParaReal(50));
    }
}
