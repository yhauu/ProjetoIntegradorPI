package br.com.aulas;
import java.util.Scanner;

public class Exercicio02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1) Converta o número binário 1111001010 em decimal:\n A - 987 \n B - 872 \n C - 1025 \n D - 102 \n E - 970");
        String alter = input.next();

        switch (alter) {
            case "a":
            case "A":
                System.out.println("Resposta incorreta");
            break;

            case "b":
            case "B":
                System.out.println("Resposta incorreta");
            break;

            case "c":
            case "C":
                System.out.println("Resposta incorreta");
            break;

            case "d":
            case "D":
                System.out.println("Resposta incorreta");
            break;

            case "e":
            case "E":
                System.out.println("Resposta correta");
            break;
        }
    }
}
