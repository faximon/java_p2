package br.com.alura.desafios.aula3.Animais;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Auauau");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo...");
    }
}
