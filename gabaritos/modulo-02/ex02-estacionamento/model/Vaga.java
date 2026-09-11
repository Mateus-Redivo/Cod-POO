package model;

public class Vaga {

    private int numero;
    private boolean ocupada;
    private String placaOcupante;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.placaOcupante = "";
    }

    public void ocupar(String placa) {
        if (ocupada) {
            System.out.println("Vaga " + numero + " ja esta ocupada.");
            return;
        }
        ocupada = true;
        placaOcupante = placa;
        System.out.println("Vaga " + numero + " ocupada pela placa " + placa + ".");
    }

    public void liberar() {
        if (!ocupada) {
            System.out.println("Vaga " + numero + " ja esta livre.");
            return;
        }
        ocupada = false;
        placaOcupante = "";
        System.out.println("Vaga " + numero + " liberada.");
    }

    public void exibirEstado() {
        if (ocupada) {
            System.out.println("Vaga " + numero + ": ocupada pela placa " + placaOcupante);
        } else {
            System.out.println("Vaga " + numero + ": livre");
        }
    }
}
