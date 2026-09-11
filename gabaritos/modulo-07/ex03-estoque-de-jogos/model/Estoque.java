package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Jogo> jogos = new ArrayList<>();

    public void adicionar(Jogo jogo) {
        jogos.add(jogo);
    }

    public double calcularValorTotalEstoque() {
        double total = 0.0;
        for (Jogo jogo : jogos) {
            total += jogo.getPreco() * jogo.getQuantidade();
        }
        return total;
    }

    public List<Jogo> listarPorGenero(String genero) {
        List<Jogo> resultado = new ArrayList<>();
        for (Jogo jogo : jogos) {
            if (jogo.getGenero().equals(genero)) {
                resultado.add(jogo);
            }
        }
        return resultado;
    }

    public void venderUnidade(String titulo) {
        for (Jogo jogo : jogos) {
            if (jogo.getTitulo().equals(titulo)) {
                if (jogo.getQuantidade() == 0) {
                    System.out.println("Sem estoque de " + titulo);
                    return;
                }
                jogo.setQuantidade(jogo.getQuantidade() - 1);
                System.out.println("Vendida 1 unidade de " + titulo + ". Restam: " + jogo.getQuantidade());
                return;
            }
        }
        System.out.println("Jogo nao encontrado: " + titulo);
    }
}
