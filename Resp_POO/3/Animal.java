public abstract class Animal {
    protected String nome;      // Atributo para armazenar o nome do animal
    protected int idade;        // Atributo para armazenar a idade do animal
    protected String especie;   // Atributo para armazenar a espécie do animal
    
    // Construtor que inicializa os atributos básicos de qualquer animal
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }
    
    // Método que pode ser sobrescrito pelas subclasses, mas tem implementação padrão
    public void emitirSom() {
        System.out.println("Som genérico");
    }
    
    // Método abstrato que DEVE ser implementado por todas as subclasses
    public abstract void mover();
    
    // Sobrescrita do método toString() da classe Object para exibir informações do animal
    @Override
    public String toString() {
        return "Animal: " + nome + ", Idade: " + idade + ", Espécie: " + especie;
    }
    
    // Getters e setters foram omitidos
}

public class Cachorro extends Animal {
    // Construtor que chama o construtor da superclasse usando super()
    public Cachorro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    // Sobrescrita do método emitirSom() com implementação específica para cachorro
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
    
    // Implementação do método abstrato mover() herdado da classe Animal
    @Override
    public void mover() {
        System.out.println("Correndo com 4 patas");
    }
    
    // Sobrescrita do método toString() com formato específico para cachorro
    @Override
    public String toString() {
        return "Cachorro: " + nome + ", Idade: " + idade;
    }
}

public class Gato extends Animal {
    // Construtor que chama o construtor da superclasse
    public Gato(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    // Sobrescrita do método emitirSom() com implementação específica para gato
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
    
    // Implementação do método abstrato mover()
    @Override
    public void mover() {
        System.out.println("Andando silenciosamente");
    }
    // Nota: esta classe utiliza o toString() herdado da classe Animal
}

public class Passaro extends Animal {
    // Construtor que chama o construtor da superclasse
    public Passaro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    // Sobrescrita do método emitirSom() com implementação específica para pássaro
    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }
    
    // Implementação do método abstrato mover() com comportamento específico
    @Override
    public void mover() {
        System.out.println("Voando");
    }
    // Nota: esta classe utiliza o toString() herdado da classe Animal
}

public class Peixe extends Animal {
    // Construtor que chama o construtor da superclasse
    public Peixe(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    // Sobrescrita do método emitirSom() com implementação específica para peixe
    @Override
    public void emitirSom() {
        System.out.println("Glub glub!");
    }
    
    // Implementação do método abstrato mover() com comportamento específico
    @Override
    public void mover() {
        System.out.println("Nadando");
    }
    // Nota: esta classe utiliza o toString() herdado da classe Animal
}