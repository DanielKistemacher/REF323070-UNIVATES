package pi.ref323070.univates;

import java.util.Scanner;

public class IncluirPessoas {
    int cpf;
    String nome;
    String telefone;
    
    public void incluirPessoa(){
        
        Scanner input = new Scanner(System.in);
                
        System.out.println("Digite o CPF da pessoa: ");
        nome = input.nextLine();
        
        System.out.println("Digite o nome da pessoa: ");
        cpf = input.nextInt();
        
        System.out.println("Digite o telefone da pessoa: ");
        telefone = input.nextLine();
        
        Pessoas p1 = new Pessoas();
        p1.consultar(nome, telefone, cpf);
    }
}
