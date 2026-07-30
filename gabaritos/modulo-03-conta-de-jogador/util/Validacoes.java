package util;

// Cada regra de validação existe SÓ AQUI: setters e construtor chamam estes métodos.
// Métodos static: não precisamos de objeto, e a classe não guarda estado nenhum.
public class Validacoes {

    public static boolean validarApelido(String apelido) {
        if (apelido == null || apelido.isEmpty()) {
            System.out.println("Apelido invalido: nao pode ser vazio.");
            return false;
        }
        if (apelido.contains(" ")) {
            System.out.println("Apelido invalido: nao pode conter espacos.");
            return false;
        }
        if (apelido.length() < 3 || apelido.length() > 16) {
            System.out.println("Apelido invalido: deve ter entre 3 e 16 caracteres.");
            return false;
        }
        return true;
    }

    public static boolean validarNivel(int nivel) {
        if (nivel < 1 || nivel > 100) {
            System.out.println("Nivel invalido: deve estar entre 1 e 100.");
            return false;
        }
        return true;
    }
}
