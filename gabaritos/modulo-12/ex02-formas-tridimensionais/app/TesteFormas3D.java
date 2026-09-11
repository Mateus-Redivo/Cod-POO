package app;

import java.util.ArrayList;
import java.util.List;

import model.Cilindro;
import model.Cubo;
import model.Esfera;
import model.FormaTridimensional;

public class TesteFormas3D {

    public static void main(String[] args) {
        List<FormaTridimensional> formas = new ArrayList<>();
        formas.add(new Cubo(3));
        formas.add(new Esfera(2));
        formas.add(new Cilindro(2, 5));

        double volumeTotal = 0;
        for (FormaTridimensional forma : formas) {
            forma.exibirInfo();
            volumeTotal += forma.calcularVolume();
        }

        System.out.println("\nVolume total: " + volumeTotal);
    }
}
