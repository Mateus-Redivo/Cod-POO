package model;

// Classe base Veiculo
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidade;
    
    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }
    
    // Método acelerar que será herdado
    public void acelerar(double incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
    }
    
    public void fazerBarulho() {
        System.out.println("O veículo está fazendo barulho!");
    }

    // Método frear
    public void frear(double decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
        System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
    }
    
    // Método para exibir informações do veículo
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
    
    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getVelocidade() { return velocidade; }
}