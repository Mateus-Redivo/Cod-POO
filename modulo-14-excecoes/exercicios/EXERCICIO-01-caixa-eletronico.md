# Exercício 01 — Caixa eletrônico (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h30 | throw, throws, try/catch/finally, exceções personalizadas, pacote exception |

## Objetivo

Construir um caixa eletrônico onde NENHUMA falha passa em silêncio e nenhuma derruba o programa: toda situação anormal vira uma exceção com nome próprio, tratada com mensagem clara para o usuário.

## Requisitos

### Exceções personalizadas (pacote `exception`)

- `SaldoInsuficienteException` — checked (estende `Exception`); guarda saldo atual e valor pedido; oferece `getValorFaltante()`
- `ValorInvalidoException` — unchecked (estende `RuntimeException`); para valores zero ou negativos
- `NotaIndisponivelException` — checked; lançada quando o valor não é múltiplo de 10 (o caixa só tem notas de 10)

### Classe ContaCaixa (pacote `model`)

- Atributos: `titular`, `saldo`.
- `sacar(double valor)` — lança `ValorInvalidoException` (valor <= 0), `NotaIndisponivelException` (não múltiplo de 10) ou `SaldoInsuficienteException`, nessa ordem de verificação. Declare as checked com `throws`.
- `depositar(double valor)` — lança `ValorInvalidoException` se valor <= 0.

### Classe Main (pacote `app`)

Menu com Scanner: sacar, depositar, ver saldo, sair.

- Cada operação envolvida em `try/catch`, com UMA mensagem amigável por tipo de exceção (use os dados da exceção: "Faltam R$ X para esse saque").
- O programa NUNCA encerra por causa de erro do usuário — sempre volta ao menu.
- Use `finally` para imprimir uma linha de encerramento de operação (para você VER o finally rodando).
- Feche o `Scanner` na saída do programa.

## Estrutura de pastas

```text
exception/
  SaldoInsuficienteException.java
  ValorInvalidoException.java
  NotaIndisponivelException.java
model/
  ContaCaixa.java
app/
  Main.java
```

## Exemplo de saída (trecho)

```text
Saldo atual: R$ 100.00
Valor do saque: 250
Nao foi possivel sacar: saldo insuficiente. Faltam R$ 150.00.
--- operacao encerrada ---

Valor do saque: 15
Nao foi possivel sacar: o caixa so possui notas de R$ 10.
--- operacao encerrada ---

Valor do saque: 50
Saque realizado. Retire suas notas.
--- operacao encerrada ---
```

## Critérios de aceitação

- [ ] As três exceções estão no pacote `exception` e estendem a superclasse certa (checked × unchecked conforme o enunciado)
- [ ] `sacar` DECLARA as checked com `throws` e o compilador te OBRIGOU a tratar no Main (perceba isso acontecendo)
- [ ] Cada catch tem mensagem específica; nenhum catch vazio, nenhum `catch (Exception e)` genérico
- [ ] Nenhuma entrada do usuário (nem letras no lugar de números) derruba o programa

## Pergunta para responder em comentário

Por que `ValorInvalidoException` faz sentido como unchecked, enquanto `SaldoInsuficienteException` faz sentido como checked? (Dica: qual das duas é um erro do PROGRAMADOR e qual é uma situação normal do NEGÓCIO?)
