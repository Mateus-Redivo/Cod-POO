package main.java.com.academia.app;

import main.java.com.academia.model.Aluno;
import main.java.com.academia.model.Treino;
import main.java.com.academia.validacoes.Validacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Aluno> alunos = new ArrayList<>();
    private static final List<Treino> treinos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Academia!");
        
        boolean continuar = true;
        while (continuar) {
            exibirMenu();
            int opcao = Validacoes.validarInteiro(scanner, "Escolha uma opção: ", 0, 4);
            
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    removerAluno();
                    break;
                case 3:
                    criarTreino();
                    break;
                case 4:
                    listarAlunos();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n===== MENU ACADEMIA =====");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Remover Aluno");
        System.out.println("3 - Criar Treino");
        System.out.println("4 - Listar Alunos");
        System.out.println("0 - Sair");
        System.out.println("========================");
    }
    
    private static void cadastrarAluno() {
        System.out.println("\n--- CADASTRO DE ALUNO ---");
        
        Aluno aluno = new Aluno();
        
        String nome = Validacoes.validarString(scanner, "Nome do aluno: ");
        aluno.setNome(nome);
        
        int idade = Validacoes.validarInteiro(scanner, "Idade: ", 1, 120);
        if (!Validacoes.validarIdade(idade)) {
            System.out.println("Erro: A idade deve estar entre 14 e 90 anos.");
            return;
        }
        aluno.setIdade(idade);
        
        System.out.println("Planos disponíveis:");
        System.out.println("1 - Básico");
        System.out.println("2 - Premium");
        int plano = Validacoes.validarInteiro(scanner, "Escolha o plano (1-2): ", 1, 2);
        aluno.setPlano(plano);
        
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    
    private static void removerAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados para remover.");
            return;
        }
        
        System.out.println("\n--- REMOÇÃO DE ALUNO ---");
        listarAlunos();
        
        int indice = Validacoes.validarInteiro(scanner, "Digite o número do aluno que deseja remover: ", 1, alunos.size()) - 1;
        Aluno alunoRemovido = alunos.remove(indice);
        
        System.out.println("Aluno '" + alunoRemovido.getNome() + "' removido com sucesso!");
    }
    
    private static void criarTreino() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados. Cadastre um aluno primeiro.");
            return;
        }
        
        System.out.println("\n--- CRIAÇÃO DE TREINO ---");
        listarAlunos();
        
        int indiceAluno = Validacoes.validarInteiro(scanner, "Escolha o aluno pelo número: ", 1, alunos.size()) - 1;
        Aluno alunoSelecionado = alunos.get(indiceAluno);
        
        System.out.println("Criando treino para " + alunoSelecionado.getNome());
        
        Treino treino = new Treino();
        
        String nomeExercicio = Validacoes.validarString(scanner, "Nome do exercício: ");
        treino.setNomeExercicio(nomeExercicio);
        
        int series = Validacoes.validarInteiro(scanner, "Número de séries: ", 1, 20);
        treino.setSeries(series);
        
        int repeticoes = Validacoes.validarInteiro(scanner, "Número de repetições: ", 1, 100);
        treino.setRepeticoes(repeticoes);
        
        System.out.print("Carga (kg): ");
        double carga = 0;
        while (true) {
            try {
                carga = Double.parseDouble(scanner.nextLine().trim());
                if (!Validacoes.validarCargaExercicios((int) carga)) {
                    System.out.println("Erro: A carga deve ser maior que zero.");
                    System.out.print("Carga (kg): ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido.");
                System.out.print("Carga (kg): ");
            }
        }
        treino.setCarga(carga);
        
        treinos.add(treino);
        System.out.println("Treino criado com sucesso para " + alunoSelecionado.getNome() + "!");
        System.out.println("Detalhes: " + treino);
    }
    
    private static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }
        
        System.out.println("\n--- LISTA DE ALUNOS ---");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i));
        }
    }
}