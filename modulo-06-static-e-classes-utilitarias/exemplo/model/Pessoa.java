package model;

import util.Validacoes;

public class Pessoa {

    // Altura assumida quando a pessoa e criada sem informar esse dado.
    // static final: pertence a CLASSE (uma so copia, compartilhada por todos os
    // objetos) e nunca muda depois de compilado -- por isso o nome em MAIUSCULAS.
    private static final double ALTURA_PADRAO = 1.70;

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = ALTURA_PADRAO;

        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    // Construtor que recebe nome e idade; a altura fica com o valor padrao.
    // "this(...)" chama o OUTRO construtor desta mesma classe, evitando repetir
    // a logica de inicializacao duas vezes.
    public Pessoa(String nome, int idade) {
        this(nome, idade, ALTURA_PADRAO);
    }

    public void saudacao() {
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Repare: o setter nao conhece mais a regra em si, so pergunta a Validacoes
    public void setNome(String nome) {
        if (!Validacoes.nomeValido(nome)) {
            System.out.println(Validacoes.mensagemErroNome(nome));
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (!Validacoes.idadeValida(idade)) {
            System.out.println(Validacoes.mensagemErroIdade(idade));
            return;
        }
        this.idade = idade;
    }

    public void setAltura(double altura) {
        if (!Validacoes.alturaValida(altura)) {
            System.out.println(Validacoes.mensagemErroAltura(altura));
            return;
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
