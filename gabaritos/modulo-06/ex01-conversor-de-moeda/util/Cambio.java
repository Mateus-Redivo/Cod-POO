package util;

public class Cambio {

    public static final double TAXA_DOLAR = 5.20;

    private Cambio() {
    }

    public static double paraReais(double valorEmDolares) {
        return valorEmDolares * TAXA_DOLAR;
    }

    public static double paraDolares(double valorEmReais) {
        return valorEmReais / TAXA_DOLAR;
    }
}
