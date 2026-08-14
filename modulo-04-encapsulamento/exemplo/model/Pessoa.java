package model;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void saudacao() {
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
    }

    // Getters: leitura controlada dos atributos privados

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Setters: escrita controlada dos atributos privados
    // (ainda SEM validação — isso e o assunto do proximo modulo)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobrescrita do metodo toString para uma representacao textual do objeto
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
