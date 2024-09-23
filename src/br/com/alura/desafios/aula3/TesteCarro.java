package br.com.alura.desafios.aula3;

import br.com.alura.desafios.aula3.Carros.ModeloCarro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(15000, 28000, 49000);
        meuCarro.exibirInfo();
    }
}