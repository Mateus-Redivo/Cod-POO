package model;

public class Estacionamento {

    private String nome;
    private Vaga vaga1;
    private Vaga vaga2;
    private Vaga vaga3;

    public Estacionamento(String nome) {
        this.nome = nome;
        this.vaga1 = new Vaga(1);
        this.vaga2 = new Vaga(2);
        this.vaga3 = new Vaga(3);
    }

    // Repare: nao precisamos perguntar a nenhuma Vaga qual e o seu numero
    // (isso exigiria um getter). O Estacionamento ja sabe, porque foi ele
    // mesmo quem criou cada vaga com aquele numero no construtor.
    public void estacionarEm(int numeroDaVaga, String placa) {
        if (numeroDaVaga == 1) {
            vaga1.ocupar(placa);
        } else if (numeroDaVaga == 2) {
            vaga2.ocupar(placa);
        } else if (numeroDaVaga == 3) {
            vaga3.ocupar(placa);
        } else {
            System.out.println("Nao existe vaga numero " + numeroDaVaga + " em " + nome + ".");
        }
    }

    public void liberarVaga(int numeroDaVaga) {
        if (numeroDaVaga == 1) {
            vaga1.liberar();
        } else if (numeroDaVaga == 2) {
            vaga2.liberar();
        } else if (numeroDaVaga == 3) {
            vaga3.liberar();
        } else {
            System.out.println("Nao existe vaga numero " + numeroDaVaga + " em " + nome + ".");
        }
    }

    public void exibirTodasAsVagas() {
        vaga1.exibirEstado();
        vaga2.exibirEstado();
        vaga3.exibirEstado();
    }
}
