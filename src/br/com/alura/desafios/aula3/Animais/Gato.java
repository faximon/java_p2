package br.com.alura.desafios.aula3.Animais;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miaaau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando os móveis....");
    }
}
