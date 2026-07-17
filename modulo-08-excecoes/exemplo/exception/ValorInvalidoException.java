package exception;

// Estende RuntimeException, portanto e uma excecao NAO VERIFICADA (unchecked):
// o compilador nao obriga o try/catch. Usamos para erros de programacao,
// como passar um valor negativo onde nunca deveria chegar um.
public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException(double valor) {
        super(String.format("Valor invalido para a operacao: R$ %.2f", valor));
    }
}
