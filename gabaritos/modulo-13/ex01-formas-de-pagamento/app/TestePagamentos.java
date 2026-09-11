package app;

import java.util.ArrayList;
import java.util.List;

import model.Boleto;
import model.Cartao;
import model.MeioDePagamento;

public class TestePagamentos {

    public static void main(String[] args) {
        List<MeioDePagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Boleto(200.0, -3));
        pagamentos.add(new Boleto(150.0, 5));
        pagamentos.add(new Cartao(300.0, 3));
        pagamentos.add(new Cartao(100.0, 1));

        double total = 0;
        for (MeioDePagamento pagamento : pagamentos) {
            double valor = pagamento.calcularValorAPagar();
            System.out.println(pagamento.getDescricao() + ": " + valor);
            total += valor;
        }

        System.out.println("\nTotal geral: " + total);
    }
}
