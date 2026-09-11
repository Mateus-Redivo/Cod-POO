package model;

import exception.PercentualInvalidoException;

public class CalculadoraDeDesconto {

    public double aplicarDesconto(double valor, double percentual) throws PercentualInvalidoException {
        if (percentual < 0 || percentual > 100) {
            throw new PercentualInvalidoException(
                    "Percentual invalido: " + percentual + ". Deve estar entre 0 e 100.");
        }
        return valor - (valor * percentual / 100);
    }
}
