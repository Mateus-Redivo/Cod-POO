public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros = 0.05; // 5% padrão
    
    public ContaPoupanca(String numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }
    
    @Override
    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }
    
    public void renderJuros() {
        aplicarJuros();
    }
    
    // Getters e setters omitidos para brevidade
}