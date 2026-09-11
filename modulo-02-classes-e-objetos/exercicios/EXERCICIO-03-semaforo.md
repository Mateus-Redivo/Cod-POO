# Exercício 03 — Semáforo (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 45 min | estado interno mais complexo, método que decide entre vários caminhos |

## Objetivo

Modelar um objeto cujo estado muda de forma cíclica e depende do próprio estado anterior, não só de um valor recebido de fora. Ainda sem getters, sem setters, sem `toString()`.

## Requisitos

### Classe Semaforo (pacote `model`)

Atributos:

- `cruzamento` (String), ex.: "Rua A com Rua B"
- `corAtual` (String), inicia `"vermelho"`
- `totalDeCiclos` (int), inicia em `0`

Construtor:

- Receba só o `cruzamento`. As outras duas propriedades começam nos valores padrão acima.

Métodos:

- `avancar()`: muda a cor seguindo o ciclo `vermelho -> verde -> amarelo -> vermelho`. Toda vez que a cor volta para `"vermelho"` a partir de `"amarelo"`, incrementa `totalDeCiclos` em 1 (um ciclo completo aconteceu). Imprime a transição (de qual cor para qual cor).
- `forcarVermelho()`: usado para emergências. Muda direto para `"vermelho"`, **sem** contar como ciclo completo, mesmo se estava em `"amarelo"`. Imprime aviso de que foi uma parada forçada.
- `exibirEstado()`: imprime o cruzamento, a cor atual e o total de ciclos completos.

### Classe TesteSemaforo (pacote `app`)

1. Crie um `Semaforo`.
2. Chame `avancar()` 5 vezes seguidas, exibindo o estado depois de cada chamada.
3. Depois das 5 chamadas, confira quantos ciclos completos aconteceram (deve ser 1, já que 5 avanços a partir do vermelho fazem: verde, amarelo, vermelho [1 ciclo], verde, amarelo).
4. Chame `forcarVermelho()` no meio de um ciclo (por exemplo, quando a cor estiver `"verde"`) e confirme que `totalDeCiclos` **não** aumentou por causa disso.
5. Exiba o estado final.

## Estrutura de pastas

```text
model/
  Semaforo.java
app/
  TesteSemaforo.java
```

## Exemplo de saída (trecho)

```text
Semaforo Rua A com Rua B: vermelho -> verde
Rua A com Rua B | cor: verde | ciclos completos: 0
Semaforo Rua A com Rua B: verde -> amarelo
Rua A com Rua B | cor: amarelo | ciclos completos: 0
Semaforo Rua A com Rua B: amarelo -> vermelho
Rua A com Rua B | cor: vermelho | ciclos completos: 1
```

## Critérios de aceitação

- [ ] `avancar()` segue exatamente o ciclo vermelho → verde → amarelo → vermelho, nessa ordem, sempre
- [ ] `totalDeCiclos` só aumenta quando a transição é de `"amarelo"` para `"vermelho"` dentro de `avancar()`
- [ ] `forcarVermelho()` muda a cor mas nunca incrementa `totalDeCiclos`
- [ ] Nenhum getter, setter ou `toString()` foi usado

## Dica

Pense em `avancar()` como um `if/else if/else` que olha o valor ATUAL de `corAtual` para decidir qual é o próximo. Não existe fórmula matemática aqui, é decisão por comparação de texto (`if (corAtual.equals("vermelho")) { ... }`).

---

Gabarito: [gabaritos/modulo-02/ex03-semaforo/](../../gabaritos/modulo-02/ex03-semaforo/), depois de tentar, não antes.
