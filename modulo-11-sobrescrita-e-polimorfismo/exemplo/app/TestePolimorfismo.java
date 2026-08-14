package app;

import java.util.ArrayList;
import java.util.List;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class TestePolimorfismo {

    public static void main(String[] args) {
        System.out.println("=== Revisao: sobrecarga (mesma classe, parametros diferentes) ===");
        Veiculo generico = new Veiculo("Generico", "X", 2020);
        generico.buzinar();
        generico.buzinar(3);

        System.out.println("\n=== Polimorfismo: uma lista, tipos diferentes ===");
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", "Corolla", 2022, 4));
        veiculos.add(new Moto("Honda", "CG", 2021, true));
        veiculos.add(new Veiculo("Generico", "Y", 2019));

        for (Veiculo v : veiculos) {
            // A MESMA linha executa uma versao diferente de acelerar() para cada tipo real.
            // O tipo da variavel "v" e sempre Veiculo -- quem decide e o objeto criado no new.
            v.acelerar(10);
            System.out.println();
        }
    }
}
