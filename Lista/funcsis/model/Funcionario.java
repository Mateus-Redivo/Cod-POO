package funcsis.model;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected String departamento;
    protected boolean ativo;

    protected Funcionario(String nome, double salarioBase, String departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.ativo = true; // Ativo por padrao
    }

    // Métodos abstratos
    public abstract double calcularSalario();
    public abstract double calcularBonus();

    // Métodos concretos - sobrecarga do método promover
    public void promover(String novoDepartamento) {
        this.departamento = novoDepartamento;
        System.out.println(this.nome + " foi promovido(a) para o departamento: " + novoDepartamento);
    }

    public void promover() {
        System.out.println(this.nome + " foi promovido(a) no mesmo departamento: " + this.departamento);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Departamento: " + departamento);
        System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
    }

    public void demitir() {
        this.ativo = false;
        System.out.println(this.nome + " foi demitido(a).");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
