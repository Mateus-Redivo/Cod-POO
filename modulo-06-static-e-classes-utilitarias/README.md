# Módulo 06 — static e classes utilitárias

As regras de validação do módulo anterior estavam repetidas dentro de cada setter. Se dez classes do sistema validassem idade, a regra "entre 0 e 150" apareceria dez vezes, e corrigi-la exigiria lembrar dos dez lugares. Neste módulo essa regra ganha um endereço único.

## Objetivos de aprendizagem

Ao final deste módulo você será capaz de:

- [ ] Criar uma classe utilitária de validações com métodos `static`
- [ ] Explicar a diferença entre um método de instância e um método `static`
- [ ] Usar `static final` para uma constante de classe
- [ ] Encadear construtores com `this(...)` para não repetir inicialização

## Pré-requisitos

[Módulo 05](../modulo-05-validacao-e-integridade/) concluído.

## Conceito

### Classes utilitárias e o static

Repare no exemplo que as regras de validação agora moram em [util/Validacoes.java](exemplo/util/Validacoes.java), com métodos `static`:

```java
if (Validacoes.idadeValida(idade)) { ... }   // sem new
```

`static` significa que o método pertence à **classe**, não a um objeto. Faz sentido aqui: validar uma idade não depende de nenhum estado, é uma função pura de apoio. Também evita repetir a mesma regra em todo setter do sistema.

Cuidado com a tentação: se TUDO no seu programa é `static`, você volta ao estilo procedural do módulo 01.

### Por que o construtor de Validacoes é privado

`Validacoes` não guarda nenhum dado, então não faz sentido criar um objeto dela. O construtor privado impede `new Validacoes()` fora da própria classe; isso é chamado de padrão de **classe utilitária**.

### static final: uma constante que pertence à classe

```java
private static final double ALTURA_PADRAO = 1.70;
```

- `static`: existe uma cópia só, compartilhada por todos os objetos de `Pessoa`, não uma cópia por objeto.
- `final`: depois de atribuído, o valor nunca muda.
- Convenção: nome em MAIÚSCULAS, porque é uma constante.

### this(...): um construtor chamando outro

```java
public Pessoa(String nome, int idade) {
    this(nome, idade, ALTURA_PADRAO);   // chama o construtor de 3 parametros
}
```

Em vez de repetir a lógica de inicialização (e o risco de esquecer de atualizar uma cópia quando mudar a outra), um construtor delega para o outro. Só pode ser a **primeira** linha do construtor.

## Duas camadas de validação (lembrete do módulo anterior)

A regra em si (`idade entre 0 e 150`) está escrita **uma vez só**, dentro de `Validacoes`. Setter e construtor apenas perguntam a ela. Duplicar a *chamada* é barato; duplicar a *regra* é que seria erro.

## Exemplo guiado

- [model/Pessoa.java](exemplo/model/Pessoa.java): agora com `static final ALTURA_PADRAO`, um construtor que chama o outro com `this(...)`, e setters que perguntam a `Validacoes`.
- [util/Validacoes.java](exemplo/util/Validacoes.java): validações de nome, idade e altura, todas `static`, com construtor privado.
- [app/TesteValidacoes.java](exemplo/app/TesteValidacoes.java): usa `Pessoa` e chama `Validacoes` diretamente, sem `new`.

```bash
cd exemplo
javac -d bin model/*.java util/*.java app/*.java
java -cp bin app.TesteValidacoes
```

Experimente: tente escrever `new Validacoes()` em algum lugar do código. Leia a mensagem de erro do compilador.

## Exercícios

1. [EXERCICIO-01-termostato.md](exercicios/EXERCICIO-01-termostato.md) (desafio): quando a regra depende de dois atributos ao mesmo tempo.

> Este módulo ainda vai ganhar um exercício de fixação numa próxima revisão do material.

## Auto-avaliação

- [ ] Sei decidir quando um método merece ser `static` e quando não
- [ ] Sei explicar por que o construtor de uma classe utilitária costuma ser privado
- [ ] Sei quando usar `static final` para uma constante
- [ ] Escrevi um construtor que chama outro com `this(...)`

## Erros comuns

| Erro | O que está acontecendo |
| --- | --- |
| Colocar `static` em tudo | Programa procedural disfarçado de POO |
| Chamar `this(...)` em outra linha que não a primeira | Erro de compilação: só pode ser a primeira instrução do construtor |
| Esquecer o `final` numa constante que nunca deveria mudar | Nada impede outro código de reatribuir o valor depois |
| Tentar `new Validacoes()` | Erro de compilação: o construtor é privado de propósito |

---

Anterior: [Módulo 05](../modulo-05-validacao-e-integridade/) | Próximo: [Módulo 07 — Coleções](../modulo-07-colecoes/)
