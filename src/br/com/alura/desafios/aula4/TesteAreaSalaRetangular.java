package br.com.alura.desafios.aula4;

import br.com.alura.desafios.aula4.AreaGeométrica.CalculadoraSalaRetangular;

public class TesteAreaSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(10,5);
        calculadora.calcularPerimetro(20,20);
    }
}
