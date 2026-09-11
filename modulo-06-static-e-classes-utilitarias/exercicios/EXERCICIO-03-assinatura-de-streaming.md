# Exercício 03 — Assinatura de streaming (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | `this(...)` encadeado em mais de dois níveis, `static final`, classe utilitária junto com sobrecarga |

## Objetivo

No exemplo do módulo, um construtor chamava o outro uma vez só (o de 2 parâmetros chamava direto o de 3). Aqui você vai encadear em **três níveis**: o construtor sem parâmetros chama o de um parâmetro, que chama o completo. E a classe utilitária, dessa vez, não só valida: ela também calcula um valor padrão.

## Requisitos

### Classe ValidacoesAssinatura (pacote `util`)

- `static boolean planoValido(String plano)`: `true` só para `"Basico"`, `"Padrao"` ou `"Premium"` (exatamente esses textos).
- `static double precoPadraoDoPlano(String plano)`: devolve `19.90` para `"Basico"`, `29.90` para `"Padrao"`, `44.90` para `"Premium"`, e `29.90` (o preço do Padrão) para qualquer outro texto.
- Construtor privado.

### Classe Assinatura (pacote `model`)

Constante:

- `static final int DIAS_TESTE_PADRAO = 7;`

Atributos:

- `plano` (String)
- `precoMensal` (double)
- `diasTesteGratis` (int)

Construtores (encadeados; preste atenção em quem chama quem):

- `Assinatura(String plano, double precoMensal, int diasTesteGratis)`: o construtor completo. Se `plano` não for válido (use `ValidacoesAssinatura.planoValido`), troque para `"Padrao"` e avise. Atribui os três atributos diretamente (este é o único construtor que não usa `this(...)`, os outros dois chamam ele, direta ou indiretamente).
- `Assinatura(String plano)`: chama `this(plano, ValidacoesAssinatura.precoPadraoDoPlano(plano), DIAS_TESTE_PADRAO)`.
- `Assinatura()`: chama `this("Padrao")` (que por sua vez chama o construtor completo). Ou seja: `Assinatura()` → `Assinatura(String)` → `Assinatura(String, double, int)`, uma cadeia de três.

Métodos:

- `toString()` sobrescrito.

### Classe TesteAssinatura (pacote `app`)

1. Crie `new Assinatura("Premium", 39.90, 14)` (construtor completo, com valores customizados) e exiba.
2. Crie `new Assinatura("Basico")` (deve pegar o preço padrão do Básico e 7 dias de teste) e exiba.
3. Crie `new Assinatura()` (deve virar Padrão, 29.90, 7 dias) e exiba.
4. Crie `new Assinatura("Vip", 99.0, 30)` (plano inválido) e exiba, confirmando que o plano virou `"Padrao"`.
5. Num comentário, desenhe a cadeia de chamadas do passo 3: qual construtor chama qual, em ordem.

## Exemplo de saída

```text
Assinatura [plano=Premium, precoMensal=39.9, diasTesteGratis=14]
Assinatura [plano=Basico, precoMensal=19.9, diasTesteGratis=7]
Assinatura [plano=Padrao, precoMensal=29.9, diasTesteGratis=7]
Erro: plano "Vip" invalido, usando Padrao.
Assinatura [plano=Padrao, precoMensal=99.0, diasTesteGratis=30]
```

## Critérios de aceitação

- [ ] Existe uma cadeia de `this(...)` com 3 níveis: `Assinatura()` → `Assinatura(String)` → construtor completo
- [ ] `DIAS_TESTE_PADRAO` é `static final` e é usado (não existe `7` solto repetido)
- [ ] `ValidacoesAssinatura` não guarda estado e tem construtor privado
- [ ] Plano inválido no construtor completo vira `"Padrao"`, mas o `precoMensal` e `diasTesteGratis` recebidos são respeitados (não são sobrescritos, só o plano muda)

## Dica

`this(...)` só pode ser a PRIMEIRA linha de um construtor. Se você quiser validar `plano` e DEPOIS chamar outro construtor, a validação precisa acontecer dentro do construtor que é o "final" da cadeia (o completo), não no meio.

---

Gabarito: [gabaritos/modulo-06/ex03-assinatura-de-streaming/](../../gabaritos/modulo-06/ex03-assinatura-de-streaming/), depois de tentar, não antes.
