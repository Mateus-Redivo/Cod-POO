package model;

//Classe base para construir formas geometricas
public abstract class Forma {
    protected String nome;
    protected String cor;

    // Construtor protegido para evitar instância direta
    protected Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Métodos abstratos: a Forma genérica NÃO SABE calcular área nem perímetro.
    // Cada classe filha (Circulo, Retangulo...) é OBRIGADA a implementar os dois.
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Exemplo de Sobrecarga (overload)

    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println(nome + " foi pintado(a) de " + novaCor);
    }

    // Método pintar sem parâmetro - Sobrecarga do método acima
    public void pintar() {
        this.cor = "Branco";
        System.out.println(nome + " foi pintado(a) de Branco (cor padrao)");
    }

    // Método que pode ser sobrescrito
    public void exibirInfo() {
        System.out.println("=== Informacoes da Forma ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calcularPerimetro()));
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}
