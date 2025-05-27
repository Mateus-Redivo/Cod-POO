package Calculadora;

public class Calculadora {
    // Demonstração de sobrecarga de métodos (mesmo nome, parâmetros diferentes)
    public int somar(int a, int b) {
        return a + b;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public String somar(String a, String b) {
        return a + b;  // Concatenação de strings
    }
}






