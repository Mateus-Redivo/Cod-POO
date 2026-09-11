package model;

// Interface, e nao classe abstrata: Smartphone precisa de TRES capacidades
// ao mesmo tempo (tocar, gravar, compartilhar). Com classe abstrata so
// poderia herdar de uma; com interface, implementa as tres sem conflito.
public class Smartphone implements Reproduzivel, Gravavel, Compartilhavel {
    private String nome;

    public Smartphone(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println(nome + " tocando (volume maximo suportado: " + VOLUME_MAXIMO + ")");
    }

    @Override
    public void pausar() {
        System.out.println(nome + " pausado.");
    }

    @Override
    public void gravar(String conteudo) {
        System.out.println(nome + " gravando: " + conteudo);
    }

    @Override
    public void compartilhar(String destino) {
        System.out.println(nome + " compartilhando com " + destino);
    }
}
