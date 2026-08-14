# Exercício 01 — Conta de jogador (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 1h | validação em setters e construtor |

## Objetivo

Construir uma classe impossível de corromper: não importa o que o código externo tente, o objeto `Jogador` nunca fica com dados inválidos.

## Requisitos

### Classe Jogador (pacote `model`)

Atributos (todos privados):

- `apelido` (String) — regras: não vazio, sem espaços, entre 3 e 16 caracteres
- `nivel` (int) — regras: entre 1 e 100
- `pontuacao` (int) — regras: nunca negativa

Construtor:

- Recebe `apelido` e `nivel`; `pontuacao` começa em 0.
- Deve validar os parâmetros chamando os próprios setters (mesmo padrão do exemplo guiado do módulo).

Métodos:

- Getters para tudo; setters com validação para `apelido` e `nivel` (a regra fica dentro do próprio setter, como no exemplo do módulo)
- `ganharPontos(int pontos)` — só aceita valores positivos
- `perderPontos(int pontos)` — só aceita positivos e não deixa a pontuação ficar negativa (trava em 0)
- `subirNivel()` — incrementa o nível, respeitando o máximo de 100
- `toString()` sobrescrito

### Classe TesteJogador (pacote `app`)

Roteiro de ataque — tente corromper o objeto de todas as formas:

1. Crie um jogador válido e imprima.
2. Tente: apelido vazio, apelido com espaço, apelido de 2 letras.
3. Tente: nível 0, nível 101, ganhar -50 pontos.
4. Faça o jogador perder mais pontos do que tem.
5. Imprima o jogador no final: ele deve estar íntegro, com os últimos valores VÁLIDOS.

## Estrutura de pastas

```text
model/
  Jogador.java
app/
  TesteJogador.java
```

## Exemplo de saída (trecho)

```text
Jogador [apelido=Shadow, nivel=5, pontuacao=0]
Apelido invalido: nao pode ser vazio.
Apelido invalido: nao pode conter espacos.
Nivel invalido: deve estar entre 1 e 100.
Pontos devem ser positivos.
Shadow perdeu 300 pontos (pontuacao travada em 0).
Jogador [apelido=Shadow, nivel=5, pontuacao=0]
```

## Critérios de aceitação

- [ ] NENHUMA sequência de chamadas deixa o objeto com dado inválido (teste de verdade)
- [ ] Cada regra de validação existe em um único lugar do código (dentro do setter correspondente)
- [ ] O construtor também valida, chamando os setters em vez de atribuir direto
