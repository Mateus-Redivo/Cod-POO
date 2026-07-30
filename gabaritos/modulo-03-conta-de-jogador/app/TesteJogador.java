package app;

import model.Jogador;

// Roteiro de ataque: tentamos corromper o objeto de todas as formas.
// Nenhuma tentativa inválida deve alterar o estado do Jogador.
public class TesteJogador {
    public static void main(String[] args) {
        // 1. Jogador válido
        Jogador jogador = new Jogador("Shadow", 5);
        System.out.println(jogador);

        // 2. Ataques ao apelido
        jogador.setApelido("");
        jogador.setApelido("Sha dow");
        jogador.setApelido("Sh");

        // 3. Ataques ao nível e aos pontos
        jogador.setNivel(0);
        jogador.setNivel(101);
        jogador.ganharPontos(-50);

        // 4. Perder mais pontos do que tem
        jogador.perderPontos(300);

        // 5. O objeto continua íntegro, com os últimos valores VÁLIDOS
        System.out.println(jogador);
    }
}
