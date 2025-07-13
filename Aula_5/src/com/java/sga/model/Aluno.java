package com.java.sga.model;

public class Aluno extends Pessoa {
    private String matricula;
    private String listaNotas;
    private String turma;

    public Aluno(int id, String nome, String datanascimento, String matricula, String listaNotas, String turma) {
        super(id, nome, datanascimento);
        this.matricula = matricula;
        this.listaNotas = listaNotas;
        this.turma = turma;
    }

    public void calcularMedia(){
        
    }
    public void verificarAprovacao(){

    }


    public String getMatricula() {
        return matricula;
    }

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
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", datanascimento='" + getDatanascimento() + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        if (!super.equals(o)) return false;

        Aluno aluno = (Aluno) o;

        if (!matricula.equals(aluno.matricula)) return false;
        if (!listaNotas.equals(aluno.listaNotas)) return false;
        return turma.equals(aluno.turma);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + matricula.hashCode();
        result = 31 * result + listaNotas.hashCode();
        result = 31 * result + turma.hashCode();
        return result;
    }
}
