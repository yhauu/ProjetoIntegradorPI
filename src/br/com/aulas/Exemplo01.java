package br.com.aulas;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        int idade = input.nextInt();

        System.out.println("Então sua idade é " + idade);
    }
}
