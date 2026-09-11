package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Tarefa;

public class Main {
    private static final List<Tarefa> tarefas = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            exibirMenu();
            int opcao = lerInteiro("Escolha uma opcao: ", 0, 5);

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTodas();
                    break;
                case 3:
                    marcarComoConcluida();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    listarPendentes();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== LISTA DE TAREFAS ===");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Listar todas");
        System.out.println("3. Marcar como concluida");
        System.out.println("4. Remover tarefa");
        System.out.println("5. Listar apenas pendentes");
        System.out.println("0. Sair");
    }

    private static void adicionarTarefa() {
        String descricao = "";
        while (descricao.trim().isEmpty()) {
            System.out.print("Descricao: ");
            descricao = scanner.nextLine();
            if (descricao.trim().isEmpty()) {
                System.out.println("Erro: descricao nao pode ser vazia.");
            }
        }
        int prioridade = lerInteiro("Prioridade (1-baixa, 2-media, 3-alta): ", 1, 3);
        tarefas.add(new Tarefa(descricao, prioridade));
        System.out.println("Tarefa adicionada.");
    }

    private static void listarTodas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.print((i + 1) + " - ");
            tarefas.get(i).exibirDados();
        }
    }

    private static void marcarComoConcluida() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        listarTodas();
        int indice = lerInteiro("Numero da tarefa concluida: ", 1, tarefas.size()) - 1;
        tarefas.get(indice).marcarComoConcluida();
        System.out.println("Tarefa marcada como concluida.");
    }

    private static void removerTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        listarTodas();
        int indice = lerInteiro("Numero da tarefa a remover: ", 1, tarefas.size()) - 1;
        Tarefa removida = tarefas.remove(indice);
        System.out.println("Tarefa removida: " + removida.getDescricao());
    }

    private static void listarPendentes() {
        List<Tarefa> pendentes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                pendentes.add(tarefa);
            }
        }
        if (pendentes.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (Tarefa tarefa : pendentes) {
            tarefa.exibirDados();
        }
    }

    private static int lerInteiro(String mensagem, int min, int max) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (numero >= min && numero <= max) {
                    return numero;
                }
                System.out.println("Erro: digite um numero entre " + min + " e " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero valido.");
            }
        }
    }
}
