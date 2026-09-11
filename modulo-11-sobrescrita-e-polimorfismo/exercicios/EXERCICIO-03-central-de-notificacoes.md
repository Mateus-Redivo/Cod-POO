# Exercício 03 — Central de notificações (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h | polimorfismo, extensão sem modificar código existente |

## Objetivo

Provar, na prática, o ganho prático do polimorfismo citado no módulo: **criar um tipo novo sem mudar uma linha do código que já existia**. A última parte deste exercício pede que você crie uma classe filha nova e comprove isso.

## Requisitos

### Classe Notificacao (pacote `model`)

Atributos protegidos:

- `destinatario` (String)
- `mensagem` (String)

Construtor: recebe os dois.

Métodos:

- `enviar()`: imprime `"Enviando para " + destinatario + ": " + mensagem` (comportamento genérico, será sobrescrito pelas filhas).

### Classe EmailNotificacao (pacote `model`, herda de Notificacao)

- Sobrescreve `enviar()`: chama `super.enviar()` e acrescenta uma linha `"  (via email, com assunto formatado)"`.

### Classe SmsNotificacao (pacote `model`, herda de Notificacao)

- Sobrescreve `enviar()`: chama `super.enviar()` e acrescenta `"  (via SMS, mensagem cortada em 160 caracteres)"`.

### Classe CentralDeNotificacoes (pacote `model`)

Atributo:

- `fila` (`List<Notificacao>`)

Métodos:

- `adicionar(Notificacao notificacao)`: adiciona à fila.
- `enviarTodas()`: percorre a fila e chama `enviar()` de cada uma, num único laço, sem `instanceof`.

### Classe TesteCentral (pacote `app`)

1. Crie uma `CentralDeNotificacoes`.
2. Adicione pelo menos um `EmailNotificacao` e um `SmsNotificacao`.
3. Chame `enviarTodas()` e confirme que cada tipo mostrou sua própria linha extra.

### Parte final: a prova do polimorfismo

4. **Sem alterar nenhuma linha de `CentralDeNotificacoes` ou `TesteCentral` feitas até aqui**, crie uma NOVA classe `PushNotificacao` (pacote `model`, herda de `Notificacao`), sobrescrevendo `enviar()` do seu próprio jeito (invente o texto extra).
5. Adicione uma instância de `PushNotificacao` na fila (isso sim exige uma linha nova no `TesteCentral`, um `adicionar(...)` a mais) e rode de novo. Confirme que `enviarTodas()` já sabe lidar com o tipo novo.

## Critérios de aceitação

- [ ] `enviarTodas()` não tem nenhum `instanceof` nem `cast`
- [ ] `PushNotificacao` foi criada DEPOIS, sem exigir nenhuma mudança em `CentralDeNotificacoes`
- [ ] A única mudança em `TesteCentral` para incluir o tipo novo foi adicionar a instância à fila
- [ ] Os três tipos de notificação produzem saída visivelmente diferente ao rodar

## Para pensar (traga para a aula)

Se `enviarTodas()` tivesse sido escrito com uma escada de `if (notificacao instanceof EmailNotificacao) { ... } else if (...)`, o que você precisaria ter mudado no passo 4? E no passo 5?

---

Gabarito: [gabaritos/modulo-11/ex03-central-de-notificacoes/](../../gabaritos/modulo-11/ex03-central-de-notificacoes/), depois de tentar, não antes.
