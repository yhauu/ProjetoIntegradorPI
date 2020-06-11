package br.com.aulas;

import java.util.Scanner;
import java.util.Random;

public class Exercicio11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random numRandom = new Random(System.currentTimeMillis());

        int QtdBombas = 0;
        int JogadasUsuario = 0;
        int pontuacaoFinal = 0;
        int caminhoTamanho = 0;
        int posicaoBomba = 0;
        int pontosFimJogo = 0;

        int caminho[];

        boolean fimJogo = false;

        do {
            System.out.println("Insira o tamanho do caminho: ");
            caminhoTamanho = input.nextInt();
            
            if(caminhoTamanho <= 1) {
                System.out.println("O tamanho do caminho deve ter ser maior que um.");
            }
        } while(caminhoTamanho <= 1);

        do {
            System.out.println("Insira a quantidade de bombas: ");
            QtdBombas = input.nextInt();
            
            if(QtdBombas <= 0) {
                System.out.println("A quantidade de bombas deve ser maior que zero.");
            }
            
            if(QtdBombas > caminhoTamanho) {
                System.out.println("A quantidade de bombas não pode ser maior que o tamanho do caminho.");
            }
        } while(QtdBombas <= 0 && QtdBombas < caminhoTamanho);

        pontosFimJogo = caminhoTamanho - QtdBombas;
        caminho = new int[caminhoTamanho];

        for(int i = 0; i < caminho.length; i++) {
            caminho[i] = 0;
        }

        for(int i = 0; i < QtdBombas; i++) {
            posicaoBomba = numRandom.nextInt(caminhoTamanho);   

            while(caminho[posicaoBomba] == -1) {
                posicaoBomba = numRandom.nextInt(caminhoTamanho);
            }

            caminho[posicaoBomba] = -1;
        }

        while(fimJogo == false) {
            for(int i = 0; i < caminho.length; i++) {
                if(caminho[i] == 0 || caminho[i] == -1) {
                    System.out.print("_ ");
                } else {
                    if(caminho[i] == 1) {
                        System.out.print("X ");
                    }
                }
            }   

            System.out.print("Insira uma posição: ");
            JogadasUsuario = input.nextInt();

            if(caminho[JogadasUsuario] == 0) {
                caminho[JogadasUsuario] = 1;

                if(JogadasUsuario == 0) {
                    if(caminho[JogadasUsuario + 1] == -1) {
                        System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                    }
                } else {
                    if(JogadasUsuario == caminhoTamanho - 1) {
                        if(caminho[JogadasUsuario - 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    } else {
                        if(caminho[JogadasUsuario - 1] == -1 || caminho[JogadasUsuario + 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    }
                }

                pontuacaoFinal++;
            } else {
                if(caminho[JogadasUsuario] == -1) {
                    fimJogo = true;
                    System.out.println("Game Over");

                    for(int i = 0; i < caminho.length; i++) {
                        if(caminho[i] == 0) {
                            System.out.print("_ ");
                        } else {
                            if(caminho[i] == 1) {
                                System.out.print("X ");
                            } else {
                                if(caminho[i] == -1) {
                                    System.out.print("B ");
                                }
                            }
                        }
                    }
                } else {
                    if(caminho[JogadasUsuario] == 1) {
                        System.out.println("Essa posição já foi escolhida.");
                    }
                }
            }

            if(pontuacaoFinal == pontosFimJogo) {
                fimJogo = true;
                System.out.println("Parabéns jogador, você completou o jogo!");
            }
        }

        System.out.println("Sua Pontuação final é: " + pontuacaoFinal);
    }
}