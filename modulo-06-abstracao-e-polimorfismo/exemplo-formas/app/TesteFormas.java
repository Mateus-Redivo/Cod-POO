package app;

import model.Forma;
import model.Circulo;
import model.Retangulo;

public class TesteFormas {
public static void main(String[] args) {
        System.out.println("=== TESTE DE SOBRECARGA E SOBRESCRITA ===\n");

        //Demonstrando Sobrecarga na classe base
        System.out.println("Criando um retangulo...");
        Retangulo ret = new Retangulo(5.0, 3.0, "Azul");
        
        // Sobrecarga do método pintar()
        ret.pintar("Vermelho");  // Versão com parâmetro
        ret.pintar();            // Versão sem parâmetro
        System.out.println();

        // Demonstrando Sobrecarga em métodos específicos
        ret.redimensionar(8.0, 6.0);        // Dois parâmetros
        ret.redimensionar(1.5);              // Um parâmetro (fator)
        System.out.println();

        // Criando um círculo para demonstrar sobrecarga também
        Circulo circ = new Circulo(4.0, "Verde");
        circ.redimensionar(6.0);             // Um parâmetro
        circ.redimensionar(2.0, true);       // Dois parâmetros
        System.out.println();

        //  Demonstrando Sobrescrita (Override) com polimorfismo
        Forma[] formas = {
            new Retangulo(4.0, 6.0, "Amarelo"),
            new Circulo(3.0, "Rosa"),
            new Retangulo(2.0, 2.0, "Roxo")  // Quadrado
        };

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Forma " + (i + 1) + ":");
            formas[i].exibirInfo(); // Chama versão sobrescrita de cada classe
            System.out.println();
        }

        // Comparando areas (sobrescrita em ação)
        Retangulo ret1 = new Retangulo(5.0, 4.0, "Branco");
        Circulo circ1 = new Circulo(3.0, "Preto");
        
        System.out.println("Area do retangulo: " + String.format("%.2f", ret1.calcularArea()));
        System.out.println("Area do circulo: " + String.format("%.2f", circ1.calcularArea()));
        
        if (ret1.calcularArea() > circ1.calcularArea()) {
            System.out.println("O retangulo tem maior area!");
        } else {
            System.out.println("O circulo tem maior area!");
        }
        System.out.println();

        System.out.println("\n=== FIM DO TESTE ===");
    }
}
