package br.com.aulas;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Declaração da variável responsável por capturar o valor inserido pelo usuário
        Scanner input = new Scanner(System.in);

        //Armazenando e convertendo o primeiro número inserido pelo usuário
        System.out.println("Digite o primeiro número real: ");
        float num1 = input.nextFloat();

        //Armazenando e convertendo o segundo número inserido pelo usuário
        System.out.println("Digite o segundo número real: ");
        float num2 = input.nextFloat();

        //Armazenando e convertendo o primeiro terceiro inserido pelo usuário
        System.out.println("Digite o terceiro número real: ");
        float num3 = input.nextFloat();

        //Efetuando a multiplicação e armazenando o resultado dentro da variável "result"
        float result = (num1 * num2 * num3);

        //Saída do resultado para o usuário
        System.out.println("O produto desses três números reais é: " + result);
    }
}
