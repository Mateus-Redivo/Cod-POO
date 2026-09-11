# Exercício 03 — Estacionamento com exceções (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h30 | checked × unchecked na mesma classe, exceção com atributos próprios |

## Objetivo

Combinar uma exceção checked e uma unchecked no mesmo sistema, cada uma no papel certo: checked para uma falha esperada do negócio, unchecked para um erro de uso do programador. Uma das exceções também vai carregar dados próprios, não só uma mensagem.

## Requisitos

### Classe VagaOcupadaException (pacote `exception`)

- Checked (estende `Exception`).
- Atributo: `numeroDaVaga` (int).
- Construtor: recebe `numeroDaVaga`, monta a mensagem (`"Vaga " + numeroDaVaga + " ja esta ocupada."`) e repassa para `super(mensagem)`.
- Método: `getNumeroDaVaga()`.

### Classe TicketInvalidoException (pacote `exception`)

- Unchecked (estende `RuntimeException`).
- Construtor: recebe uma `String mensagem` e repassa para `super(mensagem)`.

### Classe Estacionamento (pacote `model`)

Atributo:

- `vagasOcupadas` (`List<Integer>`, guarda os números das vagas ocupadas no momento)

Métodos:

- `entrar(int numeroDaVaga)`: se a vaga já estiver na lista de ocupadas, lança `VagaOcupadaException`. Senão, adiciona a vaga à lista e imprime confirmação. Declare `throws VagaOcupadaException`.
- `sair(String ticket)`: um "ticket" válido, para este exercício, é uma `String` que começa com `"TK-"` seguida de números (ex.: `"TK-042"`). Se o formato for inválido, lança `TicketInvalidoException` (SEM precisar de `throws` na assinatura, por ser unchecked). Se for válido, extraia o número da vaga do ticket e remova da lista, imprimindo confirmação.

### Classe TesteEstacionamento (pacote `app`)

1. Crie um `Estacionamento`.
2. Entre na vaga `12` (deve funcionar).
3. Tente entrar na vaga `12` de novo, dentro de um `try/catch` para `VagaOcupadaException`. Ao capturar, imprima `"Falha na vaga " + e.getNumeroDaVaga()` usando o getter da exceção.
4. Saia usando `"TK-012"` (deve funcionar, liberando a vaga 12).
5. Tente sair usando um ticket mal formatado, como `"abc"`. Como `TicketInvalidoException` é unchecked, decida: você vai deixar o programa quebrar aqui de propósito, ou vai colocar um `try/catch` mesmo sem ser obrigado? Justifique sua escolha num comentário.

## Critérios de aceitação

- [ ] `VagaOcupadaException` é checked e tem um atributo próprio (`numeroDaVaga`) acessível por getter
- [ ] `TicketInvalidoException` é unchecked; o método `sair` NÃO precisa (nem deve) declarar `throws` para ela
- [ ] O `catch` do passo 3 usa `e.getNumeroDaVaga()`, não um número reescrito manualmente
- [ ] O comentário do passo 5 justifica a decisão de tratar ou não a exceção unchecked

## Para pensar (traga para a aula)

Por que faz sentido `VagaOcupadaException` ser checked (o compilador obriga tratamento) enquanto `TicketInvalidoException` é unchecked? Pense: qual das duas é uma situação que o código chamador TEM como prever e decidir o que fazer, e qual é mais parecida com um erro de programação (formato errado, que "não deveria" acontecer se quem chamou tivesse validado antes)?

---

Gabarito: [gabaritos/modulo-14/ex03-estacionamento-com-excecoes/](../../gabaritos/modulo-14/ex03-estacionamento-com-excecoes/), depois de tentar, não antes.
