package app;

import model.CentralDeNotificacoes;
import model.EmailNotificacao;
import model.PushNotificacao;
import model.SmsNotificacao;

public class TesteCentral {

    public static void main(String[] args) {
        CentralDeNotificacoes central = new CentralDeNotificacoes();

        central.adicionar(new EmailNotificacao("ana@email.com", "Sua fatura chegou."));
        central.adicionar(new SmsNotificacao("11999998888", "Seu pedido saiu para entrega."));

        System.out.println("--- Primeiro envio (2 tipos) ---");
        central.enviarTodas();

        // Passo 5: adiciona o tipo novo, criado no passo 4, sem mudar
        // nenhuma linha de CentralDeNotificacoes.
        central.adicionar(new PushNotificacao("dispositivo-123", "Voce tem uma nova mensagem."));

        System.out.println("\n--- Segundo envio (3 tipos, incluindo o novo) ---");
        central.enviarTodas();
    }
}
