package app;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class TesteIgualdade {

    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", 25, 1);
        Aluno b = new Aluno("Ana", 25, 1);

        System.out.println("=== 1. == compara referencia ===");
        System.out.println("a == b            -> " + (a == b));          // false: dois objetos diferentes
        System.out.println("a == a            -> " + (a == a));          // true: e o mesmo objeto

        System.out.println("\n=== 2. equals compara conteudo (porque sobrescrevemos) ===");
        System.out.println("a.equals(b)       -> " + a.equals(b));       // true: mesmos dados

        System.out.println("\n=== 3. Contrato: objetos equals tem o mesmo hashCode ===");
        System.out.println("a.hashCode()      -> " + a.hashCode());
        System.out.println("b.hashCode()      -> " + b.hashCode());

        System.out.println("\n=== 4. Por que isso importa numa lista ===");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 25, 1));

        boolean contemAna = alunos.contains(new Aluno("Ana", 25, 1));
        System.out.println("alunos.contains(nova Ana com os mesmos dados) -> " + contemAna);
        // Sem equals sobrescrito, esta linha seria "false" e o sistema
        // cadastraria a Ana duas vezes sem perceber.
    }
}
