package model;

public class Personagem {
    protected String nome;
    protected String classe;
    protected int nivel;
    protected double vida;


    public Personagem(String nome, String classe, int nivel){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = 100;
    }
    

}
