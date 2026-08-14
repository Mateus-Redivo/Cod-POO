package model;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    /*
     * O construtor NAO atribui os atributos diretamente: ele passa pelos
     * setters, que sao os unicos donos da validacao. E isso que garante que
     * a pessoa nunca nasce num estado invalido.
     */
    public Pessoa(String nome, int idade, double altura) {
        // Valores seguros de partida: se algum argumento for recusado,
        // o objeto continua integro em vez de ficar com nome nulo ou idade errada
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 1.70;

        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void saudacao() {
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    /*
     * Setters: a "alfandega" do objeto.
     * Valor invalido e recusado com uma mensagem e o atributo NAO muda.
     */

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*")) {
            System.out.println("Erro: nome invalido (vazio ou com numeros).");
            return; // recusa o valor, o atributo nao muda
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 150) {
            System.out.println("Erro: idade invalida: " + idade);
            return;
        }
        this.idade = idade;
    }

    public void setAltura(double altura) {
        if (altura < 0.3 || altura > 3.0) {
            System.out.println("Erro: altura invalida: " + altura);
            return;
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
