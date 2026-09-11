package util;

import java.util.Scanner;

// Mesmo padrão do exemplo da academia: leitura validada do Scanner em métodos static
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

    public static String validarEmail(Scanner scanner, String mensagem) {
        String email;
        do {
            System.out.print(mensagem);
            email = scanner.nextLine().trim();
            if (!email.contains("@")) {
                System.out.println("Erro: O e-mail deve conter @.");
            }
        } while (!email.contains("@"));
        return email;
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
}
