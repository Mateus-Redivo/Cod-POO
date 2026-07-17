package app;

import model.Moto;

public class TesteMoto {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "CB 500", 2024, 500, true);

        // 1. Informacoes completas (parte herdada + parte da moto)
        moto.exibirInfo();
        moto.fazerBarulho();

        // 2. Empinar parado: deve recusar
        System.out.println();
        moto.empinar();

        // 3. Acelera alem de 20 km/h e tenta de novo
        System.out.println();
        moto.acelerar(30);
        moto.empinar();

        // 4. Metodo herdado sem sobrescrever: veio de graca de Veiculo
        System.out.println();
        moto.frear(10);
    }
}
