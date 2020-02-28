package br.com.aulas;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Declaração da variável responsável por capturar o valor inserido pelo usuário
        Scanner input = new Scanner(System.in);

        //Armazenando e convertendo o número inserido pelo usuário
        System.out.println("Digite um valor inteiro de 1 até 10: ");
        int num = input.nextInt();

        //Efetuando a multiplicação e armazenando os resultados dentro das variáveis
        int result1 = num * 1;
        int result2 = num * 2;
        int result3 = num * 3;
        int result4 = num * 4;
        int result5 = num * 5;
        int result6 = num * 6;
        int result7 = num * 7;
        int result8 = num * 8;
        int result9 = num * 9;
        int result10 = num * 10;

        //Montando a tabela da tabuada em conjunto do resultado de cada multiplicação do número inserido pelo usuário
        System.out.println(num + " X " + " 0 = 0");
        System.out.println(num + " X " + " 1 = " + result1);
        System.out.println(num + " X " + " 2 = " + result2);
        System.out.println(num + " X " + " 3 = " + result3);
        System.out.println(num + " X " + " 4 = " + result4);
        System.out.println(num + " X " + " 5 = " + result5);
        System.out.println(num + " X " + " 6 = " + result6);
        System.out.println(num + " X " + " 7 = " + result7);
        System.out.println(num + " X " + " 8 = " + result8);
        System.out.println(num + " X " + " 9 = " + result9);
        System.out.println(num + " X " + " 10 = " + result10);
    }
}
