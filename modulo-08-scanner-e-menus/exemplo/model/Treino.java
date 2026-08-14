package model;

public class Treino {

    private String nomeExercicio;
    private int series;
    private int repeticoes;
    private double carga;

    public Treino() {
    }

    public Treino(String nomeExercicio, int series, int repeticoes, double carga) {
        this.nomeExercicio = nomeExercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

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
        return "Treino{exercicio='" + nomeExercicio + "', series=" + series
                + ", repeticoes=" + repeticoes + ", carga=" + carga + "}";
    }
}
