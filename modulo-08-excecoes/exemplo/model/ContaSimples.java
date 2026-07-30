package model;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

// Compare com a Conta do módulo 10: lá, um saque inválido é IGNORADO
// silenciosamente (o if simplesmente não faz nada). Aqui, a conta AVISA
// quem chamou que algo deu errado, lançando uma exceção.
public class ContaSimples {

    private String titular;
    private double saldo;

    public ContaSimples(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // Erro de programação: nunca deveria chegar valor <= 0 aqui.
        // Lançamos uma exceção unchecked com throw.
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        saldo += valor;
        System.out.printf("Deposito de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }

    // A cláusula "throws" avisa no contrato do método:
    // "este método PODE falhar com SaldoInsuficienteException, prepare-se".
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
