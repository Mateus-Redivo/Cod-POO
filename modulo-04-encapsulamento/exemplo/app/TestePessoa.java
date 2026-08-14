package app;

import model.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Davi", 20, 1.75);

        // Acesso ao metodo publico
        pessoa.saudacao();

        // Imprimir o objeto agora funciona de forma legivel, gracas ao toString()
        System.out.println(pessoa);

        // Acessando o atributo atraves do getter publico
        System.out.println("Nome (via getter): " + pessoa.getNome());

        // Modificando o atributo privado atraves do setter
        pessoa.setNome("Joao");
        System.out.println("Nome modificado (via setter): " + pessoa.getNome());

        pessoa.setIdade(35);
        System.out.println("Pessoa apos modificacoes: " + pessoa);

        // Experimente: tente pessoa.nome = "Ana" diretamente aqui.
        // O compilador vai recusar -- e essa recusa e o encapsulamento em acao.
    }
}
