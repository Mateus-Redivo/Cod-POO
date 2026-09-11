# Exercício 03 — Estoque de jogos (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | busca linear com dois desfechos possíveis, filtro para lista nova, agregação com multiplicação |

## Objetivo

Uma busca que precisa diferenciar dois tipos de "não deu certo": item que não existe, e item que existe mas está sem estoque. São mensagens diferentes, e só um `for` com bandeira (uma variável booleana marcando se achou) resolve isso direito.

## Requisitos

### Classe Jogo (pacote `model`)

Atributos:

- `titulo` (String)
- `genero` (String)
- `preco` (double)
- `quantidade` (int)

Construtor:

- Recebe os quatro valores.

Métodos:

- Getters para todos os atributos, setter só para `quantidade`.
- `exibirDados()`: imprime todos os dados numa linha.

### Classe Estoque (pacote `model`)

Atributo:

- `jogos` (`List<Jogo>`)

Métodos:

- `adicionar(Jogo jogo)`: adiciona à lista.
- `calcularValorTotalEstoque()`: soma, para cada jogo, `preco * quantidade`, e devolve o total.
- `listarPorGenero(String genero)`: devolve uma **nova** lista só com os jogos daquele gênero (comparação exata com `.equals`).
- `venderUnidade(String titulo)`: procura um jogo com esse título.
  - Se não encontrar NENHUM jogo com esse título: imprime `"Jogo nao encontrado: " + titulo`.
  - Se encontrar mas a quantidade já estiver em `0`: imprime `"Sem estoque de " + titulo`.
  - Se encontrar e tiver estoque: diminui a quantidade em 1 e imprime confirmação.

### Classe TesteEstoque (pacote `app`)

1. Crie um `Estoque` e adicione pelo menos 5 jogos, de pelo menos 2 gêneros diferentes, com quantidades variadas (inclusive um com quantidade `0`).
2. Mostre o valor total do estoque.
3. Liste os jogos de um gênero específico.
4. Venda uma unidade de um jogo que tem estoque (deve funcionar).
5. Tente vender um jogo que está com quantidade `0` (mensagem de "sem estoque").
6. Tente vender um jogo com título que não existe (mensagem de "não encontrado", diferente da anterior).

## Critérios de aceitação

- [ ] `venderUnidade` distingue corretamente "não encontrado" de "sem estoque" (são mensagens diferentes, testadas nos passos 5 e 6)
- [ ] `listarPorGenero` devolve uma lista NOVA; ela não é a mesma referência que `jogos`
- [ ] `calcularValorTotalEstoque` multiplica preço por quantidade de cada jogo antes de somar
- [ ] Nenhum método usa índice fixo; toda busca percorre a lista inteira quando precisa

## Dica

Para separar "não encontrado" de "sem estoque" dentro do mesmo `for`, uma técnica comum é: quando achar o título, resolva tudo ali dentro (confira a quantidade, aja de acordo, e dê um `return` para sair do método). Se o `for` terminar sem nenhum `return` ter acontecido, você sabe que caiu no caso "não encontrado" — trate isso depois do laço.

---

Gabarito: [gabaritos/modulo-07/ex03-estoque-de-jogos/](../../gabaritos/modulo-07/ex03-estoque-de-jogos/), depois de tentar, não antes.
