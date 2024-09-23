package br.com.alura.desafios.aula3.Carros;

public class ModeloCarro extends Carro{

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Variavel de teste pra informação extra");
    }
}
