# Exercício 01 — Prevendo o nó procedural

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 20 min | limites do estilo procedural, variáveis globais |

## Objetivo

Sentir, no papel, o problema que a versão procedural do exemplo guiado só sugere. Não é um exercício de código: é um exercício de previsão.

## O ponto de partida

Releia [exemplo/versao-procedural/CalculadoraIMC.java](../exemplo/versao-procedural/CalculadoraIMC.java). Ela calcula o IMC de **uma** pessoa por vez, usando as variáveis globais `peso` e `altura` e as funções `receberPeso()`, `receberAltura()` e `calcularIMC()`.

## O que fazer

Sem escrever nenhum código, responda por escrito:

1. Para calcular o IMC de **3 pessoas ao mesmo tempo** (todas na tela juntas, no fim do programa), liste **toda variável nova** que você precisaria criar, seguindo o estilo do código original (variáveis soltas, sem classe).
2. Para cada uma das três funções (`receberPeso`, `receberAltura`, `calcularIMC`), explique o que ela precisaria "saber a mais" para funcionar com 3 pessoas em vez de uma. Ela ainda funcionaria só de olhar pra `peso` e `altura`?
3. Se o programa precisasse crescer de 3 para 30 pessoas, o que aconteceria com a quantidade de variáveis e com a complexidade das funções? Cresce na mesma proporção, mais rápido, ou mais devagar?
4. Existe alguma forma de resolver isso **sem** usar classes/objetos (por exemplo, usando arrays paralelos: `peso[0]`, `peso[1]`...)? Ela resolveria o problema de verdade, ou só adiaria? Explique em duas frases.

## Critérios de aceitação

- [ ] A lista de variáveis novas para 3 pessoas está completa e nomeada de forma consistente com o original
- [ ] A resposta sobre as três funções explica especificamente o que cada uma passaria a precisar saber
- [ ] A resposta sobre 3 → 30 pessoas justifica a proporção escolhida, não só afirma um número
- [ ] A resposta sobre arrays paralelos reconhece o que eles resolvem e o que continuam não resolvendo

---

Gabarito: [gabaritos/modulo-01/ex01-prevendo-o-no/](../../gabaritos/modulo-01/ex01-prevendo-o-no/), depois de tentar, não antes.
