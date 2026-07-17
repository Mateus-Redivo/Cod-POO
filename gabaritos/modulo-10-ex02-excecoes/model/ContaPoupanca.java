package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros() {
        double juros = getSaldo() * 0.01;
        // Saldo zero renderia juros zero — e depositar(0) agora lanca
        // ValorInvalidoException. So depositamos quando ha juros de verdade.
        if (juros > 0) {
            depositar(juros);
        }
    }

    @Override
    public void processarFimDeMes() {
        renderJuros();
    }
}
