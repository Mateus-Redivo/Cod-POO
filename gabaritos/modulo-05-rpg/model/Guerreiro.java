package model;

public class Guerreiro extends Personagem {
    private String arma;
    private boolean armadura;

    public Guerreiro(String nome, int nivel, String arma, boolean armadura) {
        super(nome, "Guerreiro", nivel);
        this.arma = arma;
        this.armadura = armadura;
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa Golpe devastador!");
    }

    @Override
    public void atacar(double dano) {
        System.out.println(getNome() + " empunha sua " + arma + " e parte para o ataque!");
        super.atacar(dano);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Arma: " + arma);
        System.out.println("Armadura: " + (armadura ? "Equipada" : "Não equipada"));
    }

    public void defender() {
        double danoDefesa = armadura ? 5 : 10;
        setVida(getVida() - danoDefesa);
        System.out.println(getNome() + " defendeu o ataque, mas perdeu " + danoDefesa + " pontos de vida!");
    }

    public void berrar() {
        System.out.println(getNome() + " está berrando de raiva!");
    }

    // Getters e Setters
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public boolean isArmadura() {
        return armadura;
    }

    public void setArmadura(boolean armadura) {
        this.armadura = armadura;
    }
}
