package app;

import model.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        // O Java decide qual construtor rodar pela quantidade/tipo dos argumentos
        Pessoa davi = new Pessoa("Davi", 20);
        System.out.println("--- Construtor com 2 parametros ---");
        davi.exibirDados();

        Pessoa ana = new Pessoa("Ana", 30, 1.65);
        System.out.println("\n--- Construtor com 3 parametros ---");
        ana.exibirDados();

        Pessoa padrao = new Pessoa();
        System.out.println("\n--- Construtor sem parametros ---");
        padrao.exibirDados();

        davi.saudacao();
    }
}
