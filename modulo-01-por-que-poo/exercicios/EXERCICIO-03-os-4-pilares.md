# Exercício 03 — Os 4 pilares num sistema descrito

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 30 min | os 4 pilares da POO, leitura crítica de um problema |

## Objetivo

Você ainda não escreveu uma classe de verdade (isso começa no módulo 02), mas já pode reconhecer onde cada um dos 4 pilares SE APLICARIA num sistema, só de ler a descrição do problema. É um exercício de leitura, não de código.

## O sistema descrito

Uma pet shop quer um sistema para controlar os animais que ficam hospedados no hotelzinho dela. Características do problema, conforme o dono descreveu:

- Todo animal hospedado tem nome, idade e dono. Ninguém de fora do sistema deveria conseguir colocar a idade de um animal como um número negativo.
- Existem vários tipos de animal (cachorro, gato, pássaro), e cada um tem uma rotina de cuidado diferente (cachorro precisa de passeio, gato precisa de caixa de areia limpa, pássaro precisa da gaiola limpa), mas todos compartilham dados básicos em comum (nome, idade, dono, data de check-in).
- No fim do dia, o funcionário aperta um botão "cuidar de todos os hospedados" e o sistema executa a rotina de cuidado certa para cada animal, sem o funcionário precisar dizer manualmente qual animal é de qual tipo.
- Para o problema da pet shop, não importa a raça exata, a cor da pelagem ou o peso do animal: só nome, idade, dono, tipo e data de check-in.

## O que fazer

Para cada um dos 4 pilares, aponte **uma frase específica** da descrição acima onde ele se aplicaria, e explique em uma ou duas frases por quê.

1. **Abstração**: qual frase mostra uma decisão de "o que entra e o que fica de fora" do modelo?
2. **Encapsulamento**: qual frase mostra a necessidade de proteger um dado contra valores inválidos?
3. **Herança**: qual frase mostra tipos diferentes compartilhando uma base comum?
4. **Polimorfismo**: qual frase mostra o mesmo comando ("cuidar de todos") se comportando diferente dependendo do tipo real do objeto?

## Critérios de aceitação

- [ ] Os 4 pilares foram associados a uma frase (ou trecho) diferente da descrição, sem repetir a mesma frase para dois pilares
- [ ] Cada explicação usa as palavras do problema (nome do animal, tipo, rotina), não só a definição genérica do pilar
- [ ] A explicação do polimorfismo menciona explicitamente que o funcionário "não precisa dizer manualmente qual animal é de qual tipo"

---

Gabarito: [gabaritos/modulo-01/ex03-os-4-pilares/](../../gabaritos/modulo-01/ex03-os-4-pilares/), depois de tentar, não antes.
