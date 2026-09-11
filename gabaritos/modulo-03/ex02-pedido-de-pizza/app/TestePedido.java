package app;

import model.Pedido;
import model.Pizza;

public class TestePedido {

    public static void main(String[] args) {
        Pizza calabresa = new Pizza("Calabresa", "grande");  // construtor (String, String)
        Pizza marguerita = new Pizza("Marguerita");           // construtor (String) -- tamanho vira "media"
        Pizza padrao = new Pizza();                           // construtor () -- Mussarela, media

        Pedido pedido = new Pedido(1001, calabresa, marguerita);
        pedido.exibirPedido();

        System.out.println();
        System.out.println("Total de fatias no pedido: " + pedido.calcularTotalDeFatias());

        System.out.println();
        System.out.println("Pizza padrao (nao usada no pedido, so demonstrando o 3o construtor):");
        padrao.exibirDados();
    }
}
