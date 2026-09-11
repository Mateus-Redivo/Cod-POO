package model;

// Implementa AS DUAS interfaces: pode conectar E carregar
public class Smartphone implements Conectavel, Carregavel {
    private String modelo;
    private int nivelBateria;
    private boolean conectado;
    private String redeAtual;

    public Smartphone(String modelo) {
        this.modelo = modelo;
        this.nivelBateria = 50;
        this.conectado = false;
        this.redeAtual = null;
    }

    @Override
    public void conectar(String rede) {
        if (rede == null || rede.trim().isEmpty()) {
            System.out.println("Rede invalida: o nome nao pode ser vazio.");
            return;
        }
        this.conectado = true;
        this.redeAtual = rede;
        System.out.println("Smartphone " + modelo + " conectado a rede " + rede + ".");
    }

    @Override
    public void desconectar() {
        this.conectado = false;
        this.redeAtual = null;
        System.out.println("Smartphone " + modelo + " desconectado.");
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }

    @Override
    public void carregar(int minutos) {
        if (minutos <= 0) {
            System.out.println("Tempo de carga invalido: deve ser positivo.");
            return;
        }
        nivelBateria += minutos; // 1% por minuto
        if (nivelBateria > 100) {
            nivelBateria = 100; // trava em 100
        }
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getRedeAtual() {
        return redeAtual;
    }

    @Override
    public String toString() {
        return "Smartphone " + modelo;
    }
}
