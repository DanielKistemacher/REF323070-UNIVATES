package pi.ref323070.univates;

import java.util.Scanner;

public class ProjetoIntegrador {
    public static void main(String[] args) {
        
        String objetos[] = new String[999];
        
        menuPrincipal();        
    }
    public static void menuPrincipal(){
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
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuPrincipal.nextInt();

        switch (opcaoEscolhida){
            case 1: menuIncluir();
                break;
            case 2: menuConsultar();
                break;
            case 3: menuEditar();
                break;
            case 4: menuExcluir();
                break;
            case 5: System.out.println("Não implementado!");
                break;      
            case 6: cadastrarManutencao();
                break;
            case 7: break;
            default: 
                    System.out.println("Opção inválida!");
                    menuPrincipal();
            }
    }

    public static void menuIncluir(){
        int opcaoEscolhida;

        Scanner menuIncluir = new Scanner(System.in);

        System.out.println("===== MENU INCLUIR =====");
        System.out.println("1. Incluir pessoa");
        System.out.println("2. Incluir tipos de objeto");
        System.out.println("3. Incluir objeto");
        System.out.println("4. Voltar ao menu principal");
        System.out.println("5. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuIncluir.nextInt();

        switch (opcaoEscolhida){
            case 1: /*IncluirPessoas();*/ System.out.println("Não implementado!");
                    break;
            case 2: 
                    break;
            case 3: /*incluirObjeto();*/ System.out.println("Não implementado!");
                    break; 
            case 4: menuPrincipal();
                    break;
            case 5: break;
            default: 
                System.out.println("Opção inválida!");
                menuIncluir();
            }
    }

    public static void menuConsultar(){
        int opcaoEscolhida;

        Scanner menuConsultar = new Scanner(System.in);

        System.out.println("===== MENU CONSULTAR =====");
        System.out.println("1. Consultar pessoas");
        System.out.println("2. Consultar tipos de objetos");
        System.out.println("3. Consultar objetos");
        System.out.println("4. Consultar manutenções");
        System.out.println("5. Consultar empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuConsultar.nextInt();

        switch (opcaoEscolhida){
            case 1: /*consultaPessoa();*/ System.out.println("Não implementado!");
                break;
            case 2: /*consultaTipoObjeto();*/ System.out.println("Não implementado!");
                break;
            case 3: /*consultaObjeto();*/ System.out.println("Não implementado!");
                break;
            case 4: /*consultarManutencao();*/ System.out.println("Não implementado!");
                break;
            case 5: /*consultaEmprestimo();*/ System.out.println("Não implementado!");
            case 6: menuPrincipal();
                break;
            case 7: break;
            default: 
                System.out.println("Opção inválida!");
                menuConsultar();
        }
    }

    public static void menuExcluir(){
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

        switch (opcaoEscolhida){
            case 1: /*excluirPessoa();*/ System.out.println("Não implementado!");
                break;
            case 2: /*excluirTipoObjeto();*/ System.out.println("Não implementado!");
                break;
            case 3: /*excluirObjeto();*/ System.out.println("Não implementado!");
                break;
            case 4: /*excluirManutencao();*/ System.out.println("Não implementado!");
                break;
            case 5: /*excluirEmprestimo();*/ System.out.println("Não implementado!");
                break;
            case 6: menuPrincipal();
                break;
            case 7: break;
            default: 
                System.out.println("Opção inválida!");
                menuExcluir();
        }
    }

    public static void menuEditar(){
        int opcaoEscolhida;

        Scanner menuEditar = new Scanner(System.in);

        System.out.println("===== MENU EDITAR =====");
        System.out.println("1. Editar pessoas");
        System.out.println("2. Editar tipos de objetos");
        System.out.println("3. Editar objetos");
        System.out.println("4. Editar manutenções");
        System.out.println("5. Editar empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuEditar.nextInt();

        switch (opcaoEscolhida){
            case 1: /*editarPessoa();*/System.out.println("Não implementado!");
                break;
            case 2: /*editarTipoObjeto();*/System.out.println("Não implementado!");
                break;
            case 3: /*editarObjeto();*/System.out.println("Não implementado!");
                break;
            case 4: /*editarManutencao();*/System.out.println("Não implementado!");
                break;
            case 6: menuPrincipal();
                break;
            case 7: break;
            default: 
                System.out.println("Opção inválida!");
                menuEditar();
        }
    }
    
    public static void cadastrarManutencao()
    {
        int opcao;
        String nomeObjeto, descricao, status;
        boolean cadastrar=true;
        
        Scanner cadastrarManutencao = new Scanner(System.in);
        Scanner continuar = new Scanner(System.in);
        
        String matrizManut[][] = new String[1][3];
        
        while (cadastrar == true){
            for (int x=0; x<matrizManut.length; x++)
            {
                for (int y=0; y<matrizManut.length; y++)
                {
                        
                        int linha=0;
                                                
                        System.out.println("Preencha os campos necessários: ");
                        System.out.print("Objeto: ");
                            nomeObjeto = cadastrarManutencao.nextLine().toUpperCase();
                            matrizManut[x + linha][y] = nomeObjeto;
                        System.out.print("Descrição manut.: ");
                            descricao = cadastrarManutencao.nextLine().toUpperCase();
                            matrizManut[x + linha][(y + 1)] = descricao;
                        System.out.print("Status : ");
                            status = cadastrarManutencao.nextLine().toUpperCase();;
                            matrizManut[x + linha][(y + 2)] = status;
                        System.out.println("Manutenção cadastrada com sucesso !");
                        
                        linha++;
                }
            }
            System.out.print("Continuar 1 sim 2 nao ?");
                        opcao = continuar.nextInt();
                        if (opcao == 1)
                        {
                            cadastrar = true;
                        }
                        if (opcao == 0)
                        {
                            cadastrar = false;
                            break;
                        }
        }
            
            for (int a = 0; a < 1; a ++)
            {
                for (int b = 0; b < 3; b ++)
                {
                                System.out.print(matrizManut[a][b] + "      |     ");
                }
            }
            menuPrincipal();
    }
        
    public void incluirTipoObjeto(String[] vet)
    {
        String nome;
        int opcao;
        boolean cadastrar = true;
        
        Scanner incluirTipoObjeto = new Scanner (System.in);
        Scanner continuar = new Scanner (System.in);
        
        
        while (cadastrar == true)
        {
            for (int x = 0; x < vet.length; x++)
            {    
                    System.out.println("===== INCLUSÃO DE TIPO DE OBJETO =====");
                    System.out.println("Código: " + "00" + (x + 1));
                    System.out.print("Nome: ");
                    nome = incluirTipoObjeto.nextLine().toUpperCase();

                    vet[x] = nome;

                    System.out.println("Tipo '" + vet[x] + "' cadastrado com sucesso!");
                    System.out.println();
                        System.out.println("Digite 0 para sair;");
                        System.out.println("Digite 1 para continuar;");

                        opcao = continuar.nextInt();

                        if (opcao==1)
                        {
                            cadastrar = true;
                        }
                        if (opcao == 0)
                        {
                            break;
                        }
            }
            menuPrincipal();
        }
    }
        
    public static void consultarTipos(String[] vetor)
    {
        
        for (int x=0; x<vetor.length; x++)
        {
                System.out.println(vetor[x]);
        }
    }
}
