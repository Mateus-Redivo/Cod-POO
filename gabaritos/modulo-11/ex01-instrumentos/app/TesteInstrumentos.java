package app;

import java.util.ArrayList;
import java.util.List;

import model.Bateria;
import model.Instrumento;
import model.Violao;

public class TesteInstrumentos {

    public static void main(String[] args) {
        Violao violao = new Violao("Violao classico");
        Bateria bateria = new Bateria("Bateria acustica");

        violao.afinar();   // sobrecarga, resolvida em compilacao (afinar() sem parametro)
        violao.afinar(5);  // sobrecarga, resolvida em compilacao (afinar(int) com parametro)

        violao.tocar();    // sobrescrita, resolvida em execucao (versao de Violao)
        bateria.tocar();   // sobrescrita, resolvida em execucao (versao de Bateria)

        System.out.println("\n--- Lista polimorfica ---");
        List<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
