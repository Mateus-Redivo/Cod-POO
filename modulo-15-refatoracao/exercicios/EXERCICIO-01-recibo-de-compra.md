# Exercício 01 — Recibo de compra (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 40 min | extração de método, DRY |

## Objetivo

Sua primeira refatoração: só extração de método, sem extração de classe ainda (isso vem no próximo exercício). A fórmula `preco * quantidade` está repetida três vezes — resolva com UM método.

## O que fazer

1. Compile e execute [codigo-inicial-recibo/ReciboDeCompra.java](codigo-inicial-recibo/ReciboDeCompra.java) e anote a saída exata.
2. Crie um método `static double calcularSubtotal(double preco, int quantidade)` que devolve `preco * quantidade`.
3. Troque as três contas repetidas (`subtotal1 = preco1 * quantidade1`, etc.) por chamadas a esse método.
4. Rode de novo e confirme que a saída é EXATAMENTE igual à anotada no passo 1.

## Estrutura de pastas

```text
ReciboDeCompra.java   (sem pacote, mesmo padrão do código inicial)
```

## Critérios de aceitação

- [ ] A fórmula `preco * quantidade` aparece escrita **uma única vez** no arquivo inteiro (dentro do método)
- [ ] A saída depois da refatoração é idêntica à de antes, char por char
- [ ] Nenhuma classe nova foi criada; a mudança é só a extração do método

## Dica

Isso é exatamente o "Ato 1" do exemplo guiado do módulo: identificar o bloco repetido, criar um método que faz aquele cálculo, e trocar as repetições pela chamada.

---

Gabarito: [gabaritos/modulo-15/ex01-recibo-de-compra/](../../gabaritos/modulo-15/ex01-recibo-de-compra/), depois de tentar, não antes.
