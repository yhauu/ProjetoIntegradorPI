package br.com.aulas;
import java.util.Scanner;

public class Exercicio02_04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double sumAB = 0.0;
        double sumBC = 0.0;
        double sumAC = 0.0;

        System.out.println("Digite o valor do lado A: ");
        double sideA = input.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        double sideB = input.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        double sideC = input.nextDouble();

        sumAB = sideA + sideB;
        sumBC = sideB + sideC;
        sumAC = sideA + sideC;

        if (sumAB < sideC || sumBC < sideA || sumAC < sideB) {
            System.out.println("Os valores inseridos não formam um triângulo.");
        } else {
            if (sideA == sideB && sideB == sideC && sideA == sideC){
                System.out.println("Os valores informados formam um triângulo equilátero.");
            } else {
                if (sideA == sideB || sideB == sideC || sideA == sideC){
                    System.out.println("Os valores informados formam um triângulo isóceles.");
                } else {
                    System.out.println("Os valores informados formam um triângulo escaleno.");
                }
            }
        }
    }
}
