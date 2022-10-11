package pi.ref323070.univates;

public class Pessoas {
    
    String nome, telefone;
    int cpf;
    
    public void consultar(String nome, String telefone, int cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
    }
    
}
