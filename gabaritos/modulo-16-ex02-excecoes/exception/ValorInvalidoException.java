package exception;

// Unchecked: valor zero ou negativo é erro de programação/entrada, que deveria
// ter sido barrado antes — não obriga todo chamador a tratar.
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
