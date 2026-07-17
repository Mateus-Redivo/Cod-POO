package exception;

// Unchecked: valor zero ou negativo e erro de programacao/entrada, que deveria
// ter sido barrado antes — nao obriga todo chamador a tratar.
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
