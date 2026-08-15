package app;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class TesteLivraria {

    // Sem equals/hashCode sobrescritos, o passo 2 abaixo daria "false":
    // a lista compararia REFERENCIAS, e o objeto novo criado no contains()
    // nunca e o MESMO objeto que ja esta na lista, mesmo com o isbn igual.

    public static void main(String[] args) {
        List<Livro> catalogo = new ArrayList<>();
        catalogo.add(new Livro("9788535902778", "Dom Casmurro", "Machado de Assis"));
        catalogo.add(new Livro("9788525406958", "O Cortico", "Aluisio Azevedo"));
        catalogo.add(new Livro("9788535911015", "Iracema", "Jose de Alencar"));

        System.out.println("--- Catalogo ---");
        for (Livro livro : catalogo) {
            livro.exibirDados();
        }

        boolean existe = catalogo.contains(new Livro("9788535902778", "Dom Casmurro (edicao 2)", "M. de Assis"));
        System.out.println("\ncontains(isbn existente, dados diferentes) -> " + existe);

        boolean naoExiste = catalogo.contains(new Livro("0000000000000", "Livro Fantasma", "Ninguem"));
        System.out.println("contains(isbn inexistente) -> " + naoExiste);

        Livro repetido = new Livro("9788535902778", "Dom Casmurro", "Machado de Assis");
        if (catalogo.contains(repetido)) {
            System.out.println("\nLivro com isbn " + repetido.getIsbn() + " ja esta cadastrado. Cadastro recusado.");
        } else {
            catalogo.add(repetido);
        }
    }
}
