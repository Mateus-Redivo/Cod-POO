# Exercício 03 — Tanque de combustível (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | invariante mantido por dois métodos diferentes, validação sem classe utilitária |

## Objetivo

Manter uma regra que precisa continuar verdadeira depois de QUALQUER sequência de chamadas, em QUALQUER ordem, sem usar uma classe `Validacoes` separada (isso vem no próximo módulo). A regra: o nível do tanque nunca pode ficar negativo nem passar da capacidade máxima.

## Requisitos

### Classe TanqueDeCombustivel (pacote `model`)

Atributos (todos privados):

- `capacidadeMaxima` (double), definida uma única vez, no construtor
- `nivelAtual` (double), começa em `0.0`

Construtor:

- Recebe `capacidadeMaxima`. Se vier menor ou igual a `0`, use `50.0` como valor seguro em vez do inválido (e avise).

Métodos:

- `abastecer(double litros)`: recusa se `litros` for negativo ou zero. Recusa também se abastecer ultrapassaria `capacidadeMaxima` (nesse caso, avise quanto excederia, e não abasteça nada, nem parcialmente). Senão, soma a `nivelAtual` e confirma.
- `consumir(double litros)`: recusa se `litros` for negativo ou zero. Recusa também se consumir deixaria `nivelAtual` negativo. Senão, subtrai de `nivelAtual` e confirma.
- `getNivelAtual()` e `getCapacidadeMaxima()`: getters.
- `toString()` sobrescrito, mostrando nível atual, capacidade máxima e o percentual cheio (`nivelAtual / capacidadeMaxima * 100`).

### Classe TesteTanque (pacote `app`)

Roteiro de ataque:

1. Crie um tanque com capacidade `40.0` e exiba.
2. Abasteça `30.0` litros (deve funcionar) e exiba.
3. Tente abastecer mais `20.0` litros (ultrapassaria a capacidade; deve recusar, e o nível deve continuar em `30.0`).
4. Consuma `10.0` litros (deve funcionar) e exiba.
5. Tente consumir `50.0` litros (deixaria negativo; deve recusar, e o nível deve continuar em `20.0`).
6. Tente `abastecer(-5.0)` e `consumir(0.0)` (ambos devem ser recusados por valor inválido).
7. Crie um segundo tanque com capacidade `-10.0` e confirme que ele nasce com `50.0` em vez do valor inválido.

## Critérios de aceitação

- [ ] `nivelAtual` nunca fica negativo nem maior que `capacidadeMaxima`, em nenhum dos 7 passos
- [ ] `abastecer` que ultrapassaria a capacidade não abastece NADA (não é permitido "abastecer só até encher")
- [ ] `consumir` que deixaria negativo não consome NADA (mesma regra, ao contrário)
- [ ] O tanque com capacidade inválida no construtor nasce com `50.0`, não com o valor negativo
- [ ] Nenhuma classe `Validacoes` foi criada: as regras estão dentro dos próprios métodos de `TanqueDeCombustivel`

## Para pensar (traga para a aula)

Repare que a regra "não pode abastecer além da capacidade" e a regra "não pode consumir além do que tem" são parecidas, mas moram em métodos diferentes, e cada uma faz sua própria conta. No próximo módulo você vai aprender a extrair regras assim para um lugar único, reaproveitável entre vários métodos e até vários objetos.

---

Gabarito: [gabaritos/modulo-05/ex03-tanque-de-combustivel/](../../gabaritos/modulo-05/ex03-tanque-de-combustivel/), depois de tentar, não antes.
