# Programação Orientada a Objetos com Java

Bem-vindo! Este repositório é a trilha oficial da disciplina de POO. Ele foi organizado como uma **sequência de módulos**: cada módulo é uma aula autocontida, com teoria, exemplo comentado, exercícios e um checklist para você saber se está pronto para avançar.

## Como estudar com este repositório

1. **Siga a ordem dos módulos.** Cada um assume que você concluiu o anterior.
2. Em cada módulo, **leia o README primeiro** (a teoria), depois **execute o código de `exemplo/`** e só então **faça os exercícios** de `exercicios/`.
3. Use o **checklist de auto-avaliação** no fim de cada módulo. Se algum item falhar, revise antes de seguir.
4. Só consulte a pasta [gabaritos/](gabaritos/) **depois de tentar de verdade**. Errar tentando ensina mais do que ler a resposta.
5. Nunca programou ou nunca configurou o Java? Comece pelo [GUIA-DO-ALUNO.md](GUIA-DO-ALUNO.md).

## A trilha de aprendizagem

```mermaid
flowchart TD
    M0["00 - Preparação do ambiente"] --> M1["01 - Por que POO?"]
    M1 --> M2["02 - Classes e objetos"]
    M2 --> M3["03 - Construtores e sobrecarga"]
    M3 --> M4["04 - Encapsulamento"]
    M4 --> M5["05 - Validação e integridade"]
    M5 --> M6["06 - static e classes utilitárias"]
    M6 --> M7["07 - Coleções"]
    M7 --> M8["08 - Scanner e menus"]
    M8 --> M9["09 - Igualdade de objetos"]
    M9 --> M10["10 - Herança"]
    M10 --> M11["11 - Sobrescrita e polimorfismo"]
    M11 --> M12["12 - Abstração"]
    M12 --> M13["13 - Interfaces"]
    M13 --> M14["14 - Exceções"]
    M14 --> M15["15 - Refatoração"]
    M15 --> M16["16 - Estudo de caso: banco"]
    M16 --> M17["17 - Projeto integrador"]
```

| Módulo | Tema | O que você vai aprender |
| --- | --- | --- |
| [00](modulo-00-preparacao/) | Preparação do ambiente | Instalar o JDK, compilar e executar seu primeiro programa |
| [01](modulo-01-por-que-poo/) | Por que POO? | O problema que a orientação a objetos resolve, comparando o mesmo programa em duas versões |
| [02](modulo-02-classes-e-objetos/) | Classes e objetos | Classe, objeto, atributo, método, construtor, `this` |
| [03](modulo-03-construtores-e-sobrecarga/) | Construtores e sobrecarga | Mais de um construtor, a regra da sobrecarga |
| [04](modulo-04-encapsulamento/) | Encapsulamento | `private`, getters e setters, `toString()` |
| [05](modulo-05-validacao-e-integridade/) | Validação e integridade | Setters que recusam valores inválidos, construtor que valida |
| [06](modulo-06-static-e-classes-utilitarias/) | static e classes utilitárias | Métodos `static`, `static final`, `this(...)` encadeado |
| [07](modulo-07-colecoes/) | Coleções | `ArrayList`, for-each |
| [08](modulo-08-scanner-e-menus/) | Scanner e menus | `Scanner`, menus interativos, CRUD em memória |
| [09](modulo-09-igualdade-de-objetos/) | Igualdade de objetos | `==` vs `equals`, contrato `equals`/`hashCode` |
| [10](modulo-10-heranca/) | Herança | `extends`, `super`, `@Override`, reaproveitamento de código |
| [11](modulo-11-sobrescrita-e-polimorfismo/) | Sobrescrita e polimorfismo | Sobrecarga × sobrescrita, ligação dinâmica, polimorfismo |
| [12](modulo-12-abstracao/) | Abstração | Classes e métodos abstratos |
| [13](modulo-13-interfaces/) | Interfaces | Contratos entre classes, `implements`, múltiplas interfaces |
| [14](modulo-14-excecoes/) | Exceções | `try/catch/finally`, `throw`, `throws`, exceções personalizadas |
| [15](modulo-15-refatoracao/) | Refatoração | Extrair métodos e classes, eliminar repetição, melhorar nomes |
| [16](modulo-16-estudo-de-caso-banco/) | Estudo de caso: banco | Um sistema completo que integra tudo que foi visto |
| [17](modulo-17-projeto-integrador/) | Projeto integrador | Você constrói seu próprio sistema, do zero |

## Os 4 pilares da POO e onde eles aparecem

A orientação a objetos se apoia em quatro ideias centrais. Elas são apresentadas aos poucos, sempre com código:

| Pilar | Em uma frase | Módulos |
| --- | --- | --- |
| Encapsulamento | Cada objeto protege seus dados e só expõe o necessário | 04, 05, 06 |
| Herança | Classes podem reaproveitar e especializar outras classes | 10 |
| Polimorfismo | O mesmo comando se comporta diferente conforme o objeto real | 11, 13 |
| Abstração | Modelar só o que importa do problema, escondendo detalhes | 01, 12, 13 |

## Estrutura de cada módulo

```text
modulo-XX-nome/
├── README.md        <- a aula: teoria, exemplo explicado, erros comuns
├── exemplo/         <- código pronto para compilar e estudar
│   ├── model/       <- as classes de domínio (Pessoa, Conta, Aluno...)
│   ├── app/         <- as classes executáveis (com o método main)
│   ├── util/        <- classes auxiliares (validações), quando houver
│   └── exception/   <- exceções personalizadas, quando houver
└── exercicios/      <- enunciados para você resolver
```

Essa separação em pacotes (`model`, `app`, `util`, `exception`) é uma convenção usada em todos os módulos e muito parecida com a que você encontrará em projetos profissionais.

## Material de apoio

- [GUIA-DO-ALUNO.md](GUIA-DO-ALUNO.md) — como instalar tudo e como compilar e executar os projetos.
- [GLOSSARIO.md](GLOSSARIO.md) — todos os termos de POO explicados em linguagem simples.
- [material-apoio/resumo-sintaxe.md](material-apoio/resumo-sintaxe.md) — cola rápida da sintaxe Java usada nos módulos.
- [material-apoio/rubrica-avaliacao.md](material-apoio/rubrica-avaliacao.md) — como os exercícios são avaliados.
- [gabaritos/](gabaritos/) — resoluções comentadas dos exercícios (use com responsabilidade).

## Público-alvo

Estudantes de tecnologia e iniciantes em Java que queiram aprender POO de forma aplicada, além de quem deseja revisar os fundamentos com uma progressão organizada.
