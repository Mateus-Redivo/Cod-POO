# Exercício 02 — Pedido de pizza (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 45 min | sobrecarga de construtor, construtor que recebe outro objeto como parâmetro |

## Objetivo

Praticar sobrecarga de construtor numa classe, e ver um construtor recebendo objetos de outra classe como parâmetro.

## Requisitos

### Classe Pizza (pacote `model`)

Atributos:

- `sabor` (String)
- `tamanho` (String): `"pequena"`, `"media"` ou `"grande"`
- `quantidadeFatias` (int): calculada a partir do tamanho: pequena = 4, media = 6, grande = 8

Construtores (todos sobrecarregados):

- `Pizza(String sabor, String tamanho)`: recebe os dois, calcula `quantidadeFatias` a partir do `tamanho`.
- `Pizza(String sabor)`: recebe só o sabor; `tamanho` vira `"media"`.
- `Pizza()`: sem parâmetros; `sabor` vira `"Mussarela"`, `tamanho` vira `"media"`.

Métodos:

- `exibirDados()`: imprime sabor, tamanho e quantidade de fatias.

### Classe Pedido (pacote `model`)

Atributos:

- `numeroDoPedido` (int)
- dois atributos do tipo `Pizza`: `pizza1`, `pizza2`

Construtor:

- `Pedido(int numeroDoPedido, Pizza pizza1, Pizza pizza2)`: recebe o número do pedido e as duas pizzas já prontas (criadas antes, fora do `Pedido`).

Métodos:

- `calcularTotalDeFatias()`: retorna a soma de `quantidadeFatias` das duas pizzas. Você vai precisar de um jeito de "ler" essa informação de dentro do `Pedido`: pense em qual método de `Pizza` te ajudaria a expor esse número sem usar a palavra "getter" (uma dica: um método pode devolver um valor com `return` sem precisar seguir a convenção `getAlgo()`).
- `exibirPedido()`: imprime o número do pedido, e chama `exibirDados()` das duas pizzas.

### Classe TestePedido (pacote `app`)

1. Crie uma `Pizza` usando cada um dos 3 construtores (3 pizzas diferentes).
2. Monte um `Pedido` com duas dessas pizzas.
3. Exiba o pedido completo.
4. Mostre o total de fatias do pedido.
5. Num comentário, ao lado de cada `new Pizza(...)`, explique qual construtor foi chamado e por quê.

## Estrutura de pastas

```text
model/
  Pizza.java
  Pedido.java
app/
  TestePedido.java
```

## Exemplo de saída

```text
Pedido #1001:
Pizza: Calabresa | Tamanho: grande | Fatias: 8
Pizza: Marguerita | Tamanho: media | Fatias: 6

Total de fatias no pedido: 14
```

## Critérios de aceitação

- [ ] Os 3 construtores de `Pizza` compilam sem erro de "already defined"
- [ ] `quantidadeFatias` é calculada corretamente a partir do `tamanho`, em todos os 3 construtores
- [ ] `Pedido` recebe as `Pizza` já prontas no construtor, sem criar nenhuma `Pizza` sozinho
- [ ] `calcularTotalDeFatias()` soma corretamente as fatias das duas pizzas do pedido

## Dica

Para `calcularTotalDeFatias()` funcionar, `Pizza` precisa de um método que devolva `quantidadeFatias` para quem pedir. Isso não é um "getter" no sentido formal do módulo 04 (ainda não vimos a convenção `getAlgo()`), é só um método comum que faz `return this.quantidadeFatias;`. A diferença de nome importa menos que você entender por que ele precisa existir: sem ele, `Pedido` não tem como "ver" dentro da `Pizza`.

---

Gabarito: [gabaritos/modulo-03/ex02-pedido-de-pizza/](../../gabaritos/modulo-03/ex02-pedido-de-pizza/), depois de tentar, não antes.
