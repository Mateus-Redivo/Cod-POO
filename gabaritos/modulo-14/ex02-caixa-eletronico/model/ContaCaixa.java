package model;

import exception.NotaIndisponivelException;
import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public class ContaCaixa {
    private String titular;
    private double saldo;

    public ContaCaixa(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // As checked são DECLARADAS com throws; a unchecked (ValorInvalidoException)
    // não precisa aparecer na assinatura
    public void sacar(double valor) throws NotaIndisponivelException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do saque deve ser positivo.");
        }
        if (valor % 10 != 0) {
            throw new NotaIndisponivelException();
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do deposito deve ser positivo.");
        }
        saldo += valor;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
