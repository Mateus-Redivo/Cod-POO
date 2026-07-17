package app;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;
import model.ContaSimples;

public class TesteExcecoes {

    public static void main(String[] args) {
        ContaSimples conta = new ContaSimples("Ana", 100.00);

        System.out.println("=== TESTE 1: operacao que funciona ===");
        try {
            conta.sacar(30.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Nao deveria cair aqui.");
        }

        System.out.println("\n=== TESTE 2: saque maior que o saldo ===");
        try {
            conta.sacar(500.00);
            System.out.println("Esta linha NUNCA executa se a excecao for lancada.");
        } catch (SaldoInsuficienteException e) {
            // getMessage() traz a mensagem que montamos no construtor da excecao.
            System.out.println("Operacao falhou: " + e.getMessage());
            System.out.printf("Faltaram R$ %.2f para completar o saque.%n", e.getValorFaltante());
        }

        System.out.println("\n=== TESTE 3: valor invalido (excecao unchecked) ===");
        try {
            conta.depositar(-50.00);
        } catch (ValorInvalidoException e) {
            System.out.println("Operacao falhou: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 4: finally sempre executa ===");
        try {
            conta.sacar(1000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operacao falhou: " + e.getMessage());
        } finally {
            // O bloco finally roda com ou sem excecao.
            // E usado para "arrumar a casa": fechar Scanner, arquivo, conexao...
            System.out.println("Encerrando operacao (finally executou).");
        }

        System.out.printf("%nSaldo final de %s: R$ %.2f%n", conta.getTitular(), conta.getSaldo());
    }
}
