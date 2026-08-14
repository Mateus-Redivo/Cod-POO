package app;

import model.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        // Cada "new" cria um objeto independente, com seus proprios dados
        Pessoa maria = new Pessoa("Maria", 30, 1.65);
        Pessoa joao = new Pessoa("Joao", 25, 1.78);

        maria.saudacao();
        joao.saudacao();

        System.out.println("\n--- Dados ---");
        maria.exibirDados();
        joao.exibirDados();

        System.out.println("\n--- Prova de independencia entre objetos ---");
        maria.fazerAniversario();
        // Repare: a idade de joao NAO mudou, mesmo os dois sendo Pessoa
        maria.exibirDados();
        joao.exibirDados();

        // Experimente: crie uma terceira Pessoa aqui e prove que ela
        // tambem e independente das outras duas.
    }
}
