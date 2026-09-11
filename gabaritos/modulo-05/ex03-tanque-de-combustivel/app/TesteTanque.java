package app;

import model.TanqueDeCombustivel;

public class TesteTanque {

    public static void main(String[] args) {
        TanqueDeCombustivel tanque = new TanqueDeCombustivel(40.0);
        System.out.println(tanque);

        System.out.println();
        tanque.abastecer(30.0);
        System.out.println(tanque);

        System.out.println();
        tanque.abastecer(20.0); // deve recusar
        System.out.println(tanque);

        System.out.println();
        tanque.consumir(10.0);
        System.out.println(tanque);

        System.out.println();
        tanque.consumir(50.0); // deve recusar
        System.out.println(tanque);

        System.out.println();
        tanque.abastecer(-5.0);
        tanque.consumir(0.0);

        System.out.println();
        TanqueDeCombustivel tanqueInvalido = new TanqueDeCombustivel(-10.0);
        System.out.println(tanqueInvalido);
    }
}
