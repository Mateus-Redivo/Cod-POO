package model;

public class Instrumento {
    protected String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public void tocar() {
        System.out.println(nome + " esta tocando.");
    }

    // Sobrecarga: mesmo nome, assinaturas diferentes, ambos na mesma classe
    public void afinar() {
        System.out.println(nome + " afinado no padrao.");
    }

    public void afinar(int nivel) {
        System.out.println(nome + " afinado no nivel " + nivel + ".");
    }
}
