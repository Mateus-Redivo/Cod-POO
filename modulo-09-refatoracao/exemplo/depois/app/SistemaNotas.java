package app;

import model.Aluno;
import model.Turma;

// Compare este main com o da versao "antes": mesmo comportamento,
// mas agora ele apenas monta os objetos e delega o trabalho.
// Adicionar um quarto aluno custa 3 linhas, nao 15.
public class SistemaNotas {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NOTAS (versao refatorada) ===\n");

        Aluno ana = new Aluno("Ana");
        ana.adicionarNota(8.0);
        ana.adicionarNota(6.5);
        ana.adicionarNota(9.0);

        Aluno bruno = new Aluno("Bruno");
        bruno.adicionarNota(5.0);
        bruno.adicionarNota(4.5);
        bruno.adicionarNota(6.0);

        Aluno carla = new Aluno("Carla");
        carla.adicionarNota(3.0);
        carla.adicionarNota(2.5);
        carla.adicionarNota(4.0);

        Turma turma = new Turma("POO 2026/2");
        turma.matricular(ana);
        turma.matricular(bruno);
        turma.matricular(carla);

        turma.exibirBoletimGeral();
    }
}
