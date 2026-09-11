package model;

public class Jogo {

    private String titulo;
    private String genero;
    private double preco;
    private int quantidade;

    public Jogo(String titulo, String genero, double preco, int quantidade) {
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDados() {
        System.out.println(titulo + " | " + genero + " | R$ " + preco + " | qtd: " + quantidade);
    }
}
