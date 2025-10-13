package sobre.model;

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
        super.exibirInfo(); // Chama metodo da classe pai
        System.out.println("Raio: " + raio);
        System.out.println("========================");
    }

    // Exemplo de Sobrecarga (Overload)

    // Metodo redimensionar com um parametro
    public void redimensionar(double novoRaio) {
        this.raio = novoRaio;
        System.out.println("Circulo redimensionado para raio: " + raio);
    }

    // Metodo redimensionar com dois parametros - Sobrecarga do metodo acima
    public void redimensionar(double fatorEscala, boolean manterProporcao) {
        if (manterProporcao) {
            this.raio *= fatorEscala;
            System.out.println("Circulo redimensionado por fator " + fatorEscala + " para raio: " + raio);
        } else {
            System.out.println("Operacao nao aplicavel para circulos (sempre mantem proporcao)");
        }
    }

    // Getter especifico
    public double getRaio() {
        return raio;
    }
}
