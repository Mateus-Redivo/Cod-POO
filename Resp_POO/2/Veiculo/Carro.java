public class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(String marca, String modelo, int ano, double preco, int numPortas) {
        super(marca, modelo, ano, preco);
        this.numPortas = numPortas;
    }
    
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }
    
    @Override
    public double calcularIpva() {
        return preco * 0.04; // 4% do valor
    }
    
    // Getters e setters omitidos para brevidade
}
