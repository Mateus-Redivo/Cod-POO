package main.java.com.academia.model;

/**
 * Classe que representa um exercício de treino na academia.
 * Armazena informações sobre o exercício, como nome, séries, repetições e carga.
 */
public class Treino {
    /** Nome do exercício a ser realizado */
    private String nomeExercicio;
    
    /** Quantidade de séries do exercício */
    private int series;
    
    /** Quantidade de repetições por série */
    private int repeticoes;
    
    /** Carga utilizada no exercício (em kg) */
    private double carga;

    // Getters and Setters
    /**
     * Obtém o nome do exercício
     * @return Nome do exercício
     */
    public String getNomeExercicio() {
        return nomeExercicio;
    }

    /**
     * Define o nome do exercício
     * @param nomeExercicio Novo nome do exercício
     */
    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    /**
     * Obtém a quantidade de séries do exercício
     * @return Número de séries
     */
    public int getSeries() {
        return series;
    }

    /**
     * Define a quantidade de séries do exercício
     * @param series Novo número de séries
     */
    public void setSeries(int series) {
        this.series = series;
    }

    /**
     * Obtém a quantidade de repetições por série
     * @return Número de repetições
     */
    public int getRepeticoes() {
        return repeticoes;
    }

    /**
     * Define a quantidade de repetições por série
     * @param repeticoes Novo número de repetições
     */
    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    /**
     * Obtém a carga utilizada no exercício
     * @return Carga em kg
     */
    public double getCarga() {
        return carga;
    }

    /**
     * Define a carga utilizada no exercício
     * @param carga Nova carga em kg
     */
    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    /**
     * Sobrescreve o método toString para exibir os dados do treino em formato legível
     * @return String representando os dados do treino
     */
    @Override
    public String toString() {
        return "Treino{" +
                "nomeExercicio='" + nomeExercicio + '\'' +
                ", series=" + series +
                ", repeticoes=" + repeticoes +
                ", carga=" + carga +
                '}';
    }
    
    /**
     * Sobrescreve o método equals para comparar dois objetos Treino
     * Dois treinos são considerados iguais se tiverem o mesmo nome de exercício,
     * número de séries, repetições e carga
     * @param o Objeto a ser comparado com este treino
     * @return true se os treinos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Treino treino = (Treino) o;
        
        if (series != treino.series) return false;
        if (repeticoes != treino.repeticoes) return false;
        if (Double.compare(treino.carga, carga) != 0) return false;
        return nomeExercicio != null ? nomeExercicio.equals(treino.nomeExercicio) : treino.nomeExercicio == null;
    }
    
    /**
     * Sobrescreve o método hashCode para gerar um código hash consistente com o equals
     * @return Código hash para este treino
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nomeExercicio != null ? nomeExercicio.hashCode() : 0;
        result = 31 * result + series;
        result = 31 * result + repeticoes;
        temp = Double.doubleToLongBits(carga);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
