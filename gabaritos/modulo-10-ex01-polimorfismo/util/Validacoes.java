package util;

import java.util.Scanner;

public class Validacoes {

    public static String validarString(Scanner scanner, String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Erro: O campo nao pode estar vazio.");
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
                System.out.printf("Erro: Digite um numero entre %d e %d.\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero valido.");
            }
        }
    }

    public static double validarDouble(Scanner scanner, String mensagem, double min) {
        double numero;
        while (true) {
            try {
                System.out.print(mensagem);
                numero = Double.parseDouble(scanner.nextLine().trim());
                if (numero >= min) {
                    return numero;
                }
                System.out.printf("Erro: Digite um valor maior ou igual a %.2f.\n", min);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero valido.");
            }
        }
    }
}
