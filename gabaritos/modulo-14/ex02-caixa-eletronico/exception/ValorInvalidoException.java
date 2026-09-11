package exception;

/*
 * Resposta da pergunta do enunciado:
 * ValorInvalidoException é UNCHECKED (estende RuntimeException) porque valor zero ou
 * negativo é um erro de PROGRAMAÇÃO/entrada que deveria ter sido barrado antes de
 * chamar o método — não é um fluxo esperado do negócio, e obrigar todo chamador a
 * tratar só poluiria o código. Já SaldoInsuficienteException é CHECKED porque saldo
 * insuficiente é uma situação NORMAL do NEGÓCIO: vai acontecer com usuários reais, e
 * o compilador deve OBRIGAR quem chama a decidir conscientemente o que fazer.
 */
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
