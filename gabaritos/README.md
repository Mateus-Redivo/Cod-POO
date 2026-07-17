# Gabaritos

Resoluções comentadas de alguns exercícios do curso.

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
| [modulo-02-biblioteca/](modulo-02-biblioteca/) | [Módulo 02, Exercício 02 — Biblioteca](../modulo-02-classes-e-objetos/exercicios/EXERCICIO-02-biblioteca.md) |
| [modulo-05-rpg/](modulo-05-rpg/) | [Módulo 05, Exercício 02 — RPG](../modulo-05-heranca/exercicios/EXERCICIO-02-rpg.md) |
| [modulo-06-funcionarios/](modulo-06-funcionarios/) | [Módulo 06, Exercício 01 — Funcionários](../modulo-06-abstracao-e-polimorfismo/exercicios/EXERCICIO-01-funcionarios.md) |

Os demais exercícios são corrigidos em aula ou na entrega, conforme combinado com o professor.

## Como executar um gabarito

Mesmo padrão de todos os módulos:

```bash
cd gabaritos/modulo-05-rpg
javac -d bin model/*.java app/*.java
java -cp bin app.TestePersonagens
```
