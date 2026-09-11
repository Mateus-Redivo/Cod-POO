package model;

// Capacidade de carregar bateria
public interface Carregavel {
    void carregar(int minutos);
    int getNivelBateria(); // 0 a 100
}
