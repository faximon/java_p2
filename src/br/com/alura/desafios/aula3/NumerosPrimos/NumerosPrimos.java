package br.com.alura.desafios.aula3.NumerosPrimos;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) {
        if (numero < 2) {
            return false;
        }

        boolean EhPrimo = true;
        double raizQuadrada = Math.sqrt(numero);

        for (int i = 2; i <=  raizQuadrada ; i++) {
            if (numero % i == 0) {
                EhPrimo = false;
                break;
            }
        }

        return EhPrimo;
    }

    public void listarPrimos(int numero) {
        System.out.println("Listando números primos até "+numero);

        if (numero < 2) {
            System.out.println("Digite um número acima de 2.");;
        }

        for (int i = 2; i <= numero ; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
