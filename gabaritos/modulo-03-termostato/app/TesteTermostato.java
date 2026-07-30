package app;

import model.Termostato;

/**
 * Roteiro de ataque do enunciado. A ideia nao e ver o programa funcionar:
 * e tentar quebrar o objeto de todas as formas e ver que ele resiste.
 */
public class TesteTermostato {

    public static void main(String[] args) {

        System.out.println("=== 1. Termostato valido ===");
        Termostato sala = new Termostato(16, 28, 22);
        System.out.println(sala);

        System.out.println("\n=== 2 e 3. Faixa invadindo a si mesma ===");
        sala.setTemperaturaMinima(30);   // invadiria a maxima (28)
        sala.setTemperaturaMaxima(10);   // invadiria a minima (16)

        System.out.println("\n=== 4. Fora da faixa absoluta do aparelho ===");
        sala.setTemperaturaMinima(-80);

        System.out.println("\n=== 5. Aquecendo ===");
        sala.aquecer(3);    // 22 -> 25, dentro da maxima
        sala.aquecer(50);   // passaria de 28: recusado

        System.out.println("\n=== 6. Resfriando demais ===");
        sala.resfriar(20);  // ficaria abaixo de 16: recusado

        System.out.println("\n=== 7. Aquecer com numero negativo ===");
        sala.aquecer(-5);   // resfriar disfarcado: recusado

        System.out.println("\n=== 8. Construtor com trio impossivel ===");
        Termostato quebrado = new Termostato(40, 10, 100);
        System.out.println(quebrado);

        System.out.println("\n=== 9. Conferindo os invariantes ===");
        conferirInvariantes(sala);
        conferirInvariantes(quebrado);
    }

    /*
     * Um teste de verdade nao olha so a saida na tela: ele afirma as regras.
     * Se algum invariante cair, este metodo denuncia.
     */
    private static void conferirInvariantes(Termostato t) {
        boolean regra1 = t.getTemperaturaMinima() >= -50 && t.getTemperaturaMaxima() <= 60;
        boolean regra2 = t.getTemperaturaMinima() < t.getTemperaturaMaxima();
        boolean regra3 = t.getTemperaturaAtual() >= t.getTemperaturaMinima()
                && t.getTemperaturaAtual() <= t.getTemperaturaMaxima();

        System.out.println(t);
        System.out.println("  faixa absoluta respeitada: " + regra1);
        System.out.println("  minima < maxima:           " + regra2);
        System.out.println("  atual dentro da faixa:     " + regra3);
        System.out.println("  OBJETO INTEGRO: " + (regra1 && regra2 && regra3));
    }
}
