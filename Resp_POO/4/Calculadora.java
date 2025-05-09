public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}

public class CalculadoraRobusta {
    private List<String> registroOperacoes = new ArrayList<>();
    
    public double dividir(int a, int b) throws DivisaoPorZeroException {
        try {
            if (b == 0) {
                throw new DivisaoPorZeroException("Não é possível dividir por zero");
            }
            double resultado = (double) a / b;
            registrarOperacao("Divisão: " + a + " / " + b + " = " + resultado);
            return resultado;
        } finally {
            // Garante que o registro ocorra mesmo com exceção
        }
    }
    
    public double raizQuadrada(double numero) {
        try {
            if (numero < 0) {
                throw new IllegalArgumentException("Raiz de número negativo");
            }
            double resultado = Math.sqrt(numero);
            registrarOperacao("Raiz: √" + numero + " = " + resultado);
            return resultado;
        } catch (IllegalArgumentException e) {
            registrarOperacao("Erro: " + e.getMessage());
            throw e;
        }
    }
    
    private void registrarOperacao(String operacao) {
        registroOperacoes.add(operacao);
    }
    
    public List<String> getRegistroOperacoes() {
        return registroOperacoes;
    }
}