package model;

public class Quadrado extends Forma {
    public Quadrado(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return medida * medida;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * medida;
    }
}
