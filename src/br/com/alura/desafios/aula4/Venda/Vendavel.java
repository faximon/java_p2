package br.com.alura.desafios.aula4.Venda;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
