# Exercício 01 — Animais (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 1h | herança, sobrescrita, sobrecarga, polimorfismo |

## Objetivo

Construir uma hierarquia de animais onde `emitirSom()` se comporta diferente para cada tipo, e provar isso com uma lista que trata todos pelo tipo comum, sem `instanceof`.

## Requisitos

### Classe Animal (pacote `model`)

Atributos protegidos:

- `nome` (String)
- `idade` (int)

Construtor: recebe `nome` e `idade`.

Métodos:

- `emitirSom()`: imprime `"[nome] faz um som generico."`. Será sobrescrito pelas filhas.
- `emitirSom(int vezes)`: SOBRECARGA, chama `emitirSom()` repetidas vezes.
- `exibirInfo()`: imprime nome e idade.

### Classe Cachorro (pacote `model`, herda de Animal)

- Construtor: recebe `nome` e `idade`, chama `super(...)`.
- Sobrescreve `emitirSom()` para imprimir `"[nome] diz: Au au!"`.

### Classe Gato (pacote `model`, herda de Animal)

- Construtor: recebe `nome` e `idade`, chama `super(...)`.
- Sobrescreve `emitirSom()` para imprimir `"[nome] diz: Miau!"`.

### Classe Passaro (pacote `model`, herda de Animal)

- Construtor: recebe `nome`, `idade` e `capazDeVoar` (boolean).
- Sobrescreve `emitirSom()` para imprimir `"[nome] diz: Piu piu!"`.
- Sobrescreve `exibirInfo()`: chama a versão da mãe com `super.exibirInfo()` e acrescenta se voa ou não.

### Classe TesteAnimais (pacote `app`)

1. Teste `emitirSom()` e `emitirSom(3)` (a sobrecarga) num `Cachorro`.
2. Crie uma `List<Animal>` com pelo menos um `Cachorro`, um `Gato` e um `Passaro`.
3. Em UM único laço `for`, chame `emitirSom()` de cada animal da lista.
4. Num comentário, explique como o Java escolheu qual `emitirSom()` executar em cada volta, sem usar `instanceof` em nenhum lugar do código.

## Estrutura de pastas

```text
model/
  Animal.java
  Cachorro.java
  Gato.java
  Passaro.java
app/
  TesteAnimais.java
```

## Exemplo de saída (trecho)

```text
Rex diz: Au au!
Rex diz: Au au!
Rex diz: Au au!
Rex diz: Au au!

--- Lista polimorfica ---
Rex diz: Au au!
Mimi diz: Miau!
Bibi diz: Piu piu!
```

## Critérios de aceitação

- [ ] `emitirSom()` de cada subclasse imprime uma mensagem diferente
- [ ] `emitirSom(3)` chama `emitirSom()` três vezes: é a sobrecarga em ação, não um método novo
- [ ] O laço da parte 3 usa só o tipo `Animal`, sem `instanceof` e sem cast
- [ ] Cada `@Override` está presente e correto

## Dica

Se o seu laço precisar de `instanceof` para funcionar, algo está errado: o `@Override` em cada filha existe exatamente para o laço não precisar saber o tipo concreto.
