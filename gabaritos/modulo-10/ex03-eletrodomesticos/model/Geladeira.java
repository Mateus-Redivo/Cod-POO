package model;

public class Geladeira extends AparelhoCozinha {
    private int temperaturaAtual;

    public Geladeira(String marca, int voltagem, int potenciaWatts) {
        super(marca, voltagem, potenciaWatts);
        this.temperaturaAtual = 4;
    }

    public void resfriar(int graus) {
        if (temperaturaAtual - graus < -5) {
            System.out.println("Erro: nao e possivel resfriar abaixo de -5 graus.");
            return;
        }
        temperaturaAtual -= graus;
        System.out.println("Geladeira resfriada para " + temperaturaAtual + " graus.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Temperatura atual: " + temperaturaAtual + " graus");
    }
}
