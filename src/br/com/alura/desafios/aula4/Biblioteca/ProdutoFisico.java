package br.com.alura.desafios.aula4.Biblioteca;

public class ProdutoFisico implements Calculavel{
    protected int preco;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
