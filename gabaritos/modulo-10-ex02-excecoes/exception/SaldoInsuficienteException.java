package exception;

// Checked: saque sem saldo e uma situacao normal do negocio — quem chama
// sacar() e obrigado pelo compilador a decidir o que fazer com ela.
public class SaldoInsuficienteException extends Exception {
    private double saldoAtual;
    private double valorPedido;

    public SaldoInsuficienteException(double saldoAtual, double valorPedido) {
        super("Saldo insuficiente para o saque.");
        this.saldoAtual = saldoAtual;
        this.valorPedido = valorPedido;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public double getValorFaltante() {
        return valorPedido - saldoAtual;
    }
}
