package br.com.alura.desafios.aula4.Biblioteca;

public class Livro extends ProdutoFisico implements  Calculavel{
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
