package model;

// Agora ABSTRATA: nao existe "conta generica" no banco, so contas concretas.
// O metodo abstrato obriga cada filha a dizer o que acontece no fim do mes.
public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Cada tipo de conta implementa do seu jeito
    public abstract void processarFimDeMes();

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
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
