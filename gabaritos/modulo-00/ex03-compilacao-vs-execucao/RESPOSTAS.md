# Gabarito — Compilação vs. execução

## O que aconteceu com cada um

| | ProgramaF | ProgramaG |
| --- | --- | --- |
| Compilou? | Sim | Não: `';' expected` na linha 3 |
| O que apareceu na tela | `Calculando a media da turma...`, depois a stack trace da exceção | Nada, nem a primeira linha |
| Tipo do erro | `ArithmeticException: / by zero`, na linha 6 (a divisão) | Erro de compilação, sintaxe |
| Quando aconteceu | Durante a EXECUÇÃO (o `.class` já existia e a JVM estava rodando) | Durante a COMPILAÇÃO (o `javac` nunca gerou o `.class`) |

## A pergunta que amarra o exercício

`ProgramaF` mostra parte da saída porque ele **compilou com sucesso**: existe um `ProgramaF.class` e a JVM começa a executar, linha por linha, de cima para baixo. O `println` da linha 3 já rodou e já imprimiu na tela quando a JVM chega na linha 6 e a divisão por zero derruba o programa. Tudo que rodou ANTES da linha que quebrou já aconteceu de verdade.

`ProgramaG` não mostra nada porque ele **nunca chegou a compilar**. O `javac` lê o arquivo inteiro procurando erros de sintaxe antes de gerar qualquer `.class`. Como a linha 3 está com erro, o `javac` para, não gera o `.class`, e o comando `java ProgramaG` nem tem o que executar. Não importa que a linha `"Iniciando o programa..."` esteja perfeita: o arquivo inteiro é rejeitado de uma vez.

Resumo da regra: **erro de compilação impede qualquer execução; erro de execução só impede o que vem DEPOIS da linha que quebrou.**

## Programas corrigidos

### ProgramaF.java

```java
public class ProgramaF {
    public static void main(String[] args) {
        System.out.println("Calculando a media da turma...");
        int totalDeAlunos = 2;
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
        System.out.println("Iniciando o programa...");
        System.out.println("Processando dados...");
    }
}
```
