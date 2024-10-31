public class Horista extends Empregado
{
    private int horasTrabalhadas;
    private double valorHora;
    private double salario;

    public Horista()
    {
        super();
        horasTrabalhadas = 0;
        valorHora = 0.0;
        salario = 0.0;
    }

    public Horista (String nome, String sobrenome, String cpf)
    {
        super(nome, sobrenome, cpf);
        horasTrabalhadas = 0;
        valorHora = 0.0;
        salario = 0.0;
    }

    public int getHorasTrabalhadas() 
    {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) 
    {
        this.horasTrabalhadas = horasTrabalhadas;
        calcularSalario();
    }

    public double getValorHora() 
    {
        return valorHora;
    }

    public void setValorHora(double valorHora) 
    {
        this.valorHora = valorHora;
        calcularSalario();
    }

    public void calcularSalario()
    {
        salario = valorHora * horasTrabalhadas;
    }

    public double salario()
    {
        return salario;
    }

    public String dados()
    {
        return super.dados() + "\nSalário: " + salario;
    }
}