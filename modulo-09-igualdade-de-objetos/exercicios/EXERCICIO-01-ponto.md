# Exercício 01 — Ponto (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 30 min | `equals`, `hashCode`, `==` × `equals` |

## Objetivo

Sobrescrever `equals`/`hashCode` numa classe simples, e comprovar na prática a diferença entre `==` e `equals`, sem lista nenhuma envolvida ainda.

## Requisitos

### Classe Ponto (pacote `model`)

Atributos:

- `x` (int)
- `y` (int)

Construtor:

- Recebe os dois valores.

Métodos:

- `equals(Object o)`: dois pontos são iguais quando têm o MESMO `x` e o MESMO `y`.
- `hashCode()`: usando os mesmos dois campos usados no `equals`.
- `toString()` sobrescrito, no formato `(x, y)`.

### Classe TestePonto (pacote `app`)

1. Crie `Ponto a = new Ponto(3, 4);` e `Ponto b = new Ponto(3, 4);`.
2. Imprima `a == b` (deve ser `false`: são dois objetos diferentes na memória).
3. Imprima `a.equals(b)` (deve ser `true`: mesmo conteúdo).
4. Imprima `a.hashCode()` e `b.hashCode()` (devem ser iguais, pelo contrato).
5. Crie `Ponto c = new Ponto(5, 4);` (só o `x` diferente) e imprima `a.equals(c)` (deve ser `false`).
6. Compare `a.equals(null)`: deve devolver `false`, não lançar exceção.

## Exemplo de saída

```text
a == b -> false
a.equals(b) -> true
a.hashCode() == b.hashCode() -> true
a.equals(c) -> false
a.equals(null) -> false
```

## Critérios de aceitação

- [ ] `a == b` é `false` mesmo com os mesmos valores
- [ ] `a.equals(b)` é `true` quando `x` e `y` são iguais nos dois
- [ ] `a.hashCode()` e `b.hashCode()` são iguais quando `a.equals(b)` é `true`
- [ ] `a.equals(null)` devolve `false` sem lançar `NullPointerException`

## Dica

Use `java.util.Objects.equals(...)` e `java.util.Objects.hash(...)` para não escrever a lógica de comparação na mão: é exatamente o que o exemplo guiado do módulo faz.

---

Gabarito: [gabaritos/modulo-09/ex01-ponto/](../../gabaritos/modulo-09/ex01-ponto/), depois de tentar, não antes.
