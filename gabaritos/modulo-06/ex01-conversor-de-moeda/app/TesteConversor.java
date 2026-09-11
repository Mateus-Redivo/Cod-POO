package app;

import model.ProdutoImportado;
import util.Cambio;

public class TesteConversor {

    public static void main(String[] args) {
        ProdutoImportado fone = new ProdutoImportado("Fone de Ouvido", 45.0);
        ProdutoImportado teclado = new ProdutoImportado("Teclado Mecanico", 89.9);

        fone.exibirPrecoConvertido();
        teclado.exibirPrecoConvertido();

        // Sem "new Cambio()" -- o construtor e privado, usamos o metodo static direto
        double emDolares = Cambio.paraDolares(100.0);
        System.out.println("100.0 reais equivalem a " + emDolares + " dolares");
    }
}
