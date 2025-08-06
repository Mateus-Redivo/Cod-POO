package com.java.sga.app;

import com.java.sga.model.Aluno;

public class Teste {
    public static void main(String[] args) {

    Aluno aluno = new Aluno("Suelen" , "123", 
    "9 , 8, 5", "2A");

    System.out.println("O nome do aluno é: " + aluno.getNome());
    
    aluno.setNome("Aline");

    System.out.println("O nome do aluno é: " + aluno.getNome());

    }
}
