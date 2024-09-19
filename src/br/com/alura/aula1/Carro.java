package br.com.alura.aula1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }

    int calculaAno(int anoAtual) {
        return anoAtual - ano;
    }
}
