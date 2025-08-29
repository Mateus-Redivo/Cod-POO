package main.java.com.academia.model;

public class Treino {
    // Nome do exercício a ser realizado
    private String nomeExercicio;
    
    // Quantidade de séries do exercício
    private int series;
    
    // Quantidade de repetições por série
    private int repeticoes;
    
    // Carga utilizada no exercício (em kg)
    private double carga;

    // Construtor padrão
    public Treino() {
    }
    
    // Construtor com parâmetros
    public Treino(String nomeExercicio, int series, int repeticoes, double carga) {
        this.nomeExercicio = nomeExercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

    // Métodos getter e setter
    
    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    @Override
    public String toString() {
        return "Treino{" +
                "nomeExercicio='" + nomeExercicio + '\'' +
                ", series=" + series +
                ", repeticoes=" + repeticoes +
                ", carga=" + carga +
                '}';
    }
    
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