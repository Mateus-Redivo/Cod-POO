package model;

// FuncionarioClt assina o contrato Pagavel: é obrigado a implementar
// calcularPagamento() e getNome(), senão o código nem compila.
public class FuncionarioClt implements Pagavel {

    private String nome;
    private double salarioMensal;

    public FuncionarioClt(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        // CLT: salário fixo mensal.
        return salarioMensal;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
