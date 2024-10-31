public class Cheque extends Pagamento
{
    private String numeroCheque;

    public Cheque()
    {
        super();
        numeroCheque = "";
    }
    public Cheque (String nome, String cpf, double valorPago, String numeroCheque)
    {
        super(nome, cpf, valorPago);
        this.numeroCheque = numeroCheque;
    }
    public String getNumeroCheque() 
    {
        return numeroCheque;
    }
    public void setNumeroCheque(String numeroCheque) 
    {
        this.numeroCheque = numeroCheque;
    }
}