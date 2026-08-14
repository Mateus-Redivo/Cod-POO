package model;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String cor) {
        super("Circulo", cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raio: " + raio);
        System.out.println("========================");
    }

    public double getRaio() {
        return raio;
    }
}
