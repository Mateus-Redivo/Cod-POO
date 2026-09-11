# Exercício 03 — Lista de presença (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | `equals`/`hashCode` como base de deduplicação, `contains` para impedir repetição |

## Objetivo

Usar `equals` para duas coisas ao mesmo tempo: impedir um check-in duplicado no momento em que acontece, e limpar duplicatas de uma lista que já existe.

## Requisitos

### Classe Aluno (pacote `model`)

Atributos:

- `nome` (String)
- `matricula` (String), identifica o aluno de forma única

Construtor:

- Recebe os dois valores.

Métodos:

- `equals(Object o)`: dois alunos são iguais quando têm a MESMA `matricula` (não compare `nome`: a matrícula já identifica o aluno).
- `hashCode()`: usando o mesmo campo (`matricula`).
- Getters para os dois atributos.

### Classe ListaDePresenca (pacote `model`)

Atributo:

- `presentes` (`List<Aluno>`)

Métodos:

- `registrarPresenca(Aluno aluno)`: se o aluno (pela matrícula) já estiver na lista, avisa e não adiciona de novo. Senão, adiciona e confirma.
- `removerDuplicatas(List<Aluno> listaComPossiveisRepeticoes)`: recebe uma lista que pode ter alunos repetidos (mesma matrícula aparecendo mais de uma vez) e devolve uma **lista nova**, sem repetições, mantendo a primeira ocorrência de cada matrícula.

### Classe TesteListaDePresenca (pacote `app`)

1. Crie uma `ListaDePresenca` vazia.
2. Registre presença de 3 alunos diferentes.
3. Tente registrar de novo um aluno que já está na lista (mesma matrícula, pode ser um objeto `Aluno` novo, não precisa ser o mesmo objeto). Deve avisar e não duplicar.
4. Crie uma lista solta (`List<Aluno>`) com 5 alunos, sendo que duas matrículas se repetem (crie objetos `Aluno` novos para as repetições, não reaproveite a referência). Passe essa lista para `removerDuplicatas` e imprima o resultado, mostrando que a lista nova tem só 3 alunos.

## Exemplo de saída (trecho)

```text
Presenca registrada: Ana (matricula 001)
Presenca registrada: Bruno (matricula 002)
Presenca registrada: Carla (matricula 003)
Aluno com matricula 001 ja registrou presenca.

--- Lista sem duplicatas (5 alunos -> 3 unicos) ---
Ana (matricula 001)
Bruno (matricula 002)
Carla (matricula 003)
```

## Critérios de aceitação

- [ ] `equals`/`hashCode` de `Aluno` usam só `matricula`, não `nome`
- [ ] `registrarPresenca` usa `contains` (ou equivalente) para detectar duplicata, sem comparar `matricula` campo a campo manualmente
- [ ] `removerDuplicatas` devolve uma lista NOVA, sem alterar a lista recebida como parâmetro
- [ ] Na lista final sem duplicatas, cada matrícula aparece exatamente uma vez, mantendo a primeira ocorrência

## Dica

Para `removerDuplicatas`, construa a lista nova vazia e percorra a lista recebida com for-each: para cada aluno, só adicione na lista nova se ela ainda **não** `contains` um aluno igual (mesma matrícula). É a mesma ideia de `registrarPresenca`, aplicada dentro de um laço.

---

Gabarito: [gabaritos/modulo-09/ex03-lista-de-presenca/](../../gabaritos/modulo-09/ex03-lista-de-presenca/), depois de tentar, não antes.
