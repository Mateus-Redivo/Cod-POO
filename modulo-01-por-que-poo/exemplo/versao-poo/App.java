// Programa principal da versão orientada a objetos.
// Repare como o main ficou curto: ele apenas ORQUESTRA objetos.
// Toda a lógica de IMC está na classe Pessoa, onde deve estar.
public class App {

    public static void main(String[] args) {
        // Cada pessoa é um OBJETO independente, com seus próprios dados.
        Pessoa ana = new Pessoa("Ana", 62.0, 1.65);
        Pessoa bruno = new Pessoa("Bruno", 98.5, 1.78);

        System.out.println("=== Calculadora de IMC (versao POO) ===");
        ana.exibirResultado();
        bruno.exibirResultado();

        // Na versão procedural, para trabalhar com duas pessoas ao mesmo tempo
        // seria preciso duplicar as variáveis (peso1, altura1, peso2, altura2...).
        // Com objetos, basta criar outra instância.
    }
}
