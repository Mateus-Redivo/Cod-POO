package funcsis.model;

public class Vendedor extends Funcionario {
    private double vendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, String departamento, double comissao) {
        super(nome, salarioBase, departamento);
        this.comissao = comissao;
        this.vendas = 0.0;
    }

    // Métodos sobrescritos (Override)
    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * comissao);
    }

    @Override
    public double calcularBonus() {
        if (vendas > 10000) {
            return vendas * 0.1; // 10% do total de vendas
        }
        return 0.0;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println("Vendas do mês: R$ " + vendas);
        System.out.println("Comissão: " + (comissao * 100) + "%");
    }

    // Métodos com sobrecarga (Overload)
    public void registrarVenda(double valor) {
        this.vendas += valor;
        System.out.println("Venda de R$ " + valor + " registrada.");
    }

    public void registrarVenda(double valor, String cliente) {
        this.vendas += valor;
        System.out.println("Venda de R$ " + valor + " registrada para o cliente: " + cliente);
    }

    public void registrarVenda(double[] valores) {
        double total = 0;
        for (double valor : valores) {
            this.vendas += valor;
            total += valor;
        }
        System.out.println("Múltiplas vendas registradas no total de R$ " + total);
    }

    // Getters
    public double getVendas() {
        return vendas;
    }

    public double getComissao() {
        return comissao;
    }
}