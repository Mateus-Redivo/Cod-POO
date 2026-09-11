# Gabarito — Decifrando erros

| Programa | Linha apontada | Mensagem real do `javac` | Causa | Correção |
| --- | --- | --- | --- | --- |
| A | 3 | `';' expected` | Faltou o `;` no fim do `println` da linha 3 | Adicionar `;` ao final da linha 3 |
| B | 4 | `package Systm does not exist` | `Systm` não existe (é `System`, com erro de digitação); o compilador tenta interpretar `Systm` como um pacote | Corrigir para `System.out.println(...)` |
| C | 3 | `unclosed string literal` | Faltou a aspa de fechamento depois de "compra" | Adicionar a aspa: `"Calculando o total da compra"` |
| D | 6 (última linha do arquivo) | `reached end of file while parsing` | Falta a chave `}` que fecha a classe `ProgramaD`; o `javac` só descobre isso ao chegar no fim do arquivo sem achar o fechamento | Adicionar um `}` extra no final do arquivo |
| E | 1 | `class ProgramaE is public, should be declared in a file named ProgramaE.java` | O arquivo se chama `Programae.java` (com "e" minúsculo), mas a classe pública dentro dele é `ProgramaE` | Renomear o arquivo para `ProgramaE.java` |

## A pergunta que amarra o exercício

**Programa D** é o caso em que a linha apontada não é onde o erro realmente está.

Isso acontece porque o `javac` não sabe, ao ler o código, "faltou uma chave aqui" — ele só sabe que, ao terminar de ler o arquivo inteiro, ainda esperava encontrar mais alguma coisa (o `}` que fecharia a classe) e não achou. Por isso o erro aparece na **última linha do arquivo**, não na linha onde a chave deveria estar. Contar chaves (`{` sempre tem um `}` correspondente) é uma forma melhor de achar esse tipo de erro do que confiar cegamente no número da linha.

## Programas corrigidos

### ProgramaA.java

```java
public class ProgramaA {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema");
        System.out.println("Digite seus dados");
    }
}
```

### ProgramaB.java

```java
public class ProgramaB {
    public static void main(String[] args) {
        String nome = "Marcos";
        System.out.println("Ola, " + nome);
    }
}
```

### ProgramaC.java

```java
public class ProgramaC {
    public static void main(String[] args) {
        System.out.println("Calculando o total da compra");
        System.out.println("Total: 150");
    }
}
```

### ProgramaD.java

```java
public class ProgramaD {
    public static void main(String[] args) {
        System.out.println("Linha 1");
        System.out.println("Linha 2");
        System.out.println("Linha 3");
    }
}
```

### ProgramaE.java (arquivo renomeado de `Programae.java`)

```java
public class ProgramaE {
    public static void main(String[] args) {
        System.out.println("Ola!");
    }
}
```
