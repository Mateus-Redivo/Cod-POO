/**
 * A classe Calculadora fornece métodos para realizar operações matemáticas básicas,
 * como soma, subtração, multiplicação, divisão e cálculo de média. 
 * Ela suporta sobrecarga de métodos para lidar com diferentes tipos de parâmetros,
 * incluindo inteiros, números de ponto flutuante e arrays.
 *
 * Métodos disponíveis:
 * - Sobrecarga de somar: Permite somar dois, três ou quatro números inteiros, 
 *   dois números de ponto flutuante ou um array de inteiros.
 * - Sobrecarga de multiplicar: Permite multiplicar dois números inteiros ou dois números de ponto flutuante.
 * - Sobrecarga de subtrair: Permite subtrair dois números inteiros ou dois números de ponto flutuante.
 * - Sobrecarga de dividir: Permite dividir dois números inteiros (com conversão para ponto flutuante) 
 *   ou dois números de ponto flutuante.
 * - Sobrecarga de calcularMedia: Permite calcular a média de dois números inteiros, 
 *   dois números de ponto flutuante ou um array de inteiros.
 *
 * Observação:
 * - O método somar(int[] numeros) soma todos os elementos de um array de inteiros.
 * - O método calcularMedia(int[] numeros) calcula a média dos elementos de um array de inteiros.
 *   Caso o array esteja vazio, ele retorna 0.
 */
public class Calculadora {
    // Sobrecarga de somar
    public int somar(int a, int b) { return a + b; }
    public double somar(double a, double b) { return a + b; }
    public int somar(int a, int b, int c) { return a + b + c; }
    public int somar(int a, int b, int c, int d) { return a + b + c + d; }
    
    // Sobrecarga de multiplicar
    public int multiplicar(int a, int b) { return a * b; }
    public double multiplicar(double a, double b) { return a * b; }
    
    // Sobrecarga de subtrair
    public int subtrair(int a, int b) { return a - b; }
    public double subtrair(double a, double b) { return a - b; }
    
    // Sobrecarga de dividir
    public double dividir(int a, int b) { return (double) a / b; }
    public double dividir(double a, double b) { return a / b; }
    
    // Sobrecarga de calcularMedia
    public double calcularMedia(int a, int b) { return (a + b) / 2.0; }
    public double calcularMedia(double a, double b) { return (a + b) / 2; }
    
    // Método que aceita array
    public int somar(int[] numeros) {
        int soma = 0;
        for (int n : numeros) soma += n;
        return soma;
    }
    
    public double calcularMedia(int[] numeros) {
        if (numeros.length == 0) return 0;
        return (double) somar(numeros) / numeros.length;
    }
}
