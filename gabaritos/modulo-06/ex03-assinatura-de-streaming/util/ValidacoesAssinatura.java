package util;

public class ValidacoesAssinatura {

    private ValidacoesAssinatura() {
    }

    public static boolean planoValido(String plano) {
        return plano.equals("Basico") || plano.equals("Padrao") || plano.equals("Premium");
    }

    public static double precoPadraoDoPlano(String plano) {
        if (plano.equals("Basico")) {
            return 19.90;
        } else if (plano.equals("Premium")) {
            return 44.90;
        }
        return 29.90; // Padrao, ou qualquer plano desconhecido
    }
}
