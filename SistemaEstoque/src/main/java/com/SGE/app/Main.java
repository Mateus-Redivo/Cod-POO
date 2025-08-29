package main.java.com.SGE.app;

import java.util.List;
import java.util.Scanner;

import main.java.com.SGE.models.Estoque;
import main.java.com.SGE.models.Produto;

public class Main {
    private static Estoque estoque = new Estoque();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;
        
        // Pré-cadastrar alguns produtos para teste
        inicializarEstoque();
        
        while (executando) {
            exibirMenu();
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    atualizarEstoque();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    buscarPorNome();
                    break;
                case 5:
                    listarTodos();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Finalizando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            
            // Pausa para o usuário ler a saída
            if (executando) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void inicializarEstoque() {
        // Cria alguns produtos
        Produto p1 = new Produto(1, "Notebook", 3500.0);
        Produto p2 = new Produto(2, "Mouse", 50.0);
        Produto p3 = new Produto(3, "Teclado", 120.0);
        
        // Cadastra produtos no estoque
        estoque.cadastrarProduto(p1);
        estoque.cadastrarProduto(p2);
        estoque.cadastrarProduto(p3);
        
        // Adiciona quantidade aos produtos
        estoque.atualizarEstoque(1, 10);
        estoque.atualizarEstoque(2, 20);
        estoque.atualizarEstoque(3, 15);
        
        System.out.println("Estoque inicializado com produtos para teste.");
    }
    
    private static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE ESTOQUE =====");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Atualizar quantidade em estoque");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Buscar produto por nome");
        System.out.println("5 - Listar todos os produtos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static int lerOpcao() {
        try {
            int opcao = Integer.parseInt(scanner.nextLine());
            return opcao;
        } catch (NumberFormatException e) {
            return -1; // Retorna opção inválida
        }
    }
    
    private static void cadastrarProduto() {
        try {
            System.out.println("\n--- CADASTRO DE PRODUTO ---");
            
            System.out.print("Informe o código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Informe o nome do produto: ");
            String nome = scanner.nextLine();
            
            System.out.print("Informe o preço do produto: R$ ");
            double preco = Double.parseDouble(scanner.nextLine());
            
            Produto novoProduto = new Produto(codigo, nome, preco);
            boolean sucesso = estoque.cadastrarProduto(novoProduto);
            
            if (sucesso) {
                System.out.println("Produto cadastrado com sucesso!");
                
                System.out.print("Deseja adicionar quantidade em estoque? (S/N): ");
                String resposta = scanner.nextLine();
                
                if (resposta.equalsIgnoreCase("S")) {
                    System.out.print("Informe a quantidade a adicionar: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    estoque.atualizarEstoque(codigo, quantidade);
                    System.out.println("Estoque atualizado com sucesso!");
                }
            } else {
                System.out.println("Erro: Produto com este código já existe!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }
    
    private static void atualizarEstoque() {
        try {
            System.out.println("\n--- ATUALIZAÇÃO DE ESTOQUE ---");
            
            System.out.print("Informe o código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Informe a quantidade a adicionar (use valores negativos para remover): ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            
            boolean sucesso = estoque.atualizarEstoque(codigo, quantidade);
            if (sucesso) {
                System.out.println("Estoque atualizado com sucesso!");
            } else {
                System.out.println("Erro: Produto não encontrado ou quantidade insuficiente!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }
    
    private static void removerProduto() {
        try {
            System.out.println("\n--- REMOÇÃO DE PRODUTO ---");
            
            System.out.print("Informe o código do produto a remover: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            boolean sucesso = estoque.removerProduto(codigo);
            if (sucesso) {
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Erro: Produto não encontrado!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }
    
    private static void buscarPorNome() {
        System.out.println("\n--- BUSCA POR NOME ---");
        
        System.out.print("Informe o termo de busca: ");
        String termo = scanner.nextLine();
        
        List<Produto> resultados = estoque.buscarProdutoPorNome(termo);
        
        if (resultados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com o termo: " + termo);
        } else {
            System.out.println("\nProdutos encontrados:");
            for (Produto p : resultados) {
                p.exibirInformacoes();
                System.out.println("----------------------------");
            }
        }
    }
    
    private static void listarTodos() {
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        estoque.listarProdutos();
    }
}
