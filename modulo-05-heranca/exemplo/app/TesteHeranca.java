package app;

import model.Veiculo;
import model.Carro;

public class TesteHeranca {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE HERANÇA EM JAVA ===");
        System.out.println();
        
        // Criando um objeto Veiculo
        System.out.println("1. Criando um veículo genérico:");
        Veiculo veiculo = new Veiculo("Yamaha", "MT-07", 2023);
        veiculo.exibirInfo();
        System.out.println();
        
        // Testando métodos da classe Veiculo
        System.out.println("2. Testando métodos do veículo:");
        veiculo.acelerar(30);
        veiculo.acelerar(20);
        veiculo.frear(15);
        System.out.println();
        
        // Criando um objeto Carro (que herda de Veiculo)
        System.out.println("3. Criando um carro:");
        Carro carro = new Carro("Toyota", "Corolla", 2024, 4, "Flex");
        carro.exibirInfo();
        System.out.println();
        
        // Testando herança - usando método acelerar herdado
        System.out.println("4. Testando herança - método acelerar:");
        carro.acelerar(25);  // Método herdado e sobrescrito
        carro.acelerar(35);
        carro.frear(20);     // Método herdado
        System.out.println();
        
        // Testando métodos específicos da classe Carro
        System.out.println("5. Testando métodos específicos do carro:");
        carro.ligarAr();
        carro.tocarBuzina();
        System.out.println();
        
        // Demonstrando polimorfismo
        System.out.println("6. Demonstrando polimorfismo:");
        Veiculo veiculo2 = new Carro("Honda", "Civic", 2023, 4, "Gasolina");
        veiculo2.acelerar(40); // Chama a versão sobrescrita do Carro
        veiculo2.exibirInfo(); // Chama a versão sobrescrita do Carro
        
        System.out.println();
        System.out.println("=== FIM DO TESTE ===");
    }
}