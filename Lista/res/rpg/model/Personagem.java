package model;

public class Personagem {

    // Atributos comuns a todos os personagens
    private String nome;
    private String classe;
    private int nivel;
    private double vida;

    // Construtor
    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = 100;
    }

    // Metodos
    public void atacar(double dano) {
        if (dano <= 0) {
            System.out.println("Dano deve ser maior que zero");
            return;
        }
        vida -= dano;
        if (vida < 0) {
            vida = 0;
            System.out.println(nome + " foi abatido");
        } else {
            System.out.println(nome + " sofreu " + dano + " de dano, vida restante: " + vida);
        }
    }

    public void descansar(int horas) {
        if (horas <= 0) {
            System.out.println("Horas devem ser maiores que zero");
            return;
        }

        vida += horas * 5;

        if (vida > 100) {
            vida = 100;
        }
        System.out.println(nome + " descansou por " + horas + " horas, vida atual: " + vida);
    }

    public void usarHabilidade() {
        System.out.println("O personagem está usando uma habilidade");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    // Metodo toString para exibir informacoes do personagem
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                '}';
    }

}
