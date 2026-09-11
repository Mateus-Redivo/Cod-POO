package app;

import java.util.Scanner;

public class FichaDeAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        while (nome.trim().isEmpty()) {
            System.out.print("Nome do aluno: ");
            nome = scanner.nextLine();
            if (nome.trim().isEmpty()) {
                System.out.println("Erro: o nome nao pode ser vazio.");
            }
        }

        int idade = -1;
        while (idade < 5 || idade > 100) {
            System.out.print("Idade: ");
            try {
                idade = Integer.parseInt(scanner.nextLine());
                if (idade < 5 || idade > 100) {
                    System.out.println("Erro: idade deve estar entre 5 e 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero valido.");
                idade = -1;
            }
        }

        int plano = 0;
        while (plano != 1 && plano != 2) {
            System.out.print("Plano (1-Basico, 2-Premium): ");
            try {
                plano = Integer.parseInt(scanner.nextLine());
                if (plano != 1 && plano != 2) {
                    System.out.println("Erro: escolha 1 ou 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero valido.");
                plano = 0;
            }
        }

        String nomePlano = plano == 1 ? "Basico" : "Premium";

        System.out.println();
        System.out.println("=== FICHA DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Plano: " + nomePlano);

        scanner.close();
    }
}
