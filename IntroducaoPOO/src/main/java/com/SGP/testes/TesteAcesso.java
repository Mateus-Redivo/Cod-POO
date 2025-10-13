package com.SGP.testes;  // Declaração do pacote

import com.SGP.modelos.Pessoa;  // Importação da classe Pessoa

public class TesteAcesso {

    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Carlos", 30);

        // Acesso ao método público
        pessoa.saudacao();

        // Acessando o atributo através do getter público
        System.out.println("Nome (público): " + pessoa.getNome());

        // Modificando o atributo privado através do setter
        pessoa.setNome("João");
        System.out.println("Nome modificado (setter): " + pessoa.getNome());
        
        // Modificando a idade através do setter
        pessoa.setIdade(35);
        System.out.println("Pessoa após modificações: " + pessoa.toString());
    }
}
