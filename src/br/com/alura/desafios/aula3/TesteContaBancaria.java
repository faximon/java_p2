package br.com.alura.desafios.aula3;

import br.com.alura.desafios.aula3.Banco.ContaBancaria;
import br.com.alura.desafios.aula3.Banco.ContaCorrente;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1500);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(500);
        contaCorrente.cobrarTarifaMensal(5);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(200);
        contaCorrente.consultarSaldo();
    }
}
