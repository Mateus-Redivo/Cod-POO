package model;

public class Bateria extends Instrumento {

    public Bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println(nome + " esta sendo batucada.");
    }
}
