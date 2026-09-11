package model;

// Interface pelo mesmo motivo de CaixaDeSom: so precisamos garantir a
// capacidade de gravar, sem hierarquia nenhuma envolvida.
public class Microfone implements Gravavel {
    private String nome;

    public Microfone(String nome) {
        this.nome = nome;
    }

    @Override
    public void gravar(String conteudo) {
        System.out.println(nome + " gravando: " + conteudo);
    }
}
