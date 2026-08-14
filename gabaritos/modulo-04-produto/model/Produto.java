package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void vender(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade de venda deve ser positiva.");
            return;
        }
        // "SE a quantidade pedida for menor ou igual ao estoque, vende; SENÃO, avisa"
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Vendidas " + qtd + " unidades de " + nome + ".");
        } else {
            System.out.println("Nao ha estoque suficiente de " + nome
                    + " (disponivel: " + quantidade + ", pedido: " + qtd + ").");
        }
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
