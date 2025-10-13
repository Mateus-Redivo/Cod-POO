package sobre.app;

import sobre.model.Forma;
import sobre.model.Circulo;
import sobre.model.Retangulo;

public class TesteFormas {
public static void main(String[] args) {
        System.out.println("=== TESTE DE SOBRECARGA E SOBRESCRITA ===\n");

        //Demonstrando Sobrecarga na classe base
        System.out.println("Criando um retangulo...");
        Retangulo ret = new Retangulo(5.0, 3.0, "Azul");
        
        // Sobrecarga do metodo pintar()
        ret.pintar("Vermelho");  // Versao com parametro
        ret.pintar();            // Versao sem parametro
        System.out.println();

        // Demonstrando Sobrecarga em metodos especificos
        ret.redimensionar(8.0, 6.0);        // Dois parametros
        ret.redimensionar(1.5);              // Um parametro (fator)
        System.out.println();

        // Criando um circulo para demonstrar sobrecarga tambem
        Circulo circ = new Circulo(4.0, "Verde");
        circ.redimensionar(6.0);             // Um parametro
        circ.redimensionar(2.0, true);       // Dois parametros
        System.out.println();

        //  Demonstrando Sobrescrita (Override) com polimorfismo
        Forma[] formas = {
            new Retangulo(4.0, 6.0, "Amarelo"),
            new Circulo(3.0, "Rosa"),
            new Retangulo(2.0, 2.0, "Roxo")  // Quadrado
        };

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Forma " + (i + 1) + ":");
            formas[i].exibirInfo(); // Chama versao sobrescrita de cada classe
            System.out.println();
        }

        // Comparando areas (sobrescrita em acao)
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
