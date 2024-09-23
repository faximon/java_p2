package br.com.alura.desafios.aula3.Banco;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal(double tarifaMensal) {
        saldoCliente -= tarifaMensal;
        System.out.println("Tarifa mensal de R$ " + tarifaMensal + " foi cobrada.");
    }
}
