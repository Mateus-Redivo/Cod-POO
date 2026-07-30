package model;

import java.util.ArrayList;
import java.util.List;

// VERSÃO "DEPOIS": os dados do aluno e as regras que operam sobre eles
// agora vivem juntos. A regra de aprovação existe em UM único lugar.
public class Aluno {

    private String nome;
    private List<Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        }
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    // A regra de negócio esta centralizada: se mudar a nota de corte,
    // alteramos apenas este método.
    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }

    public void exibirBoletim() {
        System.out.printf("%s: media %.2f - %s%n", nome, calcularMedia(), getSituacao());
    }

    public String getNome() {
        return nome;
    }
}
