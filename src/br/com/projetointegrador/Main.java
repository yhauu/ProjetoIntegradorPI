package br.com.projetointegrador;

import java.util.Scanner;

public class Main {
    //Variável global para uso na classe inteira
    static Scanner input = new Scanner(System.in);

    //Função main que executa o projeto//
    public static void main(String[] args) {
        Logon();
        MenuDemonsMath();
    }


    //Função criada para se efetuar o login no Jogo e obter o nome do jogador
    public static void Logon() {
        String login, senha;
        String senhaC, loginC;

        System.out.println("");
        System.out.println("-------- Bem-vindo ao DemonsMath --------");
        System.out.println("Efetue seu cadastro para adentrar nesta aventura");

        System.out.print("Login: ");
        login = input.nextLine();

        System.out.print("Senha: ");
        senha = input.nextLine();

        //Feedback de cadastro efetuado
        System.out.println("-------- Cadastro efetuado com SUCESSO! --------");

        //Laço de repetição para o usuário efetuar o login com os dados cadastrados logo acima
        do {
            System.out.print("Login: ");
            loginC = input.nextLine();

            System.out.print("Senha: ");
            senhaC = input.nextLine();

            // Caso o login e senha não coincidam com os cadastrados anteriormente
            if(!loginC.equals(login) || !senhaC.equals(senha)) {
                System.err.println("- Login ou Senha incorretos -");
            }
        } while(!loginC.equals(login) || !senhaC.equals(senha));
    }


    //Função que produz o menu principal do Jogo com suas respectivas opções
    public static void MenuDemonsMath() {
        String opcaoUsuario;

        do {
            //Menu principal
            System.out.println("");
            System.out.println("------------ Menu ------------");
            System.out.println("-                            -");
            System.out.println("-          Tutorial          -");
            System.out.println("-           Jogar            -");
            System.out.println("-          Creditos          -");
            System.out.println("-            Sair            -");
            System.out.println("-                            -");
            System.out.println("------------------------------");

            //Função que resolve as possíveis escolhas de opções do menu principal
            opcaoUsuario = ClassesUtil.EscolhaMenu();

            OpcoesMenu(opcaoUsuario);
        } while(!"S".equals(opcaoUsuario));
    }

 
    //Função responsável por chamar as funções com base no que foi selecionado no menu principal.
    public static void OpcoesMenu(String opcaoUsuario) {
        switch(opcaoUsuario) {
            case "T":// Tutorial //
                System.out.println("---------- Tutorial ----------");
                Tutorial();
            break;

            case "J":// Jogar //
                System.out.println("---------- Jogar ----------\n");
                Jogo.DemonsMath();
            break;

            case "C":// Creditos //
                System.out.println("---------- Creditos ----------");
                Creditos();
            break;

            case "S":// Sair //
                System.out.println("\n Até logo aventureiro.\n");
            break;

        }
    }


    //Função que executa o tutorial do Jogo
    public static void Tutorial(){
        System.out.println("");
        System.out.println("              * Olá Aventureiro");
        System.out.println("Para que você não fique perdido no meio da nossa grande batalha\n"
                         + "preparamos um livro de antigo com artes mágicas especiais para você.");

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("1º Ensinamento: Nossos pergaminhos consideram somente a primeira letra das\n"
                         + "mágias ou ações, então  caso você  digite DOZE iremos\n"
                         + "considerar somente o D.");
        System.out.println("--------------------------------------------------------");
        System.out.println("");

        System.out.println("2º Ensinamento: Fique ciente que sempre que aparecer essas redicências ( ... ) ao fim do texto\n"
                         + "significa que esperamos uma resposta no pergaminho, então, aperte ENTER para continuar\n"
                         + "a história...");

        //1º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        ClassesUtil.Proximo();

        System.out.println("-- Já está se acostumando em aventureiro --\n");
        System.out.println("Os desafios serão  questões relacionadas a matéria\n"
                         + "de Matemática onde você terá que escolher\n"
                         + "dentre 5 alternativas sendo de A até E...");

        //2º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        ClassesUtil.Proximo();

        System.out.println("");
        System.out.println("Caso consiga resolver o desafio, irá aparecer\n"
                         + "em suas mentes uma mensagem dizendo: \n"
                         + "- PARABÉNS NOBRE AVENTUREIRO -\n"
                         + " caso o contrário \n"
                         + "- O AVENTUREIRO FALHOU - \n"
                         + "Além da explicação para se passar por tal desafio \n"
                         + "independente de êxito ou falha do aventureiro...");

        //3º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        ClassesUtil.Proximo();

        System.out.println("");
        System.out.println("Seu êxito ou falha nos desafios irá mudar\n"
                         + "o curso da história tanto para o indo para\n"
                         + "um final BOM ou RUIM...");

        //4º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        ClassesUtil.Proximo();

        System.out.println("");
        System.out.println("Agora, meu caro aventureiro, o senhor está pronto para \n"
                         + "as batalhas que virão,\n"
                         + "vamos acabar com esse terrível demônio matemático! \n"
                         + "---- PRESSIONE ENTER PARA VOLTAR AO MENU ----");
        ClassesUtil.Proximo();
    }


    //Função que executa os creditos do Jogo
    public static void Creditos(){
        System.out.println("      - Direção de Audio -");
        System.out.println("SEM ORÇAMENTO!");
        System.out.println("");

        System.out.println("         - História -");
        System.out.println("João");
        System.out.println("");

        System.out.println("         - Desafios -");
        System.out.println("Fabricio");
        System.out.println("Gabriela");
        System.out.println("");

        System.out.println("        - Programação -");
        System.out.println("Fabricio");
        System.out.println("Gabriela");
        ClassesUtil.Proximo();
    }
}