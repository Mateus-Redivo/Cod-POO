# Exercício: Baralho (Java puro)

Objetivo

- Exercitar conceitos iniciais de POO utilizando encapsulamento, enums, composição, coleções, métodos e validação.

Descrição da tarefa

- Implemente um pequeno sistema que modele um baralho de 52 cartas, permita embaralhar, comprar cartas e distribuir a jogadores.

Requisitos mínimos

- Classe `Carta` representando uma carta (valor + naipe).
- Enums `Naipe` e `Valor` para representar os 4 naipes e os 13 valores.
- Classe `Baralho` que gera as 52 cartas, com métodos: `embaralhar()`, `comprar()` (retorna `Carta` ou `null`), `tamanho()`.
- Classe `Jogador` com `nome` e `mao` (coleção de `Carta`), métodos `receber(Carta)` e `mostrarMao()`.
- `Main` de demonstração que embaralha o baralho, distribui 5 cartas para 2 jogadores e imprime as mãos.
- Trate casos simples (por exemplo, comprar quando o baralho está vazio) com retorno `null` ou mensagens claras.

Estrutura sugerida (exemplo)

Baralho/
  README.md
  src/
    baralho/
      models/
        Carta.java
        Naipe.java
        Valor.java
        Baralho.java
        Jogador.java
      app/
        Main.java
      util/
        Validacoes.java

Observações de implementação

- Use encapsulamento: campos privados e getters/setters quando necessário.
- Prefira `List<Carta>` (por exemplo, `ArrayList`) para representar o baralho e as mãos.
- Para embaralhar, use `Collections.shuffle(List<?>)`.
- `Carta#toString()` deve retornar algo legível, ex.: "Ás de Espadas" ou "A♠".

Exercícios extras opcionais

- Implementar distribuição para N jogadores e verificar sobra de cartas.
- Criar método `reset()` em `Baralho` que recria e embaralha as 52 cartas.
- Implementar um pequeno jogo (ex.: comparar valores para ver quem tem a carta mais alta).
- Serializar/deserializar o baralho para arquivo.

Como compilar e executar (linha de comando)

1. Navegue para a pasta `src`:

```bash
cd Baralho/src
```

1. Compile todas as classes do package `baralho`:

```bash
javac baralho/*.java
```

1. Execute o `Main`:

```bash
java baralho.Main
```
