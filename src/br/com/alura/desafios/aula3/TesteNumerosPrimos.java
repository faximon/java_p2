package br.com.alura.desafios.aula3;

import br.com.alura.desafios.aula3.NumerosPrimos.GeradorPrimo;
import br.com.alura.desafios.aula3.NumerosPrimos.NumerosPrimos;
import br.com.alura.desafios.aula3.NumerosPrimos.VerificadorPrimo;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(97);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(50);
    }
}
