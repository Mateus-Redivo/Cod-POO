# Exercício 01 — Playlist (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 45 min | ArrayList, for-each, acesso por índice |

## Objetivo

Guardar vários objetos numa lista e percorrê-la para calcular informações agregadas, sem Scanner e sem menu (isso vem no próximo módulo).

## Requisitos

### Classe Musica (pacote `model`)

Atributos:

- `titulo` (String)
- `artista` (String)
- `duracaoSegundos` (int)

Construtor: recebe os três valores.

Métodos:

- `exibirDados()` imprime título, artista e duração no formato `mm:ss`.

### Classe TestePlaylist (pacote `app`)

1. Crie uma `List<Musica>` e adicione pelo menos 5 músicas.
2. Percorra a lista com for-each imprimindo cada uma com `exibirDados()`.
3. Some a duração total da playlist e mostre o resultado também em `mm:ss`.
4. Mostre a primeira e a última música da lista (usando índice, não for-each).
5. Remova a música do meio da lista (por índice) e imprima a lista de novo, agora com uma a menos.

## Estrutura de pastas

```text
model/
  Musica.java
app/
  TestePlaylist.java
```

## Exemplo de saída (trecho)

```text
--- Playlist ---
Musica 1 (Coldplay) - 03:45
Musica 2 (Adele) - 04:10
Musica 3 (Queen) - 05:55
Musica 4 (Beatles) - 02:30
Musica 5 (Rihanna) - 03:20

Duracao total: 19:40
Primeira: Musica 1 (Coldplay)
Ultima: Musica 5 (Rihanna)

--- Apos remover a musica do meio ---
Musica 1 (Coldplay) - 03:45
Musica 2 (Adele) - 04:10
Musica 4 (Beatles) - 02:30
Musica 5 (Rihanna) - 03:20
```

## Critérios de aceitação

- [ ] A lista aceita só `Musica` (o tipo genérico está correto)
- [ ] A duração total soma corretamente os segundos de todas as músicas e converte para `mm:ss`
- [ ] Primeira e última música são acessadas por índice (`get(0)` e `get(size() - 1)`)
- [ ] A remoção usa o índice certo, e a lista final tem uma música a menos

## Dica

Para converter segundos totais em `mm:ss`: minutos é `total / 60` e segundos é `total % 60`.
