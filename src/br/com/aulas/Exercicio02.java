package br.com.aulas;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Declaração da variável responsável por capturar o valor inserido pelo usuário
        Scanner input = new Scanner(System.in);

        //Armazenando e convertendo o primeiro número inserido pelo usuário
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();

        //Efetuando a multiplicação e armazenando os resultados dentro das variáveis
        int result1 = num * 1;
        int result2 = num * 2;
        int result3 = num * 3;

        //Saída do resultado para o usuário
        System.out.println("Os três primeiros múltiplos deste valor são: " + result1 + " , " + result2 + " , " + result3);
    }
}
