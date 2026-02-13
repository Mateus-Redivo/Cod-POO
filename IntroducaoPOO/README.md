Projeto: Introdução à POO (exemplos simples)

Descrição
--------

Este projeto contém exemplos simples em Java que demonstram conceitos básicos de Programação Orientada a Objetos (POO): encapsulamento, construtores, getters/setters e validações.

Arquivos principais
------------------

- `src/main/java/com/sgp/modelos/Pessoa.java` — classe `Pessoa` com `nome`, `idade`, construtores, `saudacao()`, getters, setters e `toString()`.
- `src/main/java/com/sgp/testes/Teste.java` — exemplo que cria objetos `Pessoa`, testa construtores e imprime resultados.
- `src/main/java/com/sgp/testes/TesteAcessoMenu.java` — menu de console para visualizar/alterar `Pessoa`.
- `src/main/java/com/sgp/util/Validacoes.java` — validações estáticas para nome e idade, com mensagens de erro.

Principais pontos
-----------------

- Validações de entrada: nome (não vazio, sem dígitos) e idade (0–150).
- Menu interativo (`TesteAcessoMenu`) com opções para mostrar dados, alterar nome/idade e exibir saudação.
- Construtor padrão em `Pessoa` fornece valores de exemplo quando necessário.

Como compilar e executar (linha de comando)
-----------------------------------------

1. Compile o código a partir da raiz do projeto:

```bash
javac -d bin src/main/java/com/sgp/**/*.java
```

1. Execute o menu interativo:

```bash
java -cp bin com.sgp.testes.TesteAcessoMenu
```

1. Execute a classe de teste não interativa:

```bash
java -cp bin com.sgp.testes.Teste
```

Observações
-----------

- Recomendo usar uma IDE (ex.: VS Code com extensão Java) para facilitar compilação e execução.
