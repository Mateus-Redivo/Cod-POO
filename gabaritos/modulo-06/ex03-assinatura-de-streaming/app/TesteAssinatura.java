package app;

import model.Assinatura;

public class TesteAssinatura {

    public static void main(String[] args) {
        Assinatura a1 = new Assinatura("Premium", 39.90, 14);
        System.out.println(a1);

        Assinatura a2 = new Assinatura("Basico");
        System.out.println(a2);

        // Cadeia: Assinatura() -> this("Padrao") -> this("Padrao", 29.90, DIAS_TESTE_PADRAO)
        Assinatura a3 = new Assinatura();
        System.out.println(a3);

        Assinatura a4 = new Assinatura("Vip", 99.0, 30);
        System.out.println(a4);
    }
}
