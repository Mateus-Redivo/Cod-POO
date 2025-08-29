package com.java.sga.app;

import com.java.sga.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão Acadêmica ===\n");
        
        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    listarProfessores();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Listar Alunos");
        System.out.println("4. Listar Professores");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void cadastrarAluno() {
        System.out.println("\n--- Cadastro de Aluno ---");
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Notas (separadas por vírgula): ");
        String notas = scanner.nextLine();
        
        System.out.print("Turma: ");
        String turma = scanner.nextLine();
        
        try {
            Aluno aluno = new Aluno(nome, matricula, notas, turma);
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }
    
    private static void cadastrarProfessor() {
        System.out.println("\n--- Cadastro de Professor ---");
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Disciplina: ");
        String disciplina = scanner.nextLine();
        
        System.out.print("Turmas (separadas por vírgula): ");
        String turmas = scanner.nextLine();
        
        try {
            Professor professor = new Professor(nome, matricula, disciplina, turmas);
            professores.add(professor);
            System.out.println("Professor cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar professor: " + e.getMessage());
        }
    }
    
    private static void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + ". " + alunos.get(i));
        }
    }
    
    private static void listarProfessores() {
        System.out.println("\n--- Lista de Professores ---");
        
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }
        
        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + ". " + professores.get(i));
        }
    }
}
