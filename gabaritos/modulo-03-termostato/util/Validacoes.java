package util;

/**
 * As tres regras do termostato, cada uma escrita UMA vez.
 *
 * Repare que nenhuma delas guarda estado: sao funcoes puras de apoio, por isso
 * static. Quem sabe qual e a maxima ATUAL do aparelho e o objeto Termostato;
 * aqui so mora a regra, nao o dado.
 */
public class Validacoes {

    public static final int MINIMA_ABSOLUTA = -50;
    public static final int MAXIMA_ABSOLUTA = 60;

    private Validacoes() {
        // Classe utilitaria: nao faz sentido instanciar
    }

    // Regra 1: nenhum valor escapa dos limites do aparelho
    public static boolean dentroDaFaixaAbsoluta(int temperatura) {
        if (temperatura < MINIMA_ABSOLUTA || temperatura > MAXIMA_ABSOLUTA) {
            System.out.println("Erro: temperatura fora da faixa permitida ("
                    + MINIMA_ABSOLUTA + " a " + MAXIMA_ABSOLUTA + ").");
            return false;
        }
        return true;
    }

    /*
     * Regra 2: o coracao do exercicio.
     * O metodo recebe DOIS parametros porque a regra fala sobre o par, nao
     * sobre um valor solto. Quem chama e que decide qual dos dois e o valor
     * novo e qual e o que o objeto ja tinha.
     */
    public static boolean faixaValida(int minima, int maxima) {
        return minima < maxima;
    }

    // Regra 3: a temperatura atual respeita a faixa configurada
    public static boolean valorNaFaixa(int valor, int minima, int maxima) {
        return valor >= minima && valor <= maxima;
    }
}
