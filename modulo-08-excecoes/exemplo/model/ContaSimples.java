package model;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

// Compare com a Conta do modulo 10: la, um saque invalido e IGNORADO
// silenciosamente (o if simplesmente nao faz nada). Aqui, a conta AVISA
// quem chamou que algo deu errado, lancando uma excecao.
public class ContaSimples {

    private String titular;
    private double saldo;

    public ContaSimples(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // Erro de programacao: nunca deveria chegar valor <= 0 aqui.
        // Lancamos uma excecao unchecked com throw.
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        saldo += valor;
        System.out.printf("Deposito de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }

    // A clausula "throws" avisa no contrato do metodo:
    // "este metodo PODE falhar com SaldoInsuficienteException, prepare-se".
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
