package model;

public class Violao extends Instrumento {

    public Violao(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println(nome + " esta sendo dedilhado.");
    }
}
