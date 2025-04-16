package com.SGP.testes;

import com.SGP.modelos.Pessoa;
import com.SGP.util.Validacoes;
import java.util.Scanner;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Carlos", 30);
        int opcao;

        do {
            System.out.println("\n=== Menu de Acesso ===");
            System.out.println("1. Mostrar dados da pessoa");
            System.out.println("2. Alterar nome");
            System.out.println("3. Alterar idade");
            System.out.println("4. Mostrar saudação");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println(pessoa.toString());
                    break;
                case 2:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    if (Validacoes.nomeValido(novoNome)) {
                        pessoa.setNome(novoNome);
                        System.out.println("Nome alterado com sucesso!");
                    } else {
                        System.out.println(Validacoes.mensagemErroNome(novoNome));
                    }
                    break;
                case 3:
                    System.out.print("Digite a nova idade: ");
                    try {
                        int novaIdade = Integer.parseInt(scanner.nextLine());
                        if (Validacoes.idadeValida(novaIdade)) {
                            pessoa.setIdade(novaIdade);
                            System.out.println("Idade alterada com sucesso!");
                        } else {
                            System.out.println(Validacoes.mensagemErroIdade(novaIdade));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Por favor, digite um número inteiro válido!");
                    }
                    break;
                case 4:
                    pessoa.saudacao();
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
