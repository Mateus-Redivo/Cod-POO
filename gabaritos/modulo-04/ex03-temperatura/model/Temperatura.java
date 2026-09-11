package model;

public class Temperatura {

    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    // Nao existe atributo "fahrenheit": o valor e calculado toda vez que alguem pede
    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // O mesmo vale para kelvin
    public double getKelvin() {
        return celsius + 273.15;
    }

    public void setCelsius(double novoCelsius) {
        this.celsius = novoCelsius;
    }

    @Override
    public String toString() {
        return "Temperatura [celsius=" + getCelsius() + ", fahrenheit=" + getFahrenheit()
                + ", kelvin=" + getKelvin() + "]";
    }
}
