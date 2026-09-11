package app;

import exception.TicketInvalidoException;
import exception.VagaOcupadaException;
import model.Estacionamento;

public class TesteEstacionamento {

    public static void main(String[] args) throws VagaOcupadaException {
        Estacionamento estacionamento = new Estacionamento();

        estacionamento.entrar(12);

        try {
            estacionamento.entrar(12);
        } catch (VagaOcupadaException e) {
            System.out.println("Falha na vaga " + e.getNumeroDaVaga());
        }

        estacionamento.sair("TK-012");

        // TicketInvalidoException e unchecked: optei por capturar mesmo assim,
        // porque entrada de usuario e algo que o programa deveria sobreviver,
        // nao um bug interno que deveria derrubar o processo.
        try {
            estacionamento.sair("abc");
        } catch (TicketInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
