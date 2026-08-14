package util;

/**
 * Classe utilitária para validação de dados de entrada.
 * Contém métodos estáticos para validar nome, idade e altura,
 * além de retornar mensagens de erro apropriadas.
 *
 * Esta classe não guarda estado e não precisa ser instanciada:
 * seus métodos pertencem à classe, não a um objeto.
 */
public class Validacoes {

    // Construtor privado: ninguém de fora consegue escrever "new Validacoes()".
    // Faz sentido, porque esta classe nunca guarda dado nenhum -- só oferece funções prontas.
    private Validacoes() {
    }

    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome nao pode estar vazio!";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome nao pode conter numeros!";
        }
        return "";
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 150;
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade nao pode ser negativa!";
        } else if (idade > 150) {
            return "Erro: Idade invalida!";
        }
        return "";
    }

    public static boolean alturaValida(double altura) {
        return altura >= 0.3 && altura <= 3.0;
    }

    public static String mensagemErroAltura(double altura) {
        if (altura < 0.3) {
            return "Erro: Altura muito baixa!";
        } else if (altura > 3.0) {
            return "Erro: Altura invalida!";
        }
        return "";
    }
}
