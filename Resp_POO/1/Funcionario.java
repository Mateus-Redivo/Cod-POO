public class Funcionario {
    private String nome;
    private double salarioBase;
    private double percentualBonus = 0.1; // 10% padrão
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalarioBase() { return salarioBase; }
    
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) this.salarioBase = salarioBase;
        else throw new IllegalArgumentException("Salário não pode ser negativo");
    }
    
    public void setPercentualBonus(double percentual) {
        if (percentual >= 0) this.percentualBonus = percentual;
    }
    
    private double calcularBonus() {
        return salarioBase * percentualBonus;
    }
    
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }
    
    @Override
    public String toString() {
        return "Funcionário: " + nome + ", Salário: " + calcularSalario();
    }
}
