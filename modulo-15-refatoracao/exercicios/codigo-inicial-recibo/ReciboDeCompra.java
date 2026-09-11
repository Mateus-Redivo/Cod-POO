// CODIGO INICIAL DO EXERCICIO. Sua missao esta em EXERCICIO-01-recibo-de-compra.md.
public class ReciboDeCompra {

    public static void main(String[] args) {
        System.out.println("=== RECIBO ===\n");

        // Item 1
        String nome1 = "Caderno";
        double preco1 = 12.90;
        int quantidade1 = 3;
        double subtotal1 = preco1 * quantidade1;
        System.out.println(nome1 + " x" + quantidade1 + " = " + subtotal1);

        // Item 2
        String nome2 = "Caneta";
        double preco2 = 2.50;
        int quantidade2 = 5;
        double subtotal2 = preco2 * quantidade2;
        System.out.println(nome2 + " x" + quantidade2 + " = " + subtotal2);

        // Item 3
        String nome3 = "Mochila";
        double preco3 = 89.90;
        int quantidade3 = 1;
        double subtotal3 = preco3 * quantidade3;
        System.out.println(nome3 + " x" + quantidade3 + " = " + subtotal3);

        double total = subtotal1 + subtotal2 + subtotal3;
        System.out.println("\nTotal: " + total);
    }
}
