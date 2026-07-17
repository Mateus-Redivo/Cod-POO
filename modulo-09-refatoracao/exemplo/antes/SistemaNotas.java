// VERSAO "ANTES": tudo dentro do main, com codigo repetido.
// Este programa FUNCIONA, mas repare nos problemas:
//   1. O mesmo calculo de media aparece 3 vezes (copiar e colar).
//   2. Se a regra de aprovacao mudar (ex.: media 7.0), precisamos
//      corrigir em 3 lugares — e e facil esquecer um deles.
//   3. Os dados de cada aluno estao espalhados em variaveis soltas.
// No README deste modulo, refatoramos este codigo passo a passo.
public class SistemaNotas {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NOTAS (versao monolitica) ===\n");

        // Aluno 1
        String nome1 = "Ana";
        double prova1a = 8.0;
        double prova1b = 6.5;
        double trabalho1 = 9.0;
        double media1 = (prova1a + prova1b + trabalho1) / 3;
        String situacao1;
        if (media1 >= 6.0) {
            situacao1 = "Aprovado";
        } else if (media1 >= 4.0) {
            situacao1 = "Recuperacao";
        } else {
            situacao1 = "Reprovado";
        }
        System.out.printf("%s: media %.2f - %s%n", nome1, media1, situacao1);

        // Aluno 2 — mesmo codigo copiado e colado
        String nome2 = "Bruno";
        double prova2a = 5.0;
        double prova2b = 4.5;
        double trabalho2 = 6.0;
        double media2 = (prova2a + prova2b + trabalho2) / 3;
        String situacao2;
        if (media2 >= 6.0) {
            situacao2 = "Aprovado";
        } else if (media2 >= 4.0) {
            situacao2 = "Recuperacao";
        } else {
            situacao2 = "Reprovado";
        }
        System.out.printf("%s: media %.2f - %s%n", nome2, media2, situacao2);

        // Aluno 3 — copiado e colado de novo
        String nome3 = "Carla";
        double prova3a = 3.0;
        double prova3b = 2.5;
        double trabalho3 = 4.0;
        double media3 = (prova3a + prova3b + trabalho3) / 3;
        String situacao3;
        if (media3 >= 6.0) {
            situacao3 = "Aprovado";
        } else if (media3 >= 4.0) {
            situacao3 = "Recuperacao";
        } else {
            situacao3 = "Reprovado";
        }
        System.out.printf("%s: media %.2f - %s%n", nome3, media3, situacao3);

        // E a media da turma? Mais variaveis soltas...
        double mediaTurma = (media1 + media2 + media3) / 3;
        System.out.printf("%nMedia da turma: %.2f%n", mediaTurma);
    }
}
