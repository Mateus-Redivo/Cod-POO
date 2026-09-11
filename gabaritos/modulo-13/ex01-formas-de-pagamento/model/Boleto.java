package model;

public class Boleto implements MeioDePagamento {
    private double valor;
    private int diasParaVencer;

    public Boleto(double valor, int diasParaVencer) {
        this.valor = valor;
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcularValorAPagar() {
        if (diasParaVencer < 0) {
            return valor + (valor * 0.02);
        }
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Boleto (vence em " + diasParaVencer + " dias)";
    }
}
