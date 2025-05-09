public abstract class ContaBancaria {
    protected String numero;
    protected String titular;
    protected double saldo;
    
    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) saldo -= valor;
    }
    
    public abstract void aplicarJuros();
    
    // Getters omitidos para brevidade
}

