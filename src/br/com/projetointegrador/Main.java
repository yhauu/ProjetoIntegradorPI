package br.com.projetointegrador;

import java.util.Scanner;
import java.util.Random;

public class Main {
    //Variável global para uso na classe inteira
    static Scanner input = new Scanner(System.in);
    static Random randow = new Random();

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
            opcaoUsuario = EscolhaMenu();

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
                DemonsMath();
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
        Proximo();

        System.out.println("-- Já está se acostumando em aventureiro --\n");
        System.out.println("Os desafios serão  questões relacionadas a matéria\n"
                         + "de Matemática onde você terá que escolher\n"
                         + "dentre 5 alternativas sendo de A até E...");

        //2º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        Proximo();

        System.out.println("");
        System.out.println("Caso consiga resolver o desafio, irá aparecer\n"
                         + "em suas mentes uma mensagem dizendo: \n"
                         + "- PARABÉNS NOBRE AVENTUREIRO -\n"
                         + " caso o contrário \n"
                         + "- O AVENTUREIRO FALHOU - \n"
                         + "Além da explicação para se passar por tal desafio \n"
                         + "independente de êxito ou falha do aventureiro...");

        //3º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        Proximo();

        System.out.println("");
        System.out.println("Seu êxito ou falha nos desafios irá mudar\n"
                         + "o curso da história tanto para o indo para\n"
                         + "um final BOM ou RUIM...");

        //4º Momento para o jogador já ir se acostumando com tal mecânica de Jogo
        Proximo();

