package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros() {
        double juros = getSaldo() * 0.01;
        depositar(juros);
    }

    @Override
    public void processarFimDeMes() {
        renderJuros(); // reaproveita o metodo que ja existia
    }
}
