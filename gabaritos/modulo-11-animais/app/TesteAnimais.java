package app;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Gato;
import model.Passaro;

public class TesteAnimais {

    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex", 3);
        rex.emitirSom();
        rex.emitirSom(3); // sobrecarga: chama emitirSom() tres vezes

        System.out.println("\n--- Lista polimorfica ---");
        List<Animal> animais = new ArrayList<>();
        animais.add(rex);
        animais.add(new Gato("Mimi", 2));
        animais.add(new Passaro("Bibi", 1, true));

        // O Java olha o objeto REAL guardado em cada posicao da lista,
        // nao o tipo da variavel "animal" (que e sempre Animal), para
        // decidir qual versao de emitirSom() executar.
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
