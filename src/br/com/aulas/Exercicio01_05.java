package br.com.aulas;
import java.util.Scanner;

public class Exercicio01_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 7");
        int dia = input.nextInt();

        switch (dia){
            case 1 :
                System.out.println("Domingo");
            break;

            case 2 :
                System.out.println("Segunda-feira");
            break;

            case 3 :
                System.out.println("Terça-feira");
            break;

            case 4 :
                System.out.println("Quarta-feira");
            break;

            case 5 :
                System.out.println("Quinta-feira");
            break;

            case 6 :
                System.out.println("Sexta-feira");
            break;

            case 7 :
                System.out.println("Sábado");
            break;

            default:
                System.out.println("Valor inválido!");
        }
    }
}
