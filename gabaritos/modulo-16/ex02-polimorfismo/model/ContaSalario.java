package model;

// A prova da vitória: esta classe entrou no sistema SEM alterar Banco nem Conta.
// Com a cadeia de instanceof original, o Banco teria que ser modificado.
public class ContaSalario extends Conta {
    public ContaSalario(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void processarFimDeMes() {
        System.out.println("Conta salario " + getNumero() + ": nada a processar no fim do mes.");
    }
}
