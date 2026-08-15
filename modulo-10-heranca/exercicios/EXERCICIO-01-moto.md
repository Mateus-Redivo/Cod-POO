# Exercício 01 — Moto (fixação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 1 de 3 | 30 min | extends, super, @Override |

## Objetivo

Criar mais uma filha para a hierarquia de veículos do exemplo: o aquecimento perfeito antes do exercício do RPG.

## Requisitos

Partindo do código do exemplo (copie `Veiculo.java` e `Carro.java` para a sua pasta de solução):

### Classe Moto (pacote `model`)

- Herda de `Veiculo`.
- Atributos adicionais: `cilindradas` (int) e `temBau` (boolean).
- Construtor recebendo tudo e repassando o que é de `Veiculo` via `super(...)`.
- Sobrescreva `fazerBarulho()` imprimindo algo digno de uma moto.
- Sobrescreva `exibirInfo()` chamando `super.exibirInfo()` e acrescentando os dados da moto.
- Método próprio: `empinar()`, só imprime se a velocidade atual for maior que 20 km/h; caso contrário avisa que é preciso ganhar velocidade.

### Classe TesteMoto (pacote `app`)

1. Crie uma moto e exiba as informações completas.
2. Tente `empinar()` parado (deve recusar).
3. Acelere além de 20 km/h e `empinar()` de novo (deve funcionar).
4. Chame `frear()`, método herdado, sem sobrescrever, para provar que veio de graça.

## Estrutura de pastas

```text
model/
  Veiculo.java   (copiado do exemplo)
  Carro.java     (copiado do exemplo)
  Moto.java      (novo)
app/
  TesteMoto.java (novo)
```

## Critérios de aceitação

- [ ] `Moto` não redeclara nenhum atributo que já existe em `Veiculo`
- [ ] Construtor usa `super(...)` na primeira linha
- [ ] As duas sobrescritas têm `@Override`
- [ ] `empinar()` usa o getter/atributo herdado de velocidade para decidir
