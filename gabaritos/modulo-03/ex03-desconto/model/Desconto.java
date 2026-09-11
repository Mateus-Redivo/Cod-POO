package model;

public class Desconto {

    private String tipo;
    private double valor;
    private boolean cumulativo;

    public Desconto(int percentual) {
        this.tipo = "percentual";
        this.valor = percentual;
        this.cumulativo = false;
    }

    public Desconto(double valorFixo) {
        this.tipo = "fixo";
        this.valor = valorFixo;
        this.cumulativo = false;
    }

    public Desconto(int percentual, boolean cumulativo) {
        this.tipo = "percentual";
        this.valor = percentual;
        this.cumulativo = cumulativo;
    }

    public double aplicarSobre(double preco) {
        double resultado;
        if (tipo.equals("percentual")) {
            resultado = preco - (preco * valor / 100);
        } else {
            resultado = preco - valor;
        }
        if (resultado < 0) {
            resultado = 0;
        }
        return resultado;
    }

    public void exibirDados() {
        System.out.println("Desconto [tipo=" + tipo + ", valor=" + valor + ", cumulativo=" + cumulativo + "]");
    }
}
