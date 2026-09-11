package app;

import java.util.ArrayList;
import java.util.List;

import model.CaixaDeSom;
import model.Gravavel;
import model.Microfone;
import model.Reproduzivel;
import model.Smartphone;

public class TesteCentral {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom("Caixa JBL");
        Microfone microfone = new Microfone("Microfone de estudio");
        Smartphone smartphone = new Smartphone("Galaxy S24");

        System.out.println("--- Reproduzivel ---");
        List<Reproduzivel> reproduziveis = new ArrayList<>();
        reproduziveis.add(caixa);
        reproduziveis.add(smartphone);
        for (Reproduzivel r : reproduziveis) {
            r.tocar();
        }

        System.out.println("\n--- Gravavel ---");
        List<Gravavel> gravaveis = new ArrayList<>();
        gravaveis.add(microfone);
        gravaveis.add(smartphone);
        for (Gravavel g : gravaveis) {
            g.gravar("nota de voz");
        }

        System.out.println("\n--- Compartilhavel (so o Smartphone) ---");
        smartphone.compartilhar("grupo da familia");
    }
}
