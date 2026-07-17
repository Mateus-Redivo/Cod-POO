package app;

import model.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        System.out.println("=== LOJA ===");

        // 1. Dois produtos diferentes
        Produto caderno = new Produto("Caderno", 25.9, 10);
        Produto caneta = new Produto("Caneta", 3.5, 100);

        // 2. Impressao via toString
        System.out.println(caderno);
        System.out.println(caneta);

        // 3. Venda normal
        System.out.println();
        caderno.vender(4);
        System.out.println(caderno);

        // 4. Venda maior que o estoque: nada muda, so avisa
        System.out.println();
        caderno.vender(50);

        // 5. Valor total em estoque
        System.out.println();
        System.out.printf("Valor total em estoque de %s: R$ %.2f%n",
                caderno.getNome(), caderno.calcularValorTotal());
        System.out.printf("Valor total em estoque de %s: R$ %.2f%n",
                caneta.getNome(), caneta.calcularValorTotal());
    }
}
