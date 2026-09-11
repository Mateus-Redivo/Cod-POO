# Exercício 02 — Identificando abstração

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 30 min | abstração, modelagem guiada pelo problema |

## Objetivo

Praticar a decisão mais importante deste módulo: o que entra no modelo e o que fica de fora, dependendo do problema.

## O que fazer

Imagine uma classe `Pessoa` em três sistemas diferentes. Para cada domínio, decida, dentre os oito atributos candidatos abaixo, quais fariam parte do modelo e quais ficariam de fora:

```text
nome, idade, CPF, endereço, peso, altura, cargo, salário,
tipo sanguíneo, alergias, time de futebol, cor favorita
```

### Domínio 1: Calculadora de IMC (o exemplo do módulo)

Liste os atributos que entrariam, e justifique cada um em uma frase. Depois liste dois que ficariam de fora e por quê.

### Domínio 2: Sistema de RH de uma empresa

Mesma tarefa: quais entram, quais ficam de fora, por quê.

### Domínio 3: Prontuário de um hospital

Mesma tarefa.

## Pergunta final

1. Existe algum atributo que você incluiu nos **três** domínios? Qual, e por quê ele parece ser "universal"?
2. Existe algum atributo que você incluiu em **só um** dos três? O que isso revela sobre a diferença entre "informação que a pessoa tem" e "informação que o problema precisa"?

## Critérios de aceitação

- [ ] Cada domínio tem sua lista de atributos incluídos, com justificativa de uma frase cada
- [ ] Cada domínio tem pelo menos dois atributos explicitamente excluídos, com justificativa
- [ ] A pergunta sobre o atributo "universal" está respondida com um exemplo concreto
- [ ] A pergunta sobre o atributo "exclusivo de um domínio" está respondida com um exemplo concreto

---

Gabarito: [gabaritos/modulo-01/ex02-identificando-abstracao/](../../gabaritos/modulo-01/ex02-identificando-abstracao/), depois de tentar, não antes.
