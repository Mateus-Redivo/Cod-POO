# Sistema de Gerenciamento de Pessoas

## Descrição
Este é um sistema Java que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO), incluindo encapsulamento, construtores e interfaces de usuário baseadas em console.

## Estrutura do Projeto

### Pacotes
- `com.exemplo.modelos`: Contém as classes de modelo
- `com.exemplo.testes`: Contém as classes de teste e implementação

### Classes Principais

#### Pessoa (`com.exemplo.modelos.Pessoa`)
```java
public class Pessoa {
    private String nome;
    private int idade;
}
```
- **Atributos**:
  - `nome`: String privada para armazenar o nome
  - `idade`: int privado para armazenar a idade

- **Construtores**:
  - `Pessoa(String nome, int idade)`: Construtor completo
  - `Pessoa(String nome)`: Construtor com valores padrão

- **Métodos**:
  - `saudacao()`: Exibe uma mensagem personalizada
  - Getters e Setters para acesso controlado
  - `toString()`: Representação textual do objeto

### Classes de Teste

#### TesteAcessoMenu
- Interface interativa baseada em console
- Menu com opções para:
  1. Mostrar dados da pessoa
  2. Alterar nome
  3. Alterar idade
  4. Mostrar saudação
  0. Sair
- Implementa validações de entrada
- Tratamento de exceções

#### TesteAcesso
- Demonstração básica de acesso aos métodos da classe Pessoa
- Exemplo de uso dos getters e setters

#### Teste
- Demonstração de casos de teste
- Tratamento de objetos nulos
- Teste dos construtores

## Tecnologias Utilizadas
- Java 8+
- Scanner para entrada de dados
- Tratamento de Exceções
- Programação Orientada a Objetos

## Recursos de POO Demonstrados
- Encapsulamento
- Sobrecarga de construtores
- Métodos públicos e privados
- ToString override
- Validação de dados

## Como Executar
1. Compile todas as classes Java
2. Execute qualquer uma das classes de teste:
   - `TesteAcessoMenu` para interface interativa
   - `TesteAcesso` para demonstração básica
   - `Teste` para casos de teste

## Validações Implementadas
- Nome:
  - Não pode conter números
  - Não pode estar vazio
- Idade:
  - Não pode ser negativa
  - Não pode ser maior que 150
  - Deve ser um número inteiro válido

## Configuração do Ambiente
- IDE: Visual Studio Code
- Estrutura de pastas:
  - `src/`: Código fonte
  - `bin/`: Arquivos compilados
  - `lib/`: Dependências (se houver)

## Requisitos do Sistema
- JDK 8 ou superior
- IDE com suporte a Java (recomendado VS Code)
- Terminal/Console para interação
