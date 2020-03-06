package br.com.aulas;
import java.util.Scanner;

public class Exercicio01_04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double discount = 0.0;
        double purchase = 0.0;

        System.out.println("Digite o valor da compra: ");
        purchase = input.nextDouble();

        if (purchase >= 300) {
            discount = purchase*0.2;
        } else {
            discount = purchase*0.15;  
        }

        purchase -= discount;

        System.out.println("O valor da compra com desconto é: " + purchase + "\nE o valor do desconto é de: " + discount);
        
    }
}
