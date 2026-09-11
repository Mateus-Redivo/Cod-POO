# Exercício 01 — Mapeando o sistema (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 40 min | leitura de código, rastreio, identificação de decisões de projeto |

## Objetivo

Entender o sistema bancário do módulo sem alterar uma linha. Você vai usá-lo, mapeá-lo e rastrear uma operação de ponta a ponta — antes de tentar mexer nele nos próximos dois exercícios.

## Parte 1 — Use antes de ler

Rode [exemplo/app/Main.java](../exemplo/app/Main.java) e faça, nesta ordem:

1. Crie uma `ContaCorrente` e uma `ContaPoupanca`.
2. Deposite em cada uma.
3. Saque um valor válido de cada uma.
4. Tente sacar mais do que o saldo de uma delas.
5. Rode o fechamento mensal (`processarMensal`) e veja o efeito em cada tipo de conta.

Anote **o que aconteceu** em cada passo, principalmente no passo 4.

## Parte 2 — O mapa

Só agora releia o código com calma. Preencha:

| Classe | Responsabilidade principal | Depende de quem? |
| --- | --- | --- |
| Conta | | |
| ContaCorrente | | |
| ContaPoupanca | | |
| Banco | | |

E responda:

**a)** Onde exatamente `saldo` é protegido? Mostre a linha.

**b)** `ContaCorrente` e `ContaPoupanca` repetem algum código entre si? Se sim, qual, e por que ele não precisou ser repetido (o que a herança já resolveu)?

## Parte 3 — Rastreie o processarMensal

1. Abra `Banco.processarMensal`. Que estrutura de decisão ele usa para saber o que fazer com cada conta?
2. Para uma `ContaCorrente`, qual método é chamado? E para uma `ContaPoupanca`?
3. Se alguém criar uma `ContaSalario` nova (mais uma filha de `Conta`) e esquecer de atualizar `processarMensal`, o que acontece quando o fechamento mensal rodar para essa conta? O programa quebra, ou faz silenciosamente a coisa errada?

## Parte 4 — O saque silencioso

No passo 4 da Parte 1, você tentou sacar mais do que o saldo.

**a)** Em qual linha exata do `sacar()` isso é decidido?

**b)** O que a tela mostrou? O saldo mudou?

**c)** Um colega que só olhasse a tela (sem saber ler código) perceberia que a operação falhou?

## Critérios de aceitação

- [ ] O sistema foi usado antes de o código ser reaberto com calma
- [ ] A tabela da Parte 2 está completa, com responsabilidade e dependência de cada classe
- [ ] A Parte 3 identifica corretamente a cadeia de `instanceof` e prevê o comportamento com uma conta nova
- [ ] A Parte 4 aponta a linha exata do saque silencioso e descreve o que a tela mostrou

---

Gabarito: não há, e é de propósito. Este exercício produz **o seu** mapa do sistema. Compare suas respostas com as de um colega: onde vocês divergiram, alguém enxergou algo que o outro não viu. As Partes 3 e 4 são exatamente os dois problemas que os exercícios 2 e 3 deste módulo vão resolver.
