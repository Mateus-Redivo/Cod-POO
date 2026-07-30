package model;

// Uma interface é um CONTRATO: quem assina (implements) se compromete
// a fornecer todos os métodos declarados aqui.
// Repare que a interface não diz COMO calcular, apenas O QUE deve existir.
public interface Pagavel {

    // Métodos de interface são public e abstract por padrão.
    double calcularPagamento();

    String getNome();
}
