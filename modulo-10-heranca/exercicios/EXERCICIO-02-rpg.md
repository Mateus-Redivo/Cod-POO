# Exercício 02 — Personagens de RPG (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h30 | herança, super, @Override, primeiro contato com polimorfismo |

## Objetivo

Construir uma hierarquia de personagens de RPG exercitando todas as ferramentas da herança — e terminar com uma demonstração de polimorfismo que prepara o módulo 06.

## Requisitos

### Classe base Personagem (pacote `model`)

Atributos:

- `nome` (String)
- `classe` (String)
- `nivel` (int)
- `vida` (double) — valor inicial 100.0

Construtor:

- Receba `nome`, `classe` e `nivel` como parâmetros.

Métodos:

- `atacar(double dano)` — reduz a vida do personagem e imprime a vida atual
- `descansar(int horas)` — aumenta a vida em `horas * 5`
- `usarHabilidade()` — imprime "O personagem esta usando uma habilidade!"
- `exibirInfo()` — mostra as informações básicas
- Getters para todos os atributos

### Classe filha Guerreiro (pacote `model`)

Atributos adicionais:

- `arma` (String)
- `armadura` (boolean)

Construtor:

- Receba `nome`, `nivel`, `arma` e status de armadura. A `classe` deve ser definida automaticamente como "Guerreiro".

Métodos sobrescritos:

- `usarHabilidade()` — imprime "Golpe devastador!"
- `atacar(double dano)` — imprime uma mensagem específica ANTES de chamar o método da classe mãe
- `exibirInfo()` — chama a versão da mãe e acrescenta arma e armadura

Métodos específicos:

- `defender()` — reduz a vida em 10 e imprime mensagem
- `berrar()` — imprime "O guerreiro esta berrando de raiva!"

### Classe TestePersonagens (pacote `app`)

1. Crie um personagem genérico e teste os métodos básicos.
2. Crie um guerreiro e teste a herança e as sobrescritas.
3. Teste os métodos específicos do guerreiro.
4. Demonstre polimorfismo: declare `Personagem p = new Guerreiro(...)` e chame `p.usarHabilidade()`. Observe QUAL versão executa e escreva a resposta num comentário do código.

## Estrutura de pastas

```text
model/
  Personagem.java
  Guerreiro.java
app/
  TestePersonagens.java
```

## Exemplo de saída

```text
=== TESTE DE HERANCA - PERSONAGENS RPG ===

1. Criando um personagem generico:
Nome: Merlin
Classe: Mago
Nivel: 10
Vida: 100.0

2. Testando metodos basicos:
Merlin recebeu 20.0 de dano! Vida atual: 80.0
Merlin descansou 4 horas. Vida atual: 100.0
O personagem esta usando uma habilidade!

3. Criando um guerreiro:
Nome: Conan
Classe: Guerreiro
Nivel: 8
Vida: 100.0
Arma: Espada de Ferro
Armadura: true

4. Testando heranca:
Guerreiro Conan esta sendo atacado...
Conan recebeu 15.0 de dano! Vida atual: 85.0
Golpe devastador!

5. Metodos especificos:
Conan esta defendendo!
O guerreiro esta berrando de raiva!

=== FIM DO TESTE ===
```

## Critérios de aceitação

- [ ] `Guerreiro` chama `super(...)` no construtor e define a classe como "Guerreiro" sem receber por parâmetro
- [ ] `atacar` do guerreiro NÃO duplica a lógica de reduzir vida (usa `super.atacar(dano)`)
- [ ] Todas as sobrescritas com `@Override`
- [ ] O item 4 do teste está feito e o comentário explica qual versão rodou e por quê
- [ ] A vida nunca fica negativa (decida onde essa regra deve morar — dica: na mãe, uma vez só)

## Dicas

- Use `super()` no construtor da classe filha.
- Use `super.metodo()` para chamar métodos da classe mãe.
- O gabarito comentado está em [gabaritos/modulo-10-rpg](../../gabaritos/modulo-10-rpg/) — só depois de tentar.
