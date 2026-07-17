package app;

import java.util.Scanner;

import exception.NotaIndisponivelException;
import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;
import model.ContaCaixa;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ContaCaixa conta = new ContaCaixa("Aluno", 100.00);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== CAIXA ELETRONICO ===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            int opcao = lerInteiro("Escolha uma opcao: ");

            switch (opcao) {
                case 1 -> sacar(conta);
                case 2 -> depositar(conta);
                case 3 -> System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                case 0 -> executando = false;
                default -> System.out.println("Opcao invalida.");
            }
        }
        scanner.close(); // Scanner fechado na saida do programa
        System.out.println("Obrigado por usar o caixa. Ate logo!");
    }

    private static void sacar(ContaCaixa conta) {
        try {
            double valor = lerDouble("Valor do saque: ");
            conta.sacar(valor);
            System.out.println("Saque realizado. Retire suas notas.");
        } catch (SaldoInsuficienteException e) {
            // Mensagem amigavel USANDO os dados da excecao
            System.out.printf("Nao foi possivel sacar: saldo insuficiente. Faltam R$ %.2f.%n",
                    e.getValorFaltante());
        } catch (NotaIndisponivelException e) {
            System.out.println("Nao foi possivel sacar: o caixa so possui notas de R$ 10.");
        } catch (ValorInvalidoException e) {
            System.out.println("Nao foi possivel sacar: " + e.getMessage());
        } finally {
            // O finally roda SEMPRE: com sucesso ou com excecao
            System.out.println("--- operacao encerrada ---");
        }
    }

    private static void depositar(ContaCaixa conta) {
        try {
            double valor = lerDouble("Valor do deposito: ");
            conta.depositar(valor);
            System.out.printf("Deposito realizado. Novo saldo: R$ %.2f%n", conta.getSaldo());
        } catch (ValorInvalidoException e) {
            System.out.println("Nao foi possivel depositar: " + e.getMessage());
        } finally {
            System.out.println("--- operacao encerrada ---");
        }
    }

    // Leitura robusta: letra no lugar de numero NAO derruba o programa
    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido.");
            }
        }
    }
}
