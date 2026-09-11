package model;

public class Eletrodomestico {
    protected String marca;
    protected int voltagem;
    protected boolean ligado;

    public Eletrodomestico(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(marca + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(marca + " desligado.");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Voltagem: " + voltagem + "V | Ligado: " + ligado);
    }
}
