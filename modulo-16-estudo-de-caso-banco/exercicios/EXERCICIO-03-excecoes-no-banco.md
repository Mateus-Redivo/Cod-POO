# Exercício 02 — Exceções no banco

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h30 | exceções personalizadas, throws, refatoração de contrato |

## Contexto

O `sacar` da `Conta` falha em silêncio: valores inválidos são simplesmente ignorados. Depois do módulo 14, você tem a ferramenta certa para consertar isso, e vai sentir na pele o efeito de mudar o "contrato" de um método já usado por outras classes.

## Missão

Continue do resultado do Exercício 01 (ou de uma cópia limpa do exemplo):

1. Crie o pacote `exception` com `SaldoInsuficienteException` (checked, com saldo e valor pedido) e `ValorInvalidoException` (unchecked).
2. Reescreva `Conta.sacar` para lançar as exceções em vez de ignorar, e `Conta.depositar` para lançar `ValorInvalidoException`.
3. Sinta o efeito dominó: `ContaCorrente.descontarTarifaMensal()` chama `sacar`, o compilador vai reclamar. Decida: tratar ali com try/catch (o que significa uma tarifa não descontada?) ou propagar com `throws`? Justifique a escolha num comentário.
4. Atualize o `Main` para tratar as exceções em cada operação do menu, com mensagens amigáveis que usem os dados da exceção.
5. Garanta que o programa nunca encerra por causa de uma operação inválida.

## Critérios de aceitação

- [ ] Saque acima do saldo agora AVISA o usuário, com o valor que falta
- [ ] Depósito de valor negativo é recusado com mensagem clara
- [ ] A decisão do item 3 está implementada E justificada em comentário
- [ ] Menu completo funcionando; nenhum catch vazio no código
- [ ] As exceções moram no pacote `exception`

## Para refletir (leve para a aula)

Este exercício mudou a ASSINATURA de um método público (`sacar` agora declara `throws`) e isso obrigou mudanças em cascata em quem o chamava. Em um sistema grande, com dezenas de chamadores, o custo seria proporcional. Moral: contratos de métodos públicos merecem ser pensados cedo, mudá-los depois é caro. Você acabou de viver o motivo.
