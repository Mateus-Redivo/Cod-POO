package model;

public class Cilindro extends FormaTridimensional {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        super("Cilindro");
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    @Override
    public double calcularAreaSuperficie() {
        return 2 * Math.PI * raio * (raio + altura);
    }
}
