public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;
    
    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    public abstract void ligar();
    public abstract double calcularIpva();
    
    // Getters e setters omitidos para brevidade
}

