package com.java.sga.model;

public class Aluno extends Pessoa {
    private String listaNotas;
    private String turma;

    public Aluno(String nome, String matricula, String listaNotas, 
    String turma) {
        super(nome);
        this.matricula = matricula;
        this.listaNotas = listaNotas;
        this.turma = turma;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(String listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", matricula='" + matricula + '\'' +
                ", listaNotas='" + listaNotas + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        if (!super.equals(o)) return false;

        Aluno aluno = (Aluno) o;

        if (matricula != null ? !matricula.equals(aluno.matricula) : aluno.matricula != null) return false;
        if (listaNotas != null ? !listaNotas.equals(aluno.listaNotas) : aluno.listaNotas != null) return false;
        return turma != null ? turma.equals(aluno.turma) : aluno.turma == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (listaNotas != null ? listaNotas.hashCode() : 0);
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        return result;
    }
}
