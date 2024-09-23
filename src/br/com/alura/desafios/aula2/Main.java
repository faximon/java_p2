package br.com.alura.desafios.aula2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(666);
        contaBancaria.setSaldo(5000);
        contaBancaria.setTitular("Vitor");

        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        System.out.println("Titular: " + contaBancaria.getTitular());

        contaBancaria.setSaldo(5500);
        System.out.println("Novo saldo: " + contaBancaria.getSaldo());


        System.out.println("=====================================================");


        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Honan");
        idadePessoa.setIdade(39);

        System.out.println("Nome pessoa: " + idadePessoa.getNome());
        System.out.println("Idade pessoa: " + idadePessoa.getIdade());
        idadePessoa.verificarIdade(idadePessoa.getIdade());


        System.out.println("=====================================================");


        Produto produto1 = new Produto("Carro", 4000);
        Produto produto2 = new Produto("Avião", 18000);

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        produto1.aplicarDesconto(10);
        System.out.println("Novo preço após desconto: " + produto1.getPreco());

        System.out.println("Nome do produto: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        produto2.aplicarDesconto(45);
        System.out.println("Novo preço após desconto: " + produto2.getPreco());


        System.out.println("=====================================================");


        Aluno aluno1 = new Aluno("Martchelo", 7,4,8,6);
        Aluno aluno2 = new Aluno("Castelo", 10, 7, 6, 6);

        System.out.println("O aluno " + aluno1.getNome() + " com as notas: \n"
                + aluno1.getNota1() + ",\n"
                + aluno1.getNota2() + ",\n"
                + aluno1.getNota3() + ",\n"
                + aluno1.getNota4() + ",\n"
                + "Alcancou a média de: " +aluno1.calcularMedia() + ".");
        System.out.println("O aluno " + aluno2.getNome() + " com as notas: \n"
                + aluno2.getNota1() + ",\n"
                + aluno2.getNota2() + ",\n"
                + aluno2.getNota3() + ",\n"
                + aluno2.getNota4() + ",\n"
                + "Alcancou a média de: " +aluno2.calcularMedia() + ".");


        System.out.println("=====================================================");


        Livro livro1 = new Livro("Só sei que nada sei", "Joãozinho");
        Livro livro2 = new Livro("Sei de tudo e mais um pouco", "Mariazinha");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
