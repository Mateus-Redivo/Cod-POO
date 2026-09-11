package model;

public class Tarefa {

    private String descricao;
    private boolean concluida;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public void exibirDados() {
        String status = concluida ? "[X]" : "[ ]";
        System.out.println(status + " " + descricao + " (prioridade " + prioridade + ")");
    }
}
