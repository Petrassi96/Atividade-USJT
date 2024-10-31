public class Mensalista extends Empregado
{
    private double salario;

    public Mensalista()
    {
        super();
        salario = 0.0;
    }

    public Mensalista (String nome, String sobrenome, String cpf, double salario)
    {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalario()
    {
        return salario;
    }

    public String dados()
    {
        return super.dados() + "\nSalário: " + salario;
    }
}