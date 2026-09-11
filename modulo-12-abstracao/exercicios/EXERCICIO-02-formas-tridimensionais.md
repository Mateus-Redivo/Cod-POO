# Exercício 02 — Formas tridimensionais (aplicação)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 1h | classe abstrata com dois métodos abstratos, polimorfismo, agregação sobre uma lista |

## Objetivo

Praticar uma classe abstrata com MAIS de um método abstrato, e usar uma lista polimórfica para somar um resultado sobre formas diferentes.

## Requisitos

### Classe abstrata FormaTridimensional (pacote `model`)

Atributo protegido:

- `nome` (String)

Construtor protegido: recebe `nome`.

Métodos abstratos:

- `calcularVolume()`: retorna `double`.
- `calcularAreaSuperficie()`: retorna `double`.

Método concreto:

- `exibirInfo()`: imprime nome, volume e área de superfície (chamando os dois métodos abstratos; mesmo sendo abstratos na classe mãe, o método concreto pode chamá-los, porque em tempo de execução sempre existe uma implementação real na filha).

### Classe Cubo (pacote `model`, herda de FormaTridimensional)

- Atributo: `lado` (double).
- `calcularVolume()`: `lado³`.
- `calcularAreaSuperficie()`: `6 * lado²`.

### Classe Esfera (pacote `model`, herda de FormaTridimensional)

- Atributo: `raio` (double).
- `calcularVolume()`: `(4.0/3.0) * Math.PI * raio³`.
- `calcularAreaSuperficie()`: `4 * Math.PI * raio²`.

### Classe Cilindro (pacote `model`, herda de FormaTridimensional)

- Atributos: `raio` (double), `altura` (double).
- `calcularVolume()`: `Math.PI * raio² * altura`.
- `calcularAreaSuperficie()`: `2 * Math.PI * raio * (raio + altura)`.

### Classe TesteFormas3D (pacote `app`)

1. Crie um `Cubo`, uma `Esfera` e um `Cilindro`.
2. Coloque os três numa `List<FormaTridimensional>`.
3. Num único laço, chame `exibirInfo()` de cada um.
4. No mesmo laço (ou em outro), some o volume de todos e exiba o volume total.

## Critérios de aceitação

- [ ] `FormaTridimensional` tem DOIS métodos abstratos, ambos implementados nas três filhas
- [ ] `exibirInfo()` (método concreto da mãe) chama os métodos abstratos sem erro, e cada filha responde com sua própria fórmula
- [ ] O laço usa só o tipo `FormaTridimensional`, sem `instanceof`
- [ ] O volume total soma corretamente os três volumes diferentes

## Dica

Um método CONCRETO numa classe abstrata pode chamar um método ABSTRATO da mesma classe sem problema. Parece estranho ("como ele chama algo que não tem corpo?"), mas funciona porque, quando `exibirInfo()` realmente executa, o objeto já é um `Cubo`, uma `Esfera` ou um `Cilindro` de verdade, com a implementação real disponível.

---

Gabarito: [gabaritos/modulo-12/ex02-formas-tridimensionais/](../../gabaritos/modulo-12/ex02-formas-tridimensionais/), depois de tentar, não antes.
