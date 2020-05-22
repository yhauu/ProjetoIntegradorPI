package br.com.projetointegrador;

import java.util.Scanner;

public class ClassesUtil {
    static Scanner input = new Scanner(System.in);

    // Cores para o terminal
    static final String fim = "\u001B[0m";
    static final String black = "\u001B[30m";
    static final String red = "\u001B[31m";
    static final String green = "\u001B[32m";
    static final String yellow = "\u001B[33m";
    static final String blue = "\u001B[34m";
    static final String purple = "\u001B[35m";
    static final String cyan = "\u001B[36m";
    static final String whyte = "\u001B[37m";


    //Função para a escolha de opções no menu principal
    public static String EscolhaMenu() {
        String opcaoUsuario;

        do {
            System.out.print("Insira a inicial da opção desejada: ");
            opcaoUsuario = input.next();

            switch(opcaoUsuario){
                case "j":
                case "J":
                    opcaoUsuario = "J"; // Jogar
                break;

                case "t":
                case "T":
                    opcaoUsuario = "T"; // Tutorial
                break;

                case "s":
                case "S":
                    opcaoUsuario = "S"; // Sair
                break;

                case "c":
                case "C":
                    opcaoUsuario = "C"; // Creditos
                break;

                default:
                    System.err.println("OPÇÃO INVÁLIDA !!!");
                    opcaoUsuario = "n";
            }
        } while("n".equals(opcaoUsuario));

        System.out.println("");

        return opcaoUsuario;
    }


    //---------------------------------Desafios-------------------------------------
    //Função para a escolha de opções dos conflitos/desafios
    static String DesafioEscolha() {
        String opcaoUsuario;

        do {
            System.out.print("Insira a opção desejada: ");
            opcaoUsuario = input.nextLine();

            //Laço de repetição para caso usuário selecione uma opção inválida
            switch(opcaoUsuario){
                case "a":
                case "A":
                    opcaoUsuario = "a";
                break;

                case "b":
                case "B":
                    opcaoUsuario = "b";
                break;

                case "c":
                case "C":
                    opcaoUsuario = "c";
                break;

                case "d":
                case "D":
                    opcaoUsuario = "d";
                break;

                case "e":
                case "E":
                    opcaoUsuario = "e";
                break;

                default:
                    System.err.println("OPÇÃO INVÁLIDA !!!");
                    opcaoUsuario = "n";
            }
        } while(opcaoUsuario.equals("n"));

        System.out.println("");

        return opcaoUsuario;
    }


    //Função feita para pausa de diálogos e espera de resposta do jogador
    public static void Proximo() {
        String next;
        next = input.nextLine();
        if(next.equals("")) {  }
    }


    //Função para o jogador dar certeza da opção de resposta escolhida
    public static String ConfirmarEscolha(int tipoConfirmar) {
        String opcaoUsuario;

        do {
            //Verificação para saber qual tipo de confirmar é, sendo 1 para PERGUNTAS e 2 para NOME DE AVENTUREIRO
            if (tipoConfirmar == 1) {
                System.out.print("Tem certeza ? (s/n): ");
                opcaoUsuario = input.nextLine();
            } else {
                input.nextLine();
                System.out.print("Tem certeza que esse é seu nome, nobre aventureiro ? (s/n): ");
                opcaoUsuario = input.nextLine();
            }

            // Verificação para que não aceite uma opção fora do desejado
            switch(opcaoUsuario){
                case "s":
                case "S":
                    opcaoUsuario = "S";
                    break;
                case "n":
                case "N":
                    break;
                default:
                    System.err.println("- Opção inválida -");
                    opcaoUsuario = "x";
            }
        } while("x".equals(opcaoUsuario));

        return opcaoUsuario;
    }


                            // A B C D E //
    //Funções de validação de testes
    public static boolean respA(String respUsuario){ // Caso a resposta seja A
        boolean resp;
        resp = (respUsuario.equals("a") || respUsuario.equals("A"));
        return resp;
    }

    public static boolean respB(String respUsuario) { // Caso a resposta seja B
        boolean resp;
        resp = (respUsuario.equals("b") || respUsuario.equals("B"));
        return resp;
    }

    public static boolean respC(String respUsuario) { // Caso a resposta seja C
        boolean resp;
        resp = (respUsuario.equals("c") || respUsuario.equals("C"));
        return resp;
    }

    public static boolean respD(String respUsuario) { // Caso a resposta seja D
        boolean resp;
        resp = (respUsuario.equals("d") || respUsuario.equals("D"));
        return resp;
    }

