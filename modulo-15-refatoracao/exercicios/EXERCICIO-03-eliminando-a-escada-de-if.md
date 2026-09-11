# Exercício 03 — Eliminando a escada de if (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h30 | substituir escada de `if` por polimorfismo, extração de classe, classe abstrata |

## Objetivo

Este é o refatoramento que o [módulo 11](../../modulo-11-sobrescrita-e-polimorfismo/) só apontou como "cheiro de código", sem resolver. Agora você tem as ferramentas (herança, classe abstrata, polimorfismo) para resolver de verdade.

## O ponto de partida

Abra [codigo-inicial-formas/CalculadoraDeFormas.java](codigo-inicial-formas/CalculadoraDeFormas.java). Repare: a mesma escada `if (tipo.equals("circulo")) { ... } else if (tipo.equals("quadrado")) { ... }` aparece **duas vezes**, uma para área, outra para perímetro. Se alguém adicionar um `"triangulo"` e esquecer de atualizar uma das duas escadas, o programa continua compilando e rodando, só que mente sobre um dos dois valores.

## O que fazer

1. Compile e execute o código inicial. Anote a saída exata (ela é a sua referência).
2. Crie uma classe abstrata `Forma` (pacote `model`) com atributo `medida` (double), construtor, e dois métodos abstratos: `calcularArea()` e `calcularPerimetro()`.
3. Crie `Circulo` e `Quadrado` (pacote `model`), cada uma herdando de `Forma` e implementando as fórmulas corretas (as mesmas do código original).
4. Reescreva o `main` (pacote `app`) para montar uma `List<Forma>` (um `Circulo(3.0)`, um `Quadrado(4.0)`, um `Circulo(5.0)`, os mesmos valores do código original) e, num único laço, imprimir os dados de cada forma chamando `calcularArea()` e `calcularPerimetro()` polimorficamente.
5. Rode e confira: a saída (os números) deve bater com a que você anotou no passo 1, mesmo o texto podendo ser formatado diferente.
6. Comprove a eliminação do "cheiro": adicione uma classe `Triangulo` (com base e altura, área = `base * altura / 2`, perímetro fica por sua conta escolher os lados) SEM tocar em nenhuma escada de `if`, porque ela não existe mais.

## Estrutura de pastas

```text
model/
  Forma.java   (abstrata)
  Circulo.java
  Quadrado.java
  Triangulo.java
app/
  TesteFormas.java
```

## Critérios de aceitação

- [ ] Não existe mais NENHUM `if (tipo.equals(...))` no projeto refatorado
- [ ] Os números de área e perímetro batem com a saída original, forma por forma
- [ ] `Triangulo` foi adicionada sem alterar `Forma`, `Circulo`, `Quadrado` nem o laço do `main`
- [ ] O laço do `main` usa só o tipo `Forma`

## Para pensar (traga para a aula)

No código original, esquecer de atualizar a segunda escada de `if` ao adicionar um tipo novo é um erro fácil de cometer e difícil de notar (o programa não quebra, só mente). Na versão com classes, que tipo de erro o compilador pegaria se você esquecesse de implementar `calcularPerimetro()` numa forma nova?

---

Gabarito: [gabaritos/modulo-15/ex03-eliminando-a-escada-de-if/](../../gabaritos/modulo-15/ex03-eliminando-a-escada-de-if/), depois de tentar, não antes.
