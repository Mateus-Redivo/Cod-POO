# Sistema de Gerenciamento de Estoque (SGE)

## Descrição
Este sistema Java implementa um gerenciador de estoque que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO), incluindo encapsulamento, herança, interfaces de usuário baseadas em console e manipulação de coleções.

## Estrutura do Projeto

### Pacotes
- `main.java.com.SGE.models`: Contém as classes de modelo
- `main.java.com.SGE.app`: Contém a classe principal com a interface do usuário

### Classes Principais

#### Produto (`main.java.com.SGE.models.Produto`)
```java
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
}
```
- **Atributos**:
  - `id`: Identificador único do produto
  - `nome`: Nome do produto
  - `preco`: Preço unitário do produto
  - `quantidadeEmEstoque`: Quantidade disponível em estoque

- **Construtores**:
  - `Produto(int id, String nome, double preco)`: Construtor completo (inicia com estoque zero)

- **Métodos**:
  - `adicionarEstoque(int quantidade)`: Adiciona unidades ao estoque
  - `removerEstoque(int quantidade)`: Remove unidades do estoque
  - `exibirInformacoes()`: Exibe os dados do produto
  - Getters e Setters para acesso controlado

#### Estoque (`main.java.com.SGE.models.Estoque`)
```java
public class Estoque {
    private List<Produto> produtos;
}
```
- **Atributos**:
  - `produtos`: Lista que armazena os produtos cadastrados

- **Métodos**:
  - `cadastrarProduto(Produto produto)`: Adiciona um novo produto ao estoque
  - `atualizarEstoque(int id, int quantidade)`: Atualiza a quantidade em estoque
  - `removerProduto(int id)`: Remove um produto do estoque
  - `listarProdutos()`: Lista todos os produtos cadastrados
  - `buscarProdutoPorNome(String nome)`: Busca produtos pelo nome
  - `buscarProdutoPorId(int id)`: Busca um produto pelo ID (método privado)

### Classe Principal

#### Main (`main.java.com.SGE.app.Main`)
- Interface interativa baseada em console
- Menu com opções para:
  1. Cadastrar novo produto
  2. Atualizar quantidade em estoque
  3. Remover produto
  4. Buscar produto por nome
  5. Listar todos os produtos
  0. Sair
- Implementa validações de entrada
- Tratamento de exceções
- Inicialização de produtos para teste

## Tecnologias Utilizadas
- Java 8+
- ArrayList para armazenamento de dados
- Scanner para entrada de dados
- Tratamento de Exceções
- Programação Orientada a Objetos

## Recursos de POO Demonstrados
- Encapsulamento (atributos privados com getters e setters)
- Composição (Estoque contém Produtos)
- Métodos públicos e privados
- Validação de dados
- Manipulação de coleções

## Como Executar
1. Compile todas as classes Java
2. Execute a classe `main.java.com.SGE.app.Main`
3. Utilize o menu interativo para manipular o estoque

## Validações Implementadas
- Produto:
  - ID único (não permite duplicação)
  - Validação de quantidade suficiente para remoção
- Estoque:
  - Verificação de produto existente
  - Validação de operações de adição/remoção
- Interface:
  - Tratamento de entradas inválidas
  - Confirmação de operações realizadas

## Configuração do Ambiente
- IDE: Visual Studio Code
- Estrutura de pastas:
  - `src/`: Código fonte
    - `main/java/com/SGE/models/`: Classes de modelo
    - `main/java/com/SGE/app/`: Classe principal

## Requisitos do Sistema
- JDK 8 ou superior
- IDE com suporte a Java (recomendado VS Code)
- Terminal/Console para interação