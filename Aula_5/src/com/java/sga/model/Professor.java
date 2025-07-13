package com.java.sga.model;

public class Professor extends Pessoa {
    private String disciplina;
    private String listaTurmas;

    public Professor(int id, String nome, String datanascimento, String disciplina, String listaTurmas) {
        super(id, nome, datanascimento);
        this.disciplina = disciplina;
        this.listaTurmas = listaTurmas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(String listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", datanascimento='" + getDatanascimento() + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", listaTurmas='" + listaTurmas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;

        Professor professor = (Professor) o;

        if (!disciplina.equals(professor.disciplina)) return false;
        return listaTurmas.equals(professor.listaTurmas);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + disciplina.hashCode();
        result = 31 * result + listaTurmas.hashCode();
        return result;
    }
}
