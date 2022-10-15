package pi.ref323070.univates;

public class Pessoa 
{
    private int cpf;
    private String nome, telefone;

    public Pessoa(int id, String n, String tel) {
        this.setCpf(id);
        this.setNome (n);
        this.setTelefone(tel);
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString()
    {
        return "CPF: " + this.getCpf() + "\nNome: " + this.getNome() + "Telefone: " + this.getTelefone();
    }
}
