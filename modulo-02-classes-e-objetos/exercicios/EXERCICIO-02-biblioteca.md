# Exercício 02 — Sistema de biblioteca (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h | classes, objetos, construtores, estado do objeto, getters/setters |

## Objetivo

Modelar duas classes que representam entidades reais e fazer o estado de um objeto mudar ao longo do programa (livro emprestado / devolvido).

## Requisitos

### Classe Livro (pacote `model`)

Atributos:

- `titulo` (String)
- `autor` (String)
- `numeroPaginas` (int)
- `disponivel` (boolean) — valor inicial `true`

Construtor:

- Receba `titulo`, `autor` e `numeroPaginas` como parâmetros.
- Configure `disponivel` como `true` automaticamente (o chamador não passa esse valor).

Métodos:

- `emprestar()` — altera `disponivel` para `false` e imprime mensagem de sucesso; se o livro já estiver emprestado, apenas avisa
- `devolver()` — altera `disponivel` para `true` e imprime mensagem
- `exibirInfo()` — mostra todas as informações do livro em uma linha
- Getters e setters para todos os atributos

### Classe Usuario (pacote `model`)

Atributos:

- `nome` (String)
- `email` (String)
- `idade` (int)

Construtor:

- Receba todos os atributos como parâmetros.

Métodos:

- `exibirDados()` — mostra as informações do usuário
- Getters e setters para todos os atributos

### Classe TesteBiblioteca (pacote `app`)

1. Crie 2 livros diferentes.
2. Teste emprestar e devolver, imprimindo o livro após cada operação.
3. Tente emprestar um livro já emprestado.
4. Crie 1 usuário e exiba seus dados.

## Estrutura de pastas

```text
model/
  Livro.java
  Usuario.java
app/
  TesteBiblioteca.java
```

## Exemplo de saída

```text
=== SISTEMA DE BIBLIOTECA ===

1. Criando livros:
Livro: Programacao em JAVA | Autor: Desconhecido | Paginas: 1024 | Disponivel: true
Livro: Python | Autor: Floresta | Paginas: 25 | Disponivel: true

2. Testando emprestimos:
O livro 'Programacao em JAVA' foi emprestado com sucesso!
Livro: Programacao em JAVA | Autor: Desconhecido | Paginas: 1024 | Disponivel: false

3. Testando devolucao:
O livro 'Programacao em JAVA' foi devolvido com sucesso!
Livro: Programacao em JAVA | Autor: Desconhecido | Paginas: 1024 | Disponivel: true

4. Dados do usuario:
Nome: Joao Silva | Email: joao@email.com | Idade: 25

=== FIM DO TESTE ===
```

## Critérios de aceitação

- [ ] `disponivel` nasce `true` sem ser passado no construtor
- [ ] `emprestar()` em livro já emprestado avisa e não "empresta duas vezes"
- [ ] As mensagens usam o título do livro (nada de mensagem genérica)
- [ ] Estrutura de pacotes respeitada
- [ ] A saída bate com o roteiro do teste (os textos podem variar, o comportamento não)

## Desafio extra (opcional)

Adicione um atributo `Livro livroEmprestado` ao `Usuario` e métodos `pegarEmprestado(Livro l)` / `devolverLivro()`, fazendo o usuário só poder ter um livro por vez. É um gostinho de como objetos se relacionam — tema que cresce nos próximos módulos.
