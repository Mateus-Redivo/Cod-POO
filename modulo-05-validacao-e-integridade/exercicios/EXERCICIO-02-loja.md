# Exercício 02 — Loja (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h | validação em setters e construtor, regra de negócio numa segunda classe |

## Objetivo

Praticar validação em duas classes ao mesmo tempo: uma protegendo seus próprios atributos, outra aplicando uma regra de negócio que depende do estado da primeira.

## Requisitos

### Classe Produto (pacote `model`)

Atributos (todos privados):

- `nome` (String), regra: não vazio
- `preco` (double), regra: maior que 0
- `quantidadeEmEstoque` (int), regra: nunca negativa

Construtor:

- Recebe os três valores, validando cada um chamando os próprios setters (mesmo padrão do exemplo do módulo).

Métodos:

- Getters para os três atributos; setters com validação para `preco` e `quantidadeEmEstoque` (o `nome` só é definido no construtor, sem setter).
- `toString()` sobrescrito.

### Classe Loja (pacote `model`)

Atributos:

- `nome` (String)
- dois atributos do tipo `Produto`: `produto1`, `produto2`

Construtor:

- Recebe o `nome` da loja e os dois `Produto` já prontos.

Métodos:

- `venderUnidades(Produto produto, int quantidade)`: se `quantidade` for maior que o estoque disponível do produto, recusa a venda e avisa (sem alterar nada). Senão, reduz o estoque do produto em `quantidade` e imprime confirmação com o valor total vendido (`preco * quantidade`).
- `exibirEstoque()`: mostra os dois produtos.

### Classe TesteLoja (pacote `app`)

1. Crie dois produtos válidos e uma `Loja` com eles.
2. Exiba o estoque.
3. Venda uma quantidade válida de um produto.
4. Tente vender mais do que existe em estoque (deve recusar).
5. Tente criar um terceiro `Produto` com preço negativo, direto no `TesteLoja`, e mostre que ele nasce com um valor seguro em vez do inválido.
6. Exiba o estoque final.

## Estrutura de pastas

```text
model/
  Produto.java
  Loja.java
app/
  TesteLoja.java
```

## Critérios de aceitação

- [ ] `Produto` nunca aceita `preco <= 0` nem `quantidadeEmEstoque < 0`, nem pelo construtor nem pelo setter
- [ ] `venderUnidades` recusa vender mais do que o estoque disponível, sem alterar `quantidadeEmEstoque`
- [ ] A regra "não pode vender mais do que tem" mora em `Loja`, não dentro de `Produto` (é uma regra sobre a VENDA, não sobre o produto isolado)
- [ ] O passo 5 confirma que o `Produto` com preço inválido nasceu com um valor seguro, não com o valor negativo

## Dica

`venderUnidades` precisa "ler" a quantidade em estoque do produto antes de decidir. Use o getter de `quantidadeEmEstoque` para isso, e só depois chame o setter para atualizar.

---

Gabarito: [gabaritos/modulo-05/ex02-loja/](../../gabaritos/modulo-05/ex02-loja/), depois de tentar, não antes.
