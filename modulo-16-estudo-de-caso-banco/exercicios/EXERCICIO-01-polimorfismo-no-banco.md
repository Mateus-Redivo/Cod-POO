# Exercício 01 — Polimorfismo no banco

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h | método abstrato, polimorfismo, eliminação de instanceof |

## Contexto

No roteiro de estudo do módulo você viu que `Banco.processarMensal` usa uma cadeia de `instanceof` para decidir o que fazer com cada conta. Este exercício elimina esse desenho.

## Missão

Trabalhe numa cópia do código de `exemplo/` e faça:

1. Transforme `Conta` em classe **abstrata** com um método abstrato `processarFimDeMes()`.
2. Implemente `processarFimDeMes()` em `ContaCorrente` (desconta a tarifa) e em `ContaPoupanca` (rende os juros) — reaproveitando os métodos que já existem.
3. Reescreva `Banco.processarMensal(Conta conta)` para uma única linha, sem `instanceof`.
4. Adicione um método `processarTodas(List<Conta> contas)` ao `Banco`, que processa a lista inteira num laço polimórfico.
5. Prove a vitória: crie uma `ContaSalario` nova (sem tarifa e sem juros; `processarFimDeMes()` apenas informa que nada há a processar) e mostre que ela funciona no `processarTodas` **sem nenhuma alteração no Banco**.

## Atenção

- `Main` instancia `Conta` diretamente em algum lugar? Se sim, agora não compila mais — decida qual conta concreta faz sentido ali. Esse "quebrou, arruma" é parte do exercício: tornar uma classe abstrata é uma decisão com consequências.

## Critérios de aceitação

- [ ] `Banco` não contém nenhum `instanceof`
- [ ] `ContaSalario` entrou no sistema sem alterar `Banco` nem `Conta`
- [ ] O menu do `Main` continua funcionando por completo
- [ ] Cada implementação de `processarFimDeMes()` reutiliza métodos existentes (nada de mexer em `saldo` na unha)
