package app;

import model.*;

public class TesteFuncionarios {
    public static void main(String[] args) {
        System.out.println("=== TESTE DO SISTEMA DE FUNCIONARIOS ===\n");

        // Criando funcionários
        Vendedor vendedor1 = new Vendedor("Ana Silva", 3000.0, "Vendas", 0.05);
        Vendedor vendedor2 = new Vendedor("Carlos Santos", 3500.0, "Vendas", 0.07);
        Gerente gerente1 = new Gerente("Maria Costa", 8000.0, "Gerencia", 6);
        Gerente gerente2 = new Gerente("Joao Oliveira", 7500.0, "Administracao", 3);

        // Testando sobrecarga do método promover()
        System.out.println("--- Testando sobrecarga do metodo promover() ---");
        vendedor1.promover("Vendas Premium"); // Com parâmetro
        vendedor1.promover(); // Sem parâmetro
        System.out.println();

        // Testando sobrecarga do método registrarVenda() no Vendedor
        System.out.println("--- Testando sobrecarga do metodo registrarVenda() ---");
        vendedor1.registrarVenda(5000.0); // Um valor
        vendedor1.registrarVenda(3000.0, "Empresa XYZ"); // Valor + cliente
        double[] vendas = { 1500.0, 2000.0, 1800.0 }; // Array de valores ( Prática mais comum em testes )
        vendedor1.registrarVenda(vendas); // Array de valores

        vendedor2.registrarVenda(12000.0); // Para testar bônus > 10000
        System.out.println();

        // Testando sobrecarga do método definirMeta() no Gerente
        System.out.println("--- Testando sobrecarga do metodo definirMeta() ---");
        gerente1.definirMeta(60000.0); // Nova meta
        gerente1.definirMeta(70000.0, 6); // Meta para vários meses
        gerente1.definirMeta(); // Meta automática
        System.out.println();

        // Array polimórfico de funcionários
        Funcionario[] funcionarios = { vendedor1, vendedor2, gerente1, gerente2 }; // Array de Funcionarios (
                                                                                   // Polimorfismo (upcasting) )
        // Prática mais comum em testes

        System.out.println("--- Informacoes dos Funcionarios ---");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionario " + (i + 1) + ":");
            funcionarios[i].exibirInfo();
            System.out.println("Salario calculado: R$ " + String.format("%.2f", funcionarios[i].calcularSalario()));
            System.out.println("Bonus calculado: R$ " + String.format("%.2f", funcionarios[i].calcularBonus()));
            System.out.println("Salario total: R$ " + String.format("%.2f",
                    funcionarios[i].calcularSalario() + funcionarios[i].calcularBonus()));
            System.out.println("----------------------------------------");
        }

        // Calculando folha de pagamento total
        double folhaPagamento = 0;
        double totalBonus = 0;

        for (Funcionario func : funcionarios) {
            if (func.isAtivo()) { // Apenas funcionários ativos
                folhaPagamento += func.calcularSalario();
                totalBonus += func.calcularBonus();
            }
        }

        System.out.println("Total da folha de pagamento: R$ " + String.format("%.2f", folhaPagamento));
        System.out.println("Total de bonus: R$ " + String.format("%.2f", totalBonus));
        System.out.println("Custo total da empresa: R$ " + String.format("%.2f", folhaPagamento + totalBonus));

        // Demonstrando que o método correto é chamado baseado no tipo real do objeto
        System.out.println("--- Polimorfismo em acao ---");
        for (Funcionario func : funcionarios) {
            System.out.println(func.getNome() + " (" + func.getClass().getSimpleName() + "):");
            System.out.println("  - Metodo calcularSalario() especifico chamado: R$ " +
                    String.format("%.2f", func.calcularSalario()));
            System.out.println("  - Metodo calcularBonus() especifico chamado: R$ " +
                    String.format("%.2f", func.calcularBonus()));
        }

        // Testando demissão
        System.out.println("--- Testando demissao ---");
        vendedor2.demitir();
        System.out.println("Status do " + vendedor2.getNome() + ": " +
                (vendedor2.isAtivo() ? "Ativo" : "Inativo"));

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}