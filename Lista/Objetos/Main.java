package objetos;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static double peso;
    private static double altura;

    // Método principal
    public static void main(String[] args) {
        int op;
        do{
        exibirMenu();
        op = receberOp();

        switch (op) {
            case 1 -> {
                if (receberPeso() && receberAltura()) {
                    calcularIMC();
                } else {
                    op = -1; // Força o loop a continuar em caso de erro na entrada
                }
            }
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
        
        }while(op != 0);
        scanner.close();
    }

    // Exibe o menu de opções
    public static void exibirMenu() {
        System.out.println("Calculadora de IMC");
        System.out.println("Menu de Opções:");
        System.out.println("0. Sair");
        System.out.println("1. Calcular IMC");
        System.out.print("Escolha uma opção: ");
    }

    // Recebe a opção do usuário
    public static int receberOp(){
        try{ 
            return scanner.nextInt();
        } catch (Exception e){
            scanner.nextLine(); 
            return -1;
        }
    }

    // Recebe o peso do usuário
    public static boolean receberPeso(){
        System.out.print("Digite seu peso (kg): ");
        
        try{
            String input = scanner.next().replace(",", ".");
            peso = Double.parseDouble(input);
            if (peso <= 0) {
                System.out.println("Peso deve ser maior que zero.");
                return false;
            }
            return true;
        } catch (Exception e){
            System.out.println("Valor inválido para peso. Por favor, insira um número.");
            scanner.nextLine(); 
            return false;
        }
    }

    // Recebe a altura do usuário
    public static boolean receberAltura(){
        System.out.print("Digite sua altura (m): ");
        
        try{
            String input = scanner.next().replace(",", ".");
            altura = Double.parseDouble(input);
            if (altura <= 0) {
                System.out.println("Altura deve ser maior que zero.");
                return false;
            }
            return true;
        } catch (Exception e){
            System.out.println("Valor inválido para altura. Por favor, insira um número.");
            scanner.nextLine(); 
            return false;
        }
    }

    // Calcula e exibe o IMC
    public static void calcularIMC() {
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}