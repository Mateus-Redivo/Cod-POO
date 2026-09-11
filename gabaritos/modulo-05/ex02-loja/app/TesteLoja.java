package app;

import model.Loja;
import model.Produto;

public class TesteLoja {

    public static void main(String[] args) {
        Produto caderno = new Produto("Caderno", 25.9, 10);
        Produto caneta = new Produto("Caneta", 3.5, 100);

        Loja loja = new Loja("Papelaria Central", caderno, caneta);
        loja.exibirEstoque();

        System.out.println();
        loja.venderUnidades(caderno, 4);
        loja.venderUnidades(caderno, 50); // deve recusar

        System.out.println();
        Produto invalido = new Produto("Borracha", -5.0, 20);
        System.out.println("Produto com preco invalido nasceu como: " + invalido);

        System.out.println();
        loja.exibirEstoque();
    }
}
