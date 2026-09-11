# Exercício 02 — Decifrando erros

| Nível | Tempo estimado | Conceitos |
| --- | --- | --- |
| 2 de 3 | 30 min | leitura de mensagem de erro do `javac`, depuração |

## Objetivo

Ler cinco mensagens de erro de compilação e consertar os programas que as produziram. É a habilidade mais útil da primeira semana, e a que ninguém ensina de propósito.

## Como fazer

Para cada programa abaixo:

1. **Antes de rodar**, leia o código e escreva o que você acha que vai acontecer.
2. Copie para um arquivo com o nome indicado e compile com `javac`.
3. Anote: **qual linha** o `javac` apontou e **qual foi a mensagem** (a primeira linha do erro).
4. Conserte e compile de novo, até funcionar.

Entregue um arquivo `decifrando_erros.md` (ou o formato que o professor pedir) com as cinco respostas, e os cinco programas corrigidos.

---

## Programa A (`ProgramaA.java`)

```java
public class ProgramaA {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema")
        System.out.println("Digite seus dados");
    }
}
```

## Programa B (`ProgramaB.java`)

```java
public class ProgramaB {
    public static void main(String[] args) {
        String nome = "Marcos";
        Systm.out.println("Ola, " + nome);
    }
}
```

## Programa C (`ProgramaC.java`)

```java
public class ProgramaC {
    public static void main(String[] args) {
        System.out.println("Calculando o total da compra);
        System.out.println("Total: 150");
    }
}
```

## Programa D (`ProgramaD.java`)

```java
public class ProgramaD {
    public static void main(String[] args) {
        System.out.println("Linha 1");
        System.out.println("Linha 2");
        System.out.println("Linha 3");
    }
```

## Programa E (`Programae.java`, salvo com esse nome de arquivo mesmo)

```java
public class ProgramaE {
    public static void main(String[] args) {
        System.out.println("Ola!");
    }
}
```

---

## Para cada um, responda

| Pergunta | O que você deve anotar |
| --- | --- |
| Que linha o `javac` apontou? | o número depois de `.java:` na mensagem |
| Qual a mensagem de erro? | a primeira linha, resumida com suas palavras |
| Como consertar? | a linha corrigida |

## A pergunta que amarra o exercício

Em um desses cinco programas, a linha que o `javac` aponta **não é** a linha onde você realmente cometeu o erro: o compilador só percebe que algo está errado bem depois, ao chegar no fim do arquivo sem encontrar o que esperava.

**Qual programa é esse? Por que o compilador só "percebe" o problema tão mais tarde?**

## Critérios de aceitação

- [ ] As cinco previsões foram escritas **antes** de compilar
- [ ] As cinco mensagens de erro estão identificadas corretamente
- [ ] As explicações estão com suas próprias palavras, não copiadas da mensagem
- [ ] Os cinco programas corrigidos compilam e executam sem erro
- [ ] A pergunta final está respondida com a observação que a comprova

## Dica sobre o Programa E

Repare no nome do arquivo pedido: `Programae.java`, com "e" minúsculo, enquanto a classe dentro dele é `ProgramaE`. Essa letra sozinha já é o problema.

---

Gabarito: [gabaritos/modulo-00/ex02-decifrando-erros/](../../gabaritos/modulo-00/ex02-decifrando-erros/), depois de tentar, não antes.
