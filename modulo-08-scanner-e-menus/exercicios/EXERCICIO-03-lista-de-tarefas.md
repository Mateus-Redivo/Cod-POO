# Exercício 03 — Lista de tarefas (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h30 | ArrayList, Scanner, menu + switch, CRUD com atualização (não só criar/listar/remover) |

## Objetivo

O exercício anterior tinha criar, listar e remover. Aqui entra a quarta operação clássica de um CRUD: **atualizar** um item que já existe, sem recriá-lo do zero.

## Requisitos

### Classe Tarefa (pacote `model`)

Atributos:

- `descricao` (String)
- `concluida` (boolean), inicia `false`
- `prioridade` (int), de 1 (baixa) a 3 (alta)

Construtor:

- Recebe `descricao` e `prioridade`.

Métodos:

- Getters para os três atributos.
- `marcarComoConcluida()`: muda `concluida` para `true`.
- `exibirDados()`: imprime um índice-friendly (a tarefa em si, sem número — o número quem mostra é o menu), descrição, prioridade e status (`[X]` se concluída, `[ ]` se não).

### Classe Main (pacote `app`)

Menu:

```text
=== LISTA DE TAREFAS ===
1. Adicionar tarefa
2. Listar todas
3. Marcar como concluida
4. Remover tarefa
5. Listar apenas pendentes
0. Sair
```

Comportamentos exigidos:

- **Adicionar**: pede descrição (não vazia) e prioridade (1 a 3, validada).
- **Listar todas**: mostra todas, numeradas, com o status de cada uma.
- **Marcar como concluída**: lista as tarefas numeradas, pede o número, valida contra o tamanho da lista, e chama `marcarComoConcluida()` na tarefa escolhida — sem recriar a tarefa, sem removê-la e adicionar outra no lugar.
- **Remover**: mesma lógica de escolher por número.
- **Listar apenas pendentes**: usa uma lista nova (filtrada), só com `concluida == false`.
- Lista vazia em qualquer listagem mostra `"Nenhuma tarefa cadastrada."`, nunca uma lista em branco.
- Opção inválida no menu, ou letra onde se espera número, não derruba o programa.

## Estrutura de pastas

```text
model/
  Tarefa.java
app/
  Main.java
```

## Critérios de aceitação

- [ ] "Marcar como concluída" muda o estado do objeto EXISTENTE na lista, não cria um novo nem reordena a lista
- [ ] "Listar apenas pendentes" usa uma lista filtrada nova, sem alterar a lista principal
- [ ] Número de tarefa fora da faixa (ex.: escolher a tarefa "10" quando só existem 3) é recusado com mensagem, não derruba o programa
- [ ] Todas as 6 opções do menu funcionam e o programa só encerra na opção 0

## Dica

"Marcar como concluída" e "Remover" pedem a mesma coisa do usuário (escolher um número da lista) e validam do mesmo jeito. Perceber essa repetição agora é um bom aquecimento para o [módulo 15 — Refatoração](../../modulo-15-refatoracao/), que ensina a extrair esse padrão para um método só.

---

Gabarito: [gabaritos/modulo-08/ex03-lista-de-tarefas/](../../gabaritos/modulo-08/ex03-lista-de-tarefas/), depois de tentar, não antes.
