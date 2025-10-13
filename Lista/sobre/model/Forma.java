package sobre.model;

//Classe base para construir formas geometricas
public abstract class Forma {
    protected String nome;
    protected String cor;

    // Construtor protegido para evitar instancia direta
    protected Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Metodo abstrato que deve ser implementado nas classes filhas
    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }

    // Exemplo de Sobrecarga (overload)

    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println(nome + " foi pintado(a) de " + novaCor);
    }

    // Metodo pintar sem parametro - Sobrecarga do metodo acima
    public void pintar() {
        this.cor = "Branco";
        System.out.println(nome + " foi pintado(a) de Branco (cor padrao)");
    }

    // Metodo que pode ser sobrescrito
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
