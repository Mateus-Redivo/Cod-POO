package model;

import java.util.ArrayList;
import java.util.List;

// Segunda classe extraida: a TURMA e quem sabe calcular a média geral.
// Na versão monolitica, isso era uma conta solta no final do main.
public class Turma {

    private String nomeDaTurma;
    private List<Aluno> alunos;

    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaDaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.size();
    }

    public void exibirBoletimGeral() {
        System.out.println("=== Turma " + nomeDaTurma + " ===");
        for (Aluno aluno : alunos) {
            aluno.exibirBoletim();
        }
        System.out.printf("%nMedia da turma: %.2f%n", calcularMediaDaTurma());
    }
}
