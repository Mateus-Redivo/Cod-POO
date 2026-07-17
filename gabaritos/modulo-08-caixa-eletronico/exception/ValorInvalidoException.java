package exception;

/*
 * Resposta da pergunta do enunciado:
 * ValorInvalidoException e UNCHECKED (estende RuntimeException) porque valor zero ou
 * negativo e um erro de PROGRAMACAO/entrada que deveria ter sido barrado antes de
 * chamar o metodo — nao e um fluxo esperado do negocio, e obrigar todo chamador a
 * tratar so poluiria o codigo. Ja SaldoInsuficienteException e CHECKED porque saldo
 * insuficiente e uma situacao NORMAL do NEGOCIO: vai acontecer com usuarios reais, e
 * o compilador deve OBRIGAR quem chama a decidir conscientemente o que fazer.
 */
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
