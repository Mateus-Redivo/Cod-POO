package com.SGP.util;

public class Validacoes {

    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome não pode estar vazio!";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome não pode conter números!";
        }
        return "";
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 150;
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa!";
        } else if (idade > 150) {
            return "Erro: Idade inválida!";
        }
        return "";
    }
}
