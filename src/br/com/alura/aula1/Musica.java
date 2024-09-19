package br.com.alura.aula1;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacoes;
    int totalAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avaliaMusica(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}