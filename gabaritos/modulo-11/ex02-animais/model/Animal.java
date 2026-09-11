package model;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som generico.");
    }

    // Sobrecarga: repete emitirSom() varias vezes
    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            emitirSom();
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
