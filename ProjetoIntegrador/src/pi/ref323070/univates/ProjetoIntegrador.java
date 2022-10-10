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
        System.out.println("6. Sair");
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
            case 6: break;
            default: 
                    System.out.println("Opção inválida!");
                    menuPrincipal();
            }
    }

    public static void menuIncluir(){
        int opcaoEscolhida;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Incluir Pessoa");
        System.out.println("2. Incluir Tipos de objeto");
        System.out.println("3. Incluir Objeto");
        System.out.println("4. Incluir Manutenção");
        System.out.println("5. Voltar ao menu principal");
        System.out.println("6. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            /* case 1: incluirPessoa();
                    break;
            case 2: incluirTipoObjeto();
                    break;
            case 3: incluirObjeto();
                    break; 
            case 4: incluirManutencao();
                    break; */
            case 5: menuPrincipal();
                    break;
            case 6: break;
            default: 
                System.out.println("Opção inválida!");
                menuIncluir();
            }
    }

    public static void menuConsultar(){
        int opcaoEscolhida;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Consultar Pessoas");
        System.out.println("2. Consultar Tipos de objetos");
        System.out.println("3. Consultar Objetos");
        System.out.println("4. Consultar Manutenções");
        System.out.println("5. Voltar ao menu principal");
        System.out.println("6. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            /* case 1: consultaPessoa();
                break;
            case 2: consultaTipoObjeto();
                break;
            case 3: consultaObjeto();
                break;
            case 4: consultaManutencao();
                break; */
            case 5: menuPrincipal();
                break;
            case 6: break;
            default: 
                System.out.println("Opção inválida!");
                menuConsultar();
        }
    }

    public static void menuExcluir(){
        int opcaoEscolhida;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Excluir Pessoas");
        System.out.println("2. Excluir Tipos de objetos");
        System.out.println("3. Excluir Objetos");
        System.out.println("4. Excluir Manutenções");
        System.out.println("5. Voltar ao menu principal");
        System.out.println("6. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            /* case 1: excluirPessoa();
                break;
            case 2: excluirTipoObjeto();
                break;
            case 3: excluirObjeto();
                break;
            case 4: excluirManutencao();
                break; */
            case 5: menuPrincipal();
                break;
            case 6: break;
            default: 
                System.out.println("Opção inválida!");
                menuExcluir();
        }
    }

    public static void menuEditar(){
        int opcaoEscolhida;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Editar Pessoas");
        System.out.println("2. Editar Tipos de objetos");
        System.out.println("3. Editar Objetos");
        System.out.println("4. Editar Manutenções");
        System.out.println("5. Voltar ao menu principal");
        System.out.println("6. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            /* case 1: editarPessoa();
                break;
            case 2: editarTipoObjeto();
                break;
            case 3: editarObjeto();
                break;
            case 4: editarManutencao();
                break; */
            case 5: menuPrincipal();
                break;
            case 6: break;
            default: 
                System.out.println("Opção inválida!");
                menuEditar();
        }
    }
}
