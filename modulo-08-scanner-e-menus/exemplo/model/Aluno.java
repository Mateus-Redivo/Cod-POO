package model;

public class Aluno {

    private String nome;
    private int idade;
    private int plano; // 1 = Basico, 2 = Premium

    public Aluno() {
    }

    public Aluno(String nome, int idade, int plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        String tipoPlano = plano == 1 ? "Basico" : "Premium";
        return "Aluno{nome='" + nome + "', idade=" + idade + ", plano=" + tipoPlano + "}";
    }
}
