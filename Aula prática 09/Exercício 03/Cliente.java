public class Cliente 
{
    String nome, fone;
    private int id;

    public String getNome()
    {
        return nome;
    }
    public String getFone()
    {
        return fone;
    }
    public int getId()
    {
        return id;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setFone(String fone)
    {
        this.fone = fone;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getDados()
    {
        return "Nome: " + getNome() + "\nTelefone: " +
        getFone() + "\nID: " + getId();
    }
}