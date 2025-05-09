public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class CpfInvalidoException extends Exception {
    public CpfInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa(String nome, int idade, String cpf) throws NomeInvalidoException, 
                                                           IdadeInvalidaException, 
                                                           CpfInvalidoException {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }
    
    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }
    
    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }
        if (idade > 150) {
            throw new IdadeInvalidaException("Idade acima do limite realista");
        }
        this.idade = idade;
    }
    
    public void setCpf(String cpf) throws CpfInvalidoException {
        if (cpf == null || !validarCpf(cpf)) {
            throw new CpfInvalidoException("CPF inválido");
        }
        this.cpf = cpf;
    }
    
    private boolean validarCpf(String cpf) {
        // Versão simplificada para exemplo
        cpf = cpf.replaceAll("[^0-9]", "");
        return cpf.length() == 11;
    }
    
    // Getters omitidos para brevidade
}