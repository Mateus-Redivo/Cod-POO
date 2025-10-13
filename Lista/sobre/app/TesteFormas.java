package sobre.app;

import sobre.model.Forma;
import sobre.model.Circulo;
import sobre.model.Retangulo;

public class TesteFormas {
public static void main(String[] args) {
        System.out.println("=== TESTE DE SOBRECARGA E SOBRESCRITA ===\n");

        // 1. Demonstrando SOBRECARGA na classe base
        System.out.println("1. DEMONSTRANDO SOBRECARGA (OVERLOAD):");
        System.out.println("Criando um retangulo...");
        Retangulo ret = new Retangulo(5.0, 3.0, "Azul");
        
        // Sobrecarga do metodo pintar()
        ret.pintar("Vermelho");  // Versao com parametro
        ret.pintar();            // Versao sem parametro
        System.out.println();

        // 2. Demonstrando SOBRECARGA em metodos especificos
        System.out.println("2. SOBRECARGA DE REDIMENSIONAR:");
        ret.redimensionar(8.0, 6.0);        // Dois parametros
        ret.redimensionar(1.5);              // Um parametro (fator)
        System.out.println();

        // 3. Criando um circulo para demonstrar sobrecarga tambem
        System.out.println("3. SOBRECARGA NO CIRCULO:");
        Circulo circ = new Circulo(4.0, "Verde");
        circ.redimensionar(6.0);             // Um parametro
        circ.redimensionar(2.0, true);       // Dois parametros
        System.out.println();

        // 4. Demonstrando SOBRESCRITA (OVERRIDE) com polimorfismo
        System.out.println("4. DEMONSTRANDO SOBRESCRITA (OVERRIDE):");
        System.out.println("Usando polimorfismo - array de Formas:");
        
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

        // 5. Comparando areas (sobrescrita em acao)
        System.out.println("5. COMPARANDO AREAS (SOBRESCRITA EM ACAO):");
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

        // 6. Demonstrando que o metodo correto e chamado (polimorfismo)
        System.out.println("6. POLIMORFISMO EM ACAO:");
        Forma formaGenerica = new Circulo(5.0, "Dourado");
        System.out.println("Forma criada como Circulo:");
        System.out.println("Area calculada: " + String.format("%.2f", formaGenerica.calcularArea()));
        System.out.println("(Metodo calcularArea() da classe Circulo foi chamado!)");
        
        formaGenerica = new Retangulo(6.0, 4.0, "Prata");
        System.out.println("Forma alterada para Retangulo:");
        System.out.println("Area calculada: " + String.format("%.2f", formaGenerica.calcularArea()));
        System.out.println("(Metodo calcularArea() da classe Retangulo foi chamado!)");

        System.out.println("\n=== RESUMO DOS CONCEITOS ===");
        System.out.println("SOBRECARGA (OVERLOAD):");
        System.out.println("- Mesmo nome, parametros diferentes");
        System.out.println("- pintar() vs pintar(String cor)");
        System.out.println("- redimensionar(...) com diferentes assinaturas");
        System.out.println();
        System.out.println("SOBRESCRITA (OVERRIDE):");
        System.out.println("- Redefinicao de metodos da classe pai");
        System.out.println("- calcularArea() implementado diferente em cada classe");
        System.out.println("- exibirInfo() personalizado para cada forma");
        System.out.println("- Polimorfismo: metodo correto chamado em tempo de execucao");

        System.out.println("\n=== FIM DO TESTE ===");
    }
}
