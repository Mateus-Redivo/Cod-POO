package app;

import exception.PercentualInvalidoException;
import model.CalculadoraDeDesconto;

public class TesteCalculadora {

    public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        try {
            double resultado = calculadora.aplicarDesconto(200.0, 10.0);
            System.out.println("Resultado: " + resultado);
        } catch (PercentualInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Calculo finalizado.");
        }

        try {
            double resultado = calculadora.aplicarDesconto(200.0, 150.0);
            System.out.println("Resultado: " + resultado);
        } catch (PercentualInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Calculo finalizado.");
        }
    }
}
