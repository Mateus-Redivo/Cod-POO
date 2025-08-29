package com.java.sga.model;

public class Professor extends Pessoa {
    private String disciplina;
    private String listaTurmas;

    public Professor(String nome, String matricula, String disciplina, String listaTurmas) {
        super(nome);
        this.matricula = matricula;
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
                "nome='" + getNome() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
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

        if (disciplina != null ? !disciplina.equals(professor.disciplina) : professor.disciplina != null) return false;
        return listaTurmas != null ? listaTurmas.equals(professor.listaTurmas) : professor.listaTurmas == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (disciplina != null ? disciplina.hashCode() : 0);
        result = 31 * result + (listaTurmas != null ? listaTurmas.hashCode() : 0);
        return result;
    }
}
