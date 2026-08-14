# Exercício 01 — Termostato (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 1h | classe utilitária `static`, `static final`, invariante de classe, validação que depende de outro atributo |

## Objetivo

Até agora cada regra de validação que você escreveu olhava para **um** atributo de cada vez: idade
tem faixa, nome não pode ser vazio. Aqui a coisa muda de patamar: a regra depende de **dois
atributos ao mesmo tempo**. A temperatura mínima só é válida em relação à máxima, e a
máxima só é válida em relação à mínima. E, como vimos no exemplo guiado deste módulo, essas regras
vão morar numa classe `Validacoes` separada, com métodos `static`.

Essa relação que precisa valer sempre tem nome: **invariante da classe**. É a promessa que o
objeto faz sobre si mesmo e nunca pode quebrar — nem no construtor, nem em nenhum setter, nem
depois de mil chamadas em qualquer ordem.

## Requisitos

### Classe Termostato (pacote `model`)

Constantes (use `static final`, com nome em MAIUSCULAS):

- `MINIMA_ABSOLUTA = -50` e `MAXIMA_ABSOLUTA = 60` — nenhum valor pode sair desta faixa, nunca.

Atributos (todos privados):

- `temperaturaMinima` (int) — piso configurado pelo usuário
- `temperaturaMaxima` (int) — teto configurado pelo usuário
- `temperaturaAtual` (int) — temperatura que o ambiente está marcando agora

Os três invariantes que o objeto deve garantir **o tempo todo**:

1. Toda temperatura fica entre `MINIMA_ABSOLUTA` e `MAXIMA_ABSOLUTA`.
2. `temperaturaMinima` é sempre **menor** que `temperaturaMaxima` (nunca igual).
3. `temperaturaAtual` fica sempre entre `temperaturaMinima` e `temperaturaMaxima`.

Construtor:

- Recebe mínima, máxima e atual, nesta ordem, e valida o trio.
- Se algo for recusado, o objeto ainda assim nasce válido — escolha valores de partida seguros e
  documente sua escolha em um comentário.

Métodos:

- Getters para os três atributos.
- `setTemperaturaMinima(int)` — recusa se invadir a máxima atual ou sair da faixa absoluta.
- `setTemperaturaMaxima(int)` — recusa se invadir a mínima atual ou sair da faixa absoluta.
- `aquecer(int graus)` — só aceita `graus` positivo e recusa se o resultado passar da máxima.
- `resfriar(int graus)` — só aceita `graus` positivo e recusa se o resultado ficar abaixo da mínima.
- `estaConfortavel()` — devolve `true` se a atual estiver entre 18 e 24 graus.
- `toString()` sobrescrito.

### Classe Validacoes (pacote `util`)

- `dentroDaFaixaAbsoluta(int temperatura)` — a regra 1.
- `faixaValida(int minima, int maxima)` — a regra 2. Repare que este método recebe **dois**
  parâmetros: a regra fala sobre o par, não sobre um valor solto.
- `valorNaFaixa(int valor, int minima, int maxima)` — a regra 3.

Todos `static`, todos sem guardar estado.

> **A pergunta que vale o exercício:** `setTemperaturaMinima` recebe só um número. Como ele decide
> se esse número é válido, se a regra depende da máxima? Resposta: ele pergunta a `Validacoes`
> usando o valor novo **junto com** o valor que o objeto já tem — `faixaValida(nova, this.temperaturaMaxima)`.
> Guardar o estado é trabalho do objeto; conhecer a regra é trabalho da classe utilitária.

### Classe TesteTermostato (pacote `app`)

Roteiro de ataque:

1. Crie um termostato válido (ex.: mínima 16, máxima 28, atual 22) e imprima.
2. Tente `setTemperaturaMinima(30)` — invadiria a máxima. Deve recusar.
3. Tente `setTemperaturaMaxima(10)` — invadiria a mínima. Deve recusar.
4. Tente `setTemperaturaMinima(-80)` — fora da faixa absoluta. Deve recusar.
5. Aqueça 3 graus (deve funcionar) e depois aqueça 50 (deve recusar).
6. Resfrie 20 graus de uma vez (deve recusar, ficaria abaixo da mínima).
7. Tente `aquecer(-5)` — aquecer com número negativo é resfriar disfarçado. Deve recusar.
8. Crie um termostato com o trio invertido (`new Termostato(40, 10, 100)`) e imprima: ele deve
   nascer válido mesmo assim.
9. Imprima o objeto do passo 1 no final e confira: os três invariantes continuam de pé.

## Estrutura de pastas

```text
model/
  Termostato.java
util/
  Validacoes.java
app/
  TesteTermostato.java
```

## Exemplo de saída (trecho)

```text
Termostato [minima=16, maxima=28, atual=22, confortavel=true]
Erro: a temperatura minima deve ser menor que a maxima (28).
Erro: a temperatura maxima deve ser maior que a minima (16).
Erro: temperatura fora da faixa permitida (-50 a 60).
Aquecido para 25 graus.
Erro: aquecer 50 graus passaria da maxima (28).
Erro: resfriar 20 graus ficaria abaixo da minima (16).
Erro: informe um numero positivo de graus.
Termostato [minima=16, maxima=28, atual=25, confortavel=false]
```

## Critérios de aceitação

- [ ] Nenhuma sequência de chamadas, em nenhuma ordem, quebra os três invariantes
- [ ] `MINIMA_ABSOLUTA` e `MAXIMA_ABSOLUTA` são `static final` — não existe `-50` solto no código
- [ ] `setTemperaturaMinima` consulta a máxima atual para decidir (e vice-versa)
- [ ] `aquecer(-5)` é recusado, e não tratado como resfriamento
- [ ] O construtor produz um objeto válido mesmo recebendo um trio impossível
- [ ] Cada regra existe em um só lugar: os setters não repetem o `if` da faixa absoluta

## Para pensar (traga para a aula)

O construtor recebeu dados impossíveis e você o obrigou a produzir um objeto válido mesmo assim,
inventando valores de partida. Isso é honesto? Um programa que pede 40 de mínima e recebe 16
calado pode enganar quem o usa. A alternativa seria **recusar a criação do objeto** — mas para isso
precisamos de uma ferramenta que ainda não temos. Ela chega no
[módulo 14 — Exceções](../../modulo-14-excecoes/).
