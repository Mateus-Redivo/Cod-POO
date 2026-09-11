package model;

public abstract class MeioDeTransporte {
    protected String nome;
    protected double velocidadeMediaKmH;

    protected MeioDeTransporte(String nome, double velocidadeMediaKmH) {
        this.nome = nome;
        this.velocidadeMediaKmH = velocidadeMediaKmH;
    }

    public abstract double calcularTempoViagem(double distanciaKm);

    public void exibirInfo() {
        System.out.println(nome + " (velocidade media: " + velocidadeMediaKmH + " km/h)");
    }
}
