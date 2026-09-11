package model;

public class SmsNotificacao extends Notificacao {

    public SmsNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("  (via SMS, mensagem cortada em 160 caracteres)");
    }
}