    public static boolean respE(String respUsuario) { // Caso a resposta seja E
        boolean resp;
        resp = (respUsuario.equals("e") || respUsuario.equals("E"));
        return resp;
    }


    //Funções usadas para mandar o feedback das questões
    public static void Feedback1(int menor , int maior){
        System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
        System.out.println("Para obter o resultado basta : \n"
                         + "\n"
                         + ""+maior+" metros  -  "+menor+" metros  = "+ClassesUtil.purple+""+(maior-menor)+" metros"+ClassesUtil.fim);
        System.out.println("--------------------------------------------------");
    }

    public static void Feedback3(int valor1, int valor2){
        System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Para obter o resultado basta : \n"
                         + "\n"
                         + "Elevar o valor "+valor1+" (quantidade de lanças) por "+valor2+" (pontos de mana)  = "+ClassesUtil.purple+""+(Math.pow(valor1,valor2))+" pontos de mana necessários"+ClassesUtil.fim);
        System.out.println("--------------------------------------------------");
    }


    public static void Feedback4(int valor){
        String numBinario = "";
        while(valor > 0){
            if(valor%2==0){
                numBinario = "0" + numBinario;
            } else { 
                numBinario = "1" + numBinario;
            }

            valor /= 2;
	}

        System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Para obter o resultado basta : \n"
                           +"Dividir o número"+valor+" por 2 e ir dividindo os resultados até chegar a 0 ou 1. Em seguida \n"
                           + "pegue os restos das divisões do último para o primeiro. O resultado será :"+ClassesUtil.purple+""+numBinario+""+ClassesUtil.fim+". \n"
                           + "Caso ainda não tenha ficado claro, aqui vai um exemplo com o número 10 em decimal e convertemos para binário: \n"
                           + "10 / 2 = 5 e o resto é 0 \n"
                           + "5 / 2 = 2 e o resto é 1 \n"
                           + "2 / 2 = 1 \n"
                           + "Resultando assim em: "+ClassesUtil.yellow+" 110"+ClassesUtil.fim+" em binário.");
        System.out.println("--------------------------------------------------");
    }


    public static void Feedback5(int indice){
        switch(indice){
            case 1 :
                System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "5x – 3x = 30 \n"
                                   + "2x = 30 \n"
                                   + "x = 30/2 \n"
                                   + "x = 15");
                System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
            break;

            case 2 :
                System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "4x + 10 = 45 – 3x \n"
                                   + "4x + 3x = 45 – 10 \n"
                                   + "7x = 35 \n"
                                   + "x = 35/7 \n"
                                   + "x = 5");
                System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
            break;

            case 3 :
                System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "2x + 4 = 2 – 3x \n"
                                   + "2x + 3x = 2 – 4 \n"
                                   + "5x = -2 \n"
                                   + "x = -2/5");
                System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
            break;

            case 4 :
                System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "5.(9 + x) = 20 – 3 + 6x \n"
                                   + "45 + 5x = 17 + 6x \n"
                                   + "45 – 17 = 6x – 5x \n"
                                   + "28 = x \n"
                                   + "x = 28");
                System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
            break;

            case 5 :
                System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "2x/(4 – 3x) = 2 \n"
                                   + "2x = 2(4 – 3x) \n"
                                   + "2x = 8 – 6x \n"
                                   + "8x = 8 \n"
                                   + "x = 8/8 \n"
                                   + "x = 1");
                System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
            break;
        }
    }


    public static void Feedback5_2(){
        System.out.println("------------- "+ClassesUtil.purple+"Como chegar á resposta"+ClassesUtil.fim+" -------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Para obter o resultado basta : \n"
                           + "De acordo com o enunciado da questão, 50 magos já haviam colaborado com sua parte de mana total, \n"
                           + "por isso não consideraremos o valor total para eles, apenas o valor de 7 pontos a mais, que deverá \n"
                           + "ser multiplicado por 50 magos. Além deles, outros cinco juntaram-se ao grupo e precisam colaborar \n"
                           + "uma quantidade de pontos de mana que não conhecemos e, portanto, podemos identificar como x. \n"
                           + "Somando-se o valor que esses magos colaborarão aos pontos acrescentados ao restante do grupo, \n"
                           + "teremos um recolhimento dos 510 pontos de mana faltantes. Podemos então montar uma equação do 1° grau: \n"
                           + "(50 * 7) + (5 * x) = 510 \n"
                           + "350 + 5x = 510 \n"
                           + "5x = 510 – 350 \n"
                           + "5x = 160 \n"
                           + ClassesUtil.cyan+"x = 32"+ClassesUtil.fim);
        System.out.println(ClassesUtil.fim+"\n--------------------------------------------------");
    }
}