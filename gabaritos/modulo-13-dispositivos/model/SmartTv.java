package model;

// TV fica na tomada: implementa APENAS Conectavel.
// O modelo reflete a realidade — carregar não faz sentido aqui.
public class SmartTv implements Conectavel {
    private int polegadas;
    private boolean conectado;
    private String redeAtual;

    public SmartTv(int polegadas) {
        this.polegadas = polegadas;
        this.conectado = false;
        this.redeAtual = null;
    }

    @Override
    public void conectar(String rede) {
        if (rede == null || rede.trim().isEmpty()) {
            System.out.println("Rede invalida: o nome nao pode ser vazio.");
            return;
        }
        this.conectado = true;
        this.redeAtual = rede;
        System.out.println("SmartTv " + polegadas + "pol conectada a rede " + rede + ".");
    }

    @Override
    public void desconectar() {
        this.conectado = false;
        this.redeAtual = null;
        System.out.println("SmartTv " + polegadas + "pol desconectada.");
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public String getRedeAtual() {
        return redeAtual;
    }

    @Override
    public String toString() {
        return "SmartTv " + polegadas + "pol";
    }
}
