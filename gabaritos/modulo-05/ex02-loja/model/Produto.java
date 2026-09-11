package model;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome.isEmpty() ? "Sem nome" : nome;
        this.preco = 0.01;
        this.quantidadeEmEstoque = 0;

        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: preco invalido (" + preco + "). Deve ser maior que zero.");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            System.out.println("Erro: quantidade invalida (" + quantidadeEmEstoque + "). Nao pode ser negativa.");
            return;
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidadeEmEstoque=" + quantidadeEmEstoque + "]";
    }
}
