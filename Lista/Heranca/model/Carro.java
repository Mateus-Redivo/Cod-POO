package model;

// Classe Carro que herda de Veiculo
public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano); // Chama o construtor da classe pai
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    // Sobrescrevendo o método acelerar para adicionar funcionalidade específica do carro
    @Override
    public void acelerar(double incremento) {
        System.out.println("Carro " + marca + " " + modelo + " está acelerando...");
        super.acelerar(incremento); // Chama o método da classe pai
    }
    
    // Método específico da classe Carro
    public void ligarAr() {
        System.out.println("Ar condicionado ligado!");
    }
    
    public void tocarBuzina() {
        System.out.println("Bi Bi!");
    }
    
    // Sobrescrevendo o método exibirInfo para incluir informações específicas do carro
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
    
    // Getters específicos
    public int getNumeroPortas() { return numeroPortas; }
    public String getTipoCombustivel() { return tipoCombustivel; }
}