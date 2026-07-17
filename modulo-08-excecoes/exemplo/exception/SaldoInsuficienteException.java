package exception;

// Excecao PERSONALIZADA: criada por nos para representar um erro
// do NOSSO dominio (banco), com nome claro e dados uteis.
// Estende Exception, portanto e uma excecao VERIFICADA (checked):
// quem chamar um metodo que a lanca sera obrigado a tratar.
public class SaldoInsuficienteException extends Exception {

    private double saldoAtual;
    private double valorSolicitado;

    public SaldoInsuficienteException(double saldoAtual, double valorSolicitado) {
        // super() envia a mensagem para o construtor de Exception.
        super(String.format("Saldo insuficiente: saldo R$ %.2f, saque solicitado R$ %.2f",
                saldoAtual, valorSolicitado));
        this.saldoAtual = saldoAtual;
        this.valorSolicitado = valorSolicitado;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    // Um metodo extra que a excecao pode oferecer para ajudar quem tratar o erro.
    public double getValorFaltante() {
        return valorSolicitado - saldoAtual;
    }
}
