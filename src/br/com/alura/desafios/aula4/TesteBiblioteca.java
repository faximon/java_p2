package br.com.alura.desafios.aula4;

import br.com.alura.desafios.aula4.Biblioteca.Livro;
import br.com.alura.desafios.aula4.Biblioteca.ProdutoFisico;

public class TesteBiblioteca {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(10);
        Livro livro = new Livro();
        livro.setPreco(10);

        System.out.println(produtoFisico.calcularPrecoFinal());
        System.out.println(livro.calcularPrecoFinal());
    }
}
