package br.com.aulas;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Declaração da variável responsável por capturar o valor inserido pelo usuário
        Scanner input = new Scanner(System.in);

        //Recebendo o nome do usuário e armazenando em uma variável
        System.out.println("Insira o seu primeiro nome: ");
        String nameUser = input.next();

        //Saída do resultado para o usuário
        System.out.println("O número de caracteres que tem o seu primeiro nome é: " + nameUser.length());
    }
}
