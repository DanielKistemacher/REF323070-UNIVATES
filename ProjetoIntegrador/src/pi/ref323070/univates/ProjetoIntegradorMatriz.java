package pi.ref323070.univates;

import java.util.Scanner;

public class ProjetoIntegradorMatriz {
    static String pessoas[][] = new String[3][2];
    static String[] tiposObjeto = new String[3];

    public static void main(String[] args) {
        inicializaCadastros();
        menuPrincipal();
    }
    
    static void inicializaCadastros(){
        //inicializa Pessoas
        for(int x=0; x<3; x++){
            for (int y=0; y<2; y++){
                pessoas[x][y] = "";
            }
        }
        
        //inicializa Tipos de Objetos
        for(int x=0; x<3; x++){
            tiposObjeto[x] = "";
        }
    }
    
    static int espacoLivreVetor(String vetor[]){ // recebe um vetor como parametro
        int i = 0;
        int x = -1; //previamente setada para -1 que vai significar que nao ha mais espaco
        while (i < vetor.length) {//percorre o vetor em busca de um espaco vazio
            if (vetor[i] == "") {  //quando encontra, atribui o indice a X e X deixa de ser -1
                x = i;
                i = vetor.length; //atribui o tamanho maximo a i para sair do laco de repeticao
            }
            i++; // incrementa i se ainda n�o encontrou espaco vazio
        }
        return x;  //retorna o valor de X (que e a posicao no vetor)    
    }
    
    static int espacoLivreMatriz(String matriz[][]){
        int i = 0;
        int x = -1;
        while (i < matriz.length) {
            if (matriz[i][0] == "") {
                x = i;
                i = matriz.length;
            }
            i++;
        }
        return x;
    }

    public static void menuPrincipal() {
        
        Scanner menuPrincipal = new Scanner(System.in);
        int opcaoEscolhida;

        System.out.println("SISTEMA DE EMPRÉSTIMO DE OBJETOS");
        System.out.println("1. Incluir");
        System.out.println("2. Consultar");
        System.out.println("3. Editar");
        System.out.println("4. Excluir");
        System.out.println("5. Cadastrar empréstimo");
        System.out.println("6. Cadastrar manutenção");
        System.out.println("7. Sair");
        System.out.print("Digite o número da opção: ");

        opcaoEscolhida = menuPrincipal.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                menuIncluir();
                break;
            case 2:
                menuConsultar();
                break;
            case 3:
                menuEditar();
                break;
            case 4:
                menuExcluir();
                break;
            case 5:
                // cadastrarEmprestimo();
                break;
            case 6:
                // cadastrarManutencao();
                break;
            case 7: System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                menuPrincipal();
        }
    }

    public static void menuIncluir() {
        int opcaoEscolhida = 0;
        int linha;

        Scanner input = new Scanner(System.in);
        
        while (opcaoEscolhida != 5){
            System.out.println("===== MENU INCLUIR =====");
            System.out.println("1. Incluir pessoa");
            System.out.println("2. Incluir tipos de objeto");
            System.out.println("3. Incluir objeto");
            System.out.println("4. Voltar ao menu principal");
            System.out.println("5. Sair");
            System.out.print("Digite o número da opção: ");

            opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    linha = espacoLivreMatriz(pessoas);
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("Não há espaços para novos cadastros!");
                    } else {
                        input.nextLine();
                        System.out.print("Informe o CPF: ");
                        pessoas[linha][0] = input.nextLine().toUpperCase();
                        System.out.print("Informe o nome: ");
                        pessoas[linha][1] = input.nextLine().toUpperCase();

                        System.out.println("Cliente cadastrado com sucesso! \n");
                        break;
                    }
                case 2:
                    // incluirTipoObjeto();
                    break;
                case 3:
                    // incluirObjeto();
                    break;
                case 4: menuPrincipal();
                    break;
                case 5: System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    menuIncluir();
            }
        }
    }

    public static void menuConsultar() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== MENU CONSULTAR =====");
        System.out.println("1. Consultar pessoas");
        System.out.println("2. Consultar tipos de objetos");
        System.out.println("3. Consultar objetos");
        System.out.println("4. Consultar empréstimos");
        System.out.println("5. Consultar manutenções");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("Digite o número da opção: ");

        int opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1: 
                for (int x=0; x<3; x++){
                    System.out.println("CPF: " + pessoas[x][0]);
                    System.out.println("Nome: " + pessoas[x][1]);
                    System.out.println("==============");
                }
                menuConsultar();
                break;
            case 2:
                    // consultarTipoObjeto();
                    break;
            case 3:
                    // consultarObjeto();
                    break;
            case 4:
                    // consultarEmprestimo();
                    break;
            case 5:
                    // consultarManutencao();
                    break;
            case 6: menuPrincipal();
                    break;
            default: System.out.println("Opção inválida!");
                menuConsultar();
        }
    }

    public static void menuExcluir() {
        int opcaoEscolhida;

        Scanner menuExcluir = new Scanner(System.in);

        System.out.println("===== MENU EXCLUIR =====");
        System.out.println("1. Excluir Pessoas");
        System.out.println("2. Excluir tipos de objetos");
        System.out.println("3. Excluir objetos");
        System.out.println("4. Excluir manutenções");
        System.out.println("5. Excluir empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuExcluir.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                //  excluirPessoa();
                break;
            case 2:
                //  excluirTipoObjeto();
                break;
            case 3:
                //  excluirObjeto();
                break;
            case 4:
                //  excluirEmprestimo();
                break;
            case 5:
                // excluirManutencao();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida!");
                menuExcluir();
        }
    }

    public static void menuEditar() {
        int opcaoEscolhida;

        Scanner menuEditar = new Scanner(System.in);

        System.out.println("===== MENU EDITAR =====");
        System.out.println("1. Editar pessoas");
        System.out.println("2. Editar tipos de objetos");
        System.out.println("3. Editar objetos");
        System.out.println("4. Editar empréstimos");
        System.out.println("5. Editar manutenções");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuEditar.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                // editarPessoa();
                break;
            case 2:
                // editarTipoObjeto();
                break;
            case 3:
                // editarObjeto();
                break;
            case 4:
                // editarEmprestimo();
                break;
            case 5:
                // editarManutencao();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida!");
                menuEditar();
        }
    }
}