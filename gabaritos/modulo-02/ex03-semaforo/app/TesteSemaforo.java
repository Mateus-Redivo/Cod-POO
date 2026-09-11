package app;

import model.Semaforo;

public class TesteSemaforo {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo("Rua A com Rua B");

        for (int i = 0; i < 5; i++) {
            semaforo.avancar();
            semaforo.exibirEstado();
        }

        System.out.println();
        semaforo.forcarVermelho();
        semaforo.exibirEstado();
    }
}
