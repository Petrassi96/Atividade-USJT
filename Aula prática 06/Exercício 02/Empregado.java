public class Empregado extends PessoaFisica
{
    public Empregado()
    {
        super();
    }

    public Empregado (String nome, String sobrenome, String cpf)
    {
        super(nome, sobrenome, cpf);
    }

    public String dados()
    {
        return super.dados();
    }
}