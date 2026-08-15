# Gabaritos

Resoluções comentadas de alguns exercícios dos módulos.

## Antes de abrir, um combinado

O gabarito existe para você **comparar** com a sua solução, não para substituí-la. A ordem certa é:

1. Tentar de verdade (travar faz parte, é onde o aprendizado acontece).
2. Terminar (ou esgotar suas ideias de verdade).
3. Só então comparar com o gabarito e anotar o que faria diferente.

Quem inverte essa ordem chega ao projeto integrador sem saber começar um exercício em branco, e o projeto integrador não tem gabarito.

## Importante: raramente existe UMA resposta certa

Sua solução pode ser diferente do gabarito e ainda assim estar correta (às vezes melhor). O que importa é atender aos critérios de aceitação do enunciado. Na dúvida, traga as duas versões para discutir em aula.

## Índice

| Gabarito | Exercício correspondente |
| --- | --- |
| [modulo-02-lampada/](modulo-02-lampada/) | [Módulo 02, Exercício 01 — Lâmpada inteligente](../modulo-02-classes-e-objetos/exercicios/EXERCICIO-01-produto.md) |
| [modulo-03-retangulo/](modulo-03-retangulo/) | [Módulo 03, Exercício 01 — Retângulo sobrecarregado](../modulo-03-construtores-e-sobrecarga/exercicios/EXERCICIO-01-formas-geometricas.md) |
| [modulo-04-produto/](modulo-04-produto/) | [Módulo 04, Exercício 01 — Produto](../modulo-04-encapsulamento/exercicios/EXERCICIO-01-produto.md) |
| [modulo-04-biblioteca/](modulo-04-biblioteca/) | [Módulo 04, Exercício 02 — Biblioteca](../modulo-04-encapsulamento/exercicios/EXERCICIO-02-biblioteca.md) |
| [modulo-05-conta-de-jogador/](modulo-05-conta-de-jogador/) | [Módulo 05, Exercício 01 — Conta de jogador](../modulo-05-validacao-e-integridade/exercicios/EXERCICIO-01-conta-de-jogador.md) |
| [modulo-06-termostato/](modulo-06-termostato/) | [Módulo 06, Exercício 01 — Termostato](../modulo-06-static-e-classes-utilitarias/exercicios/EXERCICIO-01-termostato.md) |
| [modulo-07-playlist/](modulo-07-playlist/) | [Módulo 07, Exercício 01 — Playlist](../modulo-07-colecoes/exercicios/EXERCICIO-01-playlist.md) |
| [modulo-08-agenda-de-contatos/](modulo-08-agenda-de-contatos/) | [Módulo 08, Exercício 01 — Agenda de contatos](../modulo-08-scanner-e-menus/exercicios/EXERCICIO-01-agenda-de-contatos.md) |
| [modulo-09-livraria/](modulo-09-livraria/) | [Módulo 09, Exercício 01 — Livraria](../modulo-09-igualdade-de-objetos/exercicios/EXERCICIO-01-livraria.md) |
| [modulo-10-moto/](modulo-10-moto/) | [Módulo 10, Exercício 01 — Moto](../modulo-10-heranca/exercicios/EXERCICIO-01-moto.md) |
| [modulo-10-rpg/](modulo-10-rpg/) | [Módulo 10, Exercício 02 — RPG](../modulo-10-heranca/exercicios/EXERCICIO-02-rpg.md) |
| [modulo-11-animais/](modulo-11-animais/) | [Módulo 11, Exercício 01 — Animais](../modulo-11-sobrescrita-e-polimorfismo/exercicios/EXERCICIO-01-animais.md) |
| [modulo-12-funcionarios/](modulo-12-funcionarios/) | [Módulo 12, Exercício 01 — Funcionários](../modulo-12-abstracao/exercicios/EXERCICIO-01-funcionarios.md) |
| [modulo-13-dispositivos/](modulo-13-dispositivos/) | [Módulo 13, Exercício 01 — Dispositivos inteligentes](../modulo-13-interfaces/exercicios/EXERCICIO-01-dispositivos.md) |
| [modulo-14-caixa-eletronico/](modulo-14-caixa-eletronico/) | [Módulo 14, Exercício 01 — Caixa eletrônico](../modulo-14-excecoes/exercicios/EXERCICIO-01-caixa-eletronico.md) |
| [modulo-15-farmacia/](modulo-15-farmacia/) | [Módulo 15, Exercício 01 — Refatorar a farmácia](../modulo-15-refatoracao/exercicios/EXERCICIO-01-refatorar-farmacia.md) |
| [modulo-16-ex01-polimorfismo/](modulo-16-ex01-polimorfismo/) | [Módulo 16, Exercício 01 — Polimorfismo no banco](../modulo-16-estudo-de-caso-banco/exercicios/EXERCICIO-01-polimorfismo-no-banco.md) |
| [modulo-16-ex02-excecoes/](modulo-16-ex02-excecoes/) | [Módulo 16, Exercício 02 — Exceções no banco](../modulo-16-estudo-de-caso-banco/exercicios/EXERCICIO-02-excecoes-no-banco.md) |

Todos os exercícios dos módulos têm gabarito. A única exceção intencional é o projeto integrador (módulo 17): ali é a sua vez de criar do zero, sem resposta pronta.

## Como executar um gabarito

Mesmo padrão de todos os módulos:

```bash
cd gabaritos/modulo-10-rpg
javac -d bin model/*.java app/*.java
java -cp bin app.TestePersonagens
```

Quando o gabarito tiver as pastas `util/` ou `exception/`, inclua-as na compilação (ex.: `javac -d bin exception/*.java model/*.java util/*.java app/*.java`).
