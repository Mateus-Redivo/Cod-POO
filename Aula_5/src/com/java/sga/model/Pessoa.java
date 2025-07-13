package com.java.sga.model;

public abstract class Pessoa{
    protected int id;
    protected String nome;
    protected String datanascimento;

    protected Pessoa(int id, String nome, String datanascimento) {
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (id != pessoa.id) return false;
        if (!nome.equals(pessoa.nome)) return false;
        return datanascimento.equals(pessoa.datanascimento);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nome.hashCode();
        result = 31 * result + datanascimento.hashCode();
        return result;
    }


}