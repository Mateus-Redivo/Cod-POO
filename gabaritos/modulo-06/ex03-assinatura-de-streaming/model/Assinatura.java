package model;

import util.ValidacoesAssinatura;

public class Assinatura {

    public static final int DIAS_TESTE_PADRAO = 7;

    private String plano;
    private double precoMensal;
    private int diasTesteGratis;

    // Construtor completo: o unico que atribui direto, o "fim" da cadeia
    public Assinatura(String plano, double precoMensal, int diasTesteGratis) {
        if (!ValidacoesAssinatura.planoValido(plano)) {
            System.out.println("Erro: plano \"" + plano + "\" invalido, usando Padrao.");
            plano = "Padrao";
        }
        this.plano = plano;
        this.precoMensal = precoMensal;
        this.diasTesteGratis = diasTesteGratis;
    }

    // Nivel 2 da cadeia: preenche preco padrao do plano e usa a constante de dias
    public Assinatura(String plano) {
        this(plano, ValidacoesAssinatura.precoPadraoDoPlano(plano), DIAS_TESTE_PADRAO);
    }

    // Nivel 1 da cadeia (topo): delega tudo para o de um parametro
    public Assinatura() {
        this("Padrao");
    }

    @Override
    public String toString() {
        return "Assinatura [plano=" + plano + ", precoMensal=" + precoMensal + ", diasTesteGratis=" + diasTesteGratis + "]";
    }
}
