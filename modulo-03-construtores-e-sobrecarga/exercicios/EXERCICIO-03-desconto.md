# Exercício 03 — Desconto (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 45 min | sobrecarga por TIPO de parâmetro, `int` × `double` na resolução de sobrecarga |

## Objetivo

Nos exercícios anteriores, os construtores sobrecarregados diferiam pela QUANTIDADE de parâmetros. Aqui a diferença está no TIPO — e essa é a armadilha clássica da sobrecarga em Java: `10` e `10.0` não são a mesma coisa para o compilador.

## Requisitos

### Classe Desconto (pacote `model`)

Atributos:

- `tipo` (String): `"percentual"` ou `"fixo"`
- `valor` (double)
- `cumulativo` (boolean), inicia `false`

Construtores (todos sobrecarregados, preste MUITA atenção nos tipos):

- `Desconto(int percentual)`: `tipo` vira `"percentual"`, `valor` recebe o `percentual` (convertido para `double`).
- `Desconto(double valorFixo)`: `tipo` vira `"fixo"`, `valor` recebe `valorFixo` diretamente.
- `Desconto(int percentual, boolean cumulativo)`: igual ao primeiro, mas também define `cumulativo`.

Métodos:

- `aplicarSobre(double preco)`: retorna o preço com desconto aplicado. Se `tipo` for `"percentual"`, o cálculo é `preco - (preco * valor / 100)`. Se `tipo` for `"fixo"`, o cálculo é `preco - valor` (nunca menos que 0).
- `exibirDados()`: imprime tipo, valor e se é cumulativo.

### Classe TesteDesconto (pacote `app`)

1. Crie `new Desconto(10)` — anote num comentário qual construtor é chamado e por quê.
2. Crie `new Desconto(15.0)` — anote qual construtor é chamado e por quê. Se você escrever `new Desconto(15)` (sem o `.0`) em vez disso, o que muda?
3. Crie `new Desconto(20, true)`.
4. Para cada um dos três, exiba os dados e aplique sobre um preço de `R$ 200,00`, mostrando o resultado.

## Exemplo de saída

```text
Desconto [tipo=percentual, valor=10.0, cumulativo=false]
Preco com desconto: 180.0

Desconto [tipo=fixo, valor=15.0, cumulativo=false]
Preco com desconto: 185.0

Desconto [tipo=percentual, valor=20.0, cumulativo=true]
Preco com desconto: 160.0
```

## Critérios de aceitação

- [ ] `new Desconto(10)` chama o construtor de `int`, não o de `double`
- [ ] `new Desconto(15.0)` chama o construtor de `double`, não o de `int`
- [ ] `new Desconto(20, true)` chama o construtor de dois parâmetros, mesmo existindo um construtor de `int` sozinho
- [ ] `aplicarSobre` nunca devolve um preço negativo no caso de desconto fixo maior que o preço
- [ ] Os três comentários no `TesteDesconto` explicam corretamente qual construtor foi escolhido em cada `new`

## A pergunta que vale o exercício

Por que `new Desconto(15)` (sem `.0`) chamaria o construtor de `int`, mesmo existindo um construtor de `double` que também "serviria"? Responda num comentário. Dica: o Java prefere o construtor que casa com o tipo EXATO do argumento antes de considerar conversões automáticas (`int` para `double` é uma conversão, não uma correspondência exata).

---

Gabarito: [gabaritos/modulo-03/ex03-desconto/](../../gabaritos/modulo-03/ex03-desconto/), depois de tentar, não antes.
