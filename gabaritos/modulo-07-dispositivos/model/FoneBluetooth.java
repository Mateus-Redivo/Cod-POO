package model;

// Fone: implementa APENAS Carregavel (a conexao bluetooth nao e wifi)
public class FoneBluetooth implements Carregavel {
    private String marca;
    private int nivelBateria;

    public FoneBluetooth(String marca) {
        this.marca = marca;
        this.nivelBateria = 20;
    }

    @Override
    public void carregar(int minutos) {
        if (minutos <= 0) {
            System.out.println("Tempo de carga invalido: deve ser positivo.");
            return;
        }
        nivelBateria += 2 * minutos; // carrega 2% por minuto
        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "FoneBluetooth " + marca;
    }
}
