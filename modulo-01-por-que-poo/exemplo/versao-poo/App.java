// Programa principal da versao orientada a objetos.
// Repare como o main ficou curto: ele apenas ORQUESTRA objetos.
// Toda a logica de IMC esta na classe Pessoa, onde deve estar.
public class App {

    public static void main(String[] args) {
        // Cada pessoa e um OBJETO independente, com seus proprios dados.
        Pessoa ana = new Pessoa("Ana", 62.0, 1.65);
        Pessoa bruno = new Pessoa("Bruno", 98.5, 1.78);

        System.out.println("=== Calculadora de IMC (versao POO) ===");
        ana.exibirResultado();
        bruno.exibirResultado();

        // Na versao procedural, para trabalhar com duas pessoas ao mesmo tempo
        // seria preciso duplicar as variaveis (peso1, altura1, peso2, altura2...).
        // Com objetos, basta criar outra instancia.
    }
}
