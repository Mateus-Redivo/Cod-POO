package model;

public class Circulo extends Forma {
    private double raio;

    // Construtor
    public Circulo(double raio, String cor) {
        super("Circulo", cor); // Chama construtor da classe pai
        this.raio = raio;
    }

    // Sobrescrita
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Sobrescrita
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Sobrescrita
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama método da classe pai
        System.out.println("Raio: " + raio);
        System.out.println("========================");
    }

    // Exemplo de Sobrecarga (Overload)

    // Método redimensionar com um parâmetro
    public void redimensionar(double novoRaio) {
        this.raio = novoRaio;
        System.out.println("Circulo redimensionado para raio: " + raio);
    }

    // Método redimensionar com dois parâmetros - Sobrecarga do método acima
    public void redimensionar(double fatorEscala, boolean manterProporcao) {
        if (manterProporcao) {
            this.raio *= fatorEscala;
            System.out.println("Circulo redimensionado por fator " + fatorEscala + " para raio: " + raio);
        } else {
            System.out.println("Operacao nao aplicavel para circulos (sempre mantem proporcao)");
        }
    }

    // Getter específico
    public double getRaio() {
        return raio;
    }
}
