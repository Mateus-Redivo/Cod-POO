package app;

import model.Estacionamento;

public class TesteEstacionamento {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento("Estacionamento Central");

        System.out.println("--- Estado inicial ---");
        estacionamento.exibirTodasAsVagas();
        System.out.println();

        estacionamento.estacionarEm(2, "ABC1234");
        estacionamento.estacionarEm(2, "XYZ9876"); // deve avisar que ja esta ocupada
        System.out.println();

        estacionamento.liberarVaga(2);
        System.out.println("--- Estado final ---");
        estacionamento.exibirTodasAsVagas();
    }
}
