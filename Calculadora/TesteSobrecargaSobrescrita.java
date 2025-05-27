package Calculadora;

// Teste de sobrecarga e sobrescrita
public class TesteSobrecargaSobrescrita {
    public static void main(String[] args) {
        // Teste de sobrecarga
        Calculadora calc = new Calculadora();
        System.out.println("Soma de inteiros: " + calc.somar(5, 10));
        System.out.println("Soma de decimais: " + calc.somar(5.5, 10.5));
        System.out.println("Soma de três números: " + calc.somar(5, 10, 15));
        System.out.println("Concatenação de strings: " + calc.somar("Olá, ", "mundo!"));
        
        // Teste de sobrescrita
        Forma forma = new Forma();
        Forma retangulo = new Retangulo(5, 10);
        
        forma.descricao();
        retangulo.descricao();
        
        System.out.println("Área da forma: " + forma.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
