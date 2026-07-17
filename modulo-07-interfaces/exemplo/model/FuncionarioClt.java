package model;

// FuncionarioClt assina o contrato Pagavel: e obrigado a implementar
// calcularPagamento() e getNome(), senao o codigo nem compila.
public class FuncionarioClt implements Pagavel {

    private String nome;
    private double salarioMensal;

    public FuncionarioClt(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        // CLT: salario fixo mensal.
        return salarioMensal;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
