# Exercício 01 — Sistema de funcionários (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 1 | 2h | classe abstrata, sobrecarga, sobrescrita, polimorfismo |

## Objetivo

O exercício mais completo até aqui: uma hierarquia com classe abstrata, métodos sobrecarregados E sobrescritos, fechando com uma folha de pagamento 100% polimórfica.

## Requisitos

### Classe abstrata Funcionario (pacote `model`)

Atributos protegidos:

- `nome` (String)
- `salarioBase` (double)
- `departamento` (String)
- `ativo` (boolean), valor inicial `true`

Construtor:

- Receba `nome`, `salarioBase` e `departamento`.

Métodos abstratos:

- `calcularSalario()`: retorna `double` com o salário final
- `calcularBonus()`: retorna `double` com o bônus

Métodos concretos:

- `promover(String novoDepartamento)`: altera o departamento e imprime mensagem
- `promover()`: SOBRECARGA, promove sem mudar de departamento
- `exibirInfo()`: mostra as informações básicas (pode ser sobrescrito)
- `demitir()`: altera `ativo` para `false` e imprime mensagem
- Getters: `getNome()`, `getSalarioBase()`, `getDepartamento()`, `isAtivo()`

### Classe Vendedor (pacote `model`, herda de Funcionario)

Atributos privados:

- `vendas` (double), total de vendas do mês, inicia em 0.0
- `comissao` (double), percentual (ex.: 0.05 = 5%)

Construtor: recebe `nome`, `salarioBase`, `departamento` e `comissao`.

Sobrescritas (com `@Override`):

- `calcularSalario()`: `salarioBase + (vendas * comissao)`
- `calcularBonus()`: 10% do total de vendas se `vendas > 10000`, senão 0
- `exibirInfo()`: chama a versão da mãe e acrescenta vendas e comissão

Sobrecargas:

- `registrarVenda(double valor)`
- `registrarVenda(double valor, String cliente)`: registra e imprime o cliente
- `registrarVenda(double[] valores)`: registra várias de uma vez

Getters: `getVendas()`, `getComissao()`.

### Classe Gerente (pacote `model`, herda de Funcionario)

Atributos privados:

- `equipe` (int), tamanho da equipe
- `metaMensal` (double), padrão 50000.0

Construtor: recebe `nome`, `salarioBase`, `departamento` e `equipe`.

Sobrescritas:

- `calcularSalario()`: `salarioBase * 1.5`
- `calcularBonus()`: `salarioBase * 0.2` se `equipe >= 5`, senão `salarioBase * 0.1`
- `exibirInfo()`: chama a versão da mãe e acrescenta equipe e meta

Sobrecargas:

- `definirMeta(double novaMeta)`
- `definirMeta(double novaMeta, int meses)`
- `definirMeta()`: meta automática baseada no tamanho da equipe

Getters: `getEquipe()`, `getMetaMensal()`.

### Classe TesteFuncionarios (pacote `app`)

Parte A (sobrecarga):

1. Teste os dois `promover()` de um funcionário.
2. Teste os três `registrarVenda()` do Vendedor.
3. Teste os três `definirMeta()` do Gerente.

Parte B (sobrescrita e polimorfismo):

1. Crie um array (ou lista) de `Funcionario` contendo Vendedores e Gerentes.
2. Em UM único laço, chame `calcularSalario()` e `calcularBonus()` de cada um.
3. Calcule a folha de pagamento total da empresa.
4. Num comentário, explique como o Java escolheu o método certo em cada volta do laço.

## Estrutura de pastas

```text
model/
  Funcionario.java   (abstrata)
  Vendedor.java
  Gerente.java
app/
  TesteFuncionarios.java
```

## Critérios de aceitação

- [ ] `new Funcionario(...)` não compila (e você entende por quê)
- [ ] As três sobrecargas de `registrarVenda` funcionam, inclusive a com array
- [ ] O laço da Parte B usa SÓ o tipo `Funcionario`, nenhum `instanceof`, nenhum cast
- [ ] A folha total soma salários + bônus corretamente
- [ ] Comentário da Parte B item 4 responde com as palavras "tipo do objeto real"... ou equivalente

## Armadilha conhecida

Se o seu laço precisar de `instanceof` para funcionar, algo está errado no desenho: os métodos abstratos existem exatamente para o laço NÃO precisar saber o tipo concreto.
