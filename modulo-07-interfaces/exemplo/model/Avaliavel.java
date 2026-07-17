package model;

// Segunda interface do exemplo. Uma classe pode implementar VARIAS interfaces
// ao mesmo tempo — diferente da heranca, em que so se estende UMA classe.
public interface Avaliavel {

    void receberAvaliacao(int nota);

    double getMediaAvaliacoes();
}
