public class Professor
{
    private String nome;
    private int idade;

    public String getDados()
    {
        return "Professor: " + nome + "\nIdade: " + idade;
    }

    public Professor (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }
    public int getIdade() 
    {
        return idade;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public void setIdade (int idade)
    {
        this.idade = idade;
    }
}