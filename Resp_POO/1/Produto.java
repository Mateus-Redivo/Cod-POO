public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
        setPreco(preco);
        setEstoque(estoque);
    }
    
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) this.preco = preco;
    }
    
    public void setEstoque(int estoque) {
        if (estoque >= 0) this.estoque = estoque;
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) this.estoque += quantidade;
    }
    
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) 
            this.estoque -= quantidade;
    }
    
    public double calcularValorTotalEstoque() {
        return this.preco * this.estoque;
    }
}
