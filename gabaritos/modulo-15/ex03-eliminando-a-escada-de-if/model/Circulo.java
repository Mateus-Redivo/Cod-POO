package model;

public class Circulo extends Forma {
    public Circulo(double raio) {
        super(raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * medida * medida;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * medida;
    }
}
