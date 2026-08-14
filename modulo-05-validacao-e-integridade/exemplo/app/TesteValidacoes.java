package app;

import model.Pessoa;

/**
 * Ataca o objeto direto, sem menu, sem digitacao -- exatamente como
 * qualquer outro trecho do sistema poderia fazer. E exatamente contra
 * isso que a validacao no setter protege.
 */
public class TesteValidacoes {

    public static void main(String[] args) {

        System.out.println("=== 1. Objeto valido ===");
        Pessoa ana = new Pessoa("Ana", 30, 1.65);
        System.out.println(ana);

        System.out.println("\n=== 2. Ataque pelos setters ===");
        ana.setIdade(-50);
        ana.setIdade(200);
        ana.setNome("");
        ana.setNome("Ana123");
        ana.setAltura(0.1);
        System.out.println("Depois dos ataques: " + ana);
        System.out.println("A Ana continua intacta: nenhum valor invalido entrou.");

        System.out.println("\n=== 3. Ataque pelo construtor ===");
        // Validar so no setter nao bastaria: sem validacao no construtor,
        // o objeto ja nasceria estragado e a validacao viraria decoracao.
        Pessoa suspeito = new Pessoa("Joao123", 200, 5.0);
        System.out.println("Objeto criado com dados invalidos: " + suspeito);
        System.out.println("Repare: ele nasceu com valores seguros, nao com os invalidos.");

        System.out.println("\n=== 4. Valores validos continuam passando ===");
        ana.setIdade(31);
        ana.setAltura(1.66);
        System.out.println(ana);
        ana.saudacao();
    }
}
