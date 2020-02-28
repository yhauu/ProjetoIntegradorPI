package br.com.aulas;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int num1 = input.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int num2 = input.nextInt();

        int result = num1 + num2;
        System.out.println("O resultado da soma é: " + result);
    }
}
