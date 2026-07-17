package model;

public class ItemVenda {
    // Os numeros magicos do codigo original, agora constantes com nome
    private static final double DESCONTO_GENERICO = 0.20;
    private static final double DESCONTO_COMPRA_GRANDE = 0.10;
    private static final double LIMITE_COMPRA_GRANDE = 100.0;

    private String nome;
    private double preco;
    private int quantidade;
    private boolean generico;

    public ItemVenda(String nome, double preco, int quantidade, boolean generico) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.generico = generico;
    }

    public double calcularSubtotal() {
        return preco * quantidade;
    }

    // A regra de desconto escrita UMA unica vez (no original, copiada 3 vezes)
    public double calcularDesconto() {
        double subtotal = calcularSubtotal();
        if (generico) {
            return subtotal * DESCONTO_GENERICO;
        }
        if (subtotal > LIMITE_COMPRA_GRANDE) {
            return subtotal * DESCONTO_COMPRA_GRANDE;
        }
        return 0.0;
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDesconto();
    }

    // MESMO formato do original: a saida refatorada deve ser identica
    public void exibirLinha() {
        System.out.printf("%s x%d: R$ %.2f (desconto R$ %.2f)%n",
                nome, quantidade, calcularTotal(), calcularDesconto());
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

    public boolean isGenerico() {
        return generico;
    }
}
