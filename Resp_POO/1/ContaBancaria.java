public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;
    
    public ContaBancaria(int numero, double saldoInicial, String titular) {
        if (numero <= 0) throw new IllegalArgumentException("Número deve ser positivo");
        this.numero = numero;
        if (saldoInicial < 0) throw new IllegalArgumentException("Saldo não pode ser negativo");
        this.saldo = saldoInicial;
        this.titular = titular;
    }
    
    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
    
    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
        if (valor > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        this.saldo -= valor;
    }
    
    public void transferir(ContaBancaria destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}
