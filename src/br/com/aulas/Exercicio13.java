package br.com.aulas;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char jogadaUsuario;

        int tabuleiro[][] = {{8, 0, 6}, {5, 4, 7}, {2, 3, 1}};

        geraTabuleiro(tabuleiro);

        while(verificaOrdemabuleiro(tabuleiro) == false) {
            do {
                System.out.print("Insira o seu movimento: ");
                jogadaUsuario = input.nextLine().charAt(0);
                jogadaUsuario = Character.toLowerCase(jogadaUsuario);

                if(jogadaUsuario != 'w' && jogadaUsuario != 'a' && jogadaUsuario != 's' && jogadaUsuario != 'd') {
                    System.out.println("\nMovimento inválido!");
                    System.out.println("W para movimentar para cima");
                    System.out.println("S para movimentar para baixo");
                    System.out.println("A para movimentar para esquerda");
                    System.out.println("D para movimentar para direita\n");
                }
            } while(jogadaUsuario != 's' && jogadaUsuario != 'a' && jogadaUsuario != 's' && jogadaUsuario != 'd');

            tabuleiro = jogadaUsuario(tabuleiro, jogadaUsuario);

            geraTabuleiro(tabuleiro);
        }
        System.out.println("Parabéns jogador, você completou o jogo!");
    }

    public static void geraTabuleiro(int tabuleiro[][]) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(tabuleiro[i][j] == 0) {
                    System.out.print("' '");
                } else {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static int[][] jogadaUsuario(int tabuleiro[][], char jogadaUsuario) {
        int testLinha = 0, testColuna = 0, testCasaTab = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(tabuleiro[i][j] == 0) {
                    testLinha = i;
                    testColuna = j;
                }
            }
        }

        if(testLinha == 0 && jogadaUsuario == 'W') {
            System.out.println("\nJogada inválida.\n");
        } else if(testLinha == 2 && jogadaUsuario == 'S') {
            System.out.println("\nJogada inválida.\n");
        } else if(testLinha == 0 && jogadaUsuario == 'A') {
            System.out.println("\nJogada inválida.\n");
        } else if(testLinha == 2 && jogadaUsuario == 'D') {
            System.out.println("\nJogada inválida.\n");
        } else {
            switch (jogadaUsuario) {
                case 'W':
                    testCasaTab = tabuleiro[testLinha][testColuna];
                    tabuleiro[testLinha][testColuna] = tabuleiro[testLinha - 1][testColuna];
                    tabuleiro[testLinha - 1][testColuna] = testCasaTab;
                    break;
                case 'S':
                    testCasaTab = tabuleiro[testLinha][testColuna];
                    tabuleiro[testLinha][testColuna] = tabuleiro[testLinha + 1][testColuna];
                    tabuleiro[testLinha + 1][testColuna] = testCasaTab;
                    break;
                case 'A':
                    testCasaTab = tabuleiro[testLinha][testColuna];
                    tabuleiro[testLinha][testColuna] = tabuleiro[testLinha][testColuna - 1];
                    tabuleiro[testLinha][testColuna - 1] = testCasaTab;
                    break;
                case 'D':
                    testCasaTab = tabuleiro[testLinha][testColuna];
                    tabuleiro[testLinha][testColuna] = tabuleiro[testLinha][testColuna + 1];
                    tabuleiro[testLinha][testColuna + 1] = testCasaTab;
                    break;
                default:
                    break;
            }
        }

        return tabuleiro;
    }

    public static boolean verificaOrdemabuleiro(int[][] tabuleiro) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                if(tabuleiro[i][j] > tabuleiro[i][j+1]) {
                    return false;
                }
            }
        }

        return true;
    }
}