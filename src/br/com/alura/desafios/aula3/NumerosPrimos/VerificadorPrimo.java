package br.com.alura.desafios.aula3.NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificaSeEhPrimo(int numeroParaVerificar) {
        if (verificarPrimalidade(numeroParaVerificar)) {
            System.out.println(numeroParaVerificar + " é primo");
        } else {
            System.out.println(numeroParaVerificar + " não é primo.");
        }
    }
}
