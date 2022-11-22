package pi.ref323070.univates;

import java.util.Scanner;

//552155 - DANIEL KISTEMACHER DA SILVA

public class projetoDanielKistemacher_editado {
    static String pessoas[][] = new String[3][2];
    static String tiposObjeto[] = new String[3];
    static String objetos[][] = new String[5][5];
    static String manutObjetos[][] = new String[3][4];
    static String empObjetos[][] = new String[3][4];
    
    public static void main(String[] args) {
        inicializaCadastros();
        menuPrincipal();
    }

    static void inicializaCadastros() {
        //inicializa Pessoas
        for (int x = 0; x < pessoas.length; x++) {
            for (int y = 0; y < 2; y++) {
                pessoas[x][y] = "";
            }
        }
        //inicializa Tipos de Objetos
        for (int x = 0; x < tiposObjeto.length; x++) {
            tiposObjeto[x] = "";
        }
        //inicializa Objetos
        for (int x = 0; x < objetos.length; x++) {
            for (int y = 0; y < 5; y++) {
                objetos[x][y] = "";
            }
        }
        //inicializa Manutenção de Objetos
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                manutObjetos[x][y] = "";
            }
        }
        //inicializa Empréstimos de Objetos
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
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
        System.out.println(" ____________ MENU PRINCIPAL _____________ ");
        System.out.println("|                                         |");
        System.out.println("|             1. Incluir                  |");
        System.out.println("|             2. Consultar                |");
        System.out.println("|             3. Editar                   |");
        System.out.println("|             4. Excluir                  |");
        System.out.println("|             5. Cadastrar manutenção     |");
        System.out.println("|             6. Encerrar manutenção      |");
        System.out.println("|             7. Sair                     |");
        System.out.println("|_________________________________________|");
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
                        objetos[opcao][2] = "EM MANUTENCAO";
                        input.nextLine();
                        System.out.print("Descrição da manutenção: ");
                        manutObjetos[linha][1] = input.nextLine().toUpperCase();
                        manutObjetos[linha][2] = "EM ABERTO";
                        System.out.println("Manutenção cadastrada com sucesso! \n");
                    } else {
                        System.out.println("Objeto indisponível para manutenção!");
                    }
                }
                menuPrincipal();
                break;
            case 6: 
                consultarManutencoes();
                System.out.print("Informe o código da manutenção que deseja encerrar: ");
                int codigoManut = input.nextInt();
                manutObjetos[codigoManut][2] = "ENCERRADA";
                consultarObjetos();
                System.out.print("Informe o código do objeto: ");
                int codigoObjeto = input.nextInt();
                objetos[codigoObjeto][2] = "DISPONIVEL";
                System.out.println("Manutenção encerrada com sucesso!\n");
                menuPrincipal();
                break;
            case 7: System.exit(0);
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
            System.out.println("\n _______________ MENU INCLUIR _______________");
            System.out.println(" 1. Incluir pessoa");
            System.out.println(" 2. Incluir tipos de objeto");
            System.out.println(" 3. Incluir objeto");
            System.out.println(" 4. Incluir empréstimo");
            System.out.println(" 5. Incluir devolução de empréstimo");
            System.out.println(" 6. Incluir baixa de objeto");
            System.out.println(" 7. Voltar ao menu principal");
            System.out.println(" 8. Sair");
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
                    menuIncluir();
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
                    menuIncluir();
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
                    menuIncluir();
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
                            consultarPessoas();
                            System.out.print("Código do funcionário que emprestou: ");
                            int codigoFunc = input.nextInt();
                            empObjetos[linha][1] = pessoas[codigoFunc][1];
                            System.out.print("Código do funcionário que pegou: ");
                            int codigoFunc2 = input.nextInt();
                            empObjetos[linha][2] = pessoas[codigoFunc2][1];
                            empObjetos[linha][3] = "EM ABERTO";
                            System.out.println("Empréstimo cadastrado com sucesso! \n");
                            objetos[opcao][2] = "EMPRESTADO";
                        } else {
                            System.out.println("Este objeto não está disponível, portanto não pode ser emprestado! \n");
                        }
                    }
                    menuIncluir();
                    break;
                case 5:
                    consultarEmprestimos();
                    System.out.print("Informe o código do empréstimo que deseja devolver: ");
                    int codigoEmp = input.nextInt();
                    consultarObjetos();
                    System.out.print("Informe o código do objeto que deseja devolver: ");
                    int codigoObjeto = input.nextInt();
                    objetos[codigoObjeto][2] = "DISPONIVEL";
                    empObjetos[codigoEmp][3] = "DEVOLVIDO";
                    System.out.println("Empréstimo devolvido com sucesso!");
                    menuIncluir();
                    break;
                case 6:
                    consultarObjetos();
                    System.out.print("Informe o código do objeto a ser baixado: ");
                    int opcao = input.nextInt();
                    
                    if (objetos[opcao][2] == "DISPONIVEL"){
                        objetos[opcao][2] = "BAIXADO";
                        System.out.println("Objeto baixado com sucesso!");
                    } else {
                        System.out.println("Este objeto está em manutenção ou emprestado, portanto não pode ser baixado!");
                    }
                    menuIncluir();
                    break;
                case 7: menuPrincipal();
                    break;
                case 8: System.exit(0);
                    break;
                default: System.out.println("Opção inválida!");
                    menuIncluir();
            }
        }
    }

    public static void menuConsultar() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n _______________ MENU CONSULTAR _______________");
        System.out.println(" 1. Consultar pessoas");
        System.out.println(" 2. Consultar tipos de objetos");
        System.out.println(" 3. Consultar objetos");
        System.out.println(" 4. Consultar empréstimos");
        System.out.println(" 5. Consultar manutenções");
        System.out.println(" 6. Consultar objetos conforme situação");
        System.out.println(" 7. Voltar ao menu principal");
        System.out.println(" 8. Sair");
        System.out.print("Digite o número da opção: ");

        int opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1: consultarPessoas();
                    menuConsultar();
                break;
            case 2: consultarTiposObjetos();
                    menuConsultar();
                break;
            case 3: consultarObjetos();
                    menuConsultar();
                break;
            case 4: consultarEmprestimos();
                    menuConsultar();
                break;
            case 5: consultarManutencoes();
                    menuConsultar();
                break;
            case 6: consultarObjetosSituacao();
                    menuConsultar();
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
        System.out.println("\n _______________ MENU EXCLUIR _______________");
        System.out.println(" 1. Excluir Pessoas");
        System.out.println(" 2. Excluir tipos de objetos");
        System.out.println(" 3. Excluir objetos");
        System.out.println(" 4. Excluir empréstimos");
        System.out.println(" 5. Excluir manutenções");
        System.out.println(" 6. Voltar ao menu principal");
        System.out.println(" 7. Sair");
        System.out.print("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                consultarPessoas();
                System.out.print("Informe o código da pessoa que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                pessoas[opcaoExcluir][0] = "";
                pessoas[opcaoExcluir][1] = "";
                System.out.println("Cliente excluído com sucesso! \n");
                menuExcluir();
                break;
            case 2:
                consultarTiposObjetos();
                System.out.print("Informe o código do tipo de objeto que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                tiposObjeto[opcaoExcluir] = "";
                System.out.println("Tipo de objeto excluído com sucesso! \n");
                menuExcluir();
                break;
            case 3:
                consultarObjetos();
                System.out.print("Informe o código do objeto que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                if (objetos[opcaoExcluir][2] == "DISPONIVEL" ){
                    objetos[opcaoExcluir][0] = "";
                    objetos[opcaoExcluir][1] = "";
                    objetos[opcaoExcluir][2] = "";
                    System.out.println("Objeto excluído com sucesso! \n");
                } else {
                    System.out.println("Este objeto não está disponível, portanto não pode ser excluído!");
                }    
                menuExcluir();
                break;
            case 4: 
                consultarEmprestimos();
                System.out.print("Informe o código do empréstimo que você deseja excluir: ");
                opcaoExcluir = input.nextInt();
                input.nextLine();
                if (empObjetos[opcaoExcluir][3] != "DEVOLVIDO"){
                    empObjetos[opcaoExcluir][0] = "";
                    empObjetos[opcaoExcluir][1] = "";
                    empObjetos[opcaoExcluir][2] = "";
                    System.out.println("Empréstimo excluído com sucesso! \n");
                } else {
                    System.out.println("Este empréstimo está em aberto, portanto não pode ser excluído!");
                }    
                menuExcluir();
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
                menuExcluir();
                break;
            case 6: menuPrincipal();
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
        System.out.println("\n _______________ MENU EDITAR _______________");
        System.out.println(" 1. Editar pessoas");
        System.out.println(" 2. Editar tipos de objetos");
        System.out.println(" 3. Editar objetos");
        System.out.println(" 4. Editar empréstimos");
        System.out.println(" 5. Editar manutenções");
        System.out.println(" 6. Voltar ao menu principal");
        System.out.println(" 7. Sair");
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
                menuEditar();
                break;
            case 2:
                consultarTiposObjetos();
                System.out.print("Informe o código do tipo de objeto que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Descrição do tipo de objeto: ");
                tiposObjeto[opcaoEditar] = input.nextLine().toUpperCase();
                System.out.println("Tipo de objeto alterado com sucesso! \n");
                menuEditar();
                break;
            case 3:
                consultarObjetos();
                System.out.print("Informe o código do objeto que você deseja editar: ");
                opcaoEditar = input.nextInt();
                input.nextLine();
                System.out.print("Nome do objeto: ");
                objetos[opcaoEditar][0] = input.nextLine().toUpperCase();
                consultarTiposObjetos();
                System.out.print("Informe o código do tipo de objeto: ");
                int opcao = input.nextInt();
                objetos[opcaoEditar][1] = tiposObjeto[opcao];
                System.out.println("Objeto alterado com sucesso! \n");
                menuEditar();
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
                menuEditar();
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
                menuEditar();
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
        System.out.println("\n _______________ PESSOAS CADASTRADAS _______________");
        for (int x = 0; x < pessoas.length; x++) {
            System.out.println(" Código: " + x);
            System.out.println(" CPF: " + pessoas[x][0]);
            System.out.println(" Nome: " + pessoas[x][1]);
            System.out.println("--------------------");
        }
    }
    
    public static void consultarTiposObjetos(){
        System.out.println("\n _______________ TIPOS DE OBJETOS CADASTRADOS _______________");
        for (int x = 0; x < tiposObjeto.length; x++) {
            System.out.println(" Código: " + x);
            System.out.println(" Tipo de objeto: " + tiposObjeto[x]);
            System.out.println("--------------------");
        }
    }
    
    public static void consultarObjetos(){
        System.out.println("\n _______________ OBJETOS CADASTRADOS _______________");
        for (int x = 0; x < objetos.length; x++) {
            System.out.println(" Código: " + x);
            System.out.println(" Nome: " + objetos[x][0]);
            System.out.println(" Tipo de objeto: " + objetos[x][1]);
            System.out.println(" Situação: " + objetos[x][2]);
            System.out.println("--------------------");
        }
    }
    
    public static void consultarManutencoes(){
        System.out.println("\n _______________ MANUTENÇÕES CADASTRADAS _______________");
        for (int x = 0; x < manutObjetos.length; x++) {
            System.out.println(" Código: " + x);
            System.out.println(" Nome objeto: " + manutObjetos[x][0]);
            System.out.println(" Descrição da manut.: " + manutObjetos[x][1]);
            System.out.println(" Situação: " + manutObjetos[x][2]);
            System.out.println("--------------------");
        }
    }
    
    public static void consultarEmprestimos(){
     System.out.println("\n _______________ EMPRÉSTIMOS CADASTRADOS _______________");
        for (int x = 0; x < empObjetos.length; x++) {
            System.out.println(" Código: " + x);
            System.out.println(" Nome objeto: " + empObjetos[x][0]);
            System.out.println(" Quem emprestou: " + empObjetos[x][1]);
            System.out.println(" Quem pegou emprestado: " + empObjetos[x][2]);
            System.out.println(" Situação: " + empObjetos[x][3]);
            System.out.println("--------------------");
        }   
    }
    
    public static void consultarObjetosSituacao(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Deseja consultar pelo tipo de objeto? Digite '1'(Sim) ou '2'(Não): ");
        int opcao = input.nextInt();
        if (opcao == 1){
            consultarTiposObjetos();
            System.out.print("Informe o código do tipo de objeto que deseja consultar: ");
            int opcaoTipo = input.nextInt();
            System.out.println("_______________ OBJETOS DISPONÍVEIS _______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][1] == tiposObjeto[opcaoTipo]){
                    if (objetos[x][2] == "DISPONIVEL"){
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                    }
                }
            }
            System.out.println("\n_______________ OBJETOS EMPRESTADOS _______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][1] == tiposObjeto[opcaoTipo]){
                    if (objetos[x][2] == "EMPRESTADO"){
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                    }
                }
            }    
            System.out.println("\n_______________ OBJETOS BAIXADOS _______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][1] == tiposObjeto[opcaoTipo]){
                    if (objetos[x][2] == "BAIXADO"){
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                    }
                }    
            }
            System.out.println("\n_______________ OBJETOS EM MANUTENCAO _______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][1] == tiposObjeto[opcaoTipo]){
                    if (objetos[x][2] == "EM MANUTENCAO"){
                        System.out.println("Nome: " + objetos[x][0]);
                        System.out.println("Tipo de objeto: " + objetos[x][1]);
                    }
                }
            }
        }
        if (opcao == 2){
            System.out.println("_______________ OBJETOS DISPONÍVEIS _______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][2] == "DISPONIVEL"){
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                }
            }
            System.out.println("\n_______________ OBJETOS EMPRESTADOS _______________");
            for (int x=0; x<objetos.length; x++){    
                if (objetos[x][2] == "EMPRESTADO"){
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                }
            }
            System.out.println("\n_______________ OBJETOS BAIXADOS_______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][2] == "BAIXADO"){
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                }
            }
            System.out.println("\n_______________ OBJETOS EM MANUTENCAO_______________");
            for (int x=0; x<objetos.length; x++){
                if (objetos[x][2] == "EM MANUTENCAO"){
                  System.out.println("Nome: " + objetos[x][0]);
                  System.out.println("Tipo de objeto: " + objetos[x][1]);
                }
            }    
        }    
    }
}