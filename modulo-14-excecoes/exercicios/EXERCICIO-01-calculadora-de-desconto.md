# Exercício 01 — Calculadora de desconto (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 40 min | `throw`, `throws`, `try/catch/finally`, uma exceção personalizada simples |

## Objetivo

Criar e lançar sua primeira exceção personalizada, num cenário pequeno: uma única regra, um único `throw`.

## Requisitos

### Classe PercentualInvalidoException (pacote `exception`)

- Checked (estende `Exception`).
- Construtor que recebe uma `String mensagem` e repassa para `super(mensagem)`.

### Classe CalculadoraDeDesconto (pacote `model`)

Método:

- `aplicarDesconto(double valor, double percentual)`: se `percentual` for menor que `0` ou maior que `100`, lança `PercentualInvalidoException` com uma mensagem explicando o problema. Senão, retorna `valor - (valor * percentual / 100)`. Declare `throws PercentualInvalidoException` na assinatura.

### Classe TesteCalculadora (pacote `app`)

1. Chame `aplicarDesconto(200.0, 10.0)` dentro de um `try`, capture `PercentualInvalidoException` num `catch`, e imprima o resultado dentro do `try` se der certo.
2. Chame `aplicarDesconto(200.0, 150.0)` (percentual inválido) do mesmo jeito, e confirme que o `catch` captura a exceção e imprime a mensagem dela (`e.getMessage()`).
3. Em AMBOS os casos (sucesso e erro), um bloco `finally` deve imprimir `"Calculo finalizado."` — confirme isso rodando os dois cenários.

## Exemplo de saída

```text
Resultado: 180.0
Calculo finalizado.
Erro: Percentual invalido: 150.0. Deve estar entre 0 e 100.
Calculo finalizado.
```

## Critérios de aceitação

- [ ] `aplicarDesconto` lança `PercentualInvalidoException` para percentuais fora de 0–100
- [ ] O método declara `throws PercentualInvalidoException` (é checked, o compilador exige)
- [ ] O `finally` imprime `"Calculo finalizado."` nos dois cenários, sucesso e erro
- [ ] A mensagem de erro capturada vem de `e.getMessage()`, não de um texto reescrito no `catch`

## Dica

Se o compilador reclamar de "unreported exception", falta um `throws PercentualInvalidoException` na assinatura do método que lança, OU um `try/catch` em quem chama.

---

Gabarito: [gabaritos/modulo-14/ex01-calculadora-de-desconto/](../../gabaritos/modulo-14/ex01-calculadora-de-desconto/), depois de tentar, não antes.
