package app;

import model.Aluno;
import model.Professor;
import util.Validacoes;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestao Academica - Teste Inicial ===\n");
        
        // Testando validações
        testarValidacoes();
        
        // Testando modelos
        testarModelos();
    }
    
    private static void testarValidacoes() {
        System.out.println("--- Testando Validacoes ---");
        
        // Testando validação de nome
        System.out.println("Teste de nome valido: " + Validacoes.isNomeValido("Joao Silva"));
        System.out.println("Teste de nome invalido (null): " + Validacoes.isNomeValido(null));
        System.out.println("Teste de nome invalido (vazio): " + Validacoes.isNomeValido(""));
        
        // Testando validação de matrícula
        System.out.println("Teste de matricula valida: " + Validacoes.isMatriculaValida("2023001"));
        System.out.println("Teste de matricula invalida (null): " + Validacoes.isMatriculaValida(null));
        
        // Testando validação de disciplina
        System.out.println("Teste de disciplina valida: " + Validacoes.isDisciplinaValida("Programacao Orientada a Objetos"));
        System.out.println("Teste de disciplina invalida (vazia): " + Validacoes.isDisciplinaValida("   "));
        
        // Testando validação de turma
        System.out.println("Teste de turma valida: " + Validacoes.isTurmaValida("Turma A"));
        System.out.println("Teste de turma invalida (null): " + Validacoes.isTurmaValida(null));
        
        // Testando validação de nota
        System.out.println("Teste de nota valida (8.5): " + Validacoes.isNotaValida(8.5));
        System.out.println("Teste de nota invalida (-1): " + Validacoes.isNotaValida(-1));
        System.out.println("Teste de nota invalida (11): " + Validacoes.isNotaValida(11));
        
        // Testando validação de objeto
        System.out.println("Teste de objeto valido: " + Validacoes.isObjetoValido("Teste"));
        System.out.println("Teste de objeto invalido (null): " + Validacoes.isObjetoValido(null));
        
        System.out.println();
    }
    
    private static void testarModelos() {
        System.out.println("--- Testando Modelos ---");
        
        // Criando e testando Aluno
        System.out.println("Criando aluno...");
        Aluno aluno1 = new Aluno("Maria Santos", "2023001", 
        "8.5, 9.0, 7.5", "Turma A");
        System.out.println("Aluno criado: " + aluno1);
        
        // Testando getters e setters do aluno
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Matricula do aluno: " + aluno1.getMatricula());
        System.out.println("Notas do aluno: " + aluno1.getListaNotas());
        System.out.println("Turma do aluno: " + aluno1.getTurma());
        
        // Modificando dados do aluno
        aluno1.setNome("Maria Silva Santos");
        aluno1.setListaNotas("8.5, 9.0, 7.5, 8.0");
        System.out.println("Aluno apos modificacao: " + aluno1);
        
        // Criando e testando Professor
        System.out.println("\nCriando professor...");
        Professor professor1 = new Professor("Dr. Carlos Oliveira", "PROF001", "Programacao Orientada a Objetos", "Turma A, Turma B");
        System.out.println("Professor criado: " + professor1);
        
        // Testando getters e setters do professor
        System.out.println("Nome do professor: " + professor1.getNome());
        System.out.println("Matricula do professor: " + professor1.getMatricula());
        System.out.println("Disciplina do professor: " + professor1.getDisciplina());
        System.out.println("Turmas do professor: " + professor1.getListaTurmas());
        
        // Modificando dados do professor
        professor1.setDisciplina("POO Avancado");
        professor1.setListaTurmas("Turma A, Turma B, Turma C");
        System.out.println("Professor apos modificacao: " + professor1);
        
        // Testando equals e hashCode
        System.out.println("\nTestando equals e hashCode...");
        Aluno aluno2 = new Aluno("Maria Silva Santos", "2023001", "8.5, 9.0, 7.5, 8.0", "Turma A");
        System.out.println("Aluno1 equals Aluno2: " + aluno1.equals(aluno2));
        System.out.println("HashCode Aluno1: " + aluno1.hashCode());
        System.out.println("HashCode Aluno2: " + aluno2.hashCode());
        
        Professor professor2 = new Professor("Dr. Carlos Oliveira", "PROF001", "POO Avancado", "Turma A, Turma B, Turma C");
        System.out.println("Professor1 equals Professor2: " + professor1.equals(professor2));
        System.out.println("HashCode Professor1: " + professor1.hashCode());
        System.out.println("HashCode Professor2: " + professor2.hashCode());
        
        System.out.println("\n=== Testes concluidos com sucesso! ===");
    }
}
