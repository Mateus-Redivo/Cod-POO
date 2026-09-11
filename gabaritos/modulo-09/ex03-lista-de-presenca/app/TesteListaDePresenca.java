package app;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.ListaDePresenca;

public class TesteListaDePresenca {

    public static void main(String[] args) {
        ListaDePresenca lista = new ListaDePresenca();

        lista.registrarPresenca(new Aluno("Ana", "001"));
        lista.registrarPresenca(new Aluno("Bruno", "002"));
        lista.registrarPresenca(new Aluno("Carla", "003"));
        lista.registrarPresenca(new Aluno("Ana Outra Pessoa", "001")); // mesma matricula, objeto novo

        List<Aluno> comRepeticoes = new ArrayList<>();
        comRepeticoes.add(new Aluno("Ana", "001"));
        comRepeticoes.add(new Aluno("Bruno", "002"));
        comRepeticoes.add(new Aluno("Ana", "001"));
        comRepeticoes.add(new Aluno("Carla", "003"));
        comRepeticoes.add(new Aluno("Bruno", "002"));

        List<Aluno> semRepeticoes = lista.removerDuplicatas(comRepeticoes);
        System.out.println("\n--- Lista sem duplicatas (" + comRepeticoes.size() + " alunos -> "
                + semRepeticoes.size() + " unicos) ---");
        for (Aluno aluno : semRepeticoes) {
            System.out.println(aluno);
        }
    }
}
