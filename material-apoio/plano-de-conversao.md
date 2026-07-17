# Plano de Conversão — Repositório de Ensino de POO

> Objetivo: transformar este repositório de uma coleção de projetos de exemplo em uma **trilha de aprendizagem sequencial**, onde o aluno sabe exatamente por onde começar, o que estudar em cada etapa e quais exercícios fazer antes de avançar.

---

## 1. Diagnóstico do estado atual

**O que já existe e é bom:**

| Conteúdo atual | Conceitos que cobre |
| --- | --- |
| `IntroducaoPOO` | Classes, objetos, construtores, getters/setters, validação |
| `SistemaAcademia` | Modelagem, `ArrayList`, menu interativo, validações |
| `SistemaAcademico` | Herança, classe abstrata, polimorfismo |
| `SistemaBancario` | Herança, sobrescrita, tipos de conta |
| `SistemaEstoque` | Composição, gerenciamento de coleções |
| `Lista/objetos` (Biblioteca) | Exercício: classes e objetos |
| `Lista/heranca` (Veículo/Carro + RPG) | Exercício: herança, `super`, `@Override` |
| `Lista/sobre` (Formas) | Exercício: sobrescrita, classes abstratas |
| `Lista/res/funcsis` (Funcionários) | Exercício: sobrecarga × sobrescrita, polimorfismo |
| `Lista/res/livro` e `Lista/res/rpg` | Resoluções de exercícios |

**O que falta para ser um repositório de ensino:**

- Não há **ordem definida** — o aluno não sabe se começa pela `Lista` ou pelos sistemas.
- Teoria e prática estão desconectadas — os exemplos não têm explicação do conceito antes do código.
- Exercícios e resoluções estão misturados na mesma pasta (`Lista/res` entrega o gabarito junto).
- Não há material de apoio (setup de ambiente, como compilar, glossário).
- Não há critério de "estou pronto para a próxima aula" (auto-avaliação).

---

## 2. Nova estrutura proposta

Reorganizar tudo em **módulos numerados**, cada um sendo uma aula autocontida:

```text
Cod-POO/
├── README.md                        ← Trilha de aprendizagem (mapa geral + como usar)
├── GUIA-DO-ALUNO.md                 ← Setup: JDK, VS Code, como compilar e executar
├── GLOSSARIO.md                     ← Termos de POO em linguagem simples
│
├── modulo-00-preparacao/
│   └── README.md                    ← Instalar JDK, primeira compilação, "Hello World"
│
├── modulo-01-classes-e-objetos/
│   ├── README.md                    ← Teoria + objetivos + roteiro da aula
│   ├── exemplo/                     ← Código demonstrado em aula (ex-IntroducaoPOO)
│   ├── exercicios/
│   │   ├── EXERCICIO-01-biblioteca.md   (ex-Lista/objetos/Enunciado.txt)
│   │   └── EXERCICIO-02-....md
│   └── DESAFIO.md                   ← Exercício extra para quem terminar antes
│
├── modulo-02-encapsulamento-e-validacao/
│   ├── README.md
│   ├── exemplo/                     ← (parte do ex-IntroducaoPOO: Validacoes)
│   └── exercicios/
│
├── modulo-03-colecoes-e-menus/
│   ├── README.md
│   ├── exemplo/                     ← ex-SistemaAcademia
│   └── exercicios/
│
├── modulo-04-heranca/
│   ├── README.md
│   ├── exemplo/                     ← ex-Lista/heranca (Veiculo/Carro)
│   └── exercicios/                  ← RPG (ex-Lista/heranca Enunciado)
│
├── modulo-05-classes-abstratas-e-polimorfismo/
│   ├── README.md
│   ├── exemplo/                     ← ex-SistemaAcademico
│   └── exercicios/                  ← Formas (ex-Lista/sobre) + Funcionários (ex-funcsis)
│
├── modulo-06-sistema-bancario/      ← Estudo de caso guiado (aplica tudo)
│   ├── README.md                    ← Passo a passo de construção do sistema
│   ├── exemplo/                     ← ex-SistemaBancario
│   └── exercicios/                  ← Extensões: nova conta, extrato, juros...
│
├── modulo-07-projeto-integrador/
│   ├── README.md                    ← Especificação do projeto final
│   └── exemplo-referencia/          ← ex-SistemaEstoque como referência de escopo
│
└── material-apoio/
    ├── diagramas/                   ← Diagramas de classe (Mermaid) por módulo
    └── rubrica-avaliacao.md         ← Critérios de correção dos exercícios
```

### Onde ficam os gabaritos (recomendação)

Mover as resoluções (`Lista/res/*`) para uma **branch separada `gabaritos`**, espelhando a estrutura dos módulos. Assim:

- A branch `main` fica limpa, só com enunciados — sem spoiler.
- Você libera o gabarito quando quiser, apontando os alunos para a branch (ou fazendo merge por módulo conforme o semestre avança).
- Alternativa mais simples: pasta `gabaritos/` na própria `main`, com aviso "só abra depois de tentar" (menos controle, porém mais fácil de manter).

---

## 3. Progressão pedagógica (sequência das aulas)

| Módulo | Tema | Conceitos novos | Pré-requisito |
| --- | --- | --- | --- |
| 00 | Preparação do ambiente | JDK, `javac`/`java`, estrutura de pacotes | — |
| 01 | Classes e objetos | Classe, objeto, atributo, método, construtor, `this` | 00 |
| 02 | Encapsulamento e validação | `private`, getters/setters, validação de entrada, exceções básicas | 01 |
| 03 | Coleções e interação | `ArrayList`, `Scanner`, menus, laços de CRUD | 02 |
| 04 | Herança | `extends`, `super`, `@Override`, `protected` | 03 |
| 05 | Abstração e polimorfismo | Classe abstrata, método abstrato, polimorfismo, sobrecarga × sobrescrita | 04 |
| 06 | Estudo de caso: banco | Integração de todos os conceitos em um sistema real | 05 |
| 07 | Projeto integrador | Aluno constrói um sistema completo do zero | 06 |

