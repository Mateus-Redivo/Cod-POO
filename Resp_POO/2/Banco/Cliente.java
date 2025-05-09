public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaBancaria> contas = new ArrayList<>();
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }
    
    // Getters omitidos para brevidade
}