package sobre.model;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    // Construtor
    public Retangulo(double largura, double altura, String cor) {
        super("Retangulo", cor); // Chama construtor da classe pai
        this.largura = largura;
        this.altura = altura;
    }
    
    // Sobrescrita
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    // Sobrescrita
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    // Sobrescrita
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama metodo da classe pai
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("========================");
    }
    
    // Exemplo de Sobrecarga (Overload)

    // Metodo redimensionar com dois parametros
    public void redimensionar(double novaLargura, double novaAltura) {
        this.largura = novaLargura;
        this.altura = novaAltura;
        System.out.println("Retangulo redimensionado para: " + largura + " x " + altura);
    }
    
    // Metodo redimensionar com um parametro - Sobrecarga do metodo acima
    public void redimensionar(double fatorEscala) {
        this.largura *= fatorEscala;
        this.altura *= fatorEscala;
        System.out.println("Retangulo redimensionado por fator " + fatorEscala + 
                         " para: " + largura + " x " + altura);
    }
    
    // Getters especificos
    public double getLargura() {
        return largura;
    }
    
    public double getAltura() {
        return altura;
    }
}
