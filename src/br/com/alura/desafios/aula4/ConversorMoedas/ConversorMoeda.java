package br.com.alura.desafios.aula4.ConversorMoedas;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        double cotacaoAtual = 5.54;
        double valorEmReal = valorEmDolar * cotacaoAtual;
        return valorEmReal;
    }
}
