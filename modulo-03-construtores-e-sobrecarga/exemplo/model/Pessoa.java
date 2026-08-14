package model;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    // Construtor que recebe nome e idade; altura fica com um valor padrao
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = 1.70;
    }

    // Construtor sobrecarregado: mesmo nome "Pessoa", mas com um parametro a mais.
    // O Java escolhe qual construtor chamar pelo NUMERO e TIPO dos argumentos.
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Outra sobrecarga: sem nenhum parametro, valores padrao para tudo
    public Pessoa() {
        this.nome = "Carlos";
        this.idade = 20;
        this.altura = 1.75;
    }

    public void saudacao() {
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura + "m");
    }
}
