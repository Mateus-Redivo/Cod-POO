package model;

// Uma interface e um CONTRATO: quem assina (implements) se compromete
// a fornecer todos os metodos declarados aqui.
// Repare que a interface nao diz COMO calcular, apenas O QUE deve existir.
public interface Pagavel {

    // Metodos de interface sao public e abstract por padrao.
    double calcularPagamento();

    String getNome();
}
