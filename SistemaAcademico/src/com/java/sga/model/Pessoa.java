package com.java.sga.model;

public abstract class Pessoa{
    protected String nome;
    protected String matricula;

    protected Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        return matricula != null ? matricula.equals(pessoa.matricula) : pessoa.matricula == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        return result;
    }
}