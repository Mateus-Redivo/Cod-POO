package main.java.com.SGC.modelos;

public class Banco {
    public void processarMensal(Conta conta) {
        if (conta instanceof ContaCorrente cc) {
            cc.descontarTarifaMensal();
        } else if (conta instanceof ContaPoupanca cp) {
            cp.renderJuros();
        }
    }
}
