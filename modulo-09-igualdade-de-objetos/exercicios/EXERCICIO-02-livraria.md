# Exercício 01 — Livraria (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 1h | equals, hashCode, contains numa lista |

## Objetivo

Provar, com um teste seu, por que `equals`/`hashCode` sobrescritos mudam o comportamento de uma lista.

## Requisitos

### Classe Livro (pacote `model`)

Atributos:

- `isbn` (String), identifica o livro de forma única
- `titulo` (String)
- `autor` (String)

Construtor: recebe os três valores.

Métodos:

- `equals(Object o)`: dois livros são iguais quando têm o MESMO `isbn` (não precisa comparar título nem autor: o isbn já identifica o livro).
- `hashCode()`: usando o mesmo campo (`isbn`) usado no `equals`.
- `exibirDados()` imprime isbn, título e autor.

### Classe TesteLivraria (pacote `app`)

1. Crie uma `List<Livro>` e cadastre 3 livros com ISBNs diferentes.
2. Tente `lista.contains(...)` passando um NOVO objeto `Livro` com o mesmo isbn de um dos três, mas título/autor escritos de forma ligeiramente diferente. Deve dar `true`.
3. Tente `lista.contains(...)` passando um `Livro` com isbn que não existe na lista. Deve dar `false`.
4. Tente cadastrar um livro repetido (mesmo isbn de um já cadastrado): use `contains` para impedir e imprimir um aviso.
5. Comente, num bloco de comentário no início do `main`, o que aconteceria no passo 2 se `equals` não tivesse sido sobrescrito.

## Estrutura de pastas

```text
model/
  Livro.java
app/
  TesteLivraria.java
```

## Exemplo de saída (trecho)

```text
--- Catalogo ---
9788535902778 - Dom Casmurro (Machado de Assis)
9788525406958 - O Cortico (Aluisio Azevedo)
9788535911015 - Iracema (Jose de Alencar)

contains(isbn existente, dados diferentes) -> true
contains(isbn inexistente) -> false

Livro com isbn 9788535902778 ja esta cadastrado. Cadastro recusado.
```

## Critérios de aceitação

- [ ] `equals` compara só o `isbn`, ignorando título e autor
- [ ] `hashCode` usa o mesmo campo que `equals`
- [ ] O passo 2 dá `true` mesmo com título/autor diferentes do original
- [ ] O cadastro duplicado do passo 4 é recusado usando `contains`, sem laço manual comparando campo a campo

## Dica

Se `contains` sempre der `false`, mesmo para um isbn que já está na lista, confira se `equals` foi mesmo sobrescrito com `@Override` (sem a anotação, um erro de assinatura passa despercebido).
