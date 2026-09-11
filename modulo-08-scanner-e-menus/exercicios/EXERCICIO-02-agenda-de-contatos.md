# Exercício 01 — Agenda de contatos (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 1h30 | ArrayList, Scanner, menu + switch, CRUD |

## Objetivo

Construir, sozinho, um sistema de console completo com o esqueleto aprendido no módulo: menu, lista de objetos e operações de CRUD.

## Requisitos

### Classe Contato (pacote `model`)

Atributos privados:

- `nome` (String), não vazio
- `telefone` (String), não vazio
- `email` (String), deve conter `@` (validação simples mesmo)
- `favorito` (boolean), começa `false`

Com construtor, getters/setters validados e `toString()`.

### Classe Validacoes (pacote `util`)

Aproveite o padrão do exemplo da academia: métodos static de leitura validada do Scanner.

### Classe Main (pacote `app`)

Menu com as opções:

```text
=== AGENDA DE CONTATOS ===
1. Adicionar contato
2. Listar todos
3. Buscar por nome
4. Marcar/desmarcar favorito
5. Remover contato
6. Listar apenas favoritos
0. Sair
```

Comportamentos exigidos:

- Listar com lista vazia deve avisar "Nenhum contato cadastrado", não imprimir nada em branco.
- A busca por nome deve encontrar por trecho, ignorando maiúsculas (`"ana"` acha `"Mariana"`).
- Remover deve listar os contatos numerados e pedir o número; número fora da faixa deve ser recusado.
- Opção inválida no menu não pode quebrar o programa (nem com letra no lugar de número).

## Estrutura de pastas

```text
model/
  Contato.java
util/
  Validacoes.java
app/
  Main.java
```

## Critérios de aceitação

- [ ] As 7 opções funcionam e o programa só encerra na opção 0
- [ ] Digitar letra onde se espera número NÃO derruba o programa
- [ ] Buscar/remover/listar com a lista vazia é tratado com mensagem amigável
- [ ] Nenhum contato entra na lista com dados inválidos
- [ ] Cada opção do menu está em um método próprio (main enxuto)

## Desafio extra (opcional)

Impeça o cadastro de dois contatos com o mesmo telefone. Dica: antes de adicionar, percorra a lista comparando, e pense em qual método da classe `Contato` ajudaria (`equals`?).
