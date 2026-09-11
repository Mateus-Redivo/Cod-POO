# Exercício 01 — Instrumentos musicais (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 40 min | sobrescrita (revisão), sobrecarga (revisão), distinguir os dois na prática |

## Objetivo

Aplicar, numa hierarquia pequena, a tabela "sobrecarga × sobrescrita" do módulo. Cada `new` e cada chamada de método no teste deve ser identificada por você como um caso de um ou de outro.

## Requisitos

### Classe Instrumento (pacote `model`)

Atributo protegido:

- `nome` (String)

Construtor: recebe `nome`.

Métodos:

- `tocar()`: imprime `"[nome] esta tocando."` Será sobrescrito pelas filhas.
- `afinar()`: SOBRECARGA, imprime `"[nome] afinado no padrao."`
- `afinar(int nivel)`: SOBRECARGA do método acima, imprime `"[nome] afinado no nivel " + nivel + "."`

### Classe Violao (pacote `model`, herda de Instrumento)

- Sobrescreve `tocar()` para imprimir `"[nome] esta sendo dedilhado."`

### Classe Bateria (pacote `model`, herda de Instrumento)

- Sobrescreve `tocar()` para imprimir `"[nome] esta sendo batucada."`

### Classe TesteInstrumentos (pacote `app`)

1. Crie um `Violao` e uma `Bateria`.
2. Chame `afinar()` e `afinar(5)` no `Violao`. Num comentário ao lado de cada chamada, escreva: "sobrecarga, resolvida em compilação".
3. Chame `tocar()` nos dois. Num comentário, escreva: "sobrescrita, resolvida em execução".
4. Crie uma `List<Instrumento>` com o violão e a bateria, e percorra chamando `tocar()` de cada um num só laço.

## Critérios de aceitação

- [ ] `afinar()` e `afinar(5)` chamam métodos diferentes na MESMA classe (`Instrumento`), sem herança envolvida
- [ ] `tocar()` produz uma saída diferente para `Violao` e `Bateria`, mesmo chamado a partir de uma variável do tipo `Instrumento`
- [ ] Os comentários pedidos nos passos 2 e 3 estão presentes e corretos
- [ ] O laço do passo 4 usa só o tipo `Instrumento`, sem `instanceof`

---

Gabarito: [gabaritos/modulo-11/ex01-instrumentos/](../../gabaritos/modulo-11/ex01-instrumentos/), depois de tentar, não antes.
