package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Contato;
import util.Validacoes;

public class Main {
    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            exibirMenu();
            int opcao = Validacoes.validarInteiro(scanner, "Escolha uma opcao: ", 0, 6);

            // Cada opção em um método próprio: main enxuto
            switch (opcao) {
                case 1 -> adicionarContato();
                case 2 -> listarTodos();
                case 3 -> buscarPorNome();
                case 4 -> alternarFavorito();
                case 5 -> removerContato();
                case 6 -> listarFavoritos();
                case 0 -> executando = false;
            }
        }
        scanner.close();
        System.out.println("Agenda encerrada.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== AGENDA DE CONTATOS ===");
        System.out.println("1. Adicionar contato");
        System.out.println("2. Listar todos");
        System.out.println("3. Buscar por nome");
        System.out.println("4. Marcar/desmarcar favorito");
        System.out.println("5. Remover contato");
        System.out.println("6. Listar apenas favoritos");
        System.out.println("0. Sair");
    }

    private static void adicionarContato() {
        System.out.println("\n=== ADICIONAR CONTATO ===");
        // A leitura já é validada: nenhum contato entra com dado inválido
        String nome = Validacoes.validarString(scanner, "Nome: ");
        String telefone = Validacoes.validarString(scanner, "Telefone: ");
        String email = Validacoes.validarEmail(scanner, "E-mail: ");

        contatos.add(new Contato(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void listarTodos() {
        System.out.println("\n=== LISTA DE CONTATOS ===");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    private static void buscarPorNome() {
        System.out.println("\n=== BUSCAR POR NOME ===");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        String termo = Validacoes.validarString(scanner, "Buscar por: ").toLowerCase();

        // Busca por trecho, ignorando maiusculas: "ana" acha "Mariana"
        boolean encontrou = false;
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().contains(termo)) {
                System.out.println(contato);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum contato encontrado com esse trecho.");
        }
    }

    private static void alternarFavorito() {
        System.out.println("\n=== MARCAR/DESMARCAR FAVORITO ===");
        Contato contato = escolherContato();
        if (contato != null) {
            contato.setFavorito(!contato.isFavorito());
            System.out.println(contato.getNome() + (contato.isFavorito()
                    ? " marcado(a) como favorito."
                    : " desmarcado(a) dos favoritos."));
        }
    }

    private static void removerContato() {
        System.out.println("\n=== REMOVER CONTATO ===");
        Contato contato = escolherContato();
        if (contato != null) {
            contatos.remove(contato);
            System.out.println(contato.getNome() + " removido(a) da agenda.");
        }
    }

    private static void listarFavoritos() {
        System.out.println("\n=== FAVORITOS ===");
        boolean temFavorito = false;
        for (Contato contato : contatos) {
            if (contato.isFavorito()) {
                System.out.println(contato);
                temFavorito = true;
            }
        }
        if (!temFavorito) {
            System.out.println("Nenhum contato favorito.");
        }
    }

    // Lista numerada + escolha validada: número fora da faixa é recusado pelo validarInteiro
    private static Contato escolherContato() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return null;
        }
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + " - " + contatos.get(i));
        }
        int numero = Validacoes.validarInteiro(scanner, "Numero do contato: ", 1, contatos.size());
        return contatos.get(numero - 1);
    }
}
