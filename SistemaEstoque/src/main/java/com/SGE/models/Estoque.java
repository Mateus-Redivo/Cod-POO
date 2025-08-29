package main.java.com.SGE.models;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    
    public Estoque() {
        this.produtos = new ArrayList<>();
    }
    
    public boolean cadastrarProduto(Produto produto) {
        if (produto != null) {
            for (Produto p : produtos) {
                if (p.getId() == produto.getId()) {
                    System.out.println("Erro: Produto com ID " + produto.getId() + " já existe!");
                    return false;
                }
            }
            produtos.add(produto);
            System.out.println("Produto '" + produto.getNome() + "' cadastrado com sucesso!");
            return true;
        }
        return false;
    }
    
    public boolean atualizarEstoque(int id, int quantidade) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            if (quantidade > 0) {
                produto.adicionarEstoque(quantidade);
                return true;
            } else if (quantidade < 0) {
                int qtdRemover = Math.abs(quantidade);
                if (produto.getQuantidadeEmEstoque() >= qtdRemover) {
                    produto.removerEstoque(qtdRemover);
                    return true;
                } else {
                    System.out.println("Quantidade insuficiente no estoque.");
                    return false;
                }
            }
            return true; // Quantidade zero é uma operação válida mas não faz nada
        } else {
            System.out.println("Produto com ID " + id + " não encontrado!");
            return false;
        }
    }
    
    public boolean removerProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto '" + produto.getNome() + "' removido com sucesso!");
            return true;
        } else {
            System.out.println("Produto com ID " + id + " não encontrado!");
            return false;
        }
    }
    
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados no estoque.");
            return;
        }
        
        System.out.println("=== LISTAGEM DE PRODUTOS ===");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("----------------------------");
        }
    }
    
    public List<Produto> buscarProdutoPorNome(String nome) {
        List<Produto> resultado = new ArrayList<>();
        
        if (nome == null || nome.trim().isEmpty()) {
            return resultado;
        }
        
        String nomeBusca = nome.toLowerCase();
        
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(nomeBusca)) {
                resultado.add(produto);
            }
        }
        
        return resultado;
    }
    
    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
}
