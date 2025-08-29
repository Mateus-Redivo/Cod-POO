# Sistema Bancário - Documentação

## Índice
1. [Descrição do Projeto](#descrição-do-projeto)
2. [Estrutura do Projeto](#estrutura-do-projeto)
3. [Funcionalidades](#funcionalidades)
4. [Classes](#classes)
5. [Como Executar](#como-executar)
6. [Regras de Negócio](#regras-de-negócio)
7. [Validações](#validações)

## Descrição do Projeto
Sistema bancário simples desenvolvido em Java que permite gerenciar contas correntes e poupança, realizar operações básicas como depósitos, saques e processar operações mensais.

## Estrutura do Projeto
```
src/main/java/com/SGC/
├── app/
│   └── Main.java
├── modelos/
│   ├── Banco.java
│   ├── Conta.java
│   ├── ContaCorrente.java
│   └── ContaPoupanca.java
└── util/
    └── Validacoes.java
```

## Funcionalidades

### Criar Conta
- Permite criar contas correntes ou poupança
- Gera número sequencial automático
- Valida nome do titular

### Operações Financeiras
- Realizar depósitos
- Realizar saques
- Consultar saldo
- Listar todas as contas

### Processamento Mensal
- Conta Corrente: Desconta tarifa mensal (R$ 12,90)
- Conta Poupança: Aplica rendimento (1% do saldo)

## Classes

### Main
Classe principal que contém o menu e gerencia as operações do sistema.

**Métodos principais:**
- `exibirMenu()`: Apresenta opções do sistema
- `criarConta()`: Cria nova conta
- `realizarDeposito()`: Processa depósitos
- `realizarSaque()`: Processa saques
- `consultarSaldo()`: Mostra saldo da conta
- `processarOperacoesMensais()`: Executa operações mensais

### Conta
Classe base para contas bancárias.

**Atributos:**
- `numero`: Identificador da conta
- `titular`: Nome do titular
- `saldo`: Saldo atual

### ContaCorrente
Especialização de Conta com tarifa mensal.

**Atributos específicos:**
- `tarifaMensal`: R$ 12,90

### ContaPoupanca
Especialização de Conta com rendimento mensal.

**Métodos específicos:**
- `renderJuros()`: Aplica 1% de rendimento

### Banco
Gerencia operações mensais das contas.

**Métodos:**
- `processarMensal()`: Aplica tarifas ou rendimentos

### Validacoes
Utilitário para validação de entradas.

**Métodos:**
- `validarString()`: Valida entradas de texto
- `validarInteiro()`: Valida números inteiros
- `validarDouble()`: Valida números decimais

## Como Executar
1. Compile todos os arquivos Java
2. Execute a classe `Main`
3. Use o menu numérico para navegar
4. Digite 0 para sair

## Regras de Negócio

### Contas
- Número único e sequencial
- Saldo inicial zero
- Nome do titular obrigatório

### Operações Financeiras
- Depósitos: Valores positivos
- Saques: Saldo suficiente necessário
- Consultas: Exibe número, titular e saldo

### Processamento Mensal
- Corrente: Débito automático da tarifa
- Poupança: Crédito automático dos juros

## Validações

### Entradas Numéricas
- Inteiros: Faixa válida definida
- Decimais: Valor mínimo definido
- Tratamento de exceções

### Entradas de Texto
- Não permite valores vazios
- Remove espaços extras

---

**Nota**: Este sistema é um exemplo educacional e pode ser expandido com funcionalidades adicionais como transferências entre contas, histórico de transações, etc.