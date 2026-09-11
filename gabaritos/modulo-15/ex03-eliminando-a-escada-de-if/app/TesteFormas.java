package app;

import java.util.ArrayList;
import java.util.List;

import model.Circulo;
import model.Forma;
import model.Quadrado;
import model.Triangulo;

public class TesteFormas {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Circulo(5.0));

        for (Forma forma : formas) {
            System.out.println(forma.getClass().getSimpleName()
                    + ": area=" + forma.calcularArea() + ", perimetro=" + forma.calcularPerimetro());
        }

        // Passo 6: forma nova, sem mexer em nenhuma escada de if (nao existe mais nenhuma)
        formas.add(new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0));
        System.out.println("\n--- Apos adicionar Triangulo ---");
        for (Forma forma : formas) {
            System.out.println(forma.getClass().getSimpleName()
                    + ": area=" + forma.calcularArea() + ", perimetro=" + forma.calcularPerimetro());
        }
    }
}
