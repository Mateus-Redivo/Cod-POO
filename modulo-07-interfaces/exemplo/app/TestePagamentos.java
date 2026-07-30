package app;

import java.util.ArrayList;
import java.util.List;

import model.Avaliavel;
import model.Freelancer;
import model.FuncionarioClt;
import model.Pagavel;

public class TestePagamentos {

    public static void main(String[] args) {
        System.out.println("=== FOLHA DE PAGAMENTO COM INTERFACES ===\n");

        FuncionarioClt maria = new FuncionarioClt("Maria", 4200.00);

        Freelancer joao = new Freelancer("Joao", 90.00);
        joao.registrarHoras(30);
        joao.receberAvaliacao(5);
        joao.receberAvaliacao(4);

        // Aqui está o poder da interface: uma lista que aceita QUALQUER objeto
        // que assine o contrato Pagavel, não importa a classe concreta.
        List<Pagavel> folhaDePagamento = new ArrayList<>();
        folhaDePagamento.add(maria);
        folhaDePagamento.add(joao);

        double total = 0.0;
        for (Pagavel p : folhaDePagamento) {
            System.out.printf("%s recebe R$ %.2f%n", p.getNome(), p.calcularPagamento());
            total += p.calcularPagamento();
        }
        System.out.printf("%nTotal da folha: R$ %.2f%n", total);

        // Freelancer também é Avaliavel — o mesmo objeto visto por outro contrato.
        Avaliavel avaliado = joao;
        System.out.printf("%nMedia de avaliacoes de %s: %.1f%n",
                joao.getNome(), avaliado.getMediaAvaliacoes());
    }
}
