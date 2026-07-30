// CÓDIGO INICIAL DO EXERCÍCIO DE REFATORACAO.
// Este programa funciona, mas foi escrito sem POO: tudo no main,
// com muito copiar e colar. Sua missão esta em EXERCICIO-01-refatorar-farmacia.md.
public class Farmacia {

    public static void main(String[] args) {
        System.out.println("=== FARMACIA BEM BARATA ===\n");

        // Produto 1
        String nome1 = "Dipirona";
        double preco1 = 8.50;
        int quantidade1 = 3;
        boolean generico1 = true;
        double subtotal1 = preco1 * quantidade1;
        double desconto1;
        if (generico1) {
            desconto1 = subtotal1 * 0.20;
        } else if (subtotal1 > 100.0) {
            desconto1 = subtotal1 * 0.10;
        } else {
            desconto1 = 0.0;
        }
        double total1 = subtotal1 - desconto1;
        System.out.printf("%s x%d: R$ %.2f (desconto R$ %.2f)%n", nome1, quantidade1, total1, desconto1);

        // Produto 2
        String nome2 = "Vitamina C";
        double preco2 = 45.00;
        int quantidade2 = 4;
        boolean generico2 = false;
        double subtotal2 = preco2 * quantidade2;
        double desconto2;
        if (generico2) {
            desconto2 = subtotal2 * 0.20;
        } else if (subtotal2 > 100.0) {
            desconto2 = subtotal2 * 0.10;
        } else {
            desconto2 = 0.0;
        }
        double total2 = subtotal2 - desconto2;
        System.out.printf("%s x%d: R$ %.2f (desconto R$ %.2f)%n", nome2, quantidade2, total2, desconto2);

        // Produto 3
        String nome3 = "Protetor solar";
        double preco3 = 60.00;
        int quantidade3 = 1;
        boolean generico3 = false;
        double subtotal3 = preco3 * quantidade3;
        double desconto3;
        if (generico3) {
            desconto3 = subtotal3 * 0.20;
        } else if (subtotal3 > 100.0) {
            desconto3 = subtotal3 * 0.10;
        } else {
            desconto3 = 0.0;
        }
        double total3 = subtotal3 - desconto3;
        System.out.printf("%s x%d: R$ %.2f (desconto R$ %.2f)%n", nome3, quantidade3, total3, desconto3);

        double totalVenda = total1 + total2 + total3;
        System.out.printf("%nTotal da venda: R$ %.2f%n", totalVenda);
    }
}
