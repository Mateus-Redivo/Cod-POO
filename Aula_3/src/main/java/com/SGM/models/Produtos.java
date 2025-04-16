package main.java.com.SGM.models;

public class Produtos{

    private int idProduto;
    private String descricao;
    private float preco;
    private int quantidade;

    public Produtos(int idProduto, String descricao, float preco, int quantidade) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
}