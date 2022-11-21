package pi.ref323070.univates;

import java.util.Scanner;

//552155 - DANIEL KISTEMACHER DA SILVA

public class projetoDanielKistemacher_editado {
    static String pessoas[][] = new String[3][2];
    static String tiposObjeto[] = new String[3];
    static String objetos[][] = new String[3][3];
    static String manutObjetos[][] = new String[3][3];
    static String empObjetos[][] = new String[3][3];
    
    public static void main(String[] args) {
        inicializaCadastros();
        menuPrincipal();
    }

    static void inicializaCadastros() {
        //inicializa Pessoas
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                pessoas[x][y] = "";
            }
        }
        //inicializa Tipos de Objetos
        for (int x = 0; x < 3; x++) {
            tiposObjeto[x] = "";
        }
        //inicializa Objetos
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                objetos[x][y] = "";
            }
        }
        //inicializa Manutenção de Objetos
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                manutObjetos[x][y] = "";
            }
        }
        //inicializa Empréstimos de Objetos
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                empObjetos[x][y] = "";
            }
        }
    }

    static int espacoLivreVetor(String vetor[]) {
        int i = 0;
        int x = -1; 
        while (i < vetor.length) {
            if (vetor[i] == "") {
                x = i;
                i = vetor.length;
            }
            i++;
        }
        return x;
    }

    static int espacoLivreMatriz(String matriz[][]) {
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
        Scanner input = new Scanner(System.in);
        int opcaoEscolhida, linha;
        System.out.println("\n===== SISTEMA DE EMPRÉSTIMO DE OBJETOS - VERSÃO DEMO =====");
        System.out.println("============== MENU PRINCIPAL ==============");
        System.out.println("1. Incluir");
        System.out.println("2. Consultar");
        System.out.println("3. Editar");
        System.out.println("4. Excluir");
        System.out.println("5. Cadastrar manutenção");
        System.out.println("6. Sair");
        System.out.print("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1: menuIncluir();
                break;
            case 2: menuConsultar();
                break;
            case 3: menuEditar();
                break;
            case 4: menuExcluir();
                break;
            case 5:
                linha = espacoLivreMatriz(manutObjetos);
                if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                    System.out.println("Não há espaços para novos cadastros! \n");
                } else {
                    consultarObjetos();
                    input.nextLine();
                    System.out.print("Informe o código do objeto a ser reparado: ");
                    int opcao = input.nextInt();
                    
                    if (objetos[opcao][2] == "DISPONIVEL" ){
                        manutObjetos[linha][0] = objetos[opcao][0];
                        input.nextLine();
                        System.out.print("Descrição da manut.: ");
                        manutObjetos[linha][1] = input.nextLine().toUpperCase();
                        System.out.print("Status (Recebido / Serviço / Resolvido): ");
                        manutObjetos[linha][2] = input.nextLine().toUpperCase();
                        System.out.println("Manutenção cadastrada com sucesso! \n");
                        
                        objetos[opcao][2] = "EM MANUTENCAO";
                    } else {
                        System.out.println("Objeto indisponível para manutenção!");
                    }
                }
                menuPrincipal();
                break;
            case 6: System.exit(0);
                break;
            default: System.out.println("Opção inválida!");
                menuPrincipal();
        }
    }

    public static void menuIncluir() {
        int opcaoEscolhida = 0;
        int linha;
        Scanner input = new Scanner(System.in);
        
        while (opcaoEscolhida != 5) {
            System.out.println("\n ===== MENU INCLUIR =====");
            System.out.println("1. Incluir pessoa");
            System.out.println("2. Incluir tipos de objeto");
            System.out.println("3. Incluir objeto");
            System.out.println("4. Incluir empréstimo");
            System.out.println("5. Incluir baixa de objeto");
            System.out.println("6. Voltar ao menu principal");
            System.out.println("7. Sair");
            System.out.print("Digite o número da opção: ");

            opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    linha = espacoLivreMatriz(pessoas);
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("Não há espaços para novos cadastros! \n");
                    } else {
                        input.nextLine();
                        System.out.print("Informe o CPF: ");
                        pessoas[linha][0] = input.nextLine().toUpperCase();
                        System.out.print("Informe o nome: ");
                        pessoas[linha][1] = input.nextLine().toUpperCase();

                        System.out.println("Cliente cadastrado com sucesso! \n");
                    }
                    menuPrincipal();
                    break;
                case 2:
                    linha = espacoLivreVetor(tiposObjeto);
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("Não há espaços para novos cadastros! \n");
                    } else {
                        input.nextLine();
                        System.out.print("Descrição do tipo de objeto: ");
                        tiposObjeto[linha] = input.nextLine().toUpperCase();

                        System.out.println("Tipo de objeto cadastrado com sucesso! \n");
                    }
                    menuPrincipal();
                    break;
                case 3:
                    linha = espacoLivreMatriz(objetos);
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("Não há espaços para novos cadastros! \n");
                    } else {
                        input.nextLine();
                        System.out.print("Nome do objeto: ");
                        objetos[linha][0] = input.nextLine().toUpperCase();
                        consultarTiposObjetos();
                        System.out.print("Informe o código do tipo de objeto: ");
                        int opcao = input.nextInt();
                        objetos[linha][1] = tiposObjeto[opcao];
                        objetos[linha][2] = "DISPONIVEL";                        
                        
                        System.out.println("Objeto cadastrado com sucesso! \n");
                    }
                    menuPrincipal();
                    break;
                case 4:
                    linha = espacoLivreMatriz(empObjetos);
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("Não há espaços para novos cadastros! \n");
                    } else {
                        consultarObjetos();
                        input.nextLine();
                        System.out.print("Informe o código do objeto a ser emprestado: ");
                        int opcao = input.nextInt();
                        
                        if (objetos[opcao][2] == "DISPONIVEL" ){
                            empObjetos[linha][0] = objetos[opcao][0];
                            input.nextLine();
                            System.out.print("Funcionário que emprestou: ");
                            empObjetos[linha][1] = input.nextLine().toUpperCase();
                            System.out.print("Para quem foi emprestado: ");
                            empObjetos[linha][2] = input.nextLine().toUpperCase();
                            System.out.println("Empréstimo cadastrado com sucesso! \n");
                            
                            objetos[opcao][2] = "EMPRESTADO";
                        } else {
                            System.out.println("Este objeto não está disponível, portanto não pode ser emprestado! \n");
                        }
                    }
                    menuPrincipal();
                    break;
                case 5:
                    consultarObjetos();
                    System.out.print("Informe o código do objeto a ser baixado: ");
                    int opcao = input.nextInt();
                    
                    if (objetos[opcao][2] == "DISPONIVEL"){
                        objetos[opcao][2] = "BAIXADO";
                        System.out.println("Objeto baixado com sucesso!");
                        menuPrincipal();
                    } else {
                        System.out.println("Este objeto está em manutenção ou emprestado, portanto não pode ser baixado!");
                    }
                    break;
                case 6: menuPrincipal();
                    break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("Opção inválida!");
                    menuIncluir();
            }
        }
    }

    public static void menuConsultar() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n ===== MENU CONSULTAR =====");
        System.out.println("1. Consultar pessoas");
        System.out.println("2. Consultar tipos de objetos");
        System.out.println("3. Consultar objetos");
        System.out.println("4. Consultar empréstimos");
        System.out.println("5. Consultar manutenções");
        System.out.println("6. Consultar objetos conforme situação");
        System.out.println("7. Voltar ao menu principal");
        System.out.println("8. Sair");
        System.out.print("Digite o número da opção: ");

        int opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1: consultarPessoas();
                    menuPrincipal();
                break;
            case 2: consultarTiposObjetos();
                    menuPrincipal();
                break;
            case 3: consultarObjetos();
                    menuPrincipal();
                break;
            case 4: consultarEmprestimos();
                    menuPrincipal();
                break;
            case 5: consultarManutencoes();
                    menuPrincipal();
                break;
            case 6: consultarObjetosSituacao();
                    menuPrincipal();
                break;
            case 7: menuPrincipal();
                break;
            case 8: System.exit(0);
                break;
            default: System.out.println("Opção inválida!");
                menuConsultar();
        }
    }

    public static void menuExcluir() {
        int opcaoEscolhida, opcaoExcluir;
        Scanner input = new Scanner(System.in);
        System.out.println("\n===== MENU EXCLUIR =====");
        System.out.println("1. Excluir Pessoas");
        System.out.println("2. Excluir tipos de objetos");
        System.out.println("3. Excluir objetos");
        System.out.println("4. Excluir empréstimos");
        System.out.println("5. Excluir manutenções");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.print("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                consultarPessoas();
                System.out.print("Informe o código do cadastro que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                pessoas[opcaoExcluir][0] = "";
                pessoas[opcaoExcluir][1] = "";
                System.out.println("Cliente excluído com sucesso! \n");
                menuPrincipal();
                break;
            case 2:
                consultarTiposObjetos();
                System.out.print("Informe o código do tipo de objeto que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                tiposObjeto[opcaoExcluir] = "";
                System.out.println("Tipo de objeto excluído com sucesso! \n");
                menuPrincipal();
                break;
            case 3:
                consultarObjetos();
                System.out.print("Informe o código do objeto que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                objetos[opcaoExcluir][0] = "";
                objetos[opcaoExcluir][1] = "";
                objetos[opcaoExcluir][2] = "";
                System.out.println("Objeto excluído com sucesso! \n");
                menuPrincipal();
                break;
            case 4: 
                consultarEmprestimos();
                System.out.print("Informe o código do empréstimo que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                empObjetos[opcaoExcluir][0] = "";
                empObjetos[opcaoExcluir][1] = "";
                empObjetos[opcaoExcluir][2] = "";
                System.out.println("Empréstimo excluído com sucesso! \n");
                menuPrincipal();
                break;
            case 5:
                consultarManutencoes();
                System.out.print("Informe o código da manutenção que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                manutObjetos[opcaoExcluir][0] = "";
                manutObjetos[opcaoExcluir][1] = "";
                manutObjetos[opcaoExcluir][2] = "";
                System.out.println("Manutenção excluída com sucesso! \n");
                menuPrincipal();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7: System.exit(0);
                break;
            default: System.out.println("Opção inválida!");
                menuExcluir();
        }
    }

    public static void menuEditar() {
        int opcaoMenu, opcaoEditar;
        Scanner input = new Scanner(System.in);
        System.out.println("\n===== MENU EDITAR =====");
        System.out.println("1. Editar pessoas");
        System.out.println("2. Editar tipos de objetos");
        System.out.println("3. Editar objetos");
        System.out.println("4. Editar empréstimos");
        System.out.println("5. Editar manutenções");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.print("Digite o número da opção: ");

        opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1:
                consultarPessoas();
                System.out.print("Informe o código do cadastro que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Informe o CPF: ");
                pessoas[opcaoEditar][0] = input.nextLine().toUpperCase();
                System.out.print("Informe o nome: ");
                pessoas[opcaoEditar][1] = input.nextLine().toUpperCase();
                System.out.println("Cliente alterado com sucesso! \n");
                menuPrincipal();
                break;
            case 2:
                consultarTiposObjetos();
                System.out.print("Informe o código do tipo de objeto que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Descrição do tipo de objeto: ");
                tiposObjeto[opcaoEditar] = input.nextLine().toUpperCase();
                System.out.println("Tipo de objeto alterado com sucesso! \n");
                menuPrincipal();
                break;
            case 3:
                consultarObjetos();
                System.out.print("Informe o código do objeto que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Nome do objeto: ");
                objetos[opcaoEditar][0] = input.nextLine().toUpperCase();
                System.out.print("Tipo de objeto: ");
                objetos[opcaoEditar][1] = input.nextLine().toUpperCase();
                System.out.println("Objeto alterado com sucesso! \n");
                menuPrincipal();
                break;
            case 4:
                consultarEmprestimos();
                System.out.print("Informe o código do empréstimo que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Nome do objeto: ");
                empObjetos[opcaoEditar][0] = input.nextLine().toUpperCase();
                System.out.print("Quem emprestou: ");
                empObjetos[opcaoEditar][1] = input.nextLine().toUpperCase();
                System.out.print("Quem pegou emprestado: ");
                empObjetos[opcaoEditar][2] = input.nextLine().toUpperCase();
                System.out.println("Empréstimo alterado com sucesso! \n");
                menuPrincipal();
                break;
            case 5:
                consultarManutencoes();
                System.out.print("Informe o código da manutenção que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Nome do objeto: ");
                manutObjetos[opcaoEditar][0] = input.nextLine().toUpperCase();
                System.out.print("Descrição da manut.: ");
                manutObjetos[opcaoEditar][1] = input.nextLine().toUpperCase();
                System.out.print("Status(): ");
                manutObjetos[opcaoEditar][2] = input.nextLine().toUpperCase();
                System.out.println("Manutenção alterada com sucesso! \n");
                break;
            case 6: menuPrincipal();
                break;
            case 7: System.exit(0);
                break;
            default: System.out.println("Opção inválida!");
                menuEditar();
        }
    }
    
    public static void consultarPessoas(){
        System.out.println("\n==== PESSOAS CADASTRADAS ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Código: " + x);
            System.out.println("CPF: " + pessoas[x][0]);
            System.out.println("Nome: " + pessoas[x][1]);
            System.out.println("==============");
        }
    }
    
    public static void consultarTiposObjetos(){
        System.out.println("\n==== TIPOS DE OBJETOS CADASTRADOS ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Código: " + x);
            System.out.println("Tipo de objeto: " + tiposObjeto[x]);
            System.out.println("==============");
        }
    }
    
    /*
    public static void consultarObjetosEmManutencao(){                          //VER SE É NECESSÁRIO
        System.out.println("\n==== OBJETOS EM MANUTENCAO ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Tipo de objeto: " + objetosEmManutencao[x]);
            System.out.println("==============");
        }
    } */
    
    public static void consultarObjetos(){
        System.out.println("\n==== OBJETOS CADASTRADOS ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Código: " + x);
            System.out.println("Nome: " + objetos[x][0]);
            System.out.println("Tipo de objeto: " + objetos[x][1]);
            System.out.println("Situação: " + objetos[x][2]);
            System.out.println("==============");
        }
    }
    
    public static void consultarManutencoes(){
        System.out.println("\n==== MANUTENÇÕES CADASTRADAS ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Código: " + x);
            System.out.println("Nome objeto: " + manutObjetos[x][0]);
            System.out.println("Descrição da manut.: " + manutObjetos[x][1]);
            System.out.println("Status: " + manutObjetos[x][2]);
            System.out.println("==============");
        }
    }
    
    public static void consultarEmprestimos(){
     System.out.println("\n==== EMPRÉSTIMOS CADASTRADOS ====");
        for (int x = 0; x < 3; x++) {
            System.out.println("Código: " + x);
            System.out.println("Nome objeto: " + empObjetos[x][0]);
            System.out.println("Quem emprestou: " + empObjetos[x][1]);
            System.out.println("Quem pegou emprestado: " + empObjetos[x][2]);
            System.out.println("==============");
        }   
    }
    
    public static void consultarObjetosSituacao(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Deseja consultar pelo tipo de objeto? (1=SIM / 2=NÂO)");
        int opcao = input.nextInt();
        if (opcao == 1){
            consultarTiposObjetos();
            System.out.print("Informe o código do tipo de objeto que deseja consultar: ");
            int opcaoTipo = input.nextInt();
            for (int x=0; x<tiposObjeto.length; x++){
                if (objetos[x][1] == tiposObjeto[opcaoTipo]){
                    if (objetos[x][2] == "DISPONIVEL"){
                        System.out.println("===== OBJETOS DISPONÍVEIS =====");
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                        System.out.println("==============");  
                    }
                    if (objetos[x][2] == "EMPRESTADO"){
                        System.out.println("\n===== OBJETOS EMPRESTADOS =====");
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                        System.out.println("==============");  
                    }
                    if (objetos[x][2] == "BAIXADO"){
                        System.out.println("\n===== OBJETOS BAIXADOS =====");  
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                        System.out.println("==============");  
                    }
                    if (objetos[x][2] == "EM MANUTENCAO"){
                        System.out.println("\n===== OBJETOS EM MANUTENCAO =====");  
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                        System.out.println("==============");  
                    }
                }
            }
        }
        
        if (opcao == 2){
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][2] == "DISPONIVEL"){
                  System.out.println("===== OBJETOS DISPONÍVEIS =====");
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                  System.out.println("==============");  
                }
                if (objetos[x][2] == "EMPRESTADO"){
                  System.out.println("\n===== OBJETOS EMPRESTADOS =====");
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                  System.out.println("==============");  
                }
                if (objetos[x][2] == "BAIXADO"){
                  System.out.println("\n===== OBJETOS BAIXADOS =====");  
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                  System.out.println("==============");  
                }
                if (objetos[x][2] == "EM MANUTENCAO"){
                  System.out.println("\n===== OBJETOS EM MANUTENCAO =====");  
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                  System.out.println("==============");  
                }
            }
        }    
    }
}
