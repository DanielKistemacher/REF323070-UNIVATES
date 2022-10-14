package pi.ref323070.univates;

import java.util.Scanner;

public class ProjetoIntegrador {
    public static void main(String[] args) {
        menuPrincipal();        
    }
    public static void menuPrincipal(){
        Scanner input = new Scanner(System.in);
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

        opcaoEscolhida = input.nextInt();

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

        Scanner input = new Scanner(System.in);

        System.out.println("1. Incluir pessoa");
        System.out.println("2. Incluir tipos de objeto");
        System.out.println("3. Incluir objeto");
        System.out.println("4. Voltar ao menu principal");
        System.out.println("5. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            case 1: /*IncluirPessoas();*/ System.out.println("Não implementado!");
                    break;
            case 2: incluirTipoObjeto();
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

        Scanner input = new Scanner(System.in);

        System.out.println("1. Consultar pessoas");
        System.out.println("2. Consultar tipos de objetos");
        System.out.println("3. Consultar objetos");
        System.out.println("4. Consultar manutenções");
        System.out.println("5. Consultar empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            case 1: /*consultaPessoa();*/ System.out.println("Não implementado!");
                break;
            case 2: /*consultaTipoObjeto();*/ System.out.println("Não implementado!");
                break;
            case 3: /*consultaObjeto();*/ System.out.println("Não implementado!");
                break;
            case 4: consultarManutencao();
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

        Scanner input = new Scanner(System.in);

        System.out.println("1. Excluir Pessoas");
        System.out.println("2. Excluir tipos de objetos");
        System.out.println("3. Excluir objetos");
        System.out.println("4. Excluir manutenções");
        System.out.println("5. Excluir empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

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

        Scanner input = new Scanner(System.in);

        System.out.println("1. Editar pessoas");
        System.out.println("2. Editar tipos de objetos");
        System.out.println("3. Editar objetos");
        System.out.println("4. Editar manutenções");
        System.out.println("5. Editar empréstimos");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

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
    
    public static void cadastrarManutencao(){
        int opcao;
        String nomeObjeto, descricao, status;
        boolean cadastrar=true;
        
        Scanner input = new Scanner(System.in);
        
        String matrizManut[][] = new String[1][3];
        
        while (cadastrar == true){
            for (int x=0; x<matrizManut.length; x++){
                for (int y=0; y<matrizManut.length; y++){
                        
                        int linha=0;
                                                
                        System.out.println("Preencha os campos necessários: ");
                        System.out.print("Objeto: ");
                            nomeObjeto = input.nextLine();
                            matrizManut[x + linha][y] = nomeObjeto;
                        System.out.print("Descrição manut.: ");
                            descricao = input.nextLine();
                            matrizManut[x + linha][(y + 1)] = descricao;
                        System.out.print("Status : ");
                            status = input.nextLine();
                            matrizManut[x + linha][(y + 2)] = status;
                        System.out.println("Manutenção cadastrada com sucesso !");
                        
                        linha++;
                        
                        
                }
            }
            System.out.print("Continuar 1 sim 2 nao ?");
                        opcao = input.nextInt();
                        if (opcao == 1){
                            cadastrar = true;
                        }
                        if (opcao == 0){
                            cadastrar = false;
                            break;
                        }
        }
            
            for (int a = 0; a < 1; a ++){
                for (int b = 0; b < 3; b ++){
                                System.out.print(matrizManut[a][b] + "      |     ");
                }
            }
                        
            menuPrincipal();
                        
                        
                        /*System.out.println("Digite 1 para cadastrar uma nova manutenção ou 0 para sair.");
                            opcao = input.nextInt();

                                switch (opcao){
                                    case 1:
                                        break;
                                    case 0:
                                        menuPrincipal();
                                    default:
                                        System.out.println("Opção inválida!");
                                }*/
    }
    
    public static void consultarManutencao(){
        System.out.println("Não implementado");
    }
    
    public static void incluirTipoObjeto(){
        String nome;
        int codigo, opcao;
        boolean cadastrar = true;
        
        String tipoObjeto[] = new String[999];
        
        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        
        while (cadastrar==true){
            for (int x=0; x<tipoObjeto.length; x++){
                System.out.print("Digite o nome do tipo de objeto: ");
                nome = input.nextLine();
                
                System.out.println("Tipo de objeto cadastrado!");
                System.out.print("Digite '1' p/ sair ou '2' para cadastrar um novo tipo: ");
                opcao = input2.nextInt();
                
                if (opcao == 1){
                    cadastrar = false;
                    break;
                }
                if (opcao == 2){
                    cadastrar = true;
                }
            
            }
        }
        
        for (int x=0; x<tipoObjeto.length; x++){
                System.out.println(tipoObjeto[x]);
        }
    }
}
