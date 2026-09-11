package model;

public class Pedido {

    private int numeroDoPedido;
    private Pizza pizza1;
    private Pizza pizza2;

    public Pedido(int numeroDoPedido, Pizza pizza1, Pizza pizza2) {
        this.numeroDoPedido = numeroDoPedido;
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }

    public int calcularTotalDeFatias() {
        return pizza1.obterQuantidadeFatias() + pizza2.obterQuantidadeFatias();
    }

    public void exibirPedido() {
        System.out.println("Pedido #" + numeroDoPedido + ":");
        pizza1.exibirDados();
        pizza2.exibirDados();
    }
}
