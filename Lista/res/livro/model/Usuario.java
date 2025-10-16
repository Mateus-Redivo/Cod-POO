package res.livro.model;

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Email: " + email + " | Idade: " + idade);
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}