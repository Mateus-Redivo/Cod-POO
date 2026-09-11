package app;

import model.Temperatura;

public class TesteTemperatura {

    public static void main(String[] args) {
        Temperatura t = new Temperatura(25.0);

        System.out.println(t);
        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
        System.out.println("Kelvin: " + t.getKelvin());

        t.setCelsius(0.0);
        System.out.println();
        System.out.println("Apos setCelsius(0.0):");
        System.out.println(t);
    }
}
