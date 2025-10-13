package funcsis.model;

public class Gerente extends Funcionario {
    private int equipe;
    private double metaMensal;

    public Gerente(String nome, double salarioBase, String departamento, int equipe) {
        super(nome, salarioBase, departamento);
        this.equipe = equipe;
        this.metaMensal = 50000.0; // Meta padrão
    }

    // Métodos sobrescritos (Override)
    @Override
    public double calcularSalario() {
        return salarioBase * 1.5; // 50% a mais que funcionário comum
    }

    @Override
    public double calcularBonus() {
        if (equipe >= 5) {
            return salarioBase * 0.2; // 20% do salário base
        } else {
            return salarioBase * 0.1; // 10% do salário base
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println("Tamanho da equipe: " + equipe + " funcionários");
        System.out.println("Meta mensal: R$ " + metaMensal);
    }

    // Métodos com sobrecarga (Overload)
    public void definirMeta(double novaMeta) {
        this.metaMensal = novaMeta;
        System.out.println("Meta mensal definida: R$ " + novaMeta);
    }

    public void definirMeta(double novaMeta, int meses) {
        this.metaMensal = novaMeta;
        System.out.println("Meta de R$ " + novaMeta + " definida para " + meses + " meses");
    }

    public void definirMeta() {
        // Meta automática baseada no tamanho da equipe
        this.metaMensal = equipe * 10000.0;
        System.out.println("Meta automática definida: R$ " + metaMensal + " (baseada na equipe de " + equipe + " pessoas)");
    }

    // Getters
    public int getEquipe() {
        return equipe;
    }

    public double getMetaMensal() {
        return metaMensal;
    }
}