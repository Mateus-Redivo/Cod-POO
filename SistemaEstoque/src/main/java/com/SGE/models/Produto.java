package main.java.com.SGE.models;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + nome);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque");
        }
    }
    
    public boolean removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque de " + nome);
            return true;
        } else {
            System.out.println("Quantidade inválida ou insuficiente para remover do estoque");
            return false;
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
