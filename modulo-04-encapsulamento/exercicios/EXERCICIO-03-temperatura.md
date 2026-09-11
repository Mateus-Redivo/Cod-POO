# Exercício 03 — Temperatura (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 40 min | getter que calcula em vez de só devolver, encapsulamento de representação |

## Objetivo

Até agora todo getter que você escreveu devolvia exatamente o valor guardado no atributo. Neste exercício, alguns getters vão CALCULAR o valor que devolvem, a partir de um único atributo guardado. É uma ideia pequena com efeito grande: quem usa a classe nem percebe a diferença.

## Requisitos

### Classe Temperatura (pacote `model`)

Atributo (só um, guardado; tudo mais é calculado):

- `celsius` (double)

Construtor:

- Receba a temperatura em `celsius`.

Métodos:

- `getCelsius()`: devolve `celsius` diretamente (um getter comum).
- `getFahrenheit()`: **calcula e devolve** a conversão, `celsius * 9 / 5 + 32`. Não existe atributo `fahrenheit` guardado em lugar nenhum.
- `getKelvin()`: **calcula e devolve** `celsius + 273.15`. Também não existe atributo `kelvin` guardado.
- `setCelsius(double novoCelsius)`: troca o valor de `celsius` (ainda sem validação, isso é assunto do próximo módulo).
- `toString()`: sobrescrito, mostrando o valor nas três escalas (use os próprios getters dentro do `toString`, não recalcule a fórmula de novo).

### Classe TesteTemperatura (pacote `app`)

1. Crie uma `Temperatura` com `25.0` graus Celsius.
2. Imprima o objeto (via `toString`) e chame os três getters separadamente, mostrando os três valores.
3. Use `setCelsius` para mudar a temperatura para `0.0`.
4. Imprima de novo e confirme que `getFahrenheit()` e `getKelvin()` mudaram junto, mesmo sem você ter "setado" Fahrenheit ou Kelvin em lugar nenhum.

## Exemplo de saída

```text
Temperatura [celsius=25.0, fahrenheit=77.0, kelvin=298.15]
Celsius: 25.0
Fahrenheit: 77.0
Kelvin: 298.15

Apos setCelsius(0.0):
Temperatura [celsius=0.0, fahrenheit=32.0, kelvin=273.15]
```

## Critérios de aceitação

- [ ] A classe tem só UM atributo (`celsius`); não existem atributos `fahrenheit` nem `kelvin`
- [ ] `getFahrenheit()` e `getKelvin()` calculam o valor toda vez que são chamados, a partir de `celsius`
- [ ] Depois de `setCelsius(0.0)`, os três getters refletem o novo valor sem nenhuma outra chamada
- [ ] `toString()` reaproveita os getters em vez de repetir as fórmulas

## Por que isso importa

Se `fahrenheit` fosse um atributo guardado separadamente, `setCelsius` precisaria lembrar de atualizá-lo também, e esquecer isso criaria um objeto com Celsius e Fahrenheit "fora de sincronia" (um bug bem sutil). Guardando só o dado essencial e calculando o resto sob demanda, essa categoria inteira de bug deixa de existir: não tem como Fahrenheit ficar desatualizado, porque ele nunca fica "atualizado" nem "desatualizado", é sempre recalculado na hora.

---

Gabarito: [gabaritos/modulo-04/ex03-temperatura/](../../gabaritos/modulo-04/ex03-temperatura/), depois de tentar, não antes.
