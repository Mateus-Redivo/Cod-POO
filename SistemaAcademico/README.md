# Sistema de Gestão Acadêmica (SGA)

## 📚 Descrição

O Sistema de Gestão Acadêmica (SGA) é um projeto desenvolvido em Java que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO). O sistema permite gerenciar informações de alunos e professores em um ambiente acadêmico.

## 🏗️ Estrutura do Projeto

```
src/
└── com/
    └── java/
        └── sga/
            ├── app/
            │   ├── App.java          # Classe principal da aplicação
            │   └── Teste.java        # Classe para testes unitários
            ├── model/
            │   ├── Pessoa.java       # Classe base para pessoas
            │   ├── Aluno.java        # Classe para representar alunos
            │   └── Professor.java    # Classe para representar professores
            └── util/
                └── Validacoes.java   # Utilitários para validação de dados
```

## 🎯 Objetivos de Aprendizagem

Este projeto foi desenvolvido para ensinar e praticar:

- **Herança**: Relação entre `Pessoa`, `Aluno` e `Professor`
- **Encapsulamento**: Uso adequado de modificadores de acesso
- **Abstração**: Separação de responsabilidades em classes distintas
- **Polimorfismo**: Métodos sobrescritos e comportamentos específicos
- **Validação de Dados**: Implementação de validações robustas
- **Organização de Código**: Estrutura de pacotes Java

## 🔧 Funcionalidades

### Classe Pessoa
- Atributos básicos: nome
- Métodos de acesso (getters/setters)
- Validações de entrada

### Classe Aluno (herda de Pessoa)
- Atributos específicos: matrícula, notas
- Cálculo de média
- Verificação de aprovação

### Classe Professor (herda de Pessoa)
- Atributos específicos: disciplina, turma
- Métodos específicos para gestão acadêmica

### Classe Validacoes
- Validação de nomes
- Validação de matrículas
- Validação de notas (0-10)
- Validação de disciplinas e turmas
- Validação genérica de objetos

## � Passo a Passo: Como Criar e Testar os Códigos

### 🚀 Passo 1: Criando a Classe Base `Pessoa`

1. **Crie o arquivo `Pessoa.java`** no pacote `com.java.sga.model`
2. **Implemente a classe base**:
   ```java
   package com.java.sga.model;
   import com.java.sga.util.Validacoes;

   public class Pessoa {
       private String nome;
       
       // Construtor
       public Pessoa(String nome) {
           setNome(nome);
       }
       
       // Getters e Setters com validação
       public String getNome() { return nome; }
       
       public void setNome(String nome) {
           if (Validacoes.isNomeValido(nome)) {
               this.nome = nome;
           } else {
               throw new IllegalArgumentException("Nome inválido");
           }
       }
   }
   ```
3. **Teste básico**: Crie uma instância e teste os métodos

### 🎓 Passo 2: Criando a Classe `Aluno`

1. **Crie o arquivo `Aluno.java`** no pacote `com.java.sga.model`
2. **Implemente herança e funcionalidades específicas**:
   ```java
   package com.java.sga.model;
   import com.java.sga.util.Validacoes;
   import java.util.ArrayList;
   import java.util.List;

   public class Aluno extends Pessoa {
       private String matricula;
       private List<Double> notas;
       
       public Aluno(String nome, String matricula) {
           super(nome);
           setMatricula(matricula);
           this.notas = new ArrayList<>();
       }
       
       // Métodos específicos
       public void adicionarNota(double nota) {
           if (Validacoes.isNotaValida(nota)) {
               notas.add(nota);
           }
       }
       
       public double calcularMedia() {
           return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
       }
   }
   ```
3. **Teste**: Crie um aluno, adicione notas e calcule a média

### 👨‍🏫 Passo 3: Criando a Classe `Professor`

1. **Crie o arquivo `Professor.java`** no pacote `com.java.sga.model`
2. **Implemente funcionalidades específicas**:
   ```java
   package com.java.sga.model;
   import com.java.sga.util.Validacoes;

   public class Professor extends Pessoa {
       private String disciplina;
       private String turma;
       
       public Professor(String nome, String disciplina, String turma) {
           super(nome);
           setDisciplina(disciplina);
           setTurma(turma);
       }
       
       // Getters e Setters com validação
       public void setDisciplina(String disciplina) {
           if (Validacoes.isDisciplinaValida(disciplina)) {
               this.disciplina = disciplina;
           }
       }
   }
   ```
3. **Teste**: Crie um professor e defina disciplina e turma

### 🧪 Passo 4: Criando Testes Simples

1. **Crie o arquivo `Teste.java`** no pacote `com.java.sga.app`
2. **Implemente testes básicos**:
   ```java
   package com.java.sga.app;
   import com.java.sga.model.*;

   public class Teste {
       public static void main(String[] args) {
           // Teste 1: Criar e testar Aluno
           System.out.println("=== Teste Aluno ===");
           Aluno aluno = new Aluno("João Silva", "2024001");
           aluno.adicionarNota(8.5);
           aluno.adicionarNota(7.0);
           aluno.adicionarNota(9.0);
           System.out.println("Média: " + aluno.calcularMedia());
           
           // Teste 2: Criar e testar Professor
           System.out.println("=== Teste Professor ===");
           Professor prof = new Professor("Dr. Maria", "POO", "Turma A");
           System.out.println("Professor criado: " + prof.getNome());
       }
   }
   ```
