package model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Sobrescrita: mesma assinatura de Veiculo.acelerar, comportamento proprio
    @Override
    public void acelerar(double incremento) {
        System.out.println("Carro " + marca + " " + modelo + " esta acelerando...");
        super.acelerar(incremento);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Numero de portas: " + numeroPortas);
    }
}
