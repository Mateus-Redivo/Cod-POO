package app;

import model.Pessoa;

/**
 * Demonstração automática do encapsulamento: sem menu, sem digitação.
 *
 * O MenuPessoa valida a entrada ANTES de chamar o setter, então por ele
 * você nunca vê a guarda do setter entrar em ação. Aqui fazemos o contrário:
 * atacamos o objeto direto, como qualquer outro trecho do sistema poderia
 * fazer. É exatamente contra isso que a validação no setter protege.
 */
public class TesteValidacoes {

    public static void main(String[] args) {

        System.out.println("=== 1. Objeto valido ===");
        Pessoa ana = new Pessoa("Ana", 30, 1.65);
        System.out.println(ana);

        System.out.println("\n=== 2. Ataque pelos setters ===");
        // Cada uma destas linhas imprime o motivo da recusa e NAO altera o objeto
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

        System.out.println("\n=== 5. Metodo static: nao precisa de objeto ===");
        // Repare na ausencia de "new": o metodo pertence a classe, nao a um objeto
        System.out.println("idadeValida(30)  -> " + util.Validacoes.idadeValida(30));
        System.out.println("idadeValida(-50) -> " + util.Validacoes.idadeValida(-50));
    }
}
