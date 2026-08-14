package model;

// Segunda interface do exemplo. Uma classe pode implementar VARIAS interfaces
// ao mesmo tempo — diferente da herança, em que só se estende UMA classe.
public interface Avaliavel {

    void receberAvaliacao(int nota);

    double getMediaAvaliacoes();
}
