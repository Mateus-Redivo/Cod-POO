package exception;

public class TicketInvalidoException extends RuntimeException {
    public TicketInvalidoException(String mensagem) {
        super(mensagem);
    }
}
