# Exercício 03 — Central multimídia (desafio)

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 1h30 | três interfaces, constante de interface, justificar a escolha interface × classe abstrata |

## Objetivo

Combinar três interfaces numa única classe, usar uma constante declarada na interface, e justificar por escrito por que cada uma das suas classes usou interface em vez de classe abstrata.

## Requisitos

### Interface Reproduzivel (pacote `model`)

- `int VOLUME_MAXIMO = 100;` (numa interface, isso já é implicitamente `public static final`, mas escreva os modificadores por extenso mesmo assim, para deixar claro).
- `void tocar();`
- `void pausar();`

### Interface Gravavel (pacote `model`)

- `void gravar(String conteudo);`

### Interface Compartilhavel (pacote `model`)

- `void compartilhar(String destino);`

### Classe CaixaDeSom (pacote `model`, implementa Reproduzivel)

- Atributo: `nome` (String).
- `tocar()`: imprime que está tocando, mencionando `VOLUME_MAXIMO` na mensagem (ex.: `"volume maximo suportado: " + VOLUME_MAXIMO`).
- `pausar()`: imprime que pausou.

### Classe Microfone (pacote `model`, implementa Gravavel)

- Atributo: `nome` (String).
- `gravar(String conteudo)`: imprime o que está gravando.

### Classe Smartphone (pacote `model`, implementa Reproduzivel, Gravavel e Compartilhavel)

- Atributo: `nome` (String).
- Implementa os quatro métodos das três interfaces.

### Classe TesteCentral (pacote `app`)

1. Crie uma `CaixaDeSom`, um `Microfone` e um `Smartphone`.
2. Monte uma `List<Reproduzivel>` com quem pode tocar (`CaixaDeSom` e `Smartphone`) e chame `tocar()` de cada um num laço.
3. Monte uma `List<Gravavel>` com quem pode gravar (`Microfone` e `Smartphone`) e chame `gravar(...)` de cada um.
4. Chame `compartilhar(...)` diretamente no `Smartphone` (só ele tem essa capacidade).

## Critérios de aceitação

- [ ] `Smartphone` implementa as três interfaces e todos os métodos delas
- [ ] `VOLUME_MAXIMO` é usado a partir de `CaixaDeSom` sem `Reproduzivel.VOLUME_MAXIMO` explícito (o nome sozinho já funciona, por herança de interface)
- [ ] As listas dos passos 2 e 3 usam só os tipos de interface, sem `instanceof`
- [ ] Cada uma das três classes tem um comentário explicando por que interface foi a ferramenta certa (em vez de classe abstrata), usando a tabela de decisão do módulo

## Para pensar (traga para a aula)

`Smartphone` "é um" `Reproduzivel` E "é um" `Gravavel` E "é um" `Compartilhavel`, tudo ao mesmo tempo. Se essas três capacidades fossem três CLASSES abstratas em vez de interfaces, `Smartphone` conseguiria herdar das três? Por quê?

---

Gabarito: [gabaritos/modulo-13/ex03-central-multimidia/](../../gabaritos/modulo-13/ex03-central-multimidia/), depois de tentar, não antes.
