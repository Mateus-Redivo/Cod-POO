package model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String marca, String modelo, int ano, boolean temBau) {
        super(marca, modelo, ano);
        this.temBau = temBau;
    }

    // Mesma assinatura de Veiculo.acelerar -- outra versao, sobrescrita de novo
    @Override
    public void acelerar(double incremento) {
        System.out.println("Moto " + marca + " " + modelo + " empinando e acelerando...");
        super.acelerar(incremento);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tem bau: " + (temBau ? "sim" : "nao"));
    }
}
