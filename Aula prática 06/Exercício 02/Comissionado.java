public class Comissionado extends Mensalista 
{
    private double salario;
    private double comissao;

    public Comissionado()
    {
        super();
        comissao = 0.0;
        salario = 0.0;
    }
    
    public Comissionado (String nome, String sobrenome, String cpf, double salario, double comissao)
    {
        super(nome, sobrenome, cpf, salario);
        this.comissao = comissao;
        calcularSalario();
    }

    public void calcularSalario()
    {
        salario = super.getSalario() + comissao;
    }

    public String dados()
    {
        return super.dados() + "\nSalário com comissão: " + salario;
    }
}