package br.com.alura.desafios.aula4;

import br.com.alura.desafios.aula4.Venda.Produto;
import br.com.alura.desafios.aula4.Venda.Servico;

public class TesteProdutoServico {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Brinquedo");
        produto.setPrecoUnitario(15);
        System.out.println(produto.calcularPrecoTotal(20));
        produto.aplicarDesconto(25);

        System.out.println();
        Servico servico = new Servico();
        servico.setDescricao("Elétrica");
        servico.setPrecoHora(80);
        System.out.println(servico.calcularPrecoTotal(5));
        servico.aplicarDesconto(10);
    }
}
