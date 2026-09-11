# Exercício 03 — Eletrodomésticos de cozinha (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | herança em três níveis, `super` chamando `super` |

## Objetivo

Os exercícios anteriores tinham hierarquias de um nível (mãe → filha). Aqui você vai construir três níveis (avó → mãe → filha), e vai ver `super.exibirInfo()` disparar uma cadeia: a filha chama a mãe, que chama a avó.

## Requisitos

### Classe Eletrodomestico (pacote `model`), nível avó

Atributos protegidos:

- `marca` (String)
- `voltagem` (int): `110` ou `220`
- `ligado` (boolean), inicia `false`

Construtor: recebe `marca` e `voltagem`.

Métodos:

- `ligar()`: muda `ligado` para `true`, imprime confirmação.
- `desligar()`: muda `ligado` para `false`, imprime confirmação.
- `exibirInfo()`: imprime marca, voltagem e se está ligado.

### Classe AparelhoCozinha (pacote `model`, herda de Eletrodomestico), nível mãe

Atributo protegido adicional:

- `potenciaWatts` (int)

Construtor: recebe `marca`, `voltagem` e `potenciaWatts`; repassa o que é da avó via `super(...)`.

Sobrescrita:

- `exibirInfo()`: chama `super.exibirInfo()` (que é o da `Eletrodomestico`) e acrescenta a potência.

### Classe Geladeira (pacote `model`, herda de AparelhoCozinha), nível filha

Atributo adicional:

- `temperaturaAtual` (int), em graus Celsius, inicia em `4`

Construtor: recebe `marca`, `voltagem` e `potenciaWatts`; repassa via `super(...)`.

Métodos:

- `resfriar(int graus)`: diminui `temperaturaAtual` em `graus`; recusa se o resultado for menor que `-5`.
- `exibirInfo()` (sobrescrita): chama `super.exibirInfo()` (o da `AparelhoCozinha`, que por sua vez já chamou o da `Eletrodomestico`) e acrescenta a temperatura atual.

### Classe Microondas (pacote `model`, herda de AparelhoCozinha), nível filha

Atributo adicional:

- `tempoMaximoMinutos` (int)

Construtor: recebe `marca`, `voltagem`, `potenciaWatts` e `tempoMaximoMinutos`.

Métodos:

- `aquecer(int minutos)`: se `minutos` for maior que `tempoMaximoMinutos`, recusa e avisa o máximo permitido. Senão, imprime confirmação.
- `exibirInfo()` (sobrescrita): chama `super.exibirInfo()` e acrescenta o tempo máximo.

### Classe TesteEletrodomesticos (pacote `app`)

1. Crie uma `Geladeira` e um `Microondas`.
2. Ligue os dois.
3. Chame `exibirInfo()` de cada um e confirme, lendo a saída, que os dados aparecem na ordem: avó, depois mãe, depois filha.
4. Resfrie a geladeira em `15` graus (a partir de `4`, deve recusar por passar de `-5`... ajuste o teste para um valor que funcione e um que recuse).
5. Aqueça o micro-ondas por um tempo válido, depois tente por um tempo além do máximo.

## Critérios de aceitação

- [ ] Existe uma hierarquia de 3 níveis: `Eletrodomestico` → `AparelhoCozinha` → (`Geladeira` e `Microondas`)
- [ ] `Geladeira.exibirInfo()` produz uma saída com informação dos TRÊS níveis, nessa ordem
- [ ] Cada construtor chama `super(...)` na primeira linha, repassando só o que é da mãe/avó
- [ ] `resfriar` e `aquecer` têm suas próprias regras de recusa, específicas de cada classe filha

## Dica

Pense em `super.exibirInfo()` como "primeiro deixa quem vier antes de mim terminar o trabalho dela". Quando `Geladeira.exibirInfo()` chama `super.exibirInfo()`, ela está chamando a versão de `AparelhoCozinha`, que, por sua vez, TAMBÉM chama `super.exibirInfo()` (a de `Eletrodomestico`) antes de acrescentar a potência. A cadeia se desenrola de trás para frente.

---

Gabarito: [gabaritos/modulo-10/ex03-eletrodomesticos/](../../gabaritos/modulo-10/ex03-eletrodomesticos/), depois de tentar, não antes.