Cada conceito aparece **uma única vez como novidade** e é reutilizado nos módulos seguintes — o aluno sempre pratica o que aprendeu antes.

---

## 4. Anatomia de cada módulo (padrão a seguir)

Todo `modulo-XX/README.md` segue o mesmo template:

```markdown
# Módulo XX — Título

## Objetivos de aprendizagem
Ao final deste módulo você será capaz de:
- [ ] objetivo 1 (verbo mensurável: criar, explicar, aplicar...)
- [ ] objetivo 2

## Pré-requisitos
Módulo YY concluído (você fez os exercícios E-01 e E-02).

## Conceito
Explicação da teoria em linguagem acessível, com analogia do mundo real
e diagrama de classes em Mermaid.

## Exemplo guiado
Passo a passo do código em `exemplo/`, explicando decisão por decisão
("por que o atributo é private?", "por que validar no setter?").

## Como executar o exemplo
Comandos exatos de compilação e execução.

## Exercícios
1. **Fixação** — variação pequena do exemplo (baixa dificuldade)
2. **Aplicação** — problema novo usando o conceito (dificuldade média)
3. **Desafio** (opcional) — integra conceitos de módulos anteriores

## Auto-avaliação
Checklist: "consigo explicar X sem olhar o código?" —
se algum item falhar, revise antes de ir ao próximo módulo.

## Erros comuns
Os 3–5 erros que os alunos mais cometem neste tema, com o porquê.
```

### Padrão dos enunciados de exercício

Converter os `Enunciado.txt` para Markdown (`EXERCICIO-XX-nome.md`) mantendo o formato que já funciona bem (requisitos + estrutura de pastas + exemplo de saída) e acrescentando:

- **Nível de dificuldade** (⭐ a ⭐⭐⭐) e tempo estimado
- **Conceitos praticados** (tags: herança, sobrecarga...)
- **Critérios de aceitação** — lista objetiva do que será verificado na correção

---

## 5. Material novo a produzir

Conteúdo que não existe hoje e enriquece a trilha:

1. **`README.md` raiz reescrito** — vira o "mapa da disciplina": tabela da trilha com links para cada módulo, fluxograma Mermaid da progressão, seção "como estudar com este repositório".
2. **`GUIA-DO-ALUNO.md`** — instalação do JDK e VS Code (com prints ou links), como clonar o repo, como compilar/executar pelo terminal e pela IDE, como entregar exercícios (fork? pasta própria? GitHub Classroom?).
3. **`GLOSSARIO.md`** — classe, objeto, instância, encapsulamento, herança, polimorfismo, abstração, sobrecarga, sobrescrita... cada termo em 2–3 linhas com exemplo mínimo.
4. **Diagramas de classe em Mermaid** — um por módulo, dentro do próprio README (o GitHub renderiza nativamente). Ex.: hierarquia `Conta ← ContaCorrente/ContaPoupanca`.
5. **Exercícios de fixação novos** — hoje só existem 4 enunciados; a meta é **2 a 3 exercícios por módulo** (fixação + aplicação + desafio). Módulos 02, 03 e 06 não têm nenhum exercício ainda.
6. **Especificação do projeto integrador (módulo 07)** — enunciado aberto com requisitos mínimos (ex.: sistema de locadora/farmácia/oficina com 1 classe abstrata, 2 subclasses, coleção, menu e validações) + rubrica de avaliação.
7. **`material-apoio/rubrica-avaliacao.md`** — critérios de correção reutilizáveis (compila? atende requisitos? nomes adequados? encapsulamento correto?).

---

## 6. Melhorias técnicas (opcionais, mas recomendadas)

- **Padronizar pacotes**: hoje cada projeto usa convenção diferente (`com.sgp`, `com.SGE`, `com.java.sga` — este último invertido). Padronizar para `com.poo.moduloXX` ao migrar.
- **GitHub Actions simples** que roda `javac` em todos os módulos a cada push — garante que nenhum exemplo quebrado chegue aos alunos.
- **GitHub Classroom** (se fizer sentido para sua turma): cada exercício vira um assignment com repositório template; correção automática de compilação.
- **Issues templates** — modelo de "dúvida sobre módulo X" para os alunos abrirem perguntas no próprio repo.

---

## 7. Roteiro de execução (ordem sugerida)

Migração incremental — o repo continua utilizável durante toda a conversão:

| Fase | Entrega | Esforço |
| --- | --- | --- |
| **1. Fundação** | Nova estrutura de pastas + README raiz com a trilha + GUIA-DO-ALUNO | pequeno |
| **2. Migração** | Mover projetos/exercícios existentes para os módulos, padronizar pacotes, converter `Enunciado.txt` → Markdown | médio |
| **3. Teoria** | Escrever os READMEs de cada módulo no template (conceito + exemplo guiado + erros comuns) | grande |
| **4. Exercícios** | Criar os exercícios que faltam (módulos 02, 03, 06) + mover gabaritos para a branch `gabaritos` | médio |
| **5. Extras** | Glossário, diagramas Mermaid, rubrica, projeto integrador, CI | médio |

Cada fase pode ser um commit/PR próprio, e a partir da Fase 2 os alunos já navegam pela trilha nova.
