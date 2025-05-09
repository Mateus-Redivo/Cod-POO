public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;
    
    public ContaCorrente(String numero, String titular, double saldoInicial, double taxa) {
        super(numero, titular, saldoInicial);
        this.taxaManutencao = taxa;
    }
    
    @Override
    public void aplicarJuros() {
        saldo -= taxaManutencao;
    }
    
    // Getters e setters omitidos para brevidade
}