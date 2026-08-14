package app;

import model.Pessoa;
import util.Validacoes;

public class TesteValidacoes {

    public static void main(String[] args) {

        System.out.println("=== 1. Usando o construtor com 2 parametros (this(...) por baixo dos panos) ===");
        Pessoa davi = new Pessoa("Davi", 20);
        System.out.println(davi);

        System.out.println("\n=== 2. Ataque pelos setters ===");
        davi.setIdade(-50);
        davi.setNome("Davi123");
        System.out.println("Depois dos ataques: " + davi);

        System.out.println("\n=== 3. Metodo static: nao precisa de objeto ===");
        // Repare na ausencia de "new": o metodo pertence a classe, nao a um objeto
        System.out.println("idadeValida(30)  -> " + Validacoes.idadeValida(30));
        System.out.println("idadeValida(-50) -> " + Validacoes.idadeValida(-50));

        // Se tentar "new Validacoes()" aqui, o compilador recusa: o construtor e privado
    }
}
