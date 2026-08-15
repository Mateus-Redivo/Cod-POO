package model;

public class Passaro extends Animal {
    private boolean capazDeVoar;

    public Passaro(String nome, int idade, boolean capazDeVoar) {
        super(nome, idade);
        this.capazDeVoar = capazDeVoar;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Piu piu!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capaz de voar: " + (capazDeVoar ? "sim" : "nao"));
    }
}
