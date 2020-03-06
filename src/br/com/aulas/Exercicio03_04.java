package br.com.aulas;
import java.util.Scanner;

public class Exercicio03_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0;

        System.out.println("Digite um ano: ");
        String yearText = input.next();

        if(yearText.length() > 4) {
            System.out.println("Ano inválido.");
        } else {
            year = Integer.parseInt(yearText);

            if ((year%400) == 0 || ((year%4) == 0 && (year%100) != 0)){
                System.out.println("O ano digitado é bissexto !");
            } else {
                System.out.println("O ano digitado não é bissexto.");
            }
        }
    }
}
