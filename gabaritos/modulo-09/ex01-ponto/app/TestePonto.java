package app;

import model.Ponto;

public class TestePonto {

    public static void main(String[] args) {
        Ponto a = new Ponto(3, 4);
        Ponto b = new Ponto(3, 4);
        Ponto c = new Ponto(5, 4);

        System.out.println("a == b -> " + (a == b));
        System.out.println("a.equals(b) -> " + a.equals(b));
        System.out.println("a.hashCode() == b.hashCode() -> " + (a.hashCode() == b.hashCode()));
        System.out.println("a.equals(c) -> " + a.equals(c));
        System.out.println("a.equals(null) -> " + a.equals(null));
    }
}
