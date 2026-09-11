package model;

public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    @Override
    public double calcularAreaSuperficie() {
        return 4 * Math.PI * raio * raio;
    }
}
