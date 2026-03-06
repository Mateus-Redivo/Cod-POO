package com.sgp.testes; // Declaração do pacote

import com.sgp.modelos.Pessoa;

public class Teste { // Definição da classe Teste

    public static void main(String[] args) {
        // Testando o método com uma pessoa não inicializada
        Pessoa pessoaNula = null;
        imprimirPessoa(pessoaNula);

        // Testando o método com uma pessoa inicializada
        Pessoa pessoa = new Pessoa("Davi", 20);
        pessoa.setAltura(1.8);
        imprimirPessoa(pessoa);

        // Testando o construtor com valores padrão
        Pessoa pessoaPadrao = new Pessoa();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirPessoa(pessoaPadrao);

        // Testando construtor com altura
        Pessoa pessoaComAltura = new Pessoa("Ana", 30, 1.65);
        System.out.println("\nTestando construtor com altura:");
        imprimirPessoa(pessoaComAltura);

        // Acesso ao método público
        pessoa.saudacao();

        // Acessando o atributo através do getter público
        System.out.println("Nome (público): " + pessoa.getNome());

        // Modificando o atributo privado através do setter
        pessoa.setNome("João");
        System.out.println("Nome modificado (setter): " + pessoa.getNome());

        // Modificando a idade através do setter
        pessoa.setIdade(35);
        System.out.println("Pessoa após modificações: " + pessoa.toString());
    }

    // Método estático para imprimir informações de uma pessoa
    public static void imprimirPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("Pessoa não inicializada!");
            return;
        }
        System.out.println(pessoa);
        pessoa.saudacao();
    }
}
