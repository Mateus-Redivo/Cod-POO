# Gabaritos

Resoluções comentadas de alguns exercícios dos módulos.

## Antes de abrir, um combinado

O gabarito existe para você **comparar** com a sua solução, não para substituí-la. A ordem certa é:

1. Tentar de verdade (travar faz parte — é onde o aprendizado acontece).
2. Terminar (ou esgotar suas ideias de verdade).
3. Só então comparar com o gabarito e anotar o que faria diferente.

Quem inverte essa ordem chega ao projeto integrador sem saber começar um exercício em branco — e o projeto integrador não tem gabarito.

## Importante: raramente existe UMA resposta certa

Sua solução pode ser diferente do gabarito e ainda assim estar correta (às vezes melhor). O que importa é atender aos critérios de aceitação do enunciado. Na dúvida, traga as duas versões para discutir em aula.

## Índice

| Gabarito | Exercício correspondente |
| --- | --- |
| [modulo-02-produto/](modulo-02-produto/) | [Módulo 02, Exercício 01 — Produto](../modulo-02-classes-e-objetos/exercicios/EXERCICIO-01-produto.md) |
| [modulo-02-biblioteca/](modulo-02-biblioteca/) | [Módulo 02, Exercício 02 — Biblioteca](../modulo-02-classes-e-objetos/exercicios/EXERCICIO-02-biblioteca.md) |
| [modulo-03-conta-de-jogador/](modulo-03-conta-de-jogador/) | [Módulo 03, Exercício 01 — Conta de jogador](../modulo-03-encapsulamento-e-validacao/exercicios/EXERCICIO-01-conta-de-jogador.md) |
| [modulo-04-agenda-de-contatos/](modulo-04-agenda-de-contatos/) | [Módulo 04, Exercício 01 — Agenda de contatos](../modulo-04-colecoes-e-menus/exercicios/EXERCICIO-01-agenda-de-contatos.md) |
| [modulo-05-moto/](modulo-05-moto/) | [Módulo 05, Exercício 01 — Moto](../modulo-05-heranca/exercicios/EXERCICIO-01-moto.md) |
| [modulo-05-rpg/](modulo-05-rpg/) | [Módulo 05, Exercício 02 — RPG](../modulo-05-heranca/exercicios/EXERCICIO-02-rpg.md) |
| [modulo-06-funcionarios/](modulo-06-funcionarios/) | [Módulo 06, Exercício 01 — Funcionários](../modulo-06-abstracao-e-polimorfismo/exercicios/EXERCICIO-01-funcionarios.md) |
| [modulo-07-dispositivos/](modulo-07-dispositivos/) | [Módulo 07, Exercício 01 — Dispositivos inteligentes](../modulo-07-interfaces/exercicios/EXERCICIO-01-dispositivos.md) |
| [modulo-08-caixa-eletronico/](modulo-08-caixa-eletronico/) | [Módulo 08, Exercício 01 — Caixa eletrônico](../modulo-08-excecoes/exercicios/EXERCICIO-01-caixa-eletronico.md) |
| [modulo-09-farmacia/](modulo-09-farmacia/) | [Módulo 09, Exercício 01 — Refatorar a farmácia](../modulo-09-refatoracao/exercicios/EXERCICIO-01-refatorar-farmacia.md) |
| [modulo-10-ex01-polimorfismo/](modulo-10-ex01-polimorfismo/) | [Módulo 10, Exercício 01 — Polimorfismo no banco](../modulo-10-estudo-de-caso-banco/exercicios/EXERCICIO-01-polimorfismo-no-banco.md) |
| [modulo-10-ex02-excecoes/](modulo-10-ex02-excecoes/) | [Módulo 10, Exercício 02 — Exceções no banco](../modulo-10-estudo-de-caso-banco/exercicios/EXERCICIO-02-excecoes-no-banco.md) |

Todos os exercícios dos módulos têm gabarito. A única exceção é o projeto integrador (módulo 11) — ali é a sua vez de criar do zero, sem resposta pronta.

## Como executar um gabarito

Mesmo padrão de todos os módulos:

```bash
cd gabaritos/modulo-05-rpg
javac -d bin model/*.java app/*.java
java -cp bin app.TestePersonagens
```

Quando o gabarito tiver as pastas `util/` ou `exception/`, inclua-as na compilação (ex.: `javac -d bin exception/*.java model/*.java util/*.java app/*.java`).
