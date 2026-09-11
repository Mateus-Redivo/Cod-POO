package model;

// Classe criada DEPOIS, no passo 4 do exercicio, sem tocar em
// CentralDeNotificacoes nem em nada que ja existia.
public class PushNotificacao extends Notificacao {

    public PushNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("  (via push, com icone do aplicativo)");
    }
}
