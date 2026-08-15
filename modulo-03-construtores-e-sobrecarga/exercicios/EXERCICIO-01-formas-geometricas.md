# Exercício 01 — Retângulo com construtores sobrecarregados (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 30 min | sobrecarga de construtor, resolução de sobrecarga |

## Objetivo

Praticar a regra da sobrecarga escrevendo uma classe com 3 construtores diferentes, sem copiar do exemplo.

## Requisitos

### Classe Retangulo (pacote `model`)

Atributos:

- `largura` (double)
- `altura` (double)

Construtores (todos sobrecarregados, preste atenção na assinatura de cada um):

- `Retangulo(double largura, double altura)`: recebe os dois lados.
- `Retangulo(double lado)`: recebe um valor só e usa o MESMO valor para largura e altura (ou seja, cria um quadrado).
- `Retangulo()`: sem parâmetros, largura e altura viram `1.0`.

Métodos:

- `calcularArea()`: retorna `largura * altura`
- `calcularPerimetro()`: retorna `2 * (largura + altura)`
- `exibirDados()`: imprime largura, altura, área e perímetro numa linha

### Classe TesteRetangulo (pacote `app`)

1. Crie um retângulo com `new Retangulo(4, 2)` e exiba os dados.
2. Crie um "quadrado" com `new Retangulo(5)` e exiba os dados.
3. Crie um retângulo com `new Retangulo()` e exiba os dados.
4. Antes de rodar, escreva num comentário, ao lado de cada `new`, qual dos 3 construtores está sendo chamado e por quê.

## Estrutura de pastas

```text
model/
  Retangulo.java
app/
  TesteRetangulo.java
```

## Exemplo de saída

```text
Retangulo [largura=4.0, altura=2.0, area=8.0, perimetro=12.0]
Retangulo [largura=5.0, altura=5.0, area=25.0, perimetro=20.0]
Retangulo [largura=1.0, altura=1.0, area=1.0, perimetro=4.0]
```

## Critérios de aceitação

- [ ] Os 3 construtores compilam sem erro de "already defined"
- [ ] `new Retangulo(5)` produz um quadrado 5x5, não um retângulo com altura 0
- [ ] Cada `new` no teste tem um comentário dizendo qual construtor foi chamado e por quê
- [ ] Estrutura de pacotes `model`/`app` respeitada

## Dica

Se dois construtores parecerem "iguais" e o compilador reclamar, olhe só para o tipo e a quantidade dos parênteses: nomes de parâmetro não contam para o Java.
