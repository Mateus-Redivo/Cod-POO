# Exercício 01 — Dispositivos inteligentes (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h30 | interface, implements, múltiplas interfaces, polimorfismo por interface |

## Objetivo

Modelar capacidades (conectar, carregar) como interfaces e provar que classes sem parentesco podem ser tratadas em conjunto.

## Requisitos

### Interface Conectavel (pacote `model`)

- `void conectar(String rede)`
- `void desconectar()`
- `boolean isConectado()`

### Interface Carregavel (pacote `model`)

- `void carregar(int minutos)`
- `int getNivelBateria()`: 0 a 100

### Classes concretas (pacote `model`)

Crie três classes SEM herança entre si:

- `Smartphone`: implementa `Conectavel` E `Carregavel`. Atributos: `modelo`, `nivelBateria` (começa em 50), `conectado`, `redeAtual`. Carregar aumenta 1% por minuto, travando em 100.
- `SmartTv`: implementa apenas `Conectavel`. Atributos: `polegadas`, `conectado`, `redeAtual`. (TV fica na tomada: carregar não faz sentido para ela, e o modelo deve refletir isso.)
- `FoneBluetooth`: implementa apenas `Carregavel`. Atributos: `marca`, `nivelBateria` (começa em 20). Carrega 2% por minuto.

Regras:

- `conectar` numa rede vazia deve ser recusado com aviso.
- `carregar` com minutos <= 0 deve ser recusado com aviso.

### Classe TesteDispositivos (pacote `app`)

1. Crie um objeto de cada classe.
2. Monte uma `List<Conectavel>` com quem pode conectar e conecte todos à rede "LabPOO" num único laço.
3. Monte uma `List<Carregavel>` com quem pode carregar e carregue todos por 30 minutos num único laço, imprimindo a bateria de cada um.
4. Observe que o `Smartphone` aparece NAS DUAS listas: escreva num comentário por que isso seria impossível só com herança.

## Estrutura de pastas

```text
model/
  Conectavel.java
  Carregavel.java
  Smartphone.java
  SmartTv.java
  FoneBluetooth.java
app/
  TesteDispositivos.java
```

## Exemplo de saída (trecho)

```text
Smartphone Galaxy conectado a rede LabPOO.
SmartTv 55pol conectada a rede LabPOO.

Carregando por 30 minutos...
Smartphone Galaxy: bateria 80%
FoneBluetooth JBL: bateria 80%
```

## Critérios de aceitação

- [ ] Nenhuma herança entre as três classes concretas
- [ ] Os laços dos itens 2 e 3 usam apenas os tipos das interfaces
- [ ] Bateria nunca passa de 100 nem o programa aceita minutos negativos
- [ ] O comentário do item 4 está escrito e faz sentido

## Desafio extra (opcional)

Adicione um método `default` na interface `Conectavel` chamado `reconectar()`, que desconecta e conecta de novo na mesma rede. Pesquise "default method Java": é um recurso das interfaces modernas que os módulos não cobrem em aula.
