package model;

public class Pizza {

    private String sabor;
    private String tamanho;
    private int quantidadeFatias;

    public Pizza(String sabor, String tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.quantidadeFatias = calcularFatias(tamanho);
    }

    public Pizza(String sabor) {
        this.sabor = sabor;
        this.tamanho = "media";
        this.quantidadeFatias = calcularFatias("media");
    }

    public Pizza() {
        this.sabor = "Mussarela";
        this.tamanho = "media";
        this.quantidadeFatias = calcularFatias("media");
    }

    private int calcularFatias(String tamanho) {
        if (tamanho.equals("pequena")) {
            return 4;
        } else if (tamanho.equals("grande")) {
            return 8;
        }
        return 6; // media, e tambem o padrao se vier algo inesperado
    }

    // Metodo comum que devolve um valor -- ainda nao e o "getter" formal do modulo 04
    public int obterQuantidadeFatias() {
        return quantidadeFatias;
    }

    public void exibirDados() {
        System.out.println("Pizza: " + sabor + " | Tamanho: " + tamanho + " | Fatias: " + quantidadeFatias);
    }
}
