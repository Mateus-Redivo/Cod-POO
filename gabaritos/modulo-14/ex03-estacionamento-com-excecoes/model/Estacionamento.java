package model;

import java.util.ArrayList;
import java.util.List;

import exception.TicketInvalidoException;
import exception.VagaOcupadaException;

public class Estacionamento {

    private List<Integer> vagasOcupadas = new ArrayList<>();

    public void entrar(int numeroDaVaga) throws VagaOcupadaException {
        if (vagasOcupadas.contains(numeroDaVaga)) {
            throw new VagaOcupadaException(numeroDaVaga);
        }
        vagasOcupadas.add(numeroDaVaga);
        System.out.println("Entrada confirmada na vaga " + numeroDaVaga + ".");
    }

    // Unchecked: nao declara "throws" -- e um erro de formato, nao uma
    // situacao de negocio que o chamador precisa necessariamente prever.
    public void sair(String ticket) {
        if (ticket == null || !ticket.matches("TK-\\d+")) {
            throw new TicketInvalidoException("Ticket invalido: " + ticket);
        }
        int numeroDaVaga = Integer.parseInt(ticket.substring(3));
        vagasOcupadas.remove(Integer.valueOf(numeroDaVaga));
        System.out.println("Saida confirmada da vaga " + numeroDaVaga + ".");
    }
}
