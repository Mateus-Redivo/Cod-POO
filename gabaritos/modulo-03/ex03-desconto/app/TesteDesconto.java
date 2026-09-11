package app;

import model.Desconto;

public class TesteDesconto {

    public static void main(String[] args) {
        // 10 e um literal int: chama Desconto(int percentual)
        Desconto d1 = new Desconto(10);
        d1.exibirDados();
        System.out.println("Preco com desconto: " + d1.aplicarSobre(200.0));

        System.out.println();
        // 15.0 e um literal double: chama Desconto(double valorFixo).
        // Se fosse "new Desconto(15)" sem o ".0", chamaria Desconto(int) em vez deste,
        // porque o Java prefere o construtor com correspondencia EXATA de tipo antes
        // de considerar a conversao automatica int -> double.
        Desconto d2 = new Desconto(15.0);
        d2.exibirDados();
        System.out.println("Preco com desconto: " + d2.aplicarSobre(200.0));

        System.out.println();
        // 20 (int) + true (boolean): chama Desconto(int percentual, boolean cumulativo),
        // o unico com dois parametros -- nao ha ambiguidade aqui.
        Desconto d3 = new Desconto(20, true);
        d3.exibirDados();
        System.out.println("Preco com desconto: " + d3.aplicarSobre(200.0));
    }
}
