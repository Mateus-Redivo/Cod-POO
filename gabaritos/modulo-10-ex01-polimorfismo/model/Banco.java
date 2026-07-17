package model;

import java.util.List;

public class Banco {
    // Antes: cadeia de instanceof decidindo o que fazer com cada tipo.
    // Agora: o polimorfismo decide — cada conta sabe processar a si mesma.
    public void processarMensal(Conta conta) {
        conta.processarFimDeMes();
    }

    // Laco polimorfico: aceita qualquer filha de Conta, atual ou futura
    public void processarTodas(List<Conta> contas) {
        for (Conta conta : contas) {
            processarMensal(conta);
        }
    }
}
