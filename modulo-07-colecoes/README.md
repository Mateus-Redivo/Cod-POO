# Módulo 07 — Coleções

Até agora criamos dois ou três objetos "na mão". Sistemas reais gerenciam **muitos** objetos. Neste módulo você aprende a guardar vários objetos numa lista e percorrê-la — a base de qualquer sistema de cadastro.

## Objetivos de aprendizagem

Ao final deste módulo você será capaz de:

- [ ] Guardar objetos em um `ArrayList`
- [ ] Percorrer uma lista com `for-each`
- [ ] Acessar, contar e remover elementos por índice

## Pré-requisitos

[Módulo 06](../modulo-06-static-e-classes-utilitarias/) concluído.

## Conceito

### ArrayList: a prateleira de objetos

Um array comum (`Aluno[10]`) tem tamanho fixo. O `ArrayList` cresce sozinho:

```java
List<Aluno> alunos = new ArrayList<>();
alunos.add(new Aluno("Ana", 25, 1));   // guarda
alunos.get(0);                          // pega pelo indice
alunos.size();                          // quantos tem
alunos.remove(0);                       // remove pelo indice
```

O `<Aluno>` (generics) avisa ao compilador: "esta lista só aceita `Aluno`". Tentar adicionar outra coisa nem compila — mais um erro pego de graça, antes de executar.

Para percorrer, o for-each é o mais legível:

```java
for (Aluno aluno : alunos) {
    System.out.println(aluno);   // usa o toString() de Aluno
}
```

## Exemplo guiado

- [model/Aluno.java](exemplo/model/Aluno.java) — nome, idade e plano, com `toString()`.
- [app/TesteColecoes.java](exemplo/app/TesteColecoes.java) — cria uma lista, adiciona, percorre, acessa por índice e remove.

```bash
cd exemplo
javac -d bin model/*.java app/*.java
java -cp bin app.TesteColecoes
```

## Exercícios

> Este módulo ainda vai ganhar exercícios próprios numa próxima revisão do material. Por ora, pratique alterando o `TesteColecoes.java`: adicione mais alunos, tente remover um índice que não existe e observe o erro.

## Auto-avaliação

- [ ] Sei criar, popular e percorrer um `ArrayList` sem consultar exemplo
- [ ] Sei explicar por que `List<Aluno>` recusa guardar outra coisa que não seja `Aluno`
- [ ] Sei acessar um elemento pelo índice e sei o que acontece se o índice não existir

## Erros comuns

| Erro | O que está acontecendo |
| --- | --- |
| `IndexOutOfBoundsException` ao acessar ou remover | Índice fora do tamanho da lista — valide contra `lista.size()` |
| Modificar a lista dentro de um for-each | `ConcurrentModificationException` — remova por índice fora do laço, ou use um `Iterator` (fora do escopo deste módulo) |
| Esquecer o `import java.util.ArrayList;` | `ArrayList` não é reconhecido pelo compilador |

---

Anterior: [Módulo 06](../modulo-06-static-e-classes-utilitarias/) | Próximo: [Módulo 08 — Scanner e menus](../modulo-08-scanner-e-menus/)
