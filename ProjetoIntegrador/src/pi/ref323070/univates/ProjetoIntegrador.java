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
            case 6: System.out.println("Não implementado!");
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

        System.out.println("1. Incluir Pessoa");
        System.out.println("2. Incluir Tipos de objeto");
        System.out.println("3. Incluir Objeto");
        System.out.println("4. Voltar ao menu principal");
        System.out.println("5. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            case 1: /*incluirPessoa();*/ System.out.println("Não implementado!");
                    break;
            case 2: /*incluirTipoObjeto();*/ System.out.println("Não implementado!");
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
            case 4: /*consultaManutencao();*/ System.out.println("Não implementado!");
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
}