package model;

public class Aluno {

    private String nome;
    private int idade;
    private int plano; // 1 = Basico, 2 = Premium

    public Aluno(String nome, int idade, int plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPlano() {
        return plano;
    }

    @Override
    public String toString() {
        String tipoPlano = plano == 1 ? "Basico" : "Premium";
        return "Aluno [nome=" + nome + ", idade=" + idade + ", plano=" + tipoPlano + "]";
    }
}
