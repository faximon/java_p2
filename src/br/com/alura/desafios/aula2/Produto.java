package br.com.alura.desafios.aula2;

public class Produto {
    private String nome;
    private double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double valorPercentual){
        double desconto = preco * (valorPercentual / 100);
        preco -= desconto;
    }
}
