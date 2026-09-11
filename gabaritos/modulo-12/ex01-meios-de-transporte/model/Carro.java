package model;

public class Carro extends MeioDeTransporte {

    public Carro(String nome, double velocidadeMediaKmH) {
        super(nome, velocidadeMediaKmH);
    }

    @Override
    public double calcularTempoViagem(double distanciaKm) {
        return distanciaKm / velocidadeMediaKmH;
    }
}
