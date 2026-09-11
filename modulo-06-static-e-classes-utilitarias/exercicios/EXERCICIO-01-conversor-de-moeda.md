# Exercício 01 — Conversor de moeda (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 45 min | classe utilitária `static`, `static final`, método static chamado de dentro de outra classe |

## Objetivo

Praticar uma classe utilitária de conversão, usada por uma classe de domínio.

## Requisitos

### Classe Cambio (pacote `util`)

- Constante `static final double TAXA_DOLAR = 5.20;` (cotação fixa, só para o exercício).
- `static double paraReais(double valorEmDolares)`: retorna `valorEmDolares * TAXA_DOLAR`.
- `static double paraDolares(double valorEmReais)`: retorna `valorEmReais / TAXA_DOLAR`.
- Construtor privado (é uma classe utilitária, ninguém deveria instanciá-la).

### Classe ProdutoImportado (pacote `model`)

Atributos:

- `nome` (String)
- `precoEmDolares` (double)

Construtor:

- Recebe os dois valores.

Métodos:

- `exibirPrecoConvertido()`: imprime o nome, o preço em dólares, e o preço convertido para reais (chamando `Cambio.paraReais(...)`).

### Classe TesteConversor (pacote `app`)

1. Crie dois `ProdutoImportado` com preços diferentes em dólares.
2. Chame `exibirPrecoConvertido()` dos dois.
3. Sem criar nenhum objeto `Cambio` (lembre-se: o construtor é privado), converta um valor solto de reais para dólares, chamando `Cambio.paraDolares(...)` diretamente.

## Exemplo de saída

```text
Fone de Ouvido: US$ 45.0 (R$ 234.0)
Teclado Mecanico: US$ 89.9 (R$ 467.48)
100.0 reais equivalem a 19.23076923076923 dolares
```

## Critérios de aceitação

- [ ] `Cambio` não tem nenhum atributo de instância (só a constante `static final`)
- [ ] `TAXA_DOLAR` é usada dentro de `paraReais` e `paraDolares`; não existe `5.20` solto repetido em outro lugar
- [ ] `ProdutoImportado.exibirPrecoConvertido()` chama `Cambio.paraReais(...)` em vez de repetir a conta
- [ ] `Cambio.paraDolares(...)` é chamado sem nenhum `new Cambio()` em lugar nenhum

## Dica

Se o compilador reclamar de "Cambio() has private access", é o construtor privado funcionando como deveria: você não precisa (e não deve) criar um objeto `Cambio` para usar os métodos `static`.

---

Gabarito: [gabaritos/modulo-06/ex01-conversor-de-moeda/](../../gabaritos/modulo-06/ex01-conversor-de-moeda/), depois de tentar, não antes.
