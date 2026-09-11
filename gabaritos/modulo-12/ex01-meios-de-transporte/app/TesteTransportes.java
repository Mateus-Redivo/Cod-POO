package app;

import java.util.ArrayList;
import java.util.List;

import model.Bicicleta;
import model.Carro;
import model.MeioDeTransporte;

public class TesteTransportes {

    public static void main(String[] args) {
        // new MeioDeTransporte("Generico", 50); // nao compila: classe abstrata

        Carro carro = new Carro("Carro popular", 60);
        Bicicleta bicicleta = new Bicicleta("Bicicleta urbana", 15);

        System.out.println("Tempo de carro para 60km: " + carro.calcularTempoViagem(60) + "h");
        System.out.println("Tempo de bicicleta para 60km: " + bicicleta.calcularTempoViagem(60) + "h");

        System.out.println();
        List<MeioDeTransporte> transportes = new ArrayList<>();
        transportes.add(carro);
        transportes.add(bicicleta);

        for (MeioDeTransporte transporte : transportes) {
            transporte.exibirInfo();
            System.out.println("Tempo para 100km: " + transporte.calcularTempoViagem(100) + "h");
        }
    }
}
