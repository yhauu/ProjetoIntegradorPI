package br.com.projetointegrador;

import java.util.Scanner;
import java.util.Random;

public class Jogo {
    static Scanner input = new Scanner(System.in);
    static Random randow = new Random(); 

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
            System.out.println("Ao tentar curar seu irmão acabou não piorando seu braço a ponto de amputá-lo.\n"
                               + "Com seu irmão sem um braço e seu estado de choque por ter feito isso, \n"
                               + "vocês não notaram a segunda horda de demônios e foram massacrados pelo inimigo.");

            System.out.println(ClassesUtil.red+"GAME OVER"+ClassesUtil.fim);
        } else {
            fase[0] = true;
        }

        if (fase[0]) {

            key[2] = Desafio03(nome, classe); //Desafio 3

            // Caso o jogador erre o desafio 3 também é Game Over
            if (!key[2]) {
                System.out.println("Com o fracasso ao conjurar a magia você e seu irmão são atravessados pelas lanças e morrem.\n");
                System.out.println(ClassesUtil.red+"GAME OVER"+ClassesUtil.fim);
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
                    System.out.println("AVENTUREIRO "+nome+""+ClassesUtil.green+" PARABÉNS POR CONCLUIR O JOGO"+ClassesUtil.fim+"!!!...");
                    ClassesUtil.Proximo();
                } else {
                    System.out.println(ClassesUtil.red+"GAME OVER"+ClassesUtil.fim);
                    ClassesUtil.Proximo();
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

            confirmar = ClassesUtil.ConfirmarEscolha(2);
        } while(!confirmar.equals("S"));

        System.out.println("                      ____________ ");
        System.out.println("                     | INTRODUÇÃO |");
        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Os irmãos, "+nome+" e Fernando, estavam em casa numa sexta a noite, \n"
                           + "fazendo o que mais gostavam de fazer que era jogar video-game.\n"
                           + "Após Fernando receber uma mensagem no celular, com o link de algum site, \n"
                           + "um tanto quanto estraho e na mensagem o amigo que lhe enviou a mensagem disse junto:... ");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Cuidado mano, esse PDF ai é de um livro muito antigo, e tem ums rituais meio esquisitos. \n"
                           + " Mas te enviei porque sei que tu gosta desse tipo de coisa hehe ...");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("- O Takeo mandou o PDF que eu tinha comentado com voce "+nome+"! ...");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Quando seu irmão menciona sobre o tal PDF um frio corre pela sua espinha \n"
                         + "pois não se tratava de mais uma estória ou mito sobre algum fato sobrenatural normal e popular\n"
                         + "e sim de um fato pouco discutido e que muitas pessoas nem mesmo conhecia sobre.\n"
                         + "Era sobre o demônio Beleth, que na lenda, teria ajudado um dos filhos de Noé a \n"
                         + "escrever um dos primeiros livros de mátematica...");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Fernando abriu o pdf, e começou a ler as letras em vermelho que estavam logo na \n"
                           + "primeira página: \n"
                           + "- Beleth Domine, Domine calculations est, hic est Magisto vocare te venerunt.\n" 
                           + "Quae praecepero illi facere visibilia! ....");

        ClassesUtil.Proximo();

        System.out.println("....................");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Vocês pararam por alguns segundos olhando aquelas palavras estranhas \n"
                           + "como se esperassem que algo fosse acontecer \n"
                           + "Você diz com um tom de medo e alivio: \n"
                           + "- Cadê ? Não aconteceu nada mesmo ?\n"
                           + "Fernando responde com um certo tom de deboche: \n"
                           + "- Meu latim está enferrujado, deve ser isso né.");

        ClassesUtil.Proximo();

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println("Vocês riem mas logo em seguida são atingidos por um sono \n"
                           + "pesadíssimo, se sentem como se estivessem acordados a 72 horas direto. \n"
                           + "É quando sua visão já turva se torna um breu.");

        ClassesUtil.Proximo();

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

        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        System.out.println(ClassesUtil.yellow+"|"+ClassesUtil.fim+"BEM-VINDOS AO MEU MUNDO                 "+ClassesUtil.yellow+"|"+ClassesUtil.fim);
        System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
        ClassesUtil.Proximo();

        return nome;
    }

    //Função para atribuir a classe do aventureiro
    public static String Classes(){
        String classe, confirmar, opcaoUsuario;

        do{
            System.out.println(ClassesUtil.red+"---------------------------------------------------------------"+ClassesUtil.fim);
            System.out.println("- O que aconteceu ? \n"
                               + "Vocês estão no meu mundo agora, e para voltar \n"
                               + "Terão que passar por todos os meus desafios de matemática usando \n"
                               + "da magia de gelo ou de fogo que vos darei agora.");

            System.out.println("_______________________________________________________________");
            System.out.println(ClassesUtil.purple+"Classes"+ClassesUtil.fim);
            System.out.println("");
            System.out.println(" (1) - Pyromancer (Fogo) -");
            System.out.println(" (2) - Cryomancer (Gelo)-");
            System.out.println("");

            // Laço para o jogador escolher uma classes válida
            do {
                System.out.print("Escolha uma classe: ");
                opcaoUsuario = input.nextLine();

                //Caso o que for inserio é diferente de 1 ou 2 escreve a mensagem de erro
                if(!opcaoUsuario.equals("1") && !opcaoUsuario.equals("2")){
                    System.err.println("( Essa classe não exixte! )");
                }
            } while(!opcaoUsuario.equals("1") && !opcaoUsuario.equals("2"));

            classe = InfoClasses(opcaoUsuario); // Mostra as especificações da classe escolhida.
            System.out.println("");
            confirmar = ClassesUtil.ConfirmarEscolha(1);
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
                System.out.println("- "+ClassesUtil.purple+"Pyromancer"+ClassesUtil.fim+" -");
                System.out.println("Com o pyromancer, sua força destrutiva com bolas de fogo \n"
                                 + "faz com que até mesmo os demônios queimem");
            break;

            case "2":
                System.out.println("- "+ClassesUtil.purple+"Cryomancer"+ClassesUtil.fim+" -");
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
        System.out.println("---"+ClassesUtil.red+"Onda 1"+ClassesUtil.fim+"---\n"
                           + "Antes que conseguisse recobrar a consciência vi uma horda de demônios em\n"
                           + "minha direção, olho para o horizonte e vejo naquele bioma rochoso e seco \n"
                           + "meu irmão sendo cercado por uma horda ainda maior.");

        ClassesUtil.Proximo();

        System.out.println("");
        System.out.println("Penso logo em ajudá-lo mas primeiro preciso acabar com os 20 demônios arqueiros que estavam \n"
                           + "mirando em mim. Para derrotá-los precisarei conjurar uma "+magiaClasse+", porém \n"
                           + "minha magia possui alcance limitado. Sabendo que minha magia cobre \n"
                           + ClassesUtil.blue+""+var1+" metros"+ClassesUtil.fim+" de distância e seu herói \n"
                           + " se encontra a "+ClassesUtil.blue+""+var2+" metros"+ClassesUtil.fim+" \n"
                           + "de distância dos demônios, quantos metros "+nome+" terá que andar\n"
                           + "para conseguir aniquilar seus inimigos e ir salvar seu irmão ?");

        System.out.println("(A)"+ClassesUtil.purple+" 115100"+ClassesUtil.fim+"metros."); // Resposta para o SWITCH CASE 2
        System.out.println("(B)"+ClassesUtil.purple+" 114100"+ClassesUtil.fim+"metros."); // Resposta para o SWITCH CASE 5
        System.out.println("(C)"+ClassesUtil.purple+" 111000"+ClassesUtil.fim+"metros."); // Resposta para o SWITCH CASE 3
        System.out.println("(D)"+ClassesUtil.purple+" 91000"+ClassesUtil.fim+"metros.");  // Resposta para o SWITCH CASE 1
        System.out.println("(E)"+ClassesUtil.purple+" 132490"+ClassesUtil.fim+"metros."); // Resposta para o SWITCH CASE 4
 
        opcaoUsuario = ClassesUtil.DesafioEscolha();//Chamando a função que lista as alternativas

        switch(questao){
            case 1 :
                resposta = ClassesUtil.respD(opcaoUsuario);
            break;

            case 2 :
                resposta = ClassesUtil.respA(opcaoUsuario);
            break;

            case 3 :
                resposta = ClassesUtil.respC(opcaoUsuario);
            break;

            case 4 :
                resposta = ClassesUtil.respE(opcaoUsuario);
            break;

            case 5 :
                resposta = ClassesUtil.respB(opcaoUsuario);
            break;
        }

        //Mensagem para caso o usuário tenha errado ou acertado a questão.
        if (resposta) {
            ClassesUtil.Feedback1(var1, var2);
            System.out.println(ClassesUtil.green+"- Bem na mira! Você atingiu os demônios arqueiros de forma que nenhum fico vivo! "+ClassesUtil.fim);
        } else {
            ClassesUtil.Feedback1(var1, var2);
            System.out.println(ClassesUtil.red+"- Aaaa não você não conseguiu calcular direito a distância e errou a magia!"+ClassesUtil.fim);
        }

        System.out.println("");

        ClassesUtil.Proximo();
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
                           + "sendo esses circuitos mágicos compostos por " +ClassesUtil.yellow+"negativo"+ClassesUtil.fim+"( - ) e "+ClassesUtil.yellow+"positivo"+ClassesUtil.fim+"( + ). \n"
                           + "Seguindo a "+ ClassesUtil.purple+"regra de sinais da matemática"+ClassesUtil.fim+" resolva os circuitos mágicos abaixo: ");

        do {
            System.out.print("- Entrada 1 = "+desafio[0]+" --> "); // Pergunta 1 
            opcaoUsuario[0] = input.nextLine();

            if(!opcaoUsuario[0].equals("+") && !opcaoUsuario[0].equals("-")){
                System.out.println(ClassesUtil.red+"Insira somente simbolos (+) ou (-)"+ClassesUtil.fim); 
            }
        } while(!opcaoUsuario[0].equals("+") && !opcaoUsuario[0].equals("-"));

        do {
            System.out.print("- Entrada 2 = "+desafio[1]+" --> "); // Pergunta 2 
            opcaoUsuario[1] = input.nextLine();

            if(!opcaoUsuario[1].equals("+") && !opcaoUsuario[1].equals("-")){
                System.out.println(ClassesUtil.red+"Insira somente simbolos (+) ou (-)"+ClassesUtil.fim);
            }
        } while(!opcaoUsuario[1].equals("+") && !opcaoUsuario[1].equals("-"));

        do {
            System.out.print("- Entrada 3 = "+desafio[2]+" --> "); // Pergunta 3 
            opcaoUsuario[2] = input.nextLine();
            if(!opcaoUsuario[2].equals("+") && !opcaoUsuario[2].equals("-")){
                System.out.println(ClassesUtil.red+"Insira somente simbolos (+) ou (-)"+ClassesUtil.fim);
            }
        } while(!opcaoUsuario[2].equals("+") && !opcaoUsuario[2].equals("-"));

        System.out.println("");
        resposta = CorrecaoCircuitoMagico(opcaoUsuario, questao);

        System.out.println("");

        if (resposta) {
            System.out.println(ClassesUtil.green+"- Obrigado meu irmão "+nome+", você me salvou!"+ClassesUtil.fim);

            ClassesUtil.Proximo();
        } else {
            System.out.println(ClassesUtil.red+"- MEU BRAÇOOOOOO, O QUE ACONTECEU COM ELEEEE !!!\n"
                               + "Na tentativa de curar, você acabou amputando o braço do seu irmão "+ClassesUtil.fim);
            ClassesUtil.Proximo();
        }

        return resposta;
    }


    //Função que elabora a questão 2, conforme o valor aleatório passado
    static String[] CircuitoMagico(int questao){
        String desafio[] = new String[6];

        switch(questao){
            case 1 :                          // RESPOSTAS //
                desafio[0] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // +
                desafio[1] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // -
                desafio[2] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // -
                break;
            case 2 :
                desafio[0] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // -
                desafio[1] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // +
                desafio[2] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // -
                break;
            case 3 :
                desafio[0] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // -
                desafio[1] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // -
                desafio[2] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // +
                break;
            case 4:
                desafio[0] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // +
                desafio[1] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // +
                desafio[2] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // -
                break;
            case 5:
                desafio[0] = " "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // +
                desafio[1] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ + ]"+ClassesUtil.fim+" "; // -
                desafio[2] = " "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" COM "+ClassesUtil.purple+"[ - ]"+ClassesUtil.fim+" "; // +
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
            System.out.println(ClassesUtil.green+"- Circuito mágico correto -"+ClassesUtil.fim);
        } else {
            System.out.println(ClassesUtil.red+"- Circuito mágico incorreto -"+ClassesUtil.fim);
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
        System.out.println("---"+ClassesUtil.purple+"Onda 2"+ClassesUtil.fim+"---\n"
                           + "Assim que vocês se recuperam e se levantam, Beleth aparece no horizonte \n"
                           + "e ele invoca uma horda de"+ClassesUtil.red+" demônios lanceiros!"+ClassesUtil.fim+"Vocês preparam suas magias mas \n"
                           + "dessa vez, os inimigos foram mais rápidos e arremessaram suas lanças!");

        ClassesUtil.Proximo();

        System.out.println("");
        System.out.println("Você e seu irmão conseguem por um breve momento contar a quantidade de lanças\n"
                         + "arremessadas, no total, "+ClassesUtil.blue+""+valor+" lanças"+ClassesUtil.fim+" estão indo de encontro a vocês.\n"
                         + "Sabendo que o custo da magia para conjurar uma barreira protetora é de "+ClassesUtil.blue+""+valor2+" pontos de mana"+ClassesUtil.fim+", \n"
                         + "E que para conjurar a magia com sucesso, o número de lanças é elevado ao custo de mana."
                         + "Quantos pontos de mana serão necessários para conjurar a magia para salvar a você e seu irmão ?");

        System.out.println("(A)"+ClassesUtil.purple+" 3125 "+ClassesUtil.fim+"pontos de mana"); // 2
        System.out.println("(B)"+ClassesUtil.purple+" 2401 "+ClassesUtil.fim+"pontos de mana"); // 4
        System.out.println("(C)"+ClassesUtil.purple+" 1728 "+ClassesUtil.fim+"pontos de mana"); // 5
        System.out.println("(D)"+ClassesUtil.purple+" 225 "+ClassesUtil.fim+"pontos de mana"); // 1
        System.out.println("(E)"+ClassesUtil.purple+" 1 "+ClassesUtil.fim+"pontos de mana"); // 3

        opcaoUsuario = ClassesUtil.DesafioEscolha();

        switch(questao){
            case 1 :
                resposta = ClassesUtil.respD(opcaoUsuario);
            break;

            case 2 :
                resposta = ClassesUtil.respA(opcaoUsuario);
            break;

            case 3 :
                resposta = ClassesUtil.respE(opcaoUsuario);
            break;

            case 4 :
                resposta = ClassesUtil.respB(opcaoUsuario);
            break;

            case 5 :
                resposta = ClassesUtil.respC(opcaoUsuario);
            break;
        }

        if(resposta){
            ClassesUtil.Feedback3(valor, valor2);
            System.out.println(ClassesUtil.green+"- Você consegue calcular rapidamente o custo de mana e acaba \n"
                               + "conjurando uma barreira perfeita e resistente que os salvam das lanças."+ClassesUtil.fim);
        } else {
            ClassesUtil.Feedback3(valor, valor2);
            System.out.println(ClassesUtil.red+"- Você acaba usando a quantidade de mana errada, a barreira se torna instável e"
                               + "acaba se desfazendo no primeiro contato com as lanças."+ClassesUtil.fim);
        }

        ClassesUtil.Proximo();

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

        System.out.println("---"+ClassesUtil.purple+"Onde 3"+ClassesUtil.fim+"---\n"
                           +"Beleth solta um urro de fúria ao perceber que ainda estávamos vivos, \n"
                           + "ele então se prepara para conjurar uma magia que em segundos nos atinge em cheio.\n"
                           + "Fechamos os olhos e nos preparamos para a dor, mas passados alguns segundos e ao abrirmos os olhos \n"
                           + "avistamos uma pequena quantidade de demônios guerreiros que ainda estavam vivos e vindo em nossa direção. \n"
                           + "Você se prepara para usar a sua "+magiaClasse+" mas percebe que o custo de mana que antes era decimal, agora"
                           + "está em binário. Sabendo que para poder conjurar a magia antes o custo era de "+ClassesUtil.purple+""+valor+"\n"
                           + " pontos de mana, converta-o para binário. \n");

        System.out.println("(A) "+ClassesUtil.purple+" 10010"+ClassesUtil.fim+"."); // case 3
        System.out.println("(B) "+ClassesUtil.purple+" 100000"+ClassesUtil.fim+"."); // case 4
        System.out.println("(C) "+ClassesUtil.purple+" 1110"+ClassesUtil.fim+"."); // case 2
        System.out.println("(D) "+ClassesUtil.purple+" 11001"+ClassesUtil.fim+"."); // case 1
        System.out.println("(E) "+ClassesUtil.purple+" 1011"+ClassesUtil.fim+"."); // case 5

        opcaoUsuario = ClassesUtil.DesafioEscolha();

        switch( questao ){
            case 1 :
                resposta = ClassesUtil.respD(opcaoUsuario);
            break;

            case 2 :
                resposta = ClassesUtil.respC(opcaoUsuario);
            break;

            case 3 :
                resposta = ClassesUtil.respA(opcaoUsuario);
            break;

            case 4 :
                resposta = ClassesUtil.respB(opcaoUsuario);
            break;

            case 5 :
                resposta = ClassesUtil.respE(opcaoUsuario);
            break;
        }

        if (resposta) {
            ClassesUtil.Feedback4(valor);
            System.out.println(ClassesUtil.green+"- Parabéns irmão, você e seu irmão se cumprimentam pois agora só falta uma batalha..."+ClassesUtil.fim);
        } else {
            ClassesUtil.Feedback4(valor);
            System.out.println(ClassesUtil.red+"- Infelizmente você não conseguiu fazer a convesão a tempo e os demônios conseguiram ferí-los"
                                              + "mas, seu irmão conjurou uma magia e eliminou os inimigos..."+ClassesUtil.fim);
        }

        ClassesUtil.Proximo();
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

        ClassesUtil.Proximo();

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
                           + "ficassem legíveis. A equação é: "+ClassesUtil.purple+""+questaoExercicio+""+ClassesUtil.fim+".\n");

        System.out.println("(A)"+ClassesUtil.purple+" x = 1"+ClassesUtil.fim+"");
        System.out.println("(B)"+ClassesUtil.purple+" x = 15"+ClassesUtil.fim+"");
        System.out.println("(C)"+ClassesUtil.purple+" x = 28"+ClassesUtil.fim+"");
        System.out.println("(D)"+ClassesUtil.purple+" x = 5"+ClassesUtil.fim+"");
        System.out.println("(E)"+ClassesUtil.purple+" x = -2/5"+ClassesUtil.fim+"");

        opcaoUsuario = ClassesUtil.DesafioEscolha();

        switch(questao){
            case 1 :
                resposta = ClassesUtil.respB(opcaoUsuario);
            break;

            case 2 :
                resposta = ClassesUtil.respD(opcaoUsuario);
            break;

            case 3 :
                resposta = ClassesUtil.respE(opcaoUsuario);
            break;

            case 4 :
                resposta = ClassesUtil.respC(opcaoUsuario);
            break;

            case 5 :
                resposta = ClassesUtil.respA(opcaoUsuario);
            break;
        }

        if (resposta) {
            ClassesUtil.Feedback5(questao);
            System.out.println("Círculos mágicos se formam no céu, Beleth solta mais um urro de fúria e \n"
                               + "quando o mesmo tenta vir em nossa direção um raio cai do céu e desintegra Beleth. No \n"
                               + "mesmo instante somo cegados pela luz da explosão que o raio fez e em seguida somos arremessados \n"
                               + "para tras...... Quando abrimos os olhos estamos em casa novamente. \n");
        } else {
            ClassesUtil.Feedback5(questao);
            System.out.println("Antes que conseguissem resolver o cálculo e conjurar a magia final, Beleth prepara uma \n"
                               + "bola de fogo do tamanho da lua e arremessa na direção de vocês dois.... Neste instante \n"
                               + "você, "+nome+" e seu irmão Fernando se despedem e esperam o impacto. \n");
        }

        ClassesUtil.Proximo();

        return resposta;
    }


    //Desafio 5 final 2
    public static boolean Desafio05_2(String nome, String classe){
        boolean resposta = false;
        String opcaoUsuario; 

        System.out.println("Beleth agora estava com seu pequeno exército ainda vivo, mas ainda tinhamos chance \n"
                         + "pois agora, é hora da batalha final...");

        ClassesUtil.Proximo();

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

        System.out.println("(A)"+ClassesUtil.purple+" 14"+ClassesUtil.fim+" pontos de mana");
        System.out.println("(B)"+ClassesUtil.purple+" 17"+ClassesUtil.fim+" pontos de mana");
        System.out.println("(C)"+ClassesUtil.purple+" 22"+ClassesUtil.fim+" pontos de mana");
        System.out.println("(D)"+ClassesUtil.purple+" 32"+ClassesUtil.fim+" pontos de mana");
        System.out.println("(E)"+ClassesUtil.purple+" 57"+ClassesUtil.fim+" pontos de mana");

        opcaoUsuario = ClassesUtil.DesafioEscolha();

        resposta = ClassesUtil.respB(opcaoUsuario);

        if (resposta) {
            System.out.println(ClassesUtil.green+"Como que por um milagre, você e seu irmão consegue desvendar o enigma e \n"
                               + "resolvem o desafio. Círculos mágicos se formam no céu, Beleth solta mais um urro de fúria e \n"
                               + "quando o mesmo tenta vir em nossa direção um raio cai do céu e desintegra Beleth. No \n"
                               + "mesmo instante somo cegados pela luz da explosão que o raio fez e em seguida somos arremessados \n"
                               + "para tras...... Quando abrem o olho novamente veem que ainda estão dentro do mundo de Beleth mas \n"
                               + "agora todas as criaturas o veneravam, vocês se tornaram os novos rei dos demônios da matemática."+ClassesUtil.fim);
        } else {
            ClassesUtil.Feedback5_2();
            System.out.println("Antes que conseguissem resolver o cálculo e conjurar a magia final, Beleth prepara uma \n"
                               + "bola de fogo do tamanho da lua e arremessa na direção de vocês dois.... Neste instante \n"
                               + "você, "+nome+" e seu irmão Fernando se despedem e esperam o impacto. \n");
        }

        ClassesUtil.Proximo();

        return resposta;
    }
}