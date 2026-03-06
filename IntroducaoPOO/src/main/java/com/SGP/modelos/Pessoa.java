package com.sgp.modelos;  // Declaração do pacote

public class Pessoa {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Pessoa
    private int idade;  // Atributo privado, acessível somente dentro da classe Pessoa
    private double altura; // Altura em metros

    // Construtor que recebe nome e idade como parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = 0.0;
    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão: nome="Carlos" e idade=20
    public Pessoa() {
        this.nome = "Carlos";
        this.idade = 20;
        this.altura = 1.75;
    }

    // Construtor que inclui altura
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Olá, " + nome + "!" + " Você tem " + idade + " anos.");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome da pesso
    public String getNome() {
        return nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Retorna a altura da pessoa
    public double getAltura() {
        return altura;
    }

    // Define um novo nome para a pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova idade para a pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Define uma nova altura para a pessoa (em metros)
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
