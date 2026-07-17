package model;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public abstract void processarFimDeMes();

    // Antes: valores invalidos eram IGNORADOS em silencio.
    // Agora: toda falha vira excecao com nome proprio.
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    // Mudamos o CONTRATO do metodo: quem chama sacar agora e obrigado a tratar
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do saque deve ser positivo.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta Nº: " + numero + ", Titular: " + titular + ", Saldo: R$ " + saldo;
    }
}
