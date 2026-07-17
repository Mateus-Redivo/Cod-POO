package model;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private boolean favorito;

    public Contato(String nome, String telefone, String email) {
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        this.favorito = false;
    }

    // Setters com validacao: nenhum contato fica com dado invalido
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome.trim();
        } else {
            System.out.println("Nome invalido: nao pode ser vazio.");
        }
    }

    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.trim().isEmpty()) {
            this.telefone = telefone.trim();
        } else {
            System.out.println("Telefone invalido: nao pode ser vazio.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email.trim();
        } else {
            System.out.println("E-mail invalido: deve conter @.");
        }
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isFavorito() {
        return favorito;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]"
                + (favorito ? " *FAVORITO*" : "");
    }
}
