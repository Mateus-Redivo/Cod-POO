package exception;

// Estende RuntimeException, portanto é uma exceção NÃO VERIFICADA (unchecked):
// o compilador não obriga o try/catch. Usamos para erros de programação,
// como passar um valor negativo onde nunca deveria chegar um.
public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException(double valor) {
        super(String.format("Valor invalido para a operacao: R$ %.2f", valor));
    }
}
