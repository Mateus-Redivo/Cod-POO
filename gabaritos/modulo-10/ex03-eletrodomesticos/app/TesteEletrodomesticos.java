package app;

import model.Geladeira;
import model.Microondas;

public class TesteEletrodomesticos {

    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Brastemp", 220, 150);
        Microondas microondas = new Microondas("Electrolux", 110, 1200, 10);

        geladeira.ligar();
        microondas.ligar();

        System.out.println("\n--- Geladeira ---");
        geladeira.exibirInfo();

        System.out.println("\n--- Microondas ---");
        microondas.exibirInfo();

        System.out.println();
        geladeira.resfriar(3); // de 4 para 1, ok
        geladeira.resfriar(15); // deixaria -14, recusa

        System.out.println();
        microondas.aquecer(5); // ok
        microondas.aquecer(20); // acima do maximo, recusa
    }
}
