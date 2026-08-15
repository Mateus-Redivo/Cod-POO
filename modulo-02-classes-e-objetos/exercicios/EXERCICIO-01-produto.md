# Exercício 01 — Lâmpada inteligente (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 30 min | classe, atributos, construtor, métodos que mudam o estado do objeto |

## Objetivo

Criar sua primeira classe completa, sozinho, sem copiar do exemplo. Ainda sem getters, sem setters, sem `toString()`: só atributos, construtor e métodos, exatamente como visto no exemplo guiado.

## Requisitos

### Classe Lampada (pacote `model`)

Atributos:

- `nome` (String), ex.: "Sala", "Quarto"
- `ligada` (boolean), inicia `false`
- `intensidade` (int), de 0 a 100, inicia em 0

Construtor:

- Receba só o `nome`. `ligada` e `intensidade` sempre começam em `false` e `0`.

Métodos (nenhum getter: quem quiser saber o estado da lâmpada chama `exibirEstado()`):

- `ligar()`: muda `ligada` para `true` e `intensidade` para 100; imprime confirmação
- `desligar()`: muda `ligada` para `false` e `intensidade` para 0; imprime confirmação
- `ajustarIntensidade(int valor)`: só funciona se a lâmpada estiver ligada; troca `intensidade` pelo valor recebido; se a lâmpada estiver desligada, avisa que não dá para ajustar
- `exibirEstado()`: imprime nome, se está ligada e a intensidade atual, tudo numa linha

### Classe TesteLampada (pacote `app`)

1. Crie 2 lâmpadas diferentes (ex.: "Sala" e "Quarto").
2. Ligue uma delas e exiba o estado das duas, provando que ligar uma não afeta a outra.
3. Ajuste a intensidade da lâmpada ligada.
4. Tente ajustar a intensidade da lâmpada que ainda está desligada.
5. Desligue as duas e exiba o estado final de ambas.

## Estrutura de pastas

```text
model/
  Lampada.java
app/
  TesteLampada.java
```

## Exemplo de saída

```text
Sala ligada. Intensidade: 100.
--- Estado apos ligar Sala ---
Lampada Sala: ligada, intensidade 100
Lampada Quarto: desligada, intensidade 0

Sala: intensidade ajustada para 40.
Quarto esta desligada, nao da para ajustar intensidade.

Sala desligada.
Quarto ja estava desligada.
--- Estado final ---
Lampada Sala: desligada, intensidade 0
Lampada Quarto: desligada, intensidade 0
```

## Critérios de aceitação

- [ ] Compila sem erros e a saída cobre os 5 passos do teste
- [ ] `ajustarIntensidade` recusa agir quando a lâmpada está desligada
- [ ] As duas lâmpadas nunca compartilham estado (mudar uma não muda a outra)
- [ ] Nenhum getter, setter ou `toString()` foi usado, ainda não é o momento (vem no [módulo 04](../../modulo-04-encapsulamento/))
- [ ] Estrutura de pacotes `model`/`app` respeitada

## Dica

Se travar no `ajustarIntensidade`, pense em português antes do Java: "SE a lampada estiver ligada, troca a intensidade; SENAO, avisa que nao da".
