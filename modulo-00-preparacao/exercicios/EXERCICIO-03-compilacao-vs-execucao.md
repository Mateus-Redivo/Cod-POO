# Exercício 03 — Compilação vs. execução

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 3 de 3 | 30 min | erro de compilação × erro de execução, leitura de stack trace |

## Objetivo

Você já viu erros que o `javac` recusa (módulo 00 e exercício 02). Agora você vai ver um tipo diferente: um programa que **compila perfeitamente** e só quebra quando está **rodando**. Entender a diferença entre as duas fases é a base de qualquer depuração daqui pra frente.

## Os dois programas

### ProgramaF.java

```java
public class ProgramaF {
    public static void main(String[] args) {
        System.out.println("Calculando a media da turma...");
        int totalDeAlunos = 0;
        int somaDasNotas = 50;
        int media = somaDasNotas / totalDeAlunos;
        System.out.println("Media: " + media);
    }
}
```

### ProgramaG.java

```java
public class ProgramaG {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...")
        System.out.println("Processando dados...");
    }
}
```

## O que fazer

1. Copie os dois para arquivos com esses nomes.
2. Para cada um: primeiro compile com `javac`, só depois execute com `java` (se a compilação passar).
3. Anote, para cada programa:
   - Compilou ou não?
   - O que apareceu na tela (nada, tudo, ou só uma parte)?
   - Se deu erro, em que momento ele aconteceu: ao compilar ou ao executar?
4. Conserte os dois (o `ProgramaF` precisa de uma divisão que não quebre; o `ProgramaG` tem um erro de sintaxe) e confirme que os dois rodam do início ao fim.

## A pergunta que amarra o exercício

O `ProgramaF` imprime `"Calculando a media da turma..."` antes de quebrar. O `ProgramaG` **não imprime nada**, nem `"Iniciando o programa..."`, mesmo essa linha não tendo nada de errado nela.

**Por que um mostra parte da saída antes de falhar, e o outro não mostra nada?** Use o que o módulo explicou sobre `javac` e `java` serem duas etapas separadas para responder.

## Critérios de aceitação

- [ ] Identificou corretamente que `ProgramaF` falha ao EXECUTAR e `ProgramaG` falha ao COMPILAR
- [ ] Leu a stack trace do `ProgramaF` e identificou o tipo da exceção (`ArithmeticException`) e a linha
- [ ] Os dois programas corrigidos compilam e executam do início ao fim
- [ ] A pergunta final está respondida citando a diferença entre as duas etapas (`javac` compila o arquivo INTEIRO antes de qualquer execução começar)

## Dica

Se `ProgramaG` tivesse compilado, ele também rodaria até o fim sem problema: o erro dele é só de digitação, não de lógica. É justamente por isso que ele nunca chega a rodar: o `javac` para no arquivo inteiro antes de gerar qualquer `.class`.

---

Gabarito: [gabaritos/modulo-00/ex03-compilacao-vs-execucao/](../../gabaritos/modulo-00/ex03-compilacao-vs-execucao/), depois de tentar, não antes.
