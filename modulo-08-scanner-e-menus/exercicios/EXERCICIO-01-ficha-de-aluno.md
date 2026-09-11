# Exercício 01 — Ficha de aluno via Scanner (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 30 min | `Scanner`, leitura validada, laço de repetição até acertar |

## Objetivo

Ler dados do teclado com validação, sem ainda montar um menu completo (isso vem no próximo exercício). Um programa de passagem única: pergunta, lê, valida, confirma.

## Requisitos

### Classe FichaDeAluno (pacote `app`, sem pacote `model` neste exercício)

Um único `main` que, na ordem:

1. Pede o **nome** do aluno. Se vier vazio, repete a pergunta até receber algo (use um `while`).
2. Pede a **idade**. Se não for um número, ou for menor que 5 ou maior que 100, avisa e pede de novo, até receber um valor válido.
3. Pede o **plano** (`1` para Básico, `2` para Premium). Se vier outro número, avisa e pede de novo.
4. Ao final, imprime a ficha completa formatada.

## Exemplo de saída

```text
Nome do aluno: 
Erro: o nome nao pode ser vazio.
Nome do aluno: Marina Costa
Idade: abc
Erro: digite um numero valido.
Idade: 200
Erro: idade deve estar entre 5 e 100.
Idade: 22
Plano (1-Basico, 2-Premium): 3
Erro: escolha 1 ou 2.
Plano (1-Basico, 2-Premium): 2

=== FICHA DO ALUNO ===
Nome: Marina Costa
Idade: 22
Plano: Premium
```

## Critérios de aceitação

- [ ] O programa nunca aceita nome vazio, idade fora da faixa 5–100, ou plano diferente de 1/2
- [ ] Digitar texto onde se espera número não derruba o programa com `InputMismatchException`
- [ ] Cada validação usa um laço `while` que só sai quando o valor é válido
- [ ] A ficha final usa o texto do plano (`"Basico"`/`"Premium"`), não o número digitado

## Dica

Para ler um número sem arriscar `InputMismatchException`, leia a linha inteira com `scanner.nextLine()` e converta com `Integer.parseInt(...)` dentro de um `try/catch (NumberFormatException e)`, avisando e pedindo de novo no `catch`.

---

Gabarito: [gabaritos/modulo-08/ex01-ficha-de-aluno/](../../gabaritos/modulo-08/ex01-ficha-de-aluno/), depois de tentar, não antes.
