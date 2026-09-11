# Exercício 01 — Refatorar a farmácia (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h30 | extração de método, extração de classe, DRY |

## Objetivo

Você recebeu um programa que FUNCIONA: [codigo-inicial/Farmacia.java](codigo-inicial/Farmacia.java) calcula o total de uma venda com regras de desconto. Sua missão é transformá-lo em POO **sem alterar a saída**.

## Passo 0 (obrigatório)

Compile e execute o código inicial. Copie a saída para um arquivo de texto (ou print). Essa é a sua referência: ao final, a saída da versão refatorada deve ser idêntica.

```bash
cd codigo-inicial
javac Farmacia.java
java Farmacia
```

## O que refatorar

Identifique no código inicial (anote como comentário no seu código final):

1. Qual bloco está duplicado três vezes?
2. Quais variáveis estão "numeradas" (`nome1`, `nome2`...)?
3. Quais números mágicos existem e o que significam?

## Resultado esperado

```text
model/
  ItemVenda.java   (nome, preco, quantidade, generico)
app/
  Farmacia.java    (main enxuto: cria itens, imprime, soma)
```

Requisitos da classe `ItemVenda`:

- Atributos privados com construtor.
- `calcularSubtotal()`: preço x quantidade.
- `calcularDesconto()`: A REGRA (20% genérico; senão 10% acima de R$ 100; senão zero) escrita UMA única vez. Extraia os percentuais para constantes com nome (`DESCONTO_GENERICO = 0.20`).
- `calcularTotal()`: subtotal menos desconto.
- `exibirLinha()`: imprime a linha do item no MESMO formato do original.

Requisitos do novo `main`:

- Cria os três itens, exibe cada um e imprime o total da venda.
- Deve ser possível adicionar um quarto item com no máximo 2 linhas novas.

## Critérios de aceitação

- [ ] Saída idêntica à versão original (compare linha a linha)
- [ ] A regra de desconto existe em exatamente UM lugar
- [ ] Nenhuma variável numerada sobreviveu
- [ ] Os percentuais têm nome (constantes), não são números mágicos soltos
- [ ] Comentário no código responde às 3 perguntas da seção "O que refatorar"

## Desafio extra (opcional)

Crie uma classe `Venda` que guarda uma `List<ItemVenda>` e sabe `calcularTotalVenda()` e `exibirCupom()`, o mesmo movimento do `Turma` no exemplo do módulo. Depois responda: se a farmácia criar um desconto novo para idosos, quantos arquivos você tocaria na sua versão? E na original?