        System.out.println("");
        System.out.println("Agora, meu caro aventureiro, o senhor está pronto para \n"
                         + "as batalhas que virão,\n"
                         + "vamos acabar com esse terrível demônio matemático! \n"
                         + "---- PRESSIONE ENTER PARA VOLTAR AO MENU ----");
        Proximo();
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
        Proximo();
    }

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
        System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
        System.out.println("Para obter o resultado basta : \n"
                         + "\n"
                         + ""+maior+" metros  -  "+menor+" metros  = "+purple+""+(maior-menor)+" metros"+fim);
        System.out.println("--------------------------------------------------");
    }

    public static void Feedback3(int valor1, int valor2){
        System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Para obter o resultado basta : \n"
                         + "\n"
                         + "Elevar o valor "+valor1+" (quantidade de lanças) por "+valor2+" (pontos de mana)  = "+purple+""+(Math.pow(valor1,valor2))+" pontos de mana necessários"+fim);
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

        System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Para obter o resultado basta : \n"
                           +"Dividir o número"+valor+" por 2 e ir dividindo os resultados até chegar a 0 ou 1. Em seguida \n"
                           + "pegue os restos das divisões do último para o primeiro. O resultado será :"+purple+""+numBinario+""+fim+". \n"
                           + "Caso ainda não tenha ficado claro, aqui vai um exemplo com o número 10 em decimal e convertemos para binário: \n"
                           + "10 / 2 = 5 e o resto é 0 \n"
                           + "5 / 2 = 2 e o resto é 1 \n"
                           + "2 / 2 = 1 \n"
                           + "Resultando assim em: "+yellow+" 110"+fim+" em binário.");
        System.out.println("--------------------------------------------------");
    }


    public static void Feedback5(int indice){
        switch(indice){
            case 1 :
                System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "5x – 3x = 30 \n"
                                   + "2x = 30 \n"
                                   + "x = 30/2 \n"
                                   + "x = 15");
                System.out.println(fim+"\n--------------------------------------------------");
            break;

            case 2 :
                System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "4x + 10 = 45 – 3x \n"
                                   + "4x + 3x = 45 – 10 \n"
                                   + "7x = 35 \n"
                                   + "x = 35/7 \n"
                                   + "x = 5");
                System.out.println(fim+"\n--------------------------------------------------");
            break;

            case 3 :
                System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "2x + 4 = 2 – 3x \n"
                                   + "2x + 3x = 2 – 4 \n"
                                   + "5x = -2 \n"
                                   + "x = -2/5");
                System.out.println(fim+"\n--------------------------------------------------");
            break;

            case 4 :
                System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "5.(9 + x) = 20 – 3 + 6x \n"
                                   + "45 + 5x = 17 + 6x \n"
                                   + "45 – 17 = 6x – 5x \n"
                                   + "28 = x \n"
                                   + "x = 28");
                System.out.println(fim+"\n--------------------------------------------------");
            break;

            case 5 :
                System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
                System.out.println("--------------------------------------------------");
                System.out.println("Para obter o resultado basta : \n"
                                   + "2x/(4 – 3x) = 2 \n"
                                   + "2x = 2(4 – 3x) \n"
                                   + "2x = 8 – 6x \n"
                                   + "8x = 8 \n"
                                   + "x = 8/8 \n"
                                   + "x = 1");
                System.out.println(fim+"\n--------------------------------------------------");
            break;
        }
    }


    public static void Feedback5_2(){
        System.out.println("------------- "+purple+"Como chegar á resposta"+fim+" -------------");
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
                           + cyan+"x = 32"+fim);
        System.out.println(fim+"\n--------------------------------------------------");
    }

    public static void DemonsMath(){
        boolean key[] = new boolean [5];
        boolean fase[] = new boolean [5];
        String nome, classe, magiaClasse;

        // Parte 1 da historia
        nome = Introducao(); //Introdução do jogo e definição do nome do jogador
        classe = Classes(); //Classes que o aventureiro pode escolher
        magiaClasse = MagiaClasse(classe); //Nome da magia que será colocada no desafio

        // Parte 2 da historia
        key[0] = Desafio01(nome, classe, magiaClasse); // Desafio 1
        key[1] = Desafio02(nome, classe); // Desafio 1.2

        //1º possível Game Over
        //Para que o jogador avance na historia, terá que passar no desafio 2
        if(!key[1]) {
            System.out.println("Ao tentar curar seu irmão, acabou piorando seu braço a ponto de amputá-lo.\n"
                               + "Com seu irmão sem um braço e,o seu estado de choque por ter feito isso, \n"
                               + "vocês não notaram a segunda horda de demônios e foram massacrados pelo inimigo.");

            System.out.println(red+"GAME OVER"+fim);
        } else {
            fase[0] = true;
        }

        if (fase[0]) {

            key[2] = Desafio03(nome, classe); //Desafio 3

            // Caso o jogador erre o desafio 3 também é Game Over
            if (!key[2]) {
                System.out.println("Com o fracasso ao conjurar a magia você e seu irmão são atravessados pelas lanças e morrem.\n");
                System.out.println(red+"GAME OVER"+fim);
            } else {
                key[3] = Desafio04(nome, classe, magiaClasse);

                //Verificação para mandar o jogador para diferentes finais
                if (key[3]) {
                    key[4] = Desafio05(nome, classe);
                } else {
                    key[4] = Desafio05_2(nome, classe);
                }

                //Verificação caso o jogador tenha acertado o desafio 5 ou não
                if (key[4]) {
                    System.out.println("AVENTUREIRO "+nome+""+green+" PARABÉNS POR CONCLUIR O JOGO "+fim+" !!!...");
                    Proximo();
                } else {
                    System.out.println(red+"GAME OVER"+fim);
                    Proximo();
                }
            }
        }
    }


    //Função que introduz o jogador a 1º parte da historia, atribuindo nome do personagem e classe
    public static String Introducao() {
        String nome, confirmar;

        //Laço de repetição para a escolha de nome para o personagem
        do {
            System.out.print("Insira seu nome nobre aventureiro: ");
            nome = input.next();
            
            confirmar = ConfirmarEscolha(2);
        } while(!confirmar.equals("S"));

        System.out.println("                      ____________ ");
        System.out.println("                     | INTRODUÇÃO |");
        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Os irmãos, "+nome+" e Fernando, estavam em casa numa sexta a noite, \n"
                           + "fazendo o que mais gostavam de fazer que era jogar video-game.\n"
                           + "Após Fernando receber uma mensagem no celular, com o link de algum site, \n"
                           + "um tanto estraho e na mensagem o amigo que lhe enviou a mensagem disse junto:... ");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Cuidado mano, esse PDF ai é de um livro muito antigo, e tem ums rituais meio esquisitos. \n"
                           + " Mas te enviei porque sei que tu gosta desse tipo de coisa hehe ...");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("- O Takeo mandou o PDF que eu tinha comentado com voce "+nome+"! ...");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Quando seu irmão menciona sobre o tal PDF , um frio corre pela sua espinha \n"
                         + "pois não se tratava de mais uma estória ou mito sobre algum fato sobrenatural normal e popular\n"
                         + "e sim de um fato pouco discutido e que muitas pessoas nem mesmo o conheciam.\n"
                         + "Era sobre o demônio Beleth, que na lenda, teria ajudado um dos filhos de Noé a \n"
                         + "escrever um dos primeiros livros de mátematica...");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Fernando abriu o pdf, e começou a ler as letras em vermelho que estavam logo na \n"
                           + "primeira página: \n"
                           + "- Beleth Domine, Domine calculations est, hic est Magisto vocare te venerunt.\n" 
                           + "Quae praecepero illi facere visibilia! ....");

        Proximo();

        System.out.println("....................");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Vocês pararam por alguns segundos olhando aquelas palavras estranhas \n"
                           + "como se esperassem que algo fosse acontecer \n"
                           + "Você diz com um tom de medo e alivio: \n"
                           + "- Cadê ? Não aconteceu nada mesmo ?\n"
                           + "Fernando responde com um certo tom de deboche: \n"
                           + "- Meu latim está enferrujado, deve ser isso né.");

        Proximo();

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println("Vocês riem mas logo em seguida são atingidos por um sono \n"
                           + "pesadíssimo, se sentem como se estivessem acordados a 72 horas direto. \n"
                           + "É quando sua visão já turva se torna um breu.");

        Proximo();

        System.out.println("                         ,-.\n" +
                           "       ___,---.__          /'|`\\          __,---,___\n" +
                           "    ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.\n" +
                           "  ,'        |           ~'\\     /`~           |        `.\n" +
                           " /      ___//              `. ,'          ,  , \\___      \\\n" +
                           "|    ,-'   `-.__   _         |        ,    __,-'   `-.    |\n" +
                           "|   /          /\\_  `   .    |    ,      _/\\          \\   |\n" +
                           "\\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /\n" +
                           " \\  \\           | `._   `\\\\  |  //'   _,' |           /  /\n" +
                           "  `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'\n" +
                           "     ``       /     \\    ,='/ \\`=.    /     \\       ''\n" +
                           "             |__   /|\\_,--.,-.--,--._/|\\   __|\n" +
                           "             /  `./  \\\\`\\ |  |  | /,//' \\,'  \\\n" +
                           "            /   /     ||--+--|--+-/-|     \\   \\\n" +
                           "           |   |     /'\\_\\_\\ | /_/_/`\\     |   |\n" +
                           "            \\   \\__, \\_     `~'     _/ .__/   /\n" +
                           "             `-._,-'   `-._______,-'   `-._,-'");

        System.out.println(red+"---------------------------------------------------------------"+fim);
        System.out.println(yellow+"|"+fim+"BEM-VINDOS AO MEU MUNDO                 "+yellow+"|"+fim);
        System.out.println(red+"---------------------------------------------------------------"+fim);
        Proximo();

        return nome;
    }

    //Função para atribuir a classe do aventureiro
    public static String Classes(){
        String classe, confirmar, opcaoUsuario;

        do{
            System.out.println(red+"---------------------------------------------------------------"+fim);
            System.out.println("- O que aconteceu ? \n"
                               + "Vocês estão no meu mundo agora, e para voltar \n"
                               + "Terão que passar por todos os meus desafios de matemática usando \n"
                               + "a magia de gelo ou de fogo que vos darei agora.");

            System.out.println("_______________________________________________________________");
            System.out.println(purple+"Classes"+fim);
            System.out.println("");
            System.out.println(" (1) - Pyromancer (Fogo) -");
            System.out.println(" (2) - Cryomancer (Gelo)-");
            System.out.println("");

            // Laço para o jogador escolher uma classes válida
            do {
                input.nextLine();
                System.out.print("Escolha uma classe: ");
                opcaoUsuario = input.nextLine();

                //Caso o que for inserio é diferente de 1 ou 2 escreve a mensagem de erro
                if(!opcaoUsuario.equals("1") && !opcaoUsuario.equals("2")){
                    System.err.println("( Essa classe não exixte! )");
                }
            } while(!opcaoUsuario.equals("1") && !opcaoUsuario.equals("2"));

            classe = InfoClasses(opcaoUsuario); // Mostra as especificações da classe escolhida.
            System.out.println("");
            confirmar = ConfirmarEscolha(1);
        } while(!confirmar.equals("S"));  

        return classe;
    }


    //Informações da classe escolha.
    public static String InfoClasses(String classeUsuario){        
        String classe = "";

        // Aqui atribuimos o nome da classe em uma variavel.
        switch(classeUsuario){
            case "1":
                classe = "Pyromancer";
            break;

            case "2":
                classe = "Cryomancer";
            break;

            default:
                System.err.println("ERROR 404");
        }

        switch (classeUsuario) {
            case "1":
                System.out.println("              ( \n" +
                                   "             ) \n" +
                                   "            (  ( \n" +
                                   "                )  \n" +
                                   "          (    (   \n" +
                                   "           ) /\\ \n" +
                                   "         (  // |\n" +
                                   "       _ -.;_/ \\\\--._  \n" +
                                   "      (_;-// | \\ \\-'.\\ \n" +
                                   "      ( `.__ _  ___,')  \n" +
                                   "       `'(_ )_)(_)_)'");
            break;

            case "2":
                System.out.println("                ()\n" +
                                   "                /\\\n" +
                                   "               //\\\\\n" +
                                   "              <<  >>\n" +
                                   "          ()   \\\\//   ()\n" +
                                   "()._____   /\\   \\\\   /\\   _____.()\n" +
                                   "   \\.--.\\ //\\\\ //\\\\ //\\\\ /.--./\n" +
                                   "    \\\\__\\\\/__\\//__\\//__\\\\/__//\n" +
                                   "     '--/\\\\--//\\--//\\--/\\\\--'\n" +
                                   "        \\\\\\\\///\\\\//\\\\\\////\n" +
                                   "    ()-= >>\\\\< <\\\\> >\\\\<< =-()\n" +
                                   "        ////\\\\\\//\\\\///\\\\\\\\\n" +
                                   "     .--\\\\/--\\//--\\//--\\//--.\n" +
                                   "    //\"\"/\\\\\"\"//\\\"\"//\\\"\"//\\\"\"\\\\\n" +
                                   "   /'--'/ \\\\// \\\\// \\\\// \\'--'\\\n" +
                                   " ()`\"\"\"`   \\/   //   \\/   `\"\"\"\"`()\n" +
                                   "          ()   //\\\\   ()\n" +
                                   "              <<  >>\n" +
                                   "               \\\\//\n" +
                                   "                \\/\n" +
                                   "                ()");
            break;
        }

        //Estrutura switch para exibir o comentario da classe escolhida pelo aventureiro
        switch(classeUsuario){
            case "1":
                System.out.println("- "+purple+"Pyromancer"+fim+" -");
                System.out.println("Com o pyromancer, sua força destrutiva com bolas de fogo \n"
                                 + "faz com que até mesmo os demônios queimem");
            break;

            case "2":
                System.out.println("- "+purple+"Cryomancer"+fim+" -");
                System.out.println("Diferente do pyromancer que utiliza de uma força barulhenta \n"
                                 + "o Cryomancer é um mago silencioso que congela seus inimigos \n"
                                 + "com suas estacas de gelo que causam um enorme dano em área");
            break;
        }

        return classe;
    }

    //Função para definir o ataque mágico dependendo da classe escolhida pelo aventureiro
    public static String MagiaClasse(String classeUsuario) {
        String magiaClasse = "";

        if (classeUsuario.equals("Pyromancer")) {
            magiaClasse = "Bola de fogo";
        } else {
            magiaClasse = "Tempestade de gelo";
        }

        return magiaClasse;
    }


    //2º parte da historia, os primeiros desafios são mostrados
    public static boolean Desafio01(String nome, String classe, String magiaClasse){
        String opcaoUsuario;
        boolean resposta = false;
        int var1 = 0, var2 = 0;
        int questao;

        questao = randow.nextInt(5);
        questao++;

        switch(questao){
            case 1 :
                var1 = 125000;
                var2 = 216000;
            break;

            case 2 :
                var1 = 178900;
                var2 = 294000;
            break;

            case 3 :
                var1 = 190000;
                var2 = 301000;
            break;

            case 4 :
                var1 = 113640;
                var2 = 246130;
            break;

            case 5 :
                var1 = 179900;
                var2 = 294000;
            break;
        }

        //Introdução á sua primeira batalha
        System.out.println("");
        System.out.println("---"+red+"Onda 1"+fim+"---\n"
                           + "Antes que conseguisse recobrar a consciência vi uma horda de demônios em\n"
                           + "minha direção, olho para o horizonte e vejo naquele bioma rochoso e seco \n"
                           + "meu irmão sendo cercado por uma horda ainda maior.");

        Proximo();

        System.out.println("");
        System.out.println("Penso logo em ajudá-lo mas primeiro preciso acabar com os 20 demônios arqueiros que estavam \n"
                           + "mirando em mim. Para derrotá-los precisarei conjurar uma "+magiaClasse+", porém \n"
                           + "minha magia possui alcance limitado. Sabendo que minha magia cobre \n"
                           + blue+""+var1+" metros"+fim+" de distância e seu herói \n"
                           + " se encontra a "+blue+""+var2+" metros"+fim+" \n"
                           + "de distância dos demônios, quantos metros "+nome+" terá que andar\n"
                           + "para conseguir aniquilar seus inimigos e ir salvar seu irmão ?");

        System.out.println("(A)"+purple+" 115100"+fim+"metros."); // Resposta para o SWITCH CASE 2
        System.out.println("(B)"+purple+" 114100"+fim+"metros."); // Resposta para o SWITCH CASE 5
        System.out.println("(C)"+purple+" 111000"+fim+"metros."); // Resposta para o SWITCH CASE 3
        System.out.println("(D)"+purple+" 91000"+fim+"metros.");  // Resposta para o SWITCH CASE 1
        System.out.println("(E)"+purple+" 132490"+fim+"metros."); // Resposta para o SWITCH CASE 4
 
        opcaoUsuario = DesafioEscolha();//Chamando a função que lista as alternativas

        switch(questao){
            case 1 :
                resposta = respD(opcaoUsuario);
            break;

            case 2 :
                resposta = respA(opcaoUsuario);
            break;

            case 3 :
                resposta = respC(opcaoUsuario);
            break;

            case 4 :
                resposta = respE(opcaoUsuario);
            break;

            case 5 :
                resposta = respB(opcaoUsuario);
            break;
        }

        //Mensagem para caso o usuário tenha errado ou acertado a questão.
        if (resposta) {
            Feedback1(var1, var2);
            System.out.println(green+"- Bem na mira! Você atingiu os demônios arqueiros de forma que nenhum ficaste vivo! "+fim);
        } else {
            Feedback1(var1, var2);
            System.out.println(red+"- Aaaa não ! Você não conseguiu calcular direito a distância e errou a magia!"+fim);
        }

        System.out.println("");

        Proximo();
        return resposta;
    }


    //DESAFIO 2 
    public static boolean Desafio02(String nome, String classe){
        String opcaoUsuario[] = new String[3];
        String desafio[];
        boolean resposta = false;
        int questao;

        questao = randow.nextInt(5);
        questao++;

        desafio = CircuitoMagico(questao);

        System.out.println("");
        System.out.println("Após o ataque dos arqueiros, você consegui correr e chegar perto do seu irmão \n"
                           + "que foi ferido por um demônio lanceiro em seu braço direito."
                           + "Você em sua última batalha aprendeu a conjurar magias simples e uma \n"
                           + "magia de cura é necessário ligar os circuitos mágicos de forma correta para poder curar o indivíduo, \n"
                           + "sendo esses circuitos mágicos compostos por " +yellow+"negativo"+fim+"( - ) e "+yellow+"positivo"+fim+"( + ). \n"
                           + "Seguindo a "+ purple+"regra de sinais da matemática"+fim+" resolva os circuitos mágicos abaixo: ");

        do {
            System.out.print("- Entrada 1 = "+desafio[0]+" --> "); // Pergunta 1 
            opcaoUsuario[0] = input.nextLine();

            if(!opcaoUsuario[0].equals("+") && !opcaoUsuario[0].equals("-")){
                System.out.println(red+"Insira somente simbolos (+) ou (-)"+fim); 
            }
        } while(!opcaoUsuario[0].equals("+") && !opcaoUsuario[0].equals("-"));

        do {
            System.out.print("- Entrada 2 = "+desafio[1]+" --> "); // Pergunta 2 
            opcaoUsuario[1] = input.nextLine();

            if(!opcaoUsuario[1].equals("+") && !opcaoUsuario[1].equals("-")){
                System.out.println(red+"Insira somente simbolos (+) ou (-)"+fim);
            }
        } while(!opcaoUsuario[1].equals("+") && !opcaoUsuario[1].equals("-"));

        do {
            System.out.print("- Entrada 3 = "+desafio[2]+" --> "); // Pergunta 3 
            opcaoUsuario[2] = input.nextLine();
            if(!opcaoUsuario[2].equals("+") && !opcaoUsuario[2].equals("-")){
                System.out.println(red+"Insira somente simbolos (+) ou (-)"+fim);
            }
        } while(!opcaoUsuario[2].equals("+") && !opcaoUsuario[2].equals("-"));

        System.out.println("");
        resposta = CorrecaoCircuitoMagico(opcaoUsuario, questao);

        System.out.println("");

        if (resposta) {
            System.out.println(green+"- Obrigado meu irmão "+nome+", você me salvou!"+fim);

            Proximo();
        } else {
            System.out.println(red+"- MEU BRAÇOOOOOO, O QUE ACONTECEU COM ELEEEE !!!\n"
                               + "Na tentativa de curar, você acabou amputando o braço do seu irmão "+fim);
            Proximo();
        }

        return resposta;
    }


    //Função que elabora a questão 2, conforme o valor aleatório passado
    static String[] CircuitoMagico(int questao){
        String desafio[] = new String[6];

        switch(questao){
            case 1 :                          // RESPOSTAS //
                desafio[0] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // +
                desafio[1] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // -
                desafio[2] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // -
                break;
            case 2 :
                desafio[0] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // -
                desafio[1] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // +
                desafio[2] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // -
                break;
            case 3 :
                desafio[0] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // -
                desafio[1] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // -
                desafio[2] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // +
                break;
            case 4:
                desafio[0] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // +
                desafio[1] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // +
                desafio[2] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // -
                break;
            case 5:
                desafio[0] = " "+purple+"[ + ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // +
                desafio[1] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ + ]"+fim+" "; // -
                desafio[2] = " "+purple+"[ - ]"+fim+" COM "+purple+"[ - ]"+fim+" "; // +
                break;
        }

        return desafio;
    }

    //Função que verifica as respostas inseridas no desafio 2 e da um feedback
    public static boolean CorrecaoCircuitoMagico(String escolha[], int questao){
        boolean resposta = false;
        boolean verifica;

        switch(questao){
            case 1 :
                verifica = escolha[0].equals("+");
                mostraCircuitoResp(verifica);

                verifica = escolha[1].equals("-");
                mostraCircuitoResp(verifica);

                verifica = escolha[2].equals("-");
                mostraCircuitoResp(verifica);

                resposta = escolha[0].equals("+") && escolha[1].equals("-") && escolha[2].equals("-");
            break;

            case 2 :
                verifica = escolha[0].equals("-");
                mostraCircuitoResp(verifica);

                verifica = escolha[1].equals("+");
                mostraCircuitoResp(verifica);

                verifica = escolha[2].equals("-");
                mostraCircuitoResp(verifica);

                resposta = escolha[0].equals("-") && escolha[1].equals("+") && escolha[2].equals("-");
            break;

            case 3 :
                verifica = escolha[0].equals("-");
                mostraCircuitoResp(verifica);

                verifica = escolha[1].equals("-");
                mostraCircuitoResp(verifica);

                verifica = escolha[2].equals("+");
                mostraCircuitoResp(verifica);

                resposta = escolha[0].equals("-") && escolha[1].equals("-") && escolha[2].equals("+");
            break;

            case 4 :
                verifica = escolha[0].equals("+");
                mostraCircuitoResp(verifica);

                verifica = escolha[1].equals("+");
                mostraCircuitoResp(verifica);

                verifica = escolha[2].equals("-");
                mostraCircuitoResp(verifica);

                resposta = escolha[0].equals("+") && escolha[1].equals("+") && escolha[2].equals("-");
            break;

            case 5 :
                verifica = escolha[0].equals("+");
                mostraCircuitoResp(verifica);

                verifica = escolha[1].equals("-");
                mostraCircuitoResp(verifica);

                verifica = escolha[2].equals("+");
                mostraCircuitoResp(verifica);

                resposta = escolha[0].equals("+") && escolha[1].equals("-") && escolha[2].equals("+");
            break;
        }

        return resposta;
    }


    //Função responsável por dar o feedback de resposta para o aventureiro
    public static void mostraCircuitoResp(boolean verifica){
        if (verifica) {
            System.out.println(green+"- Circuito mágico correto -"+fim);
        } else {
            System.out.println(red+"- Circuito mágico incorreto -"+fim);
        }      
    }


    public static boolean Desafio03(String nome, String classe){
        int questao;
        int valor = 0;
        int valor2 = 0;
        String opcaoUsuario;
        boolean resposta = false;

        questao = randow.nextInt(5);
        questao++;

        switch(questao){
            case 1 :
                valor = 15; //Resposta: 225
                valor2 = 2;
            break;

            case 2 :
                valor = 5; //Resposta: 3125
                valor2 = 5;
            break;

            case 3 :
                valor = 9; //Resposta: 1
                valor2 = 0;
            break;

            case 4 :
                valor = 7; //Resposta: 2401
                valor2 = 4;
            break;

            case 5 :
                valor = 12; //Resposta: 1728
                valor2 = 3;
            break;
        }

        System.out.println("");
        System.out.println("---"+purple+"Onda 2"+fim+"---\n"
                           + "Assim que vocês se recuperam e se levantam, Beleth aparece no horizonte \n"
                           + "e ele invoca uma horda de"+red+" demônios lanceiros!"+fim+"Vocês preparam suas magias mas \n"
                           + "dessa vez, os inimigos foram mais rápidos e arremessaram suas lanças!");

        Proximo();

        System.out.println("");
        System.out.println("Você e seu irmão conseguem por um breve momento contar a quantidade de lanças\n"
                         + "arremessadas, no total, "+blue+""+valor+" lanças"+fim+" estão indo de encontro a vocês.\n"
                         + "Sabendo que o custo da magia para conjurar uma barreira protetora é de "+blue+""+valor2+" pontos de mana"+fim+", \n"
                         + "E que para conjurar a magia com sucesso, o número de lanças é elevado ao custo de mana."
                         + "Quantos pontos de mana serão necessários para conjurar a magia para salvar a você e seu irmão ?");

        System.out.println("(A)"+purple+" 3125 "+fim+"pontos de mana"); // 2
        System.out.println("(B)"+purple+" 2401 "+fim+"pontos de mana"); // 4
        System.out.println("(C)"+purple+" 1728 "+fim+"pontos de mana"); // 5
        System.out.println("(D)"+purple+" 225 "+fim+"pontos de mana"); // 1
        System.out.println("(E)"+purple+" 1 "+fim+"pontos de mana"); // 3

        opcaoUsuario = DesafioEscolha();

        switch(questao){
            case 1 :
                resposta = respD(opcaoUsuario);
            break;

            case 2 :
                resposta = respA(opcaoUsuario);
            break;

            case 3 :
                resposta = respE(opcaoUsuario);
            break;

            case 4 :
                resposta = respB(opcaoUsuario);
            break;

            case 5 :
                resposta = respC(opcaoUsuario);
            break;
        }

        if(resposta){
            Feedback3(valor, valor2);
            System.out.println(green+"- Você consegue calcular rapidamente o custo de mana e acaba \n"
                               + "conjurando uma barreira perfeita e resistente que os salvam das lanças."+fim);
        } else {
            Feedback3(valor, valor2);
            System.out.println(red+"- Você acaba usando a quantidade de mana errada, a barreira se torna instável e"
                               + "acaba se desfazendo no primeiro contato com as lanças."+fim);
        }

        Proximo();

        return resposta;
    }


    public static boolean Desafio04(String nome, String classe, String magiaClasse){
        boolean resposta = false;
        int questao;
        double valor = 0;
        String opcaoUsuario;

        questao = randow.nextInt(5);
        questao++;

        switch( questao ){
            case 1 :
                valor = 25; //Resposta: 11001
            break;

            case 2 :
                valor = 14; //Resposta: 1110
            break;

            case 3 :
                valor = 18; //Resposta: 10010
            break;

            case 4 :
                valor = 32;//Resposta: 100000
            break;

            case 5 :
                valor = 11;//Resposta: 1011
            break;
        }

        System.out.println("---"+purple+"Onde 3"+fim+"---\n"
                           +"Beleth solta um urro de fúria ao perceber que ainda estávamos vivos, \n"
                           + "ele então se prepara para conjurar uma magia que em segundos nos atinge em cheio.\n"
                           + "Fechamos os olhos e nos preparamos para a dor, mas passados alguns segundos e ao abrirmos os olhos \n"
                           + "avistamos uma pequena quantidade de demônios guerreiros que ainda estavam vivos e vindo em nossa direção. \n"
                           + "Você se prepara para usar a sua "+magiaClasse+" mas percebe que o custo de mana que antes era decimal, agora"
                           + "está em binário. Sabendo que para poder conjurar a magia antes o custo era de "+purple+""+valor+"\n"
                           + " pontos de mana, converta-o para binário. \n" + fim);

        System.out.println("(A) "+purple+" 10010"+fim+"."); // case 3
        System.out.println("(B) "+purple+" 100000"+fim+"."); // case 4
        System.out.println("(C) "+purple+" 1110"+fim+"."); // case 2
        System.out.println("(D) "+purple+" 11001"+fim+"."); // case 1
        System.out.println("(E) "+purple+" 1011"+fim+"."); // case 5

        opcaoUsuario = DesafioEscolha();

        switch( questao ){
            case 1 :
                resposta = respD(opcaoUsuario);
            break;

            case 2 :
                resposta = respC(opcaoUsuario);
            break;

            case 3 :
                resposta = respA(opcaoUsuario);
            break;

            case 4 :
                resposta = respB(opcaoUsuario);
            break;

            case 5 :
                resposta = respE(opcaoUsuario);
            break;
        }

        if (resposta) {
            Feedback4((int)valor);
            System.out.println(green+"- Parabéns irmão, você e seu irmão se cumprimentam pois agora só falta uma batalha..."+fim);
        } else {
            Feedback4((int)valor);
            System.out.println(red+"- Infelizmente você não conseguiu fazer a convesão a tempo e os demônios conseguiram ferí-los"
                                              + "mas, seu irmão conjurou uma magia e eliminou os inimigos..."+fim);
        }

        Proximo();
        return resposta;
    }


    //Desafio 5 final
    public static boolean Desafio05(String nome, String classe){
        boolean resposta = false;
        int questao;
        String questaoExercicio = "";
        String opcaoUsuario; 

        System.out.println("Beleth agora estava sozinho, todo seu exército tinha sido dizimado \n"
                         + "por nós dois, agora é hora da batalha final...");

        Proximo();

        questao = randow.nextInt(5);
        questao++;

        switch(questao){
            case 1 :
                questaoExercicio = "5x – 3x = 30"; //Resposa: x = 15
            break;

            case 2 :
                questaoExercicio = "4x + 10 = 45 – 3x"; //Resposa: x = 5
            break;

            case 3 :
                questaoExercicio = "2x + 4 = 2 – 3x"; //Resposa: x = -2/5
            break;

            case 4 :
                questaoExercicio = "5.(9 + x) = 20 – 3 + 6x"; //Resposa: x = 28
            break;

            case 5 :
                questaoExercicio = "2x / (4 – 3x) = 2"; //Resposa: x = 1
            break;
        }

        System.out.println("Quando nós encaramos Beleth, o sistema do jogo identificou como nossa batalha final e \n"
                           + "e um pergaminho apareceu diante dos nossos olhos. O conteúdo que nele tinha era uma magia \n"
                           + "para derrotarmos Beleth e o selarmos para todo o sempre, mas para conjurá-la temos que \n"
                           + "desvendar o resultado de uma equação de 1º grau para que todas as palavras de conjuração \n"
                           + "ficassem legíveis. A equação é: "+purple+""+questaoExercicio+""+fim+".\n");

        System.out.println("(A)"+purple+" x = 1"+fim+"");
        System.out.println("(B)"+purple+" x = 15"+fim+"");
        System.out.println("(C)"+purple+" x = 28"+fim+"");
        System.out.println("(D)"+purple+" x = 5"+fim+"");
        System.out.println("(E)"+purple+" x = -2/5"+fim+"");

        opcaoUsuario = DesafioEscolha();

        switch(questao){
            case 1 :
                resposta = respB(opcaoUsuario);
            break;

            case 2 :
                resposta = respD(opcaoUsuario);
            break;

            case 3 :
                resposta = respE(opcaoUsuario);
            break;

            case 4 :
                resposta = respC(opcaoUsuario);
            break;

            case 5 :
                resposta = respA(opcaoUsuario);
            break;
        }

        if (resposta) {
            Feedback5(questao);
            System.out.println("Círculos mágicos se formam no céu, Beleth solta mais um urro de fúria e \n"
                               + "quando o mesmo tenta vir em nossa direção um raio cai do céu e desintegra Beleth. No \n"
                               + "mesmo instante somo cegados pela luz da explosão que o raio fez e em seguida somos arremessados \n"
                               + "para tras...... Quando abrimos os olhos estamos em casa novamente. \n");
        } else {
            Feedback5(questao);
            System.out.println("Antes que conseguissem resolver o cálculo e conjurar a magia final, Beleth prepara uma \n"
                               + "bola de fogo do tamanho da lua e arremessa na direção de vocês dois.... Neste instante \n"
                               + "você, "+nome+" e seu irmão Fernando se despedem e esperam o impacto. \n");
        }

        Proximo();

        return resposta;
    }


    //Desafio 5 final 2
    public static boolean Desafio05_2(String nome, String classe){
        boolean resposta = false;
        String opcaoUsuario; 

        System.out.println("Beleth agora estava com seu pequeno exército ainda vivo, mas ainda tinhamos chance \n"
                         + "pois agora, é hora da batalha final...");

        Proximo();

        System.out.println("Quando nós encaramos Beleth, o sistema do jogo identificou como nossa batalha final e \n"
                           + "e um pergaminho envolto em chamas explodiu diante dos nossos olhos. O conteúdo que nele tinha era uma magia \n"
                           + "para derrotarmos Beleth e o selarmos para todo o sempre, mas como forma de punição por termos perdido \n"
                           + "a última batalha, para conjurá-la temos que desvendar um enigma que tem como tema uma \n"
                           + "equação de 1º grau e resolvê-la para que todas as palavras de conjuração \n"
                           + "ficassem legíveis. O enigma é: \n"
                           +"\n"
                           + "Um grupo de 50 magos combinaram de organizar um círculo mágico para fazer uma magia para mudar o curso do mundo,\n"
                           + "e para isso, cada mago iria doar uma quantidade de mana igualitária para que a magia não beneficiasse mais uns do que outros. \n"
                           + "Na primeira tentativa, foi indetificado que faltavam 510 pontos de mana para conjurar a magia, \n"
                           + "e que 5 novos magos foram necessários entrar no grupo para que não houvesse um esforço muito grande \n"
                           + "para conjurar tal magia. Então, foi acertado novamente que a despesa total de mana seria divida em partes iguais \n"
                           + "entre os 55 magos. Os magos novos iriam contribuir com a sua parte normalmente e cada um dos 50 magos do \n"
                           + "grupo inicial deveriam contribuir com mais 7 pontos de mana.\n"
                           + "\n"
                           + "De acordo com essas informações, qual foi a quantidade de pontos de mana calculada no acerto final para cada um \n"
                           + " dos 55 magos ?");

        System.out.println("(A)"+purple+" 14"+fim+" pontos de mana");
        System.out.println("(B)"+purple+" 17"+fim+" pontos de mana");
        System.out.println("(C)"+purple+" 22"+fim+" pontos de mana");
        System.out.println("(D)"+purple+" 32"+fim+" pontos de mana");
        System.out.println("(E)"+purple+" 57"+fim+" pontos de mana");

        opcaoUsuario = DesafioEscolha();

        resposta = respB(opcaoUsuario);

        if (resposta) {
            System.out.println(green+"Como que por um milagre, você e seu irmão consegue desvendar o enigma e \n"
                               + "resolvem o desafio. Círculos mágicos se formam no céu, Beleth solta mais um urro de fúria e \n"
                               + "quando o mesmo tenta vir em nossa direção um raio cai do céu e desintegra Beleth. No \n"
                               + "mesmo instante somo cegados pela luz da explosão que o raio fez e em seguida somos arremessados \n"
                               + "para tras...... Quando abrem o olho novamente veem que ainda estão dentro do mundo de Beleth mas \n"
                               + "agora todas as criaturas o veneravam, vocês se tornaram os novos rei dos demônios da matemática."+fim);
        } else {
            Feedback5_2();
            System.out.println("Antes que conseguissem resolver o cálculo e conjurar a magia final, Beleth prepara uma \n"
                               + "bola de fogo do tamanho da lua e arremessa na direção de vocês dois.... Neste instante \n"
                               + "você, "+nome+" e seu irmão Fernando se despedem e esperam o impacto. \n");
        }

        Proximo();

        return resposta;
    }
}