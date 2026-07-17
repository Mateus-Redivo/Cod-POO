# Exercício 01 — Produto (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 30 min | classe, atributos, construtor, métodos, toString |

## Objetivo

Criar sua primeira classe completa, sozinho, sem copiar do exemplo.

## Requisitos

### Classe Produto (pacote `model`)

Atributos:

- `nome` (String)
- `preco` (double)
- `quantidade` (int)

Construtor:

- Receba os três valores como parâmetros.

Métodos:

- `calcularValorTotal()` — retorna `preco * quantidade`
- `vender(int qtd)` — diminui a quantidade em estoque e imprime mensagem; se não houver quantidade suficiente, imprime aviso e não altera nada
- `toString()` — sobrescrito, devolvendo os dados formatados
- Getters para todos os atributos

### Classe TesteProduto (pacote `app`)

1. Crie 2 produtos diferentes.
2. Imprima os dois com `System.out.println(produto)` (via `toString`).
3. Venda unidades de um deles e imprima o produto de novo.
4. Tente vender mais do que existe e mostre que o estoque não fica negativo.
5. Imprima o valor total em estoque de cada produto.

## Estrutura de pastas

```text
model/
  Produto.java
app/
  TesteProduto.java
```

## Exemplo de saída

```text
=== LOJA ===
Produto [nome=Caderno, preco=25.9, quantidade=10]
Produto [nome=Caneta, preco=3.5, quantidade=100]

Vendidas 4 unidades de Caderno.
Produto [nome=Caderno, preco=25.9, quantidade=6]

Nao ha estoque suficiente de Caderno (disponivel: 6, pedido: 50).

Valor total em estoque de Caderno: R$ 155.40
Valor total em estoque de Caneta: R$ 350.00
```

## Critérios de aceitação

- [ ] Compila sem erros e a saída cobre os 5 passos do teste
- [ ] Atributos privados (vamos reforçar o porquê no módulo 03)
- [ ] `vender` não deixa a quantidade ficar negativa
- [ ] `toString` sobrescrito com `@Override`
- [ ] Estrutura de pacotes `model`/`app` respeitada

## Dica

Trave no `vender`? Pense em português antes do Java: "SE a quantidade pedida for menor ou igual ao estoque, vende; SENÃO, avisa".
