package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaDaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNotaFinal();
        }
        return soma / alunos.size();
    }

    public List<Aluno> listarAprovados() {
        List<Aluno> aprovados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.foiAprovado()) {
                aprovados.add(aluno);
            }
        }
        return aprovados;
    }

    public Aluno buscarPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
