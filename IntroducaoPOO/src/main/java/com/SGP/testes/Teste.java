package com.SGP.testes;  // Declaração do pacote

// Importando a classe Pessoa do pacote com.exemplo.modelos
import com.SGP.modelos.Pessoa;

public class Teste {  // Definição da classe Teste
    
    // Método estático para imprimir informações de uma pessoa
    public static void imprimirPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("Pessoa não inicializada!");
            return;
        }
        System.out.println(pessoa);
        pessoa.saudacao();
    }

    public static void main(String[] args) {
        // Testando o método com uma pessoa não inicializada
        Pessoa pessoaNula = null;
        imprimirPessoa(pessoaNula);
        
        // Testando o método com uma pessoa inicializada
        Pessoa pessoa = new Pessoa("Davi", 20);
        imprimirPessoa(pessoa);
        
        // Testando o construtor com valores padrão
        Pessoa pessoaPadrao = new Pessoa("");
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirPessoa(pessoaPadrao);
    }
}
