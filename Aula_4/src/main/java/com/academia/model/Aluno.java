package main.java.com.academia.model;

/**
 * Classe que representa um aluno de uma academia.
 * Armazena informações básicas como nome, idade e tipo de plano contratado.
 */
public class Aluno {
    /** Nome do aluno */
    private String nome;
    
    /** Idade do aluno */
    private int idade;
    
    /** 
     * Tipo de plano contratado pelo aluno
     * 1 - Plano Básico
     * 2 - Plano Premium
     */
    private int plano;

    // Getters and Setters
    /**
     * Obtém o nome do aluno
     * @return Nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno
     * @param nome Novo nome do aluno
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade do aluno
     * @return Idade do aluno
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do aluno
     * @param idade Nova idade do aluno
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o tipo de plano do aluno
     * @return Código do plano (1-Básico ou 2-Premium)
     */
    public int getPlano() {
        return plano;
    }

    /**
     * Define o tipo de plano do aluno
     * @param plano Código do plano (1-Básico ou 2-Premium)
     */
    public void setPlano(int plano) {
        this.plano = plano;
    }
    
    /**
     * Sobrescreve o método toString para exibir os dados do aluno em formato legível
     * @return String representando os dados do aluno
     */
    @Override
    public String toString() {
        String tipoPlano = plano == 1 ? "Básico" : "Premium";
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", plano=" + tipoPlano +
                '}';
    }
    
    /**
     * Sobrescreve o método equals para comparar dois objetos Aluno
     * Dois alunos são considerados iguais se tiverem o mesmo nome, idade e plano
     * @param o Objeto a ser comparado com este aluno
     * @return true se os alunos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Aluno aluno = (Aluno) o;
        
        if (idade != aluno.idade) return false;
        if (plano != aluno.plano) return false;
        return nome != null ? nome.equals(aluno.nome) : aluno.nome == null;
    }
    
    /**
     * Sobrescreve o método hashCode para gerar um código hash consistente com o equals
     * @return Código hash para este aluno
     */
    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + idade;
        result = 31 * result + plano;
        return result;
    }
}
