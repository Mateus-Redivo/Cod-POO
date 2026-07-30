package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;
import util.Validacoes;

public class Main {
    private static ArrayList<Conta> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Banco banco = new Banco();

    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            exibirMenu();
            int opcao = Validacoes.validarInteiro(scanner, "Escolha uma opcao: ", 0, 6);

            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> realizarDeposito();
                case 3 -> realizarSaque();
                case 4 -> consultarSaldo();
                case 5 -> listarContas();
                case 6 -> processarOperacoesMensais();
                case 0 -> executando = false;
            }
        }
        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA BANCARIO ===");
        System.out.println("1 - Criar nova conta");
        System.out.println("2 - Realizar deposito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Consultar saldo");
        System.out.println("5 - Listar todas as contas");
        System.out.println("6 - Processar operacoes mensais");
        System.out.println("0 - Sair");
    }

    private static void criarConta() {
        System.out.println("\n=== CRIAR NOVA CONTA ===");
        String titular = Validacoes.validarString(scanner, "Nome do titular: ");
        // A ContaSalario entrou no menu sem NENHUMA mudança no Banco
        int tipo = Validacoes.validarInteiro(scanner,
                "Tipo de conta (1-Corrente, 2-Poupanca, 3-Salario): ", 1, 3);
        int numero = contas.size() + 1;

        // Conta agora é abstrata: só instanciamos as filhas concretas
        Conta novaConta = switch (tipo) {
            case 1 -> new ContaCorrente(numero, titular);
            case 2 -> new ContaPoupanca(numero, titular);
            case 3 -> new ContaSalario(numero, titular);
            default -> null;
        };

        contas.add(novaConta);
        System.out.println("Conta criada com sucesso!");
        System.out.println(novaConta);
    }

    private static void realizarDeposito() {
        System.out.println("\n=== REALIZAR DEPOSITO ===");
        Conta conta = buscarConta();
        if (conta != null) {
            double valor = Validacoes.validarDouble(scanner, "Valor do deposito: R$ ", 0.01);
            conta.depositar(valor);
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + conta.getSaldo());
        }
    }

    private static void realizarSaque() {
        System.out.println("\n=== REALIZAR SAQUE ===");
        Conta conta = buscarConta();
        if (conta != null) {
            double valor = Validacoes.validarDouble(scanner, "Valor do saque: R$ ", 0.01);
            if (valor <= conta.getSaldo()) {
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: R$ " + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    private static void consultarSaldo() {
        System.out.println("\n=== CONSULTAR SALDO ===");
        Conta conta = buscarConta();
        if (conta != null) {
            System.out.println(conta);
        }
    }

    private static void listarContas() {
        System.out.println("\n=== LISTA DE CONTAS ===");
        if (contas.isEmpty()) {
            System.out.println("Nao ha contas cadastradas.");
            return;
        }
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    private static void processarOperacoesMensais() {
        System.out.println("\n=== PROCESSAR OPERACOES MENSAIS ===");
        if (contas.isEmpty()) {
            System.out.println("Nao ha contas para processar.");
            return;
        }
        banco.processarTodas(contas); // uma linha: o laco polimorfico mora no Banco
        System.out.println("Operacoes mensais processadas com sucesso!");
    }

    private static Conta buscarConta() {
        if (contas.isEmpty()) {
            System.out.println("Nao ha contas cadastradas.");
            return null;
        }

        int numero = Validacoes.validarInteiro(scanner, "Numero da conta: ", 1, contas.size());
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        System.out.println("Conta nao encontrada.");
        return null;
    }
}
