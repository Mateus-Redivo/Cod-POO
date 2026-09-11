package model;

// Interface, e nao classe abstrata: CaixaDeSom nao compartilha campos nem
// codigo pronto com nenhuma outra classe deste exercicio, so precisa
// garantir que sabe tocar/pausar. Nao existe "parentesco natural" aqui.
public class CaixaDeSom implements Reproduzivel {
    private String nome;

    public CaixaDeSom(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println(nome + " tocando (volume maximo suportado: " + VOLUME_MAXIMO + ")");
    }

    @Override
    public void pausar() {
        System.out.println(nome + " pausada.");
    }
}
