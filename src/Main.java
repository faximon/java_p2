public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        pessoa.enviaMensagem();

        System.out.println(calculadora.dobraNumeroRecebido(5));

        musica.titulo = "Sweet Kiss of Death";
        musica.artista = "The Reaper";
        musica.anoDeLancamento = 1666;

        musica.exibeFichaTecnica();
        musica.avaliaMusica(9.3);
        musica.avaliaMusica(4.1);
        musica.avaliaMusica(10);
        System.out.println("Média de avaliações da música: " + musica.pegaMedia());

        carro.modelo = "Fiat";
        carro.ano = 2020;
        carro.cor = "Vermelho";
        carro.exibeFichaTecnica();
        System.out.println("Idade do carro em anos: "+carro.calculaAno(2024));

        aluno.nome = "Vitor";
        aluno.idade = 28;
        aluno.informacoesAluno();
    }
}