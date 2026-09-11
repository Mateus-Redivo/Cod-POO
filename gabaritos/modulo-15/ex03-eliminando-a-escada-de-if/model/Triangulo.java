package model;

// Adicionada no passo 6 do exercicio, sem tocar em Forma, Circulo,
// Quadrado nem no laço do main -- a prova de que o "cheiro" sumiu.
public class Triangulo extends Forma {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super(base); // "medida" herdada nao e usada aqui, o triangulo tem seus proprios campos
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
