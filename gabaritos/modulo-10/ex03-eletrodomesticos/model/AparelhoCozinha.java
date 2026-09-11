package model;

public class AparelhoCozinha extends Eletrodomestico {
    protected int potenciaWatts;

    public AparelhoCozinha(String marca, int voltagem, int potenciaWatts) {
        super(marca, voltagem);
        this.potenciaWatts = potenciaWatts;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Potencia: " + potenciaWatts + "W");
    }
}
