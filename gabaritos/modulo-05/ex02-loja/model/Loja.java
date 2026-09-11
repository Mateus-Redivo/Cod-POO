package model;

public class Loja {

    private String nome;
    private Produto produto1;
    private Produto produto2;

    public Loja(String nome, Produto produto1, Produto produto2) {
        this.nome = nome;
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    public void venderUnidades(Produto produto, int quantidade) {
        if (quantidade > produto.getQuantidadeEmEstoque()) {
            System.out.println("Venda recusada: estoque insuficiente de " + produto.getNome()
                    + " (disponivel: " + produto.getQuantidadeEmEstoque() + ", pedido: " + quantidade + ").");
            return;
        }
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
        double total = produto.getPreco() * quantidade;
        System.out.println("Vendidas " + quantidade + " unidades de " + produto.getNome() + ". Total: " + total);
    }

    public void exibirEstoque() {
        System.out.println("--- Estoque de " + nome + " ---");
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
