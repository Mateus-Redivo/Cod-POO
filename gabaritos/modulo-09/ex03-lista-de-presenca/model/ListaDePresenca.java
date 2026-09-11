package model;

import java.util.ArrayList;
import java.util.List;

public class ListaDePresenca {

    private List<Aluno> presentes = new ArrayList<>();

    public void registrarPresenca(Aluno aluno) {
        if (presentes.contains(aluno)) {
            System.out.println("Aluno com matricula " + aluno.getMatricula() + " ja registrou presenca.");
            return;
        }
        presentes.add(aluno);
        System.out.println("Presenca registrada: " + aluno);
    }

    public List<Aluno> removerDuplicatas(List<Aluno> listaComPossiveisRepeticoes) {
        List<Aluno> semDuplicatas = new ArrayList<>();
        for (Aluno aluno : listaComPossiveisRepeticoes) {
            if (!semDuplicatas.contains(aluno)) {
                semDuplicatas.add(aluno);
            }
        }
        return semDuplicatas;
    }
}