3. **Execute o teste** e verifique os resultados

### 🎯 Passo 5: Aplicação Principal

1. **Crie o arquivo `App.java`** no pacote `com.java.sga.app`
2. **Implemente uma aplicação interativa**:
   ```java
   package com.java.sga.app;
   import com.java.sga.model.*;
   import java.util.Scanner;

   public class App {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("=== Sistema de Gestão Acadêmica ===");
           
           // Exemplo de criação de aluno interativo
           System.out.print("Nome do aluno: ");
           String nome = scanner.nextLine();
           
           System.out.print("Matrícula: ");
           String matricula = scanner.nextLine();
           
           Aluno aluno = new Aluno(nome, matricula);
           System.out.println("Aluno criado com sucesso!");
           
           scanner.close();
       }
   }
   ```

### ✅ Passo 6: Compilação e Execução

1. **Abra o terminal** no diretório do projeto
2. **Crie a pasta bin**:
   ```powershell
   mkdir bin
   ```
3. **Compile todos os arquivos**:
   ```powershell
   javac -d bin src/com/java/sga/**/*.java
   ```
4. **Execute os testes**:
   ```powershell
   java -cp bin com.java.sga.app.Teste
   ```
5. **Execute a aplicação**:
   ```powershell
   java -cp bin com.java.sga.app.App
   ```

### 🔍 Exercícios de Prática

**Exercício 1**: Adicione um método `isAprovado()` na classe `Aluno` (média >= 7.0)

**Exercício 2**: Implemente `toString()` em todas as classes para melhor visualização

**Exercício 3**: Crie uma lista de alunos na aplicação principal e implemente busca por nome

**Exercício 4**: Adicione tratamento de exceções para validações

## 🧪 Testes

O arquivo `Teste.java` contém exemplos de como testar as funcionalidades:

- Criação de objetos
- Validação de dados
- Cálculos de média
- Verificação de aprovação

## 📊 Validações Implementadas

| Validação | Descrição | Método |
|-----------|-----------|---------|
| Nome | Não pode ser nulo ou vazio | `isNomeValido()` |
| Matrícula | Não pode ser nula ou vazia | `isMatriculaValida()` |
| Disciplina | Não pode ser nula ou vazia | `isDisciplinaValida()` |
| Turma | Não pode ser nula ou vazia | `isTurmaValida()` |
| Nota | Deve estar entre 0 e 10 | `isNotaValida()` |
| Objeto | Não pode ser nulo | `isObjetoValido()` |

## 🎨 Boas Práticas Aplicadas

1. **Convenções de Nomenclatura**
   - Classes com primeira letra maiúscula (`PascalCase`)
   - Métodos e variáveis com primeira letra minúscula (`camelCase`)
   - Constantes em maiúsculas (`SNAKE_CASE`)

2. **Organização de Pacotes**
   - `app`: Classes de aplicação e testes
   - `model`: Modelos de dados (entidades)
   - `util`: Utilitários e helpers

3. **Encapsulamento**
   - Atributos privados
   - Métodos públicos para acesso controlado
   - Validações antes de modificar dados

4. **Documentação**
   - Comentários explicativos
   - JavaDoc para métodos públicos

## 🔄 Extensões Possíveis

- [ ] Adicionar mais tipos de pessoa (Funcionário, Coordenador)
- [ ] Implementar persistência de dados (arquivos, banco de dados)
- [ ] Criar interface gráfica
- [ ] Adicionar relatórios em PDF
- [ ] Implementar sistema de login
- [ ] Adicionar histórico acadêmico

## 💡 Dicas para Estudo

1. **Comece pela classe `Pessoa`**: Entenda a classe base
2. **Explore a herança**: Veja como `Aluno` e `Professor` estendem `Pessoa`
3. **Teste as validações**: Use a classe `Validacoes` em diferentes cenários
4. **Experimente**: Modifique o código e observe os resultados
5. **Debug**: Use breakpoints para entender o fluxo de execução

## 📚 Conceitos de POO Demonstrados

### Herança
```java
public class Aluno extends Pessoa {
    // Aluno herda todos os atributos e métodos de Pessoa
}
```

### Encapsulamento
```java
private String nome;
public String getNome() { return nome; }
public void setNome(String nome) { 
    if (Validacoes.isNomeValido(nome)) {
        this.nome = nome;
    }
}
```

### Abstração
- Separação de responsabilidades em diferentes classes
- Interface clara através de métodos públicos

### Polimorfismo
- Métodos `toString()` sobrescritos em cada classe
- Comportamentos específicos para cada tipo de pessoa

## 🐛 Solução de Problemas Comuns

### Erro de Compilação
```
Error: Could not find or load main class
```
**Solução**: Verifique se o classpath está correto e se compilou todos os arquivos.

### ClassNotFoundException
**Solução**: Certifique-se de que está executando a partir do diretório correto.

### Validação Falhando
**Solução**: Verifique se os dados de entrada atendem aos critérios de validação.

## 👥 Contribuindo

Este é um projeto educacional. Sinta-se à vontade para:
- Fazer fork do projeto
- Adicionar novas funcionalidades
- Melhorar a documentação
- Reportar bugs ou sugerir melhorias

## 📄 Licença

Este projeto é para fins educacionais e está disponível sob a licença MIT.

