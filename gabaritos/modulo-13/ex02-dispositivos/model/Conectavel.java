package model;

// Capacidade de conectar: qualquer classe pode assinar este contrato,
// sem precisar de parentesco com as demais
public interface Conectavel {
    void conectar(String rede);
    void desconectar();
    boolean isConectado();
}
