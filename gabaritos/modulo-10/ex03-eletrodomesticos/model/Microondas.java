package model;

public class Microondas extends AparelhoCozinha {
    private int tempoMaximoMinutos;

    public Microondas(String marca, int voltagem, int potenciaWatts, int tempoMaximoMinutos) {
        super(marca, voltagem, potenciaWatts);
        this.tempoMaximoMinutos = tempoMaximoMinutos;
    }

    public void aquecer(int minutos) {
        if (minutos > tempoMaximoMinutos) {
            System.out.println("Erro: o maximo permitido e " + tempoMaximoMinutos + " minutos.");
            return;
        }
        System.out.println("Aquecendo por " + minutos + " minutos.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tempo maximo: " + tempoMaximoMinutos + " minutos");
    }
}
