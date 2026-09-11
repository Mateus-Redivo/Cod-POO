public class ReciboDeCompra {

    public static void main(String[] args) {
        System.out.println("=== RECIBO ===\n");

        String nome1 = "Caderno";
        double preco1 = 12.90;
        int quantidade1 = 3;
        double subtotal1 = calcularSubtotal(preco1, quantidade1);
        System.out.println(nome1 + " x" + quantidade1 + " = " + subtotal1);

        String nome2 = "Caneta";
        double preco2 = 2.50;
        int quantidade2 = 5;
        double subtotal2 = calcularSubtotal(preco2, quantidade2);
        System.out.println(nome2 + " x" + quantidade2 + " = " + subtotal2);

        String nome3 = "Mochila";
        double preco3 = 89.90;
        int quantidade3 = 1;
        double subtotal3 = calcularSubtotal(preco3, quantidade3);
        System.out.println(nome3 + " x" + quantidade3 + " = " + subtotal3);

        double total = subtotal1 + subtotal2 + subtotal3;
        System.out.println("\nTotal: " + total);
    }

    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }
}
