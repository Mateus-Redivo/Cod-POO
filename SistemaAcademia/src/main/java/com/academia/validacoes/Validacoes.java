package main.java.com.academia.validacoes;

import java.util.Scanner;

public class Validacoes {
    private Validacoes() {
        // Private constructor to prevent instantiation
    }

    public static boolean validarIdade(int idade) {
        return idade >= 14 && idade <= 90;
    }

    public static boolean validarCargaExercicios(int carga) {
        return carga > 0;
    }

    public static String validarString(Scanner scanner, String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Erro: O campo não pode estar vazio.");
            }
        } while (entrada.isEmpty());
        return entrada;
    }

    public static int validarInteiro(Scanner scanner, String mensagem, int min, int max) {
        int numero;
        while (true) {
            try {
                System.out.print(mensagem);
                numero = Integer.parseInt(scanner.nextLine().trim());
                if (numero >= min && numero <= max) {
                    return numero;
                }
                System.out.printf("Erro: Digite um número entre %d e %d.\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido.");
            }
        }
    }
}
