package app;

import java.util.ArrayList;
import java.util.List;

import model.Musica;

public class TestePlaylist {

    public static void main(String[] args) {
        List<Musica> playlist = new ArrayList<>();
        playlist.add(new Musica("Musica 1", "Coldplay", 225));
        playlist.add(new Musica("Musica 2", "Adele", 250));
        playlist.add(new Musica("Musica 3", "Queen", 355));
        playlist.add(new Musica("Musica 4", "Beatles", 150));
        playlist.add(new Musica("Musica 5", "Rihanna", 200));

        System.out.println("--- Playlist ---");
        for (Musica musica : playlist) {
            musica.exibirDados();
        }

        int totalSegundos = 0;
        for (Musica musica : playlist) {
            totalSegundos += musica.getDuracaoSegundos();
        }
        System.out.printf("%nDuracao total: %02d:%02d%n", totalSegundos / 60, totalSegundos % 60);

        Musica primeira = playlist.get(0);
        Musica ultima = playlist.get(playlist.size() - 1);
        System.out.print("Primeira: ");
        primeira.exibirDados();
        System.out.print("Ultima: ");
        ultima.exibirDados();

        playlist.remove(2); // remove a musica do meio (indice 2)
        System.out.println("\n--- Apos remover a musica do meio ---");
        for (Musica musica : playlist) {
            musica.exibirDados();
        }
    }
}
