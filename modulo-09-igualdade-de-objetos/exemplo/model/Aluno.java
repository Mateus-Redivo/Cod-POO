package model;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int idade;
    private int plano;

    public Aluno(String nome, int idade, int plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', idade=" + idade + ", plano=" + plano + "}";
    }

    // equals: define o que significa "dois Alunos com os MESMOS dados".
    // Compara campo a campo -- os mesmos campos usados no hashCode logo abaixo.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade
                && plano == aluno.plano
                && Objects.equals(nome, aluno.nome);
    }

    // hashCode: "resumo numerico" do objeto, usado por colecoes como HashSet/HashMap.
    // Regra do contrato: se dois objetos sao equals, o hashCode DELES tem que ser igual.
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, plano);
    }
}
