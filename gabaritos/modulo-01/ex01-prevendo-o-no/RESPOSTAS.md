# Gabarito — Prevendo o nó procedural

## 1. Variáveis novas para 3 pessoas

Seguindo o estilo original (uma variável por dado, sem classe), seriam necessárias:

```text
peso1, altura1, imc1
peso2, altura2, imc2
peso3, altura3, imc3
```

9 variáveis no lugar de 2 (`peso`, `altura`). Repare que já é preciso inventar `imc1`, `imc2`, `imc3` também, porque `calcularIMC()` precisaria devolver o resultado de cada pessoa separadamente para poder imprimir os três no fim.

## 2. O que cada função passaria a precisar saber

- `receberPeso()`: hoje ela não recebe parâmetro nenhum, só preenche `peso`. Com 3 pessoas, ela precisaria saber **de qual pessoa** é esse peso (por exemplo, receber um número ou nome como parâmetro) e escrever no lugar certo (`peso1`, `peso2` ou `peso3`), o que geralmente vira um `if`/`switch` dentro da própria função.
- `receberAltura()`: exatamente o mesmo problema de `receberPeso()`.
- `calcularIMC()`: hoje ela lê direto as variáveis globais `peso` e `altura`. Com 3 pessoas, ela precisaria saber qual dos três pares usar, e devolver o resultado pro lugar certo (`imc1`, `imc2` ou `imc3`).

Nenhuma das três continuaria funcionando só olhando `peso` e `altura`: as três precisariam de um jeito de saber "qual pessoa" a cada chamada.

## 3. De 3 para 30 pessoas

A quantidade de variáveis cresce na **mesma proporção** (linearmente): 30 pessoas exigiriam 90 variáveis (`peso1`...`peso30`, `altura1`...`altura30`, `imc1`...`imc30`). Mas a **complexidade das funções** cresce mais rápido que isso: cada função passaria a ter um `if`/`switch` com 30 ramos, um para cada pessoa, só para decidir em qual variável mexer. O código de decisão ("qual pessoa é essa?") cresce mais que os dados em si.

## 4. Arrays paralelos resolvem?

Usar `peso[30]`, `altura[30]`, `imc[30]` resolve o problema de **nomear** 90 variáveis diferentes: agora é só um índice. Mas não resolve o problema de fundo, que é as funções ainda não saberem, sozinhas, "de quem" é o dado que estão processando: elas continuam precisando receber o índice como parâmetro toda vez, e nada impede que dois arrays fiquem "fora de sincronia" (por exemplo, alguém atualizar `peso[5]` sem atualizar `altura[5]` correspondente). É um alívio de sintaxe, não uma solução estrutural. É exatamente o problema que uma classe `Pessoa` resolve, porque cada objeto já carrega peso, altura e cálculo consigo, sem precisar de índice nenhum.
