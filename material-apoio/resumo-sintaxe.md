# Resumo de sintaxe — cola rápida de POO em Java

Consulta rápida da sintaxe usada nos módulos, na ordem em que aparece. Para os conceitos, veja o [GLOSSARIO](../GLOSSARIO.md); aqui é só o "como se escreve".

## Classe, atributos, construtor (módulo 02)

```java
package model;

public class Pessoa {
    private String nome;                 // atributo privado
    private int idade;

    public Pessoa(String nome, int idade) {   // construtor
        this.nome = nome;                // this = este objeto
        this.idade = idade;
    }

    public Pessoa() {                    // sobrecarga de construtor
        this("Sem nome", 0);             // chama o outro construtor
    }

    public String getNome() { return nome; }          // getter
    public void setNome(String nome) {                // setter
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}
```

```java
Pessoa p = new Pessoa("Ana", 30);        // instanciar
System.out.println(p);                   // imprime via toString()
```

## Validação em setter (módulo 03)

```java
public void setIdade(int idade) {
    if (idade < 0 || idade > 150) {
        System.out.println("Idade invalida: " + idade);
        return;                          // recusa: atributo nao muda
    }
    this.idade = idade;
}
```

## Método e classe utilitária static (módulo 03)

```java
public class Validacoes {
    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 150;
    }
}
// uso, sem new:
if (Validacoes.validarIdade(20)) { ... }
```

## ArrayList e Scanner (módulo 04)

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

List<Aluno> alunos = new ArrayList<>();
alunos.add(new Aluno("Ana", 25, 1));
alunos.get(0);                           // acesso por indice
alunos.size();                           // tamanho
alunos.remove(0);                        // remover por indice

for (Aluno a : alunos) {                 // for-each
    System.out.println(a);
}

Scanner sc = new Scanner(System.in);
int op = sc.nextInt();
sc.nextLine();                           // limpa o Enter do buffer!
String nome = sc.nextLine();
```

## equals e hashCode (módulo 04)

```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;                       // mesmo objeto
    if (o == null || getClass() != o.getClass()) return false;
    Aluno outro = (Aluno) o;
    return idade == outro.idade && nome.equals(outro.nome);
}

@Override
public int hashCode() {                               // MESMOS campos do equals
    return java.util.Objects.hash(nome, idade);
}
```

```java
a == b          // compara REFERENCIAS (mesmo objeto?)
a.equals(b)     // compara CONTEUDO (se sobrescrito)
lista.contains(x)   // usa equals por baixo dos panos
```

## Menu padrão (módulo 04)

```java
int op;
do {
    exibirMenu();
    op = lerOpcao();
    switch (op) {
        case 1 -> cadastrar();
        case 2 -> listar();
        case 0 -> System.out.println("Saindo...");
        default -> System.out.println("Opcao invalida.");
    }
} while (op != 0);
```

## Herança (módulo 05)

```java
public class Carro extends Veiculo {                 // Carro E UM Veiculo
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);                   // construtor da mae PRIMEIRO
        this.portas = portas;
    }

    @Override                                        // sempre use
    public void exibirInfo() {
        super.exibirInfo();                          // versao da mae...
        System.out.println("Portas: " + portas);     // ...mais o extra
    }
}
```

Visibilidade: `private` (só a classe) | `protected` (classe + filhas) | `public` (todos).

## Classe abstrata (módulo 06)

```java
public abstract class Forma {                        // new Forma() NAO compila
    public abstract double calcularArea();           // sem corpo: filha implementa

    public void exibirInfo() {                       // concreto: filhas herdam pronto
        System.out.println("Area: " + calcularArea());
    }
}
```

## Sobrecarga × sobrescrita (módulo 06)

```java
// SOBRECARGA: mesma classe, mesmo nome, parametros diferentes
public void pintar() { ... }
public void pintar(String cor) { ... }

// SOBRESCRITA: filha redefine metodo da mae, mesma assinatura
@Override
public double calcularArea() { ... }
```

## Polimorfismo (módulos 06 e 07)

```java
List<Forma> formas = new ArrayList<>();
formas.add(new Circulo(...));
formas.add(new Retangulo(...));
for (Forma f : formas) {
    f.calcularArea();    // executa a versao do objeto REAL, em cada volta
}
```

## Interface (módulo 07)

```java
public interface Pagavel {
    double calcularPagamento();          // public abstract por padrao
}

public class Freelancer implements Pagavel, Avaliavel {   // varias de uma vez
    @Override
    public double calcularPagamento() { ... }
    // + obrigacoes de Avaliavel
}
```

## Exceções (módulo 08)

```java
// personalizada checked (obriga tratamento)
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) { super(msg); }
}

// lancar e declarar
public void sacar(double valor) throws SaldoInsuficienteException {
    if (valor > saldo) {
        throw new SaldoInsuficienteException("Faltou dinheiro");
    }
}

// tratar
try {
    conta.sacar(500);
} catch (SaldoInsuficienteException e) {
    System.out.println("Falhou: " + e.getMessage());
} finally {
    System.out.println("Sempre executa");
}
```

## Compilar e executar (todos os módulos)

```bash
cd modulo-XX-nome/exemplo
javac -d bin model/*.java util/*.java app/*.java   # inclua so as pastas que existirem
java -cp bin app.NomeDaClasseComMain
```
