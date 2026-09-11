# Exercício 01 — Meios de transporte (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 40 min | classe abstrata, método abstrato, método concreto herdado |

## Objetivo

Criar sua primeira classe abstrata do zero, sem copiar o exemplo de `Forma`.

## Requisitos

### Classe abstrata MeioDeTransporte (pacote `model`)

Atributos protegidos:

- `nome` (String)
- `velocidadeMediaKmH` (double)

Construtor protegido: recebe os dois valores.

Método abstrato:

- `calcularTempoViagem(double distanciaKm)`: retorna `double`, o tempo em horas que a viagem levaria (`distanciaKm / velocidadeMediaKmH`). Cada filha implementa isso à sua maneira (algumas podem ter um ajuste extra, veja abaixo).

Método concreto:

- `exibirInfo()`: imprime nome e velocidade média.

### Classe Carro (pacote `model`, herda de MeioDeTransporte)

- `calcularTempoViagem`: implementação direta da fórmula (`distanciaKm / velocidadeMediaKmH`).

### Classe Bicicleta (pacote `model`, herda de MeioDeTransporte)

- `calcularTempoViagem`: a fórmula direta, mas acrescenta 15% de tempo a mais (parênteses de descanso). Ou seja: `(distanciaKm / velocidadeMediaKmH) * 1.15`.

### Classe TesteTransportes (pacote `app`)

1. Tente escrever `new MeioDeTransporte("Generico", 50)` em algum lugar (só para ver o erro) e depois comente ou apague essa linha.
2. Crie um `Carro` e uma `Bicicleta`.
3. Para uma distância de `60` km, calcule e exiba o tempo de viagem de cada um.
4. Crie um array ou lista de `MeioDeTransporte` com os dois, e num único laço, exiba `exibirInfo()` e o tempo de viagem de cada um para uma distância de `100` km.

## Critérios de aceitação

- [ ] `MeioDeTransporte` não compila com `new` direto (você confirmou isso no passo 1)
- [ ] `Bicicleta.calcularTempoViagem` aplica o ajuste de 15%, `Carro` não
- [ ] O laço do passo 4 usa só o tipo `MeioDeTransporte`

---

Gabarito: [gabaritos/modulo-12/ex01-meios-de-transporte/](../../gabaritos/modulo-12/ex01-meios-de-transporte/), depois de tentar, não antes.
