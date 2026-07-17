package app;

import java.util.ArrayList;
import java.util.List;

import model.ItemVenda;

/*
 * Respostas da secao "O que refatorar" do enunciado:
 * 1. Bloco duplicado 3 vezes: o calculo de subtotal, desconto e total,
 *    seguido do printf da linha do item.
 * 2. Variaveis numeradas: nome1/2/3, preco1/2/3, quantidade1/2/3,
 *    generico1/2/3, subtotal1/2/3, desconto1/2/3, total1/2/3.
 * 3. Numeros magicos: 0.20 (desconto de generico), 0.10 (desconto de compra
 *    grande) e 100.0 (limite de subtotal para o desconto de compra grande).
 */
public class Farmacia {

    public static void main(String[] args) {
        System.out.println("=== FARMACIA BEM BARATA ===\n");

        // Um quarto item entra com UMA linha nova aqui
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Dipirona", 8.50, 3, true));
        itens.add(new ItemVenda("Vitamina C", 45.00, 4, false));
        itens.add(new ItemVenda("Protetor solar", 60.00, 1, false));

        double totalVenda = 0.0;
        for (ItemVenda item : itens) {
            item.exibirLinha();
            totalVenda += item.calcularTotal();
        }

        System.out.printf("%nTotal da venda: R$ %.2f%n", totalVenda);
    }
}
