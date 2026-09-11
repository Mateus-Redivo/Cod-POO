package model;

public interface Reproduzivel {
    int VOLUME_MAXIMO = 100; // implicitamente public static final

    void tocar();
    void pausar();
}
