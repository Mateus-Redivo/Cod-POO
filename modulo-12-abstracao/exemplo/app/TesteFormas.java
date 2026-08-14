package app;

import model.Forma;
import model.Circulo;
import model.Retangulo;

public class TesteFormas {
    public static void main(String[] args) {
        System.out.println("=== ABSTRACAO EM ACAO ===\n");

        // "new Forma(...)" nao compilaria -- so as filhas concretas podem ser instanciadas.
        Forma[] formas = {
            new Retangulo(4.0, 6.0, "Amarelo"),
            new Circulo(3.0, "Rosa"),
            new Retangulo(2.0, 2.0, "Roxo") // Quadrado
        };

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Forma " + (i + 1) + ":");
            formas[i].exibirInfo(); // cada uma calcula area/perimetro do seu proprio jeito
            System.out.println();
        }

        Retangulo ret1 = new Retangulo(5.0, 4.0, "Branco");
        Circulo circ1 = new Circulo(3.0, "Preto");

        System.out.println("Area do retangulo: " + String.format("%.2f", ret1.calcularArea()));
        System.out.println("Area do circulo: " + String.format("%.2f", circ1.calcularArea()));

        ret1.pintar("Vermelho");
        ret1.pintar();

        System.out.println("\n=== FIM DO TESTE ===");
    }
}
