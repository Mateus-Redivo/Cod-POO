package model;

public class Aluno {

    private String nome;
    private double notaFinal;

    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void exibirDados() {
        System.out.println(nome + " - nota: " + notaFinal);
    }

    public boolean foiAprovado() {
        return notaFinal >= 6.0;
    }
}
