package livro.app;

import livro.model.Livro;
import livro.model.Usuario;

public class TesteBiblioteca {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BIBLIOTECA ===");
        System.out.println();
        
        // 1. Criando livros
        System.out.println("1. Criando livros:");
        Livro livro1 = new Livro("Programação em JAVA", "Desconhecido", 1024);
        Livro livro2 = new Livro("Python", "Floresta", 25);
        
        livro1.exibirInfo();
        livro2.exibirInfo();
        System.out.println();
        
        // 2. Testando empréstimos
        System.out.println("2. Testando empréstimos:");
        livro1.emprestar();
        livro1.exibirInfo();
        System.out.println();
        
        // 3. Testando devolução
        System.out.println("3. Testando devolução:");
        livro1.devolver();
        livro1.exibirInfo();
        System.out.println();
        
        // 4. Criando e exibindo dados do usuário
        System.out.println("4. Dados do usuário:");
        Usuario usuario = new Usuario("João Silva", "joao@email.com", 25);
        usuario.exibirDados();
        System.out.println();
        
        System.out.println("=== FIM DO TESTE ===");
    }
}