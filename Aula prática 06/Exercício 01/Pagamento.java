public class Pagamento
{
    private String nome;
    private String cpf;
    private double valorPago;

    public Pagamento()
    {
        nome = "";
        cpf = "";
        valorPago = 0.0;
    }
    public Pagamento (String nome, String cpf, double valorPago)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.valorPago = valorPago;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public double getValorPago() 
    {
        return valorPago;
    }

    public void setValorPago(double valorPago) 
    {
        this.valorPago = valorPago;
    }
}