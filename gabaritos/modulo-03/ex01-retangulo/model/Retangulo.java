package model;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Sobrecarga: um valor so, vira quadrado
    public Retangulo(double lado) {
        this.largura = lado;
        this.altura = lado;
    }

    // Sobrecarga: sem parametros, valores padrao
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void exibirDados() {
        System.out.println("Retangulo [largura=" + largura + ", altura=" + altura
                + ", area=" + calcularArea() + ", perimetro=" + calcularPerimetro() + "]");
    }
}
