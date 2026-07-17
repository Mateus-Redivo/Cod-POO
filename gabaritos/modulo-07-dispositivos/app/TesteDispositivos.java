package app;

import java.util.ArrayList;
import java.util.List;

import model.Carregavel;
import model.Conectavel;
import model.FoneBluetooth;
import model.SmartTv;
import model.Smartphone;

public class TesteDispositivos {
    public static void main(String[] args) {
        // 1. Um objeto de cada classe
        Smartphone celular = new Smartphone("Galaxy");
        SmartTv tv = new SmartTv(55);
        FoneBluetooth fone = new FoneBluetooth("JBL");

        // 2. Lista de quem pode conectar — o tipo e a INTERFACE, nao a classe
        List<Conectavel> conectaveis = new ArrayList<>();
        conectaveis.add(celular);
        conectaveis.add(tv);
        for (Conectavel dispositivo : conectaveis) {
            dispositivo.conectar("LabPOO");
        }

        // 3. Lista de quem pode carregar
        List<Carregavel> carregaveis = new ArrayList<>();
        carregaveis.add(celular);
        carregaveis.add(fone);
        System.out.println("\nCarregando por 30 minutos...");
        for (Carregavel dispositivo : carregaveis) {
            dispositivo.carregar(30);
            System.out.println(dispositivo + ": bateria " + dispositivo.getNivelBateria() + "%");
        }

        /*
         * 4. O Smartphone aparece NAS DUAS listas. So com heranca isso seria
         * impossivel: uma classe Java so pode estender UMA superclasse, entao
         * Smartphone teria que escolher entre ser "filho de Conectavel" OU
         * "filho de Carregavel" — nunca os dois. Interfaces resolvem porque
         * sao contratos de capacidade, e uma classe pode assinar quantos
         * contratos quiser (implements Conectavel, Carregavel).
         */
    }
}
