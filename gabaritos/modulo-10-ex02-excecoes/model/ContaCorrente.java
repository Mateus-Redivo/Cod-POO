package model;

import exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    private double tarifaMensal = 12.90;

    public ContaCorrente(int numero, String titular) {
        super(numero, titular);
    }

    /*
     * Decisao do item 3 do enunciado: tratamos AQUI com try/catch, em vez de
     * propagar com throws. Motivo: o fechamento mensal processa varias contas em
     * sequencia — uma conta sem saldo para a tarifa nao deve interromper as
     * demais. A tarifa nao descontada vira um aviso (num sistema real, seria
     * registrada como pendencia). Se propagassemos, o throws contaminaria
     * processarFimDeMes, o Banco e o Main, espalhando um problema que sabemos
     * resolver aqui mesmo.
     */
    public void descontarTarifaMensal() {
        try {
            sacar(tarifaMensal);
        } catch (SaldoInsuficienteException e) {
            System.out.printf("Conta %d: tarifa não descontada (faltam R$ %.2f).%n",
                    getNumero(), e.getValorFaltante());
        }
    }

    @Override
    public void processarFimDeMes() {
        descontarTarifaMensal();
    }
}
