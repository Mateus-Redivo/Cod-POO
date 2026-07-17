// Versao orientada a objetos da Calculadora de IMC.
// Compare este arquivo com ../versao-procedural/CalculadoraIMC.java:
// aqui os DADOS (peso, altura) e os COMPORTAMENTOS (calcular, classificar)
// vivem juntos dentro de uma unica classe.
public class Pessoa {

    private String nome;
    private double peso;   // em quilogramas
    private double altura; // em metros

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // O calculo do IMC pertence a Pessoa: quem tem peso e altura e ela.
    // Na versao procedural, esse calculo dependia de variaveis soltas.
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // A classificacao tambem e responsabilidade da propria Pessoa.
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public void exibirResultado() {
        System.out.printf("%s: IMC %.2f (%s)%n", nome, calcularIMC(), classificarIMC());
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
