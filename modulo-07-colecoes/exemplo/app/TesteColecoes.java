package app;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class TesteColecoes {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 25, 1));
        alunos.add(new Aluno("Bruno", 31, 2));
        alunos.add(new Aluno("Carla", 19, 1));

        System.out.println("Quantidade de alunos: " + alunos.size());

        System.out.println("\n--- Percorrendo com for-each ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n--- Acessando por indice ---");
        Aluno primeiro = alunos.get(0);
        System.out.println("Primeiro aluno: " + primeiro);

        System.out.println("\n--- Removendo por indice ---");
        alunos.remove(1); // remove o Bruno
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // Experimente: tente adicionar um "Object" qualquer na lista.
        // O compilador recusa -- List<Aluno> so aceita Aluno.
    }
}
