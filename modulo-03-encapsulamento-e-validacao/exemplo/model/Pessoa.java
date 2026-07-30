package model;

import util.Validacoes;

public class Pessoa {

    // Altura assumida quando a pessoa é criada sem informar esse dado
    private static final double ALTURA_PADRAO = 1.70;

    private String nome;   // Atributo privado, acessível somente dentro da classe Pessoa
    private int idade;     // Atributo privado, acessível somente dentro da classe Pessoa
    private double altura; // Altura em metros

    /*
     * Construtor completo. Repare que ele NÃO atribui os atributos diretamente:
     * ele passa pelos setters, que são os únicos donos da validação.
     * É isso que garante que a pessoa nunca nasce num estado inválido.
     */
    public Pessoa(String nome, int idade, double altura) {
        // Valores seguros de partida: se algum argumento for recusado,
        // o objeto continua íntegro em vez de ficar com nome nulo ou idade errada
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = ALTURA_PADRAO;

        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    // Construtor que recebe nome e idade; a altura fica com o valor padrão
    public Pessoa(String nome, int idade) {
        this(nome, idade, ALTURA_PADRAO);
    }

    // Construtor sobrecarregado sem parâmetros
    // Inicializa com valores padrão: nome="Carlos" e idade=20
    public Pessoa() {
        this("Carlos", 20, ALTURA_PADRAO);
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Ola, " + nome + "!" + " Voce tem " + idade + " anos.");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados

    // Retorna o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Retorna a altura da pessoa
    public double getAltura() {
        return altura;
    }

    /*
     * Setters: a "alfândega" do objeto.
     * Valor inválido é recusado com uma mensagem e o atributo NÃO muda.
     * (No módulo 08 você aprenderá a recusar de forma mais firme, com exceções.)
     */

    // Define um novo nome para a pessoa, se ele passar na validação
    public void setNome(String nome) {
        if (!Validacoes.nomeValido(nome)) {
            System.out.println(Validacoes.mensagemErroNome(nome));
            return; // recusa o valor, o atributo não muda
        }
        this.nome = nome;
    }

    // Define uma nova idade para a pessoa, se ela passar na validação
    public void setIdade(int idade) {
        if (!Validacoes.idadeValida(idade)) {
            System.out.println(Validacoes.mensagemErroIdade(idade));
            return; // recusa o valor, o atributo não muda
        }
        this.idade = idade;
    }

    // Define uma nova altura para a pessoa (em metros), se ela passar na validação
    public void setAltura(double altura) {
        if (!Validacoes.alturaValida(altura)) {
            System.out.println(Validacoes.mensagemErroAltura(altura));
            return; // recusa o valor, o atributo não muda
        }
        this.altura = altura;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
