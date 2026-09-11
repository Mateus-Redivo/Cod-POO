package exception;

// CHECKED: pedir um valor que não fecha com as notas do caixa é situação normal
// de uso — o chamador precisa avisar o usuário e seguir em frente.
public class NotaIndisponivelException extends Exception {
    public NotaIndisponivelException() {
        super("O caixa so possui notas de R$ 10.");
    }
}
