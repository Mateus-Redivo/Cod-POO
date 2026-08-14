# Glossário de POO

Termos usados nos módulos, explicados em linguagem simples e com um exemplo mínimo. Use este arquivo como consulta rápida sempre que um nome aparecer e você não lembrar o que significa.

## Classe

O molde, a planta, a receita. Define quais dados e comportamentos os objetos daquele tipo terão. Uma classe `Pessoa` define que toda pessoa tem `nome` e `idade` — mas a classe sozinha não é nenhuma pessoa específica.

```java
public class Pessoa {
    private String nome;
    private int idade;
}
```

## Objeto (ou instância)

Um exemplar concreto criado a partir da classe, com valores próprios. Duas instâncias de `Pessoa` são independentes: mudar o nome de uma não afeta a outra.

```java
Pessoa ana = new Pessoa("Ana", 30);
Pessoa bia = new Pessoa("Bia", 25);
```

## Atributo

Uma variável que pertence ao objeto e guarda seu estado. `nome` e `idade` são atributos de `Pessoa`.

## Método

Uma ação que o objeto sabe realizar, geralmente usando seus próprios atributos. `calcularIMC()` é um método de `Pessoa`.

## Construtor

O método especial chamado na hora do `new`, responsável por inicializar o objeto. Tem o mesmo nome da classe e não tem tipo de retorno.

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

## this

Referência ao "próprio objeto". Usado principalmente para diferenciar o atributo do parâmetro quando têm o mesmo nome: `this.nome = nome`.

## Encapsulamento

Proteger os dados do objeto (`private`) e controlar o acesso por métodos (getters e setters). Impede que qualquer parte do programa coloque um valor inválido direto no atributo. Visto nos módulos 04 e 05.

## Getter e Setter

Métodos públicos de leitura (`getNome()`) e escrita (`setNome(...)`) de um atributo privado. O setter é o lugar ideal para validar: `setIdade(-5)` pode recusar o valor.

## Herança

Uma classe (`Carro`) reaproveita e estende outra (`Veiculo`) usando `extends`. A filha ganha os atributos e métodos da mãe e pode adicionar os seus. Visto no módulo 10.

## super

Dentro da classe filha, referencia a classe mãe. `super(...)` chama o construtor da mãe; `super.metodo()` chama a versão original de um método sobrescrito.

## Sobrescrita (Override)

A classe filha fornece uma nova implementação para um método herdado, mantendo a mesma assinatura. Marcamos com `@Override` para o compilador conferir. Visto nos módulos 05 e 06.

## Sobrecarga (Overload)

Vários métodos com o **mesmo nome** e **parâmetros diferentes** na mesma classe. `pintar()` e `pintar(String cor)` são sobrecargas. Não confundir com sobrescrita. Visto no módulo 03, revisado no módulo 11.

## Classe abstrata

Classe que não pode ser instanciada com `new`; existe para ser mãe de outras. Pode ter métodos abstratos (sem corpo) que as filhas são obrigadas a implementar. Vista no módulo 12.

## Abstração

O pilar de "modelar só o que importa". Ao criar a classe `Aluno` para a academia, guardamos nome, idade e plano — e ignoramos cor dos olhos, time de futebol etc. Abstrair é decidir o que entra e o que fica de fora do modelo.

## Polimorfismo

"Muitas formas": tratar objetos de classes diferentes pelo tipo comum (mãe ou interface) e deixar cada um responder do seu jeito. Num `for` sobre `List<Funcionario>`, cada `calcularSalario()` executa a versão da classe real do objeto. Visto nos módulos 06 e 07.

## Interface

Um contrato: só declara métodos (o quê), sem implementação (o como). Quem `implements` a interface é obrigado a implementar tudo. Uma classe pode implementar várias interfaces. Vista no módulo 13.

## Exceção

Um objeto que representa um erro em tempo de execução. É lançado com `throw` e tratado com `try/catch`. Exceções verificadas (checked) obrigam tratamento; não verificadas (unchecked, filhas de `RuntimeException`) não obrigam. Vistas no módulo 14.

## Refatoração

Melhorar a estrutura interna do código **sem mudar seu comportamento**: extrair métodos, extrair classes, renomear, eliminar duplicação. Vista no módulo 15.

## Pacote (package)

Uma pasta lógica que organiza classes relacionadas. Nos módulos usamos `model` (domínio), `app` (executáveis), `util` (auxiliares) e `exception` (exceções personalizadas).

## ArrayList / List

Coleção que cresce conforme necessário, usada para guardar vários objetos: `List<Aluno> alunos = new ArrayList<>()`. Vista no módulo 07.

## Scanner

Classe do Java para ler o que o usuário digita no terminal. Vista no módulo 08.

## static

Marca atributos e métodos que pertencem à **classe**, não a cada objeto. `Validacoes.validarIdade(20)` é chamado sem criar objeto. Vista no módulo 06. Cuidado: programa só com `static` é programa procedural disfarçado (módulo 01 explica).

## toString()

Método herdado de `Object` que devolve a representação em texto do objeto. Sobrescrevê-lo faz `System.out.println(objeto)` imprimir algo legível.

## equals()

Método herdado de `Object` que responde "este objeto é igual àquele?". A versão herdada compara referências (mesmo objeto na memória); sobrescrevemos para comparar **conteúdo** (campo a campo). Coleções usam `equals` em `contains`, `remove` e `indexOf`. Não confundir com `==`, que sempre compara referências. Visto no módulo 09.

## hashCode()

Par inseparável do `equals`: um "resumo numérico" do objeto, usado por coleções como `HashSet` e `HashMap` para localizar objetos rapidamente. Contrato: se dois objetos são `equals`, seus `hashCode` devem ser iguais — por isso os dois métodos são sempre sobrescritos juntos, com os mesmos campos. Visto no módulo 09.
