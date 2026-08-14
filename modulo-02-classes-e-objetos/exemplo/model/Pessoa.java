package model;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    // Um único construtor por enquanto: recebe os três dados de uma vez
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
    }

    // Mostra todos os dados da pessoa numa linha só
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura + "m");
    }

    // Exemplo de método que MUDA o estado do objeto: um ano se passou
    public void fazerAniversario() {
        idade = idade + 1;
        System.out.println(nome + " fez aniversario! Nova idade: " + idade);
    }
}
