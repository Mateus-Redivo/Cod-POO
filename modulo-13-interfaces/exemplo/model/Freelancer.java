package model;

import java.util.ArrayList;
import java.util.List;

// Freelancer implementa DUAS interfaces ao mesmo tempo.
// FuncionarioClt e Freelancer não têm nenhum parentesco (não há herança
// entre eles), mas ambos podem ser tratados como Pagavel.
public class Freelancer implements Pagavel, Avaliavel {

    private String nome;
    private double valorHora;
    private int horasTrabalhadas;
    private List<Integer> avaliacoes;

    public Freelancer(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = 0;
        this.avaliacoes = new ArrayList<>();
    }

    public void registrarHoras(int horas) {
        if (horas > 0) {
            this.horasTrabalhadas += horas;
        }
    }

    @Override
    public double calcularPagamento() {
        // Freelancer: recebe pelas horas trabalhadas.
        return valorHora * horasTrabalhadas;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void receberAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        }
    }

    @Override
    public double getMediaAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
