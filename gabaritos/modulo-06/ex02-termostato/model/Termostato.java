package model;

import util.Validacoes;

/**
 * Um objeto com INVARIANTE: uma promessa que vale o tempo todo, nao importa
 * a ordem em que os metodos sejam chamados.
 *
 * Os tres invariantes desta classe:
 *   1. toda temperatura fica entre MINIMA_ABSOLUTA e MAXIMA_ABSOLUTA;
 *   2. temperaturaMinima e sempre MENOR que temperaturaMaxima;
 *   3. temperaturaAtual fica sempre entre a minima e a maxima configuradas.
 */
public class Termostato {

    // Faixa de conforto usada por estaConfortavel(): nada de numero solto no meio do codigo
    private static final int CONFORTO_MINIMO = 18;
    private static final int CONFORTO_MAXIMO = 24;

    /*
     * Valores de partida seguros. Se o construtor receber um trio impossivel,
     * o objeto nasce com esta configuracao em vez de nascer quebrado.
     * (No modulo 08 aprendemos a alternativa honesta: recusar a criacao.)
     */
    private static final int MINIMA_PADRAO = 16;
    private static final int MAXIMA_PADRAO = 28;
    private static final int ATUAL_PADRAO = 22;

    private int temperaturaMinima;
    private int temperaturaMaxima;
    private int temperaturaAtual;

    public Termostato(int minima, int maxima, int atual) {
        // Comeca valido; so entao tenta aplicar o que veio de fora
        this.temperaturaMinima = MINIMA_PADRAO;
        this.temperaturaMaxima = MAXIMA_PADRAO;
        this.temperaturaAtual = ATUAL_PADRAO;

        /*
         * A ordem importa: a faixa precisa estar de pe antes de posicionar a
         * temperatura atual dentro dela. Por isso o par (minima, maxima) e
         * validado junto, e nao um setter de cada vez -- setTemperaturaMinima(40)
         * seria recusado sozinho, mesmo o trio (40, 50, 45) sendo valido.
         */
        if (Validacoes.dentroDaFaixaAbsoluta(minima)
                && Validacoes.dentroDaFaixaAbsoluta(maxima)
                && Validacoes.faixaValida(minima, maxima)) {
            this.temperaturaMinima = minima;
            this.temperaturaMaxima = maxima;
        } else {
            System.out.println("Erro: faixa invalida no construtor, usando a padrao ("
                    + MINIMA_PADRAO + " a " + MAXIMA_PADRAO + ").");
        }

        if (Validacoes.valorNaFaixa(atual, this.temperaturaMinima, this.temperaturaMaxima)) {
            this.temperaturaAtual = atual;
        } else {
            // Sem valor valido para a atual, o meio da faixa e a escolha menos arbitraria
            this.temperaturaAtual = (this.temperaturaMinima + this.temperaturaMaxima) / 2;
            System.out.println("Erro: temperatura atual fora da faixa, ajustada para "
                    + this.temperaturaAtual + ".");
        }
    }

    /*
     * O metodo recebe UM numero, mas a regra depende de DOIS: ele pergunta a
     * Validacoes usando o valor novo junto com o valor que o objeto ja tem.
     * Guardar o estado e trabalho do objeto; conhecer a regra e da utilitaria.
     */
    public void setTemperaturaMinima(int minima) {
        if (!Validacoes.dentroDaFaixaAbsoluta(minima)) {
            return;
        }
        if (!Validacoes.faixaValida(minima, temperaturaMaxima)) {
            System.out.println("Erro: a temperatura minima deve ser menor que a maxima ("
                    + temperaturaMaxima + ").");
            return;
        }
        this.temperaturaMinima = minima;
        // Subir o piso pode ter deixado a temperatura atual para tras
        reposicionarAtual();
    }

    public void setTemperaturaMaxima(int maxima) {
        if (!Validacoes.dentroDaFaixaAbsoluta(maxima)) {
            return;
        }
        if (!Validacoes.faixaValida(temperaturaMinima, maxima)) {
            System.out.println("Erro: a temperatura maxima deve ser maior que a minima ("
                    + temperaturaMinima + ").");
            return;
        }
        this.temperaturaMaxima = maxima;
        reposicionarAtual();
    }

    public void aquecer(int graus) {
        if (graus <= 0) {
            System.out.println("Erro: informe um numero positivo de graus.");
            return;
        }
        int destino = temperaturaAtual + graus;
        if (destino > temperaturaMaxima) {
            System.out.println("Erro: aquecer " + graus + " graus passaria da maxima ("
                    + temperaturaMaxima + ").");
            return;
        }
        temperaturaAtual = destino;
        System.out.println("Aquecido para " + temperaturaAtual + " graus.");
    }

    public void resfriar(int graus) {
        if (graus <= 0) {
            System.out.println("Erro: informe um numero positivo de graus.");
            return;
        }
        int destino = temperaturaAtual - graus;
        if (destino < temperaturaMinima) {
            System.out.println("Erro: resfriar " + graus + " graus ficaria abaixo da minima ("
                    + temperaturaMinima + ").");
            return;
        }
        temperaturaAtual = destino;
        System.out.println("Resfriado para " + temperaturaAtual + " graus.");
    }

    public boolean estaConfortavel() {
        return Validacoes.valorNaFaixa(temperaturaAtual, CONFORTO_MINIMO, CONFORTO_MAXIMO);
    }

    /*
     * Mudar a faixa pode deixar a temperatura atual fora dela. Este metodo e
     * privado de proposito: e uma engrenagem interna, ninguem de fora chama.
     */
    private void reposicionarAtual() {
        if (temperaturaAtual < temperaturaMinima) {
            temperaturaAtual = temperaturaMinima;
            System.out.println("Aviso: temperatura atual ajustada para a nova minima ("
                    + temperaturaMinima + ").");
        } else if (temperaturaAtual > temperaturaMaxima) {
            temperaturaAtual = temperaturaMaxima;
            System.out.println("Aviso: temperatura atual ajustada para a nova maxima ("
                    + temperaturaMaxima + ").");
        }
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    @Override
    public String toString() {
        return "Termostato [minima=" + temperaturaMinima
                + ", maxima=" + temperaturaMaxima
                + ", atual=" + temperaturaAtual
                + ", confortavel=" + estaConfortavel() + "]";
    }
}
