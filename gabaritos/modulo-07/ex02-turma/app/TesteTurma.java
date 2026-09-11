package app;

import java.util.List;

import model.Aluno;
import model.Turma;

public class TesteTurma {

    public static void main(String[] args) {
        Turma turma = new Turma("3A");
        turma.matricular(new Aluno("Ana", 8.5));
        turma.matricular(new Aluno("Bruno", 5.0));
        turma.matricular(new Aluno("Carla", 9.2));
        turma.matricular(new Aluno("Davi", 4.0));
        turma.matricular(new Aluno("Elisa", 6.0));

        System.out.println("Media da turma: " + turma.calcularMediaDaTurma());

        System.out.println("\n--- Aprovados ---");
        List<Aluno> aprovados = turma.listarAprovados();
        for (Aluno aluno : aprovados) {
            aluno.exibirDados();
        }

        System.out.println("\n--- Busca ---");
        Aluno encontrado = turma.buscarPorNome("Carla");
        if (encontrado != null) {
            encontrado.exibirDados();
        }

        Aluno naoEncontrado = turma.buscarPorNome("Fernanda");
        if (naoEncontrado == null) {
            System.out.println("Aluno nao encontrado.");
        }
    }
}
