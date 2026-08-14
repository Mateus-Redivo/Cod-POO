package model;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidade;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }

    public void acelerar(double incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
    }

    // Sobrecarga: mesmo nome "buzinar", assinaturas diferentes
    public void buzinar() {
        System.out.println(marca + " " + modelo + ": Bi!");
    }

    public void buzinar(int vezes) {
        for (int i = 0; i < vezes; i++) {
            buzinar();
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
