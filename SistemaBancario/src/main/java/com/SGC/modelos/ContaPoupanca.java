package main.java.com.SGC.modelos;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros() {
        double juros = getSaldo() * 0.01;
        depositar(juros);
    }
}

