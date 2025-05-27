package Calculadora;

// Sobrescrita de métodos
public class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public void descricao() {
        System.out.println("Este é um retângulo de " + largura + "x" + altura);
    }
}