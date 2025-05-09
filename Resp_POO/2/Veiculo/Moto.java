public class Moto extends Veiculo {
    private int cilindrada;
    
    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }
    
    @Override
    public double calcularIpva() {
        return preco * 0.02; // 2% do valor
    }
    
    // Getters e setters omitidos para brevidade
}