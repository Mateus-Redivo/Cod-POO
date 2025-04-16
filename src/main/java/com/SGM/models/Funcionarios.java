package main.java.com.SGM.models;


public class Funcionarios {
    
    private int idFuncionario;
    private String nome;
    private float salario;


    public Funcionarios(int idFuncionario, String nome, float salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + "]";
    }
}
