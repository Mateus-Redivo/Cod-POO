# Módulo 00 — Preparação do ambiente

## Objetivos de aprendizagem

Ao final deste módulo você será capaz de:

- [ ] Instalar e verificar o JDK no seu computador
- [ ] Compilar um arquivo `.java` pelo terminal com `javac`
- [ ] Executar um programa Java com `java`
- [ ] Explicar a diferença entre código-fonte (`.java`) e bytecode (`.class`)

## Pré-requisitos

Nenhum. Este é o ponto de partida.

## Preparando a máquina

Siga o passo a passo completo de instalação no [GUIA-DO-ALUNO.md](../GUIA-DO-ALUNO.md). Volte aqui quando `java -version` e `javac -version` responderem no seu terminal.

## Entendendo o que acontece ao "rodar Java"

Java não executa seu texto diretamente. Existe uma etapa intermediária:

```mermaid
flowchart LR
    A["MeuPrograma.java<br>(codigo-fonte que voce escreve)"] -->|"javac"| B["MeuPrograma.class<br>(bytecode)"]
    B -->|"java"| C["JVM executa<br>(qualquer sistema operacional)"]
```

- `javac` é o **compilador**, traduz seu código para bytecode e, de quebra, aponta seus erros de escrita antes de o programa existir.
- `java` inicia a **JVM** (máquina virtual), que executa o bytecode. É ela que torna o Java portátil: o mesmo `.class` roda em Windows, Linux e Mac.

## Seu primeiro programa

Crie um arquivo chamado `OlaTurma.java` (o nome do arquivo DEVE ser igual ao nome da classe) com este conteúdo. Digite, não copie, para começar a criar memória muscular:

```java
public class OlaTurma {

    public static void main(String[] args) {
        System.out.println("Ola, turma de POO!");
        System.out.println("Ambiente configurado com sucesso.");
    }
}
```

No terminal, na pasta onde salvou o arquivo:

```bash
javac OlaTurma.java
java OlaTurma
```

Se as duas mensagens apareceram, parabéns: seu ambiente está pronto.

Sobre o `public static void main(String[] args)`: por enquanto, aceite-o como "a porta de entrada do programa", onde a JVM começa a executar. Cada palavra dessa assinatura vai fazer sentido ao longo dos módulos.

## Experimente quebrar

Aprender a ler erros do compilador agora vai economizar horas depois. Faça cada sabotagem abaixo, recompile e leia a mensagem de erro com calma:

1. Remova o `;` do final de um `println`.
2. Escreva `system` com "s" minúsculo.
3. Renomeie a classe para `OlaTurma2` sem renomear o arquivo.
4. Apague uma das chaves `}` do final.

Desfaça tudo e confirme que volta a compilar.

## Auto-avaliação

Antes de ir ao módulo 01, confirme:

- [ ] Sei compilar e executar um `.java` pelo terminal sem consultar nada
- [ ] Sei explicar o que o `javac` produz e quem executa esse produto
- [ ] Provoquei pelo menos dois erros de compilação e entendi as mensagens

## Erros comuns

| Sintoma | Causa provável |
| --- | --- |
| `'javac' não é reconhecido...` | JDK não instalado ou fora do PATH |
| `class OlaTurma is public, should be declared in a file named...` | Nome do arquivo diferente do nome da classe |
| `Could not find or load main class` | Você digitou `java OlaTurma.class` ou `java olaturma`. O certo é `java OlaTurma` |
| O terminal "não acha" o arquivo | Você está em outra pasta; use `cd` até a pasta do arquivo |

---

Próxima parada: [Módulo 01 — Por que POO?](../modulo-01-por-que-poo/)
