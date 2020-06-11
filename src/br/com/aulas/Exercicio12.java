package br.com.aulas;

import java.util.Scanner;
import java.util.Random;

public class Exercicio12 {
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random numRandom = new Random(System.currentTimeMillis());

        int linhaCaminho = 0;
        int colunaCaminho = 0;
        int qtdBombas  = 0;
        int jogarLinha = 0;
        int jogarColuna = 0;
        int posicaoBombaLinha = 0;
        int posicaoBombaColuna = 0;
        int calcLinhaColuna = 0;
        int pontosFimJogo = 0;
        int pontuacaoFinal = 0;

        int [] [] caminho;

        boolean fimJogo = false;

        do {
            System.out.println("Insira a quantidade de linhas do caminho: ");
            linhaCaminho = input.nextInt();
            
            if(linhaCaminho <= 1) {
                System.out.println("O caminho deve ter um número de linhas maior que um.");
            }
        } while(linhaCaminho <= 1);

        do {
            System.out.println("Insira a quantidade de colunas do caminho: ");
            colunaCaminho = input.nextInt();
            
            if(colunaCaminho <= 1) {
                System.out.println("O Caminho deve ter um número de colunas maior que um.");
            }
        } while(colunaCaminho <= 1);

        do {
            System.out.println("Insira a quantidade de bombas: ");
            qtdBombas = input.nextInt();
            
            if(qtdBombas <= 0) {
                System.out.println("A quantidade de bombas deve ser maior que zero.");
            }

            calcLinhaColuna = linhaCaminho * colunaCaminho;

            if(qtdBombas > calcLinhaColuna) {
                System.out.println("A quantidade de bombas não pode ser maior que o tamanho do caminho.");
            }
        } while(qtdBombas <= 0 && qtdBombas < linhaCaminho * colunaCaminho);

        pontosFimJogo = linhaCaminho * colunaCaminho - qtdBombas;

        caminho = new int[linhaCaminho][colunaCaminho];

        for(int i = 0; i < linhaCaminho; i++) {
            for(int j = 0; j < colunaCaminho; j++) {
                caminho[i][j] = 0;
            }
        }

        for(int i = 0; i < qtdBombas; i++) {
            posicaoBombaLinha = numRandom.nextInt(linhaCaminho);   
            posicaoBombaColuna = numRandom.nextInt(colunaCaminho);   

            while(caminho[posicaoBombaLinha][posicaoBombaColuna] == -1) {
                posicaoBombaLinha = numRandom.nextInt(linhaCaminho);
                posicaoBombaColuna = numRandom.nextInt(colunaCaminho);
            }

            caminho[posicaoBombaLinha][posicaoBombaColuna] = -1;
        }

        while(fimJogo == false) {
            for(int i = 0; i < linhaCaminho; i++) {
                for(int j = 0; j < colunaCaminho; j++) {
                    if(caminho[i][j] == 0 || caminho[i][j] == -1) {
                        System.out.print("_ ");
                    } else {
                        if(caminho[i][j] == 1) {
                            System.out.print("X ");
                        }
                    }
                }
                System.out.println("");
            }   

            do {
                System.out.print("Insira uma posição de linha: ");
                jogarLinha = input.nextInt();

                if(jogarLinha > linhaCaminho - 1 || jogarLinha < 0) {
                    System.out.println("Ponto não existente, insira um novo ponto de linha: ");
                }
            } while(jogarLinha > linhaCaminho - 1 || jogarLinha < 0);
            
            do {
                System.out.print("Insira uma posição de coluna: ");
                jogarColuna = input.nextInt();

                if(jogarColuna > colunaCaminho - 1 || jogarColuna < 0) {
                    System.out.println("Ponto não existente, insira um novo ponto de coluna: ");
                }
            } while(jogarColuna > colunaCaminho - 1 || jogarColuna < 0);

            if(caminho[jogarLinha][jogarColuna] == 0) {
                caminho[jogarLinha][jogarColuna] = 1;

                if(jogarLinha == 0) {
                    if(jogarColuna == 0) {
                        if(caminho[jogarLinha + 1][jogarColuna] == -1 || caminho[jogarLinha][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    } else {
                        if(caminho[jogarLinha + 1][jogarColuna] == -1 || caminho[jogarLinha][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1 || caminho[jogarLinha][jogarColuna - 1] == -1 || caminho[jogarLinha - 1][jogarColuna - 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        } 
                    }
                } else if(jogarColuna == 0) {
                    if(jogarLinha == 0) {
                        if(caminho[jogarLinha + 1][jogarColuna] == -1 || caminho[jogarLinha][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    } else {
                        if(caminho[jogarLinha + 1][jogarColuna] == -1 || caminho[jogarLinha][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1 || caminho[jogarLinha][jogarColuna - 1] == -1 || caminho[jogarLinha - 1][jogarColuna - 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        } 
                    }
                } else {
                    if(jogarLinha == linhaCaminho - 1 && jogarColuna == colunaCaminho - 1) {
                        if(caminho[jogarLinha][jogarColuna - 1] == -1 || caminho[jogarLinha - 1][jogarColuna] == -1 || caminho[jogarLinha - 1][jogarColuna - 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    } else {
                        if(caminho[jogarLinha - 1][jogarColuna - 1] == -1 || caminho[jogarLinha - 1][jogarColuna] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1 || caminho[jogarLinha][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna + 1] == -1 || caminho[jogarLinha + 1][jogarColuna] == -1 || caminho[jogarLinha - 1][jogarColuna - 1] == -1 || caminho[jogarLinha][jogarColuna - 1] == -1) {
                            System.out.println("Cuidado!!!! Tem uma bomba próxima.");
                        }
                    }
                }

                pontuacaoFinal++;
            } else {
                if(caminho[jogarLinha][jogarColuna] == -1) {
                    fimJogo = true;
                    System.out.println("Game Over");

                    for(int i = 0; i < linhaCaminho; i++) {
                        for(int j = 0; j < colunaCaminho; j++) {
                            if(caminho[i][j] == 0) {
                                System.out.print("_ ");
                            } else {
                                if(caminho[i][j] == 1) {
                                    System.out.print("X ");
                                } else {
                                    if(caminho[i][j] == -1) {
                                        System.out.print("B ");
                                    }
                                }
                            }
                        }
                        System.out.println("");
                    }
                } else {
                    if(caminho[jogarLinha][jogarColuna] == 1) {
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