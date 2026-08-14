package model;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor) {
        super("Retangulo", cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("========================");
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
