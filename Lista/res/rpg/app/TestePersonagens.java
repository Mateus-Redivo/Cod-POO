package app;

import model.Personagem;
import model.Guerreiro;

public class TestePersonagens {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE HERANCA - PERSONAGENS RPG ===\n");

        // 1. Criando um personagem generico
        System.out.println("1. Criando um personagem generico:");
        Personagem merlin = new Personagem("Merlin", "Mago", 10);
        merlin.exibirInfo();
        System.out.println();

        // 2. Testando metodos basicos
        System.out.println("2. Testando metodos basicos:");
        merlin.atacar(20.0);
        System.out.println("Vida: " + merlin.getVida());
        merlin.descansar(4);
        System.out.println("Vida atual: " + merlin.getVida());
        merlin.usarHabilidade();
        System.out.println();

        // 3. Criando um guerreiro
        System.out.println("3. Criando um guerreiro:");
        Guerreiro conan = new Guerreiro("Conan", 8, "Espada de Ferro", true);
        conan.exibirInfo();
        System.out.println();

        // 4. Testando heranca e metodos sobrescritos
        System.out.println("4. Testando heranca:");
        conan.atacar(15.0);
        System.out.println("Vida atual: " + conan.getVida());
        conan.usarHabilidade();
        System.out.println();

        // 5. Testando metodos especificos do guerreiro
        System.out.println("5. Metodos especificos:");
        conan.defender();
        conan.berrar();
        System.out.println();

        // 6. Demonstrando polimorfismo
        System.out.println("6. Demonstrando polimorfismo:");
        Personagem guerreiroPolimorfico = new Guerreiro("Arthur", 12, "Excalibur", true);
        System.out.println("Personagem criado como Guerreiro:");
        guerreiroPolimorfico.exibirInfo();
        System.out.println("Usando habilidade:");
        guerreiroPolimorfico.usarHabilidade(); // Chama a versao do Guerreiro

        System.out.println("\n=== FIM DO TESTE ===");
    }
}