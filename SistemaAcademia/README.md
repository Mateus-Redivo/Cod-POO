# Academia Fitness Manager 🏋️‍♂️

## Sobre o Projeto
Este projeto é um sistema simples para gerenciamento de uma academia, desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO) em Java. Ele permite o cadastro de alunos, a criação de treinos personalizados e a remoção de alunos, utilizando validações e boas práticas de programação.

---

## Estrutura do Sistema

### Classes Principais

#### 1. Aluno 👤
Representa um aluno da academia.

- Atributos:
  - `nome` (String): Nome do aluno.
  - `idade` (int): Idade do aluno.
  - `plano` (int): Tipo de plano do aluno (1 - Básico, 2 - Premium).

- Métodos:
  - Getters e setters para acessar e modificar os atributos.
  - `toString()`: Retorna uma representação textual do aluno.
  - `equals()` e `hashCode()`: Implementados para comparar objetos de forma consistente.

---

#### 2. Treino 💪
Representa um treino personalizado para um aluno.

- Atributos:
  - `nomeExercicio` (String): Nome do exercício.
  - `series` (int): Número de séries do exercício.
  - `repeticoes` (int): Número de repetições por série.
  - `carga` (double): Carga em quilogramas.

- Métodos:
  - Getters e setters para acessar e modificar os atributos.
  - `toString()`: Retorna uma descrição detalhada do treino.
  - `equals()` e `hashCode()`: Implementados para comparar objetos de treino.

---

#### 3. Validacoes ✅
Classe utilitária para validações de entrada.

- Métodos Estáticos:
  - `validarIdade(int idade)`: Verifica se a idade está entre 14 e 90 anos.
  - `validarCargaExercicios(int carga)`: Verifica se a carga é maior que zero.
  - `validarString(Scanner scanner, String mensagem)`: Garante que uma string não seja vazia.
  - `validarInteiro(Scanner scanner, String mensagem, int min, int max)`: Valida se um número inteiro está dentro de um intervalo.

---

#### 4. Main 🚀
Classe principal que contém o menu interativo e gerencia as operações do sistema.

- Atributos:
  - `alunos` (List<Aluno>): Lista de alunos cadastrados.
  - `treinos` (List<Treino>): Lista de treinos criados.
  - `scanner` (Scanner): Utilizado para capturar entradas do usuário.

- Funcionalidades:
  - Menu Principal:
    - Exibe opções para o usuário interagir com o sistema.
  - Cadastrar Aluno:
    - Solicita informações do aluno (nome, idade, plano) e realiza validações.
    - Adiciona o aluno à lista.
  - Remover Aluno:
    - Lista os alunos cadastrados e permite a remoção de um aluno pelo índice.
  - Criar Treino:
    - Associa um treino a um aluno existente, solicitando informações como nome do exercício, séries, repetições e carga.
  - Listar Alunos:
    - Exibe todos os alunos cadastrados.

---

## Funcionalidades ⚙️

- [x] Cadastro de Alunos: Permite adicionar novos alunos ao sistema.
- [x] Remoção de Alunos: Remove um aluno da lista com base no índice.
- [x] Criação de Treinos: Cria treinos personalizados para os alunos cadastrados.

---

## Regras de Negócio ⚠️

1. Validações de Aluno:
   - O nome do aluno não pode estar vazio.
   - A idade deve estar entre 14 e 90 anos.
   - O plano deve ser 1 (Básico) ou 2 (Premium).

2. Validações de Treino:
   - O nome do exercício não pode estar vazio.
   - O número de séries deve estar entre 1 e 20.
   - O número de repetições deve estar entre 1 e 100.
   - A carga deve ser maior que zero.

---

## Como Funciona o Sistema 💡

1. Menu Interativo:
   - O sistema exibe um menu com opções para o usuário.
   - O usuário escolhe uma opção digitando o número correspondente.

2. Cadastro de Aluno:
   - O sistema solicita o nome, idade e plano do aluno.
   - Realiza validações e adiciona o aluno à lista.

3. Criação de Treino:
   - O sistema solicita o aluno para o qual o treino será criado.
   - Solicita informações do treino (nome do exercício, séries, repetições, carga).
   - Realiza validações e adiciona o treino à lista.

4. Remoção de Aluno:
   - O sistema exibe a lista de alunos cadastrados.
   - O usuário escolhe o aluno a ser removido pelo índice.

5. Listagem de Alunos:
   - Exibe todos os alunos cadastrados no sistema.

---

## Tecnologias Utilizadas 🛠️

- Java: Linguagem de programação principal.
- ArrayList: Estrutura de dados para gerenciar listas de alunos e treinos.
- Scanner: Para capturar entradas do usuário.
- Tratamento de Exceções: Para validações robustas.

---