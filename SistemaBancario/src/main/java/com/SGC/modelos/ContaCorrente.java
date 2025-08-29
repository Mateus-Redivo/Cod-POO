package main.java.com.SGC.modelos;

public class ContaCorrente extends Conta {
    private double tarifaMensal = 12.90;

    public ContaCorrente(int numero, String titular) {
        super(numero, titular);
    }

    public void descontarTarifaMensal() {
        sacar(tarifaMensal);
    }
}
