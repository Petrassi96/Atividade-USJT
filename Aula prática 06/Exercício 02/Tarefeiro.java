public class Tarefeiro extends Empregado 
{
    private int tarefasRealizadas;
    private double valorTarefa;
    private double salario;

    public Tarefeiro()
    {
        super();
        tarefasRealizadas = 0;
        valorTarefa = 0.0;
        salario = 0.0;
    }

    public Tarefeiro(String nome, String sobrenome, String cpf, int tarefasRealizadas, double valorTarefa)
    {
        super(nome, sobrenome, cpf);
        this.tarefasRealizadas = tarefasRealizadas;
        this.valorTarefa = valorTarefa;
    }

    public int getTarefasRealizadas()
    {
        return tarefasRealizadas;
    }

    public void setTarefasRealizadas(int tarefasRealizadas)
    {
        this.tarefasRealizadas = tarefasRealizadas;
        calcularSalario();
    }

    public double getValorTarefa()
    {
        return valorTarefa;
    }

    public void setValorTarefa(int valorTarefa)
    {
        this.valorTarefa = valorTarefa;
        calcularSalario();
    }

    public void calcularSalario()
    {
        salario = tarefasRealizadas * valorTarefa;
    }

    public String dados()
    {
        return super.dados() + "\nSalário: " + salario;
    }
}