package model;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void exibirDados() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        System.out.printf("%s (%s) - %02d:%02d%n", titulo, artista, minutos, segundos);
    }
}
