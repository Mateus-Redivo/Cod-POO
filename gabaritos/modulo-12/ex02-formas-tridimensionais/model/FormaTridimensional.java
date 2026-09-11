package model;

public abstract class FormaTridimensional {
    protected String nome;

    protected FormaTridimensional(String nome) {
        this.nome = nome;
    }

    public abstract double calcularVolume();

    public abstract double calcularAreaSuperficie();

    public void exibirInfo() {
        System.out.println(nome + " | volume: " + calcularVolume() + " | area: " + calcularAreaSuperficie());
    }
}
