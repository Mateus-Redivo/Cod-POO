# Exercício 01 — Formas de pagamento (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 45 min | interface, `implements`, polimorfismo por interface |

## Objetivo

Criar sua primeira interface do zero, com uma única interface implementada por classes sem parentesco, antes de combinar duas interfaces no próximo exercício.

## Requisitos

### Interface MeioDePagamento (pacote `model`)

- `double calcularValorAPagar();`
- `String getDescricao();`

### Classe Boleto (pacote `model`, implementa MeioDePagamento)

Atributos: `valor` (double), `diasParaVencer` (int).

- `calcularValorAPagar()`: se `diasParaVencer` for negativo (vencido), aplica 2% de multa sobre `valor`; senão, devolve `valor` sem alteração.
- `getDescricao()`: `"Boleto (vence em " + diasParaVencer + " dias)"`.

### Classe Cartao (pacote `model`, implementa MeioDePagamento)

Atributos: `valor` (double), `numeroDeParcelas` (int).

- `calcularValorAPagar()`: se `numeroDeParcelas` for maior que 1, aplica 5% de juros sobre `valor`; senão, devolve `valor` sem alteração.
- `getDescricao()`: `"Cartao em " + numeroDeParcelas + "x"`.

### Classe TestePagamentos (pacote `app`)

1. Crie um `Boleto` vencido (`diasParaVencer` negativo) e um em dia.
2. Crie um `Cartao` parcelado e um à vista (`numeroDeParcelas = 1`).
3. Coloque os quatro numa `List<MeioDePagamento>`.
4. Num único laço, exiba `getDescricao()` e `calcularValorAPagar()` de cada um, e some o total geral.

## Critérios de aceitação

- [ ] `Boleto` e `Cartao` não têm nenhuma relação de herança entre si, só implementam a mesma interface
- [ ] O laço do passo 4 usa só o tipo `MeioDePagamento`
- [ ] A multa do boleto vencido e os juros do cartão parcelado são aplicados corretamente

## Dica

Repare que esta interface se chama `MeioDePagamento`, não `Pagavel` como no exemplo guiado do módulo: são dois contratos diferentes, cada um pensado para seu próprio problema.

---

Gabarito: [gabaritos/modulo-13/ex01-formas-de-pagamento/](../../gabaritos/modulo-13/ex01-formas-de-pagamento/), depois de tentar, não antes.
