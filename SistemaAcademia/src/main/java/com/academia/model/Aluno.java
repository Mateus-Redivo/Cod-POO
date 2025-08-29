package main.java.com.academia.model;

public class Aluno {
    // Nome do aluno
    private String nome;
    
    // Idade do aluno
    private int idade;
    
    // Tipo de plano: 1 = Básico, 2 = Premium
    private int plano;

    // Construtor padrão
    public Aluno() {
    }
    
    // Construtor com parâmetros
    public Aluno(String nome, int idade, int plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    // Métodos getter e setter
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }
    
    @Override
    public String toString() {
        String tipoPlano = plano == 1 ? "Básico" : "Premium";
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", plano=" + tipoPlano +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Aluno aluno = (Aluno) o;
        
        if (idade != aluno.idade) return false;
        if (plano != aluno.plano) return false;
        return nome != null ? nome.equals(aluno.nome) : aluno.nome == null;
    }
    
    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + idade;
        result = 31 * result + plano;
        return result;
    }
}
