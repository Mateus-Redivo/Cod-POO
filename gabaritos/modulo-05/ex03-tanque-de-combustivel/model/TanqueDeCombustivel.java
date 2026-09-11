package model;

public class TanqueDeCombustivel {

    private double capacidadeMaxima;
    private double nivelAtual;

    public TanqueDeCombustivel(double capacidadeMaxima) {
        if (capacidadeMaxima <= 0) {
            System.out.println("Aviso: capacidade invalida (" + capacidadeMaxima + "). Usando 50.0 litros.");
            this.capacidadeMaxima = 50.0;
        } else {
            this.capacidadeMaxima = capacidadeMaxima;
        }
        this.nivelAtual = 0.0;
    }

    public void abastecer(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: informe um numero positivo de litros para abastecer.");
            return;
        }
        double excedente = (nivelAtual + litros) - capacidadeMaxima;
        if (excedente > 0) {
            System.out.println("Erro: abastecer " + litros + " litros excederia a capacidade em " + excedente + " litros.");
            return;
        }
        nivelAtual += litros;
        System.out.println("Abastecido com " + litros + " litros.");
    }

    public void consumir(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: informe um numero positivo de litros para consumir.");
            return;
        }
        if (litros > nivelAtual) {
            System.out.println("Erro: consumir " + litros + " litros deixaria o tanque negativo (nivel atual: " + nivelAtual + ").");
            return;
        }
        nivelAtual -= litros;
        System.out.println("Consumidos " + litros + " litros.");
    }

    public double getNivelAtual() {
        return nivelAtual;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    @Override
    public String toString() {
        double percentual = nivelAtual / capacidadeMaxima * 100;
        return "Tanque [nivelAtual=" + nivelAtual + ", capacidadeMaxima=" + capacidadeMaxima
                + ", percentualCheio=" + percentual + "%]";
    }
}
