# Módulo 09 — Igualdade de objetos

Uma pergunta que parece boba até morder: **quando dois objetos são iguais?** Este módulo isola essa pergunta, porque ela é sutil o bastante para merecer uma aula própria — e porque toda coleção do Java (`contains`, `remove`, `HashSet`...) depende da resposta.

## Objetivos de aprendizagem

Ao final deste módulo você será capaz de:

- [ ] Explicar a diferença entre `==` e `equals`
- [ ] Sobrescrever `equals` e `hashCode` juntos, respeitando o contrato entre eles
- [ ] Explicar por que `ArrayList.contains()`/`remove()`/`indexOf()` dependem de `equals`

## Pré-requisitos

[Módulo 08](../modulo-08-scanner-e-menus/) concluído.

## Conceito

### == vs. equals

```java
Aluno a = new Aluno("Ana", 25, 1);
Aluno b = new Aluno("Ana", 25, 1);
System.out.println(a == b);        // false!
System.out.println(a.equals(b));   // depende...
```

- `==` compara **referências**: "são o MESMO objeto na memória?" Dois `new` sempre criam objetos diferentes, então `a == b` é `false` mesmo com dados idênticos.
- `equals` deveria comparar **conteúdo** — mas a versão herdada de `Object` também compara referência. Ou seja: sem sobrescrever, `a.equals(b)` é `false` também.

### Por que isso importa numa lista

A lista usa `equals` por baixo dos panos:

```java
alunos.contains(new Aluno("Ana", 25, 1));   // "ja existe essa aluna?"
alunos.remove(algumAluno);                   // remove QUEM for equals
alunos.indexOf(algumAluno);                  // procura por equals
```

Sem `equals` sobrescrito, `contains` responde `false` para uma aluna com dados idênticos — e seu sistema cadastra a Ana duas vezes. Abra [model/Aluno.java](exemplo/model/Aluno.java): ele sobrescreve `equals` comparando nome, idade e plano, campo a campo.

### E o hashCode?

É o par inseparável do `equals`, um "resumo numérico" do objeto que coleções como `HashSet` e `HashMap` (você as encontrará em breve na carreira) usam para localizar objetos rapidamente. A regra do contrato é uma só e vale decorar:

> Se dois objetos são `equals`, seus `hashCode` DEVEM ser iguais.

Por isso os dois são sempre sobrescritos **juntos**, usando os mesmos campos — repare no `Aluno.java` que é exatamente o que acontece. Sobrescrever só um deles quebra o contrato e causa bugs silenciosos (objetos que "somem" dentro de um `HashSet`).

Na prática, sua IDE gera os dois para você (no VS Code: clique direito, "Source Action", "Generate hashCode() and equals()"). O importante é saber QUANDO gerar — toda classe de domínio que vai morar numa coleção e ser buscada/comparada — e escolher os campos que definem a identidade do objeto.

## Exemplo guiado

- [model/Aluno.java](exemplo/model/Aluno.java) — agora com `equals`/`hashCode` sobrescritos usando `java.util.Objects`.
- [app/TesteIgualdade.java](exemplo/app/TesteIgualdade.java) — compara `==` com `equals`, mostra o `hashCode` e prova por que `contains()` depende de `equals`.

```bash
cd exemplo
javac -d bin model/*.java app/*.java
java -cp bin app.TesteIgualdade
```

Experimente: comente as sobrescritas de `equals`/`hashCode` em `Aluno.java`, recompile e rode de novo. Veja o `contains()` do passo 4 virar `false`.

## Exercícios

> Este módulo ainda vai ganhar exercícios próprios numa próxima revisão do material. Por ora, pratique no `TesteIgualdade.java`: crie uma classe `Livro` sua, com `equals`/`hashCode`, e repita o experimento do `contains()`.

## Auto-avaliação

- [ ] Sei explicar a diferença entre `==` e `equals`, com um exemplo meu
- [ ] Sobrescrevi `equals` e `hashCode` juntos, usando os mesmos campos
- [ ] Sei explicar por que `contains` "não encontra" um objeto que tecnicamente já está na lista, se `equals` não foi sobrescrito

## Erros comuns

| Erro | O que está acontecendo |
| --- | --- |
| Comparar objetos com `==` | Compara referências, não conteúdo — use `equals` (sobrescrito) |
| `contains` "não encontra" um objeto com os mesmos dados | A classe não sobrescreveu `equals` — a lista compara referências |
| Sobrescrever `equals` e esquecer `hashCode` | Contrato quebrado: o objeto se perde em `HashSet`/`HashMap` |
| Comparar `o.getClass() != this.getClass()` esquecido | Sem essa checagem, `equals` pode aceitar comparar com um tipo totalmente diferente |

---

Anterior: [Módulo 08](../modulo-08-scanner-e-menus/) | Próximo: [Módulo 10 — Herança](../modulo-10-heranca/)
