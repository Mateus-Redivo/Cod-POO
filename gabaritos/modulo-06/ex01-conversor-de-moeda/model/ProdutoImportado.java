package model;

import util.Cambio;

public class ProdutoImportado {

    private String nome;
    private double precoEmDolares;

    public ProdutoImportado(String nome, double precoEmDolares) {
        this.nome = nome;
        this.precoEmDolares = precoEmDolares;
    }

    public void exibirPrecoConvertido() {
        double precoEmReais = Cambio.paraReais(precoEmDolares);
        System.out.println(nome + ": US$ " + precoEmDolares + " (R$ " + precoEmReais + ")");
    }
}
