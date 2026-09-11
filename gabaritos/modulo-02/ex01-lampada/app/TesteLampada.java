package app;

import model.Lampada;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada sala = new Lampada("Sala");
        Lampada quarto = new Lampada("Quarto");

        sala.ligar();
        System.out.println("--- Estado apos ligar Sala ---");
        sala.exibirEstado();
        quarto.exibirEstado();

        System.out.println();
        sala.ajustarIntensidade(40);
        quarto.ajustarIntensidade(60);

        System.out.println();
        sala.desligar();
        quarto.desligar();
        System.out.println("--- Estado final ---");
        sala.exibirEstado();
        quarto.exibirEstado();
    }
}
