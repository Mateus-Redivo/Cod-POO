package exception;

// CHECKED: pedir um valor que nao fecha com as notas do caixa e situacao normal
// de uso — o chamador precisa avisar o usuario e seguir em frente.
public class NotaIndisponivelException extends Exception {
    public NotaIndisponivelException() {
        super("O caixa so possui notas de R$ 10.");
    }
}
