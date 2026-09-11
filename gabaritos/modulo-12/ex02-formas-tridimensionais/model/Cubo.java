package model;

public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }

    @Override
    public double calcularAreaSuperficie() {
        return 6 * lado * lado;
    }
}
