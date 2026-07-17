# Rubrica de avaliação

Critérios usados na correção dos exercícios e do projeto integrador. Use como checklist antes de entregar: se você consegue marcar tudo, provavelmente a nota vem junto.

## Exercícios dos módulos

| Critério | Peso | O que é observado |
| --- | --- | --- |
| Funciona | 30% | Compila sem erros; a saída cumpre o roteiro do enunciado; entradas inválidas não derrubam o programa |
| Atende aos requisitos | 30% | Todos os itens do enunciado e os critérios de aceitação presentes |
| Qualidade do modelo | 25% | Atributos privados; validações onde o enunciado pede; responsabilidade no lugar certo (regra de negócio no `model`, não no `main`); sem duplicação evidente |
| Legibilidade | 15% | Nomes descritivos em português ou inglês (consistente); indentação correta; estrutura de pacotes do curso |

## Projeto integrador

| Critério | Peso | O que é observado |
| --- | --- | --- |
| Requisitos técnicos | 35% | Os 9 requisitos obrigatórios do enunciado, verificados um a um |
| Qualidade do modelo | 30% | Classes coesas e coerentes com o domínio; herança usada onde faz sentido (relação "é um" real); polimorfismo resolvendo problema de verdade; encapsulamento sem furos |
| Robustez | 20% | Validações de entrada; exceções tratadas com mensagens úteis; nenhum caminho derruba o programa |
| Documentação e organização | 15% | README do projeto com diagrama e mapa dos requisitos; pacotes organizados; código limpo (módulo 09 aplicado) |

## O que derruba nota (em qualquer entrega)

- Código que não compila. Entregue a versão anterior que compilava, nunca uma "quase pronta" quebrada.
- Cópia de colega ou gabarito. Solução idêntica = conversa com os envolvidos; o objetivo aqui é aprender, e a cópia só adia o problema para a prova.
- `catch` vazio engolindo erro.
- Atributos públicos sem justificativa.
- Uso de recursos claramente colados de fora do escopo do curso sem saber explicar. Regra simples: **você precisa saber explicar cada linha do que entregar** — explicou, valeu.

## O que impressiona (além do pedido)

- Testar seus próprios limites: e se a lista estiver vazia? E se o usuário digitar letra?
- Constantes com nome no lugar de números mágicos.
- Um `toString()` caprichado em todas as classes de domínio.
- README do projeto que um colega consegue seguir sem sua ajuda.
