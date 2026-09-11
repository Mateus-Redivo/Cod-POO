package model;

public class Semaforo {

    private String cruzamento;
    private String corAtual;
    private int totalDeCiclos;

    public Semaforo(String cruzamento) {
        this.cruzamento = cruzamento;
        this.corAtual = "vermelho";
        this.totalDeCiclos = 0;
    }

    public void avancar() {
        String corAnterior = corAtual;

        if (corAtual.equals("vermelho")) {
            corAtual = "verde";
        } else if (corAtual.equals("verde")) {
            corAtual = "amarelo";
        } else if (corAtual.equals("amarelo")) {
            corAtual = "vermelho";
            totalDeCiclos++;
        }

        System.out.println("Semaforo " + cruzamento + ": " + corAnterior + " -> " + corAtual);
    }

    public void forcarVermelho() {
        corAtual = "vermelho";
        System.out.println("Semaforo " + cruzamento + ": parada forcada, foi direto para vermelho.");
    }

    public void exibirEstado() {
        System.out.println(cruzamento + " | cor: " + corAtual + " | ciclos completos: " + totalDeCiclos);
    }
}
