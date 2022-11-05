package pi.ref323070.univates;

import java.util.Scanner;

public class projetoDanielKistemacher {

    public static void main(String[] args) {
        menuPrincipal();
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
        System.out.println("Digite o número da opção: ");

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
                cadastrarEmprestimo();
                break;
            case 6:
                cadastrarManutencao();
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida!");
                menuPrincipal();
        }
    }

    public static void menuIncluir() {
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

        switch (opcaoEscolhida) {
            case 1:
                incluirPessoa();
                break;
            case 2:
                incluirTipoObjeto();
                break;
            case 3:
                incluirObjeto();
                break;
            case 4:
                menuPrincipal();
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida!");
                menuIncluir();
        }
    }

    public static void menuConsultar() {
        int opcaoEscolhida;

        Scanner menuConsultar = new Scanner(System.in);

        System.out.println("===== MENU CONSULTAR =====");
        System.out.println("1. Consultar pessoas");
        System.out.println("2. Consultar tipos de objetos");
        System.out.println("3. Consultar objetos");
        System.out.println("4. Consultar empréstimos");
        System.out.println("5. Consultar manutenções");
        System.out.println("6. Voltar ao menu principal");
        System.out.println("7. Sair");
        System.out.println("Digite o número da opção: ");

        opcaoEscolhida = menuConsultar.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                consultarPessoa();
                break;
            case 2:
                consultarTipoObjeto();
                break;
            case 3:
                consultarObjeto();
                break;
            case 4:
                consultarEmprestimo();
                break;
            case 5:
                consultarManutencao();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida!");
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
                excluirPessoa();
                break;
            case 2:
                excluirTipoObjeto();
                break;
            case 3:
                excluirObjeto();
                break;
            case 4:
                excluirEmprestimo();
                break;
            case 5:
                excluirManutencao();
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
                editarPessoa();
                break;
            case 2:
                editarTipoObjeto();
                break;
            case 3:
                editarObjeto();
                break;
            case 4:
                editarEmprestimo();
                break;
            case 5:
                editarManutencao();
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

    public static void incluirPessoa() {
        System.out.println("Não implementado.");
    }

    public static void incluirTipoObjeto() {
        System.out.println("Não implementado.");
    }

    public static void incluirObjeto() {
        System.out.println("Não implementado.");
    }

    public static void consultarPessoa() {
        System.out.println("Não implementado.");
    }

    public static void consultarTipoObjeto() {
        System.out.println("Não implementado.");
    }

    public static void consultarObjeto() {
        System.out.println("Não implementado.");
    }

    public static void consultarManutencao() {
        System.out.println("Não implementado.");
    }

    public static void consultarEmprestimo() {
        System.out.println("Não implementado.");
    }

    public static void excluirPessoa() {
        System.out.println("Não implementado.");
    }

    public static void excluirTipoObjeto() {
        System.out.println("Não implementado.");
    }

    public static void excluirObjeto() {
        System.out.println("Não implementado.");
    }

    public static void excluirManutencao() {
        System.out.println("Não implementado.");
    }

    public static void excluirEmprestimo() {
        System.out.println("Não implementado.");
    }

    public static void editarPessoa() {
        System.out.println("Não implementado.");
    }

    public static void editarTipoObjeto() {
        System.out.println("Não implementado.");
    }

    public static void editarObjeto() {
        System.out.println("Não implementado.");
    }

    public static void editarManutencao() {
        System.out.println("Não implementado.");
    }

    public static void editarEmprestimo() {
        System.out.println("Não implementado.");
    }

    public static void cadastrarEmprestimo() {
        System.out.println("Não implementado.");
    }

    public static void cadastrarManutencao() {
        System.out.println("Não implementado.");
    }
}