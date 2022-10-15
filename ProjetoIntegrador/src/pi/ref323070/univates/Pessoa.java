package pi.ref323070.univates;

public class Pessoa 
{
   
    private int cpf;
    private String nome;

    public Pessoa(int id, String n) {
        this.setCpf(id);
        this.setNome (n);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString()
    {
        return "CPF: " + this.getCpf() + "\nNome: " + this.getNome();
    }
}
