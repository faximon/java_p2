package br.com.alura.desafios.aula3;

import br.com.alura.desafios.aula3.Animais.Cachorro;
import br.com.alura.desafios.aula3.Animais.Gato;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
