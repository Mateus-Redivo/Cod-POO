# Exercício 02 — Estacionamento (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 45 min | duas classes interagindo, um objeto guardando outro como atributo |

## Objetivo

Praticar duas classes trabalhando juntas: uma delas guarda referências de objetos da outra e chama métodos neles. Ainda sem getters, sem setters, sem `toString()`.

## Requisitos

### Classe Vaga (pacote `model`)

Atributos:

- `numero` (int)
- `ocupada` (boolean), inicia `false`
- `placaOcupante` (String), inicia vazia (`""`)

Construtor:

- Receba só o `numero`.

Métodos:

- `ocupar(String placa)`: se a vaga já estiver ocupada, avisa e não faz nada; senão, marca `ocupada` como `true` e guarda a `placa`, imprimindo confirmação.
- `liberar()`: se a vaga já estiver livre, avisa e não faz nada; senão, marca `ocupada` como `false`, limpa `placaOcupante` e imprime confirmação.
- `exibirEstado()`: imprime o número da vaga, se está ocupada e, se estiver, a placa de quem ocupa.

### Classe Estacionamento (pacote `model`)

Atributos:

- `nome` (String)
- três atributos do tipo `Vaga`: `vaga1`, `vaga2`, `vaga3`

Construtor:

- Receba o `nome` do estacionamento e crie as três vagas dentro do próprio construtor, numeradas 1, 2 e 3 (`this.vaga1 = new Vaga(1);` e assim por diante).

Métodos:

- `estacionarEm(int numeroDaVaga, String placa)`: descobre qual das três vagas tem esse número e chama `ocupar(placa)` nela; se o número não corresponder a nenhuma vaga, avisa.
- `liberarVaga(int numeroDaVaga)`: mesma lógica, chamando `liberar()`.
- `exibirTodasAsVagas()`: chama `exibirEstado()` das três vagas, em ordem.

### Classe TesteEstacionamento (pacote `app`)

1. Crie um `Estacionamento`.
2. Exiba todas as vagas (devem estar todas livres).
3. Estacione um carro na vaga 2.
4. Tente estacionar outro carro na vaga 2 de novo (deve avisar que já está ocupada).
5. Libere a vaga 2 e exiba todas as vagas de novo.

## Estrutura de pastas

```text
model/
  Vaga.java
  Estacionamento.java
app/
  TesteEstacionamento.java
```

## Exemplo de saída (trecho)

```text
--- Estado inicial ---
Vaga 1: livre
Vaga 2: livre
Vaga 3: livre

Vaga 2 ocupada pela placa ABC1234.
Vaga 2 ja esta ocupada.

Vaga 2 liberada.
--- Estado final ---
Vaga 1: livre
Vaga 2: livre
Vaga 3: livre
```

## Critérios de aceitação

- [ ] `Estacionamento` cria suas três `Vaga` dentro do próprio construtor, sem o `TesteEstacionamento` precisar criar nenhuma `Vaga` diretamente
- [ ] `estacionarEm` numa vaga já ocupada não sobrescreve a placa, só avisa
- [ ] `liberarVaga` numa vaga já livre não quebra, só avisa
- [ ] Nenhum getter, setter ou `toString()` foi usado

## Dica

`Estacionamento` "tem" três `Vaga`: isso é um objeto guardando outros objetos como atributos, o mesmo tipo de relação que você vai ver com listas mais pra frente, só que aqui são três variáveis nomeadas em vez de uma coleção.

---

Gabarito: [gabaritos/modulo-02/ex02-estacionamento/](../../gabaritos/modulo-02/ex02-estacionamento/), depois de tentar, não antes.
