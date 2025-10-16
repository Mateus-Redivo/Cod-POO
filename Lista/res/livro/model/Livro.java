package res.livro.model;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }
    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' foi emprestado com sucesso!");
        } else {
            System.out.println("Livro '" + titulo + "' não está disponível para empréstimo.");
        }
    }
    
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro '" + titulo + "' foi devolvido com sucesso!");
        } else {
            System.out.println("O livro '" + titulo + "' já está disponível na biblioteca.");
        }
    }
    
    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas + " | Disponível: " + disponivel);
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}