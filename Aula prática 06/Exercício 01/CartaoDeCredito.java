public class CartaoDeCredito extends Pagamento
{
    private String numeroCartao;

    public CartaoDeCredito()
    {
        super();
        numeroCartao = "";
    }

    public CartaoDeCredito (String nome, String cpf, double valorPago, String numeroCartao)
    {
        super(nome, cpf, valorPago);
        this.numeroCartao = numeroCartao;
    }

    public String getNumero() 
    {
        return numeroCartao;
    }

    public void setNumero(String numeroCartao) 
    {
        this.numeroCartao = numeroCartao;
    }
}