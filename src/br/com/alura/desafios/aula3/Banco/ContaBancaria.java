package br.com.alura.desafios.aula3.Banco;

public class ContaBancaria {
    protected double saldoCliente;

    public void depositar(double valorParaDepositar){
        if (valorParaDepositar > 0) {
            saldoCliente += valorParaDepositar;
            System.out.println("R$" + valorParaDepositar + " foi depositado na conta.");
        } else {
            System.out.println("Impossível depositar um valor negativo. Tente novamente");
        }
    }

    public void sacar(double valorParaSacar) {
        if (saldoCliente >= valorParaSacar) {
            saldoCliente -= valorParaSacar;
            System.out.println("O valor R$ " + valorParaSacar + " foi sacado da conta.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldoCliente);
    }
}
