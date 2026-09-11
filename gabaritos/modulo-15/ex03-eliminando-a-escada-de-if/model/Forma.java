package model;

public abstract class Forma {
    protected double medida;

    public Forma(double medida) {
        this.medida = medida;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
