package br.com.alura.desafios.aula4.Temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        double resultado = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A conversão é de " + temperaturaCelsius + "ºC para " + resultado + "ºF.");
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        double resultado = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("A conversão é de " + temperaturaFahrenheit + "ºF para " + resultado + "ºC.");

    }
}
