package br.com.alura.desafios.aula4.Temperatura;

public class TesteConversorTemperaturaPadrao {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(30);
        conversor.fahrenheitParaCelsius(68);
    }
}
