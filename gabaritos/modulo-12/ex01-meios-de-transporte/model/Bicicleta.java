package model;

public class Bicicleta extends MeioDeTransporte {

    public Bicicleta(String nome, double velocidadeMediaKmH) {
        super(nome, velocidadeMediaKmH);
    }

    @Override
    public double calcularTempoViagem(double distanciaKm) {
        return (distanciaKm / velocidadeMediaKmH) * 1.15;
    }
}
