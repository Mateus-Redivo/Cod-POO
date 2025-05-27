package Calculadora;

// Classe base para demonstrar sobrescrita
public class Forma {
    public double calcularArea() {
        return 0.0;  // Método genérico a ser sobrescrito
    }
    
    public void descricao() {
        System.out.println("Esta é uma forma genérica");
    }
}
