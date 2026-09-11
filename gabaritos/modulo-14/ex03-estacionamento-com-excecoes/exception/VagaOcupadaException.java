package exception;

public class VagaOcupadaException extends Exception {
    private int numeroDaVaga;

    public VagaOcupadaException(int numeroDaVaga) {
        super("Vaga " + numeroDaVaga + " ja esta ocupada.");
        this.numeroDaVaga = numeroDaVaga;
    }

    public int getNumeroDaVaga() {
        return numeroDaVaga;
    }
}
