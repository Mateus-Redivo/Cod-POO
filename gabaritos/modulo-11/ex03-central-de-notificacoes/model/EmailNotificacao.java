package model;

public class EmailNotificacao extends Notificacao {

    public EmailNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("  (via email, com assunto formatado)");
    }
}
