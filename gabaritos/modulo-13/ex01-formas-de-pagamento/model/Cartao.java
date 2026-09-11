package model;

public class Cartao implements MeioDePagamento {
    private double valor;
    private int numeroDeParcelas;

    public Cartao(double valor, int numeroDeParcelas) {
        this.valor = valor;
        this.numeroDeParcelas = numeroDeParcelas;
    }

    @Override
    public double calcularValorAPagar() {
        if (numeroDeParcelas > 1) {
            return valor + (valor * 0.05);
        }
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Cartao em " + numeroDeParcelas + "x";
    }
}
