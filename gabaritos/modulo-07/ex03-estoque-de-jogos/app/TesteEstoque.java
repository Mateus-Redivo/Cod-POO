package app;

import java.util.List;

import model.Estoque;
import model.Jogo;

public class TesteEstoque {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionar(new Jogo("Corrida Extrema", "Corrida", 99.90, 5));
        estoque.adicionar(new Jogo("Velocidade Maxima", "Corrida", 79.90, 0));
        estoque.adicionar(new Jogo("Aventura Epica", "Aventura", 129.90, 3));
        estoque.adicionar(new Jogo("Puzzle Mental", "Puzzle", 39.90, 10));
        estoque.adicionar(new Jogo("Corrida Noturna", "Corrida", 89.90, 2));

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("\n--- Jogos de Corrida ---");
        List<Jogo> corrida = estoque.listarPorGenero("Corrida");
        for (Jogo jogo : corrida) {
            jogo.exibirDados();
        }

        System.out.println("\n--- Vendas ---");
        estoque.venderUnidade("Corrida Extrema");
        estoque.venderUnidade("Velocidade Maxima"); // sem estoque
        estoque.venderUnidade("Jogo Inexistente");   // nao encontrado
    }
}
