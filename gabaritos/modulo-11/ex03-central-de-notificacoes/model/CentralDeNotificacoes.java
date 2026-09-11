package model;

import java.util.ArrayList;
import java.util.List;

public class CentralDeNotificacoes {

    private List<Notificacao> fila = new ArrayList<>();

    public void adicionar(Notificacao notificacao) {
        fila.add(notificacao);
    }

    // Nenhum instanceof, nenhum cast -- e por isso que PushNotificacao
    // funciona aqui sem precisar mudar nada deste metodo.
    public void enviarTodas() {
        for (Notificacao notificacao : fila) {
            notificacao.enviar();
        }
    }
}
