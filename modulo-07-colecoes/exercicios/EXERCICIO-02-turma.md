# Exercício 02 — Turma (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h | ArrayList, busca linear, filtrar para uma nova lista, agregação |

## Objetivo

Praticar três operações clássicas sobre uma lista: buscar um item, calcular algo sobre todos, e filtrar alguns para uma lista nova. Ainda sem Scanner e sem menu.

## Requisitos

### Classe Aluno (pacote `model`)

Atributos:

- `nome` (String)
- `notaFinal` (double)

Construtor:

- Recebe os dois valores.

Métodos:

- Getters para os dois atributos (você já sabe fazer isso desde o módulo 04).
- `exibirDados()`: imprime nome e nota.
- `foiAprovado()`: retorna `true` se `notaFinal >= 6.0`.

### Classe Turma (pacote `model`)

Atributo:

- `nome` (String)
- `alunos` (`List<Aluno>`)

Construtor:

- Recebe o `nome` da turma e cria a lista vazia.

Métodos:

- `matricular(Aluno aluno)`: adiciona o aluno à lista.
- `calcularMediaDaTurma()`: percorre todos os alunos e devolve a média das notas. Se a turma estiver vazia, devolve `0.0` (e não quebra).
- `listarAprovados()`: devolve uma **nova** `List<Aluno>` só com quem tem `foiAprovado() == true`. A lista original (`alunos`) não é alterada.
- `buscarPorNome(String nome)`: percorre a lista procurando um aluno com esse nome exato; devolve o `Aluno` se achar, ou `null` se não achar.

### Classe TesteTurma (pacote `app`)

1. Crie uma `Turma` e matricule pelo menos 5 alunos, com notas variadas (algumas acima de 6, outras abaixo).
2. Exiba a média da turma.
3. Liste os aprovados (percorra a lista devolvida e exiba cada um).
4. Busque um aluno que existe pelo nome e exiba o resultado.
5. Busque um aluno que **não** existe e trate o `null` (exiba uma mensagem, não deixe o programa quebrar com `NullPointerException`).

## Estrutura de pastas

```text
model/
  Aluno.java
  Turma.java
app/
  TesteTurma.java
```

## Critérios de aceitação

- [ ] `calcularMediaDaTurma()` não quebra numa turma vazia
- [ ] `listarAprovados()` devolve uma lista NOVA; alterar essa lista não afeta `turma.alunos`
- [ ] `buscarPorNome` devolve `null` quando não encontra, e o `TesteTurma` trata esse caso sem lançar `NullPointerException`
- [ ] Nenhuma das buscas ou filtros usa índice fixo (`get(0)`, `get(1)`...); tudo percorre com for-each ou for indexado genérico

## Dica

Para `buscarPorNome`, percorra a lista com um `for` e, ao achar `aluno.getNome().equals(nome)`, retorne aquele aluno imediatamente com `return`. Se o laço terminar sem achar, o `return null;` no final resolve.

---

Gabarito: [gabaritos/modulo-07/ex02-turma/](../../gabaritos/modulo-07/ex02-turma/), depois de tentar, não antes.
