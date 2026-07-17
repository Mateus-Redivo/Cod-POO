package model;

import util.Validacoes;

public class Jogador {
    private String apelido;
    private int nivel;
    private int pontuacao;

    public Jogador(String apelido, int nivel) {
        // Reutiliza os setters: a regra mora em Validacoes, nao se repete aqui
        setApelido(apelido);
        setNivel(nivel);
        this.pontuacao = 0;
    }

    public void setApelido(String apelido) {
        if (Validacoes.validarApelido(apelido)) {
            this.apelido = apelido;
        }
        // Se for invalido, o atributo simplesmente nao muda: o objeto continua integro
    }

    public void setNivel(int nivel) {
        if (Validacoes.validarNivel(nivel)) {
            this.nivel = nivel;
        }
    }

    public void ganharPontos(int pontos) {
        if (pontos <= 0) {
            System.out.println("Pontos devem ser positivos.");
            return;
        }
        pontuacao += pontos;
    }

    public void perderPontos(int pontos) {
        if (pontos <= 0) {
            System.out.println("Pontos devem ser positivos.");
            return;
        }
        if (pontos >= pontuacao) {
            // Nunca deixa a pontuacao ficar negativa: trava em 0
            pontuacao = 0;
            System.out.println(apelido + " perdeu " + pontos + " pontos (pontuacao travada em 0).");
        } else {
            pontuacao -= pontos;
            System.out.println(apelido + " perdeu " + pontos + " pontos.");
        }
    }

    public void subirNivel() {
        if (nivel < 100) {
            nivel++;
        } else {
            System.out.println("Nivel maximo (100) ja atingido.");
        }
    }

    @Override
    public String toString() {
        return "Jogador [apelido=" + apelido + ", nivel=" + nivel + ", pontuacao=" + pontuacao + "]";
    }

    // Getters
    public String getApelido() {
        return apelido;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
