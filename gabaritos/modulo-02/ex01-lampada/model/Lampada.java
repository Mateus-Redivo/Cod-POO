package model;

public class Lampada {
    private String nome;
    private boolean ligada;
    private int intensidade;

    public Lampada(String nome) {
        this.nome = nome;
        this.ligada = false;
        this.intensidade = 0;
    }

    public void ligar() {
        ligada = true;
        intensidade = 100;
        System.out.println(nome + " ligada. Intensidade: " + intensidade + ".");
    }

    public void desligar() {
        if (!ligada) {
            System.out.println(nome + " ja estava desligada.");
            return;
        }
        ligada = false;
        intensidade = 0;
        System.out.println(nome + " desligada.");
    }

    public void ajustarIntensidade(int valor) {
        if (!ligada) {
            System.out.println(nome + " esta desligada, nao da para ajustar intensidade.");
            return;
        }
        intensidade = valor;
        System.out.println(nome + ": intensidade ajustada para " + intensidade + ".");
    }

    public void exibirEstado() {
        String estado = ligada ? "ligada" : "desligada";
        System.out.println("Lampada " + nome + ": " + estado + ", intensidade " + intensidade);
    }
}
