package app;

import model.Retangulo;

public class TesteRetangulo {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(4, 2); // construtor (double, double)
        ret.exibirDados();

        Retangulo quadrado = new Retangulo(5); // construtor (double), vira quadrado
        quadrado.exibirDados();

        Retangulo padrao = new Retangulo(); // construtor sem parametros
        padrao.exibirDados();
    }
}
