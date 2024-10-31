public class Boleto extends Pagamento
{
    private String numeroBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto()
    {
        super();
        dia = 0;
        mes = 0;
        ano = 0;
        numeroBoleto = "";
    }
    public Boleto (String nome, String cpf, double valorPago, String numeroBoletoString,
    int dia, int mes, int ano)
    {
        super(nome, cpf, valorPago);
        this.numeroBoleto = numeroBoletoString;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String getNumeroBoleto() 
    {
        return numeroBoleto;
    }
    public void setNumeroBoleto(String numeroBoleto) 
    {
        this.numeroBoleto = numeroBoleto;
    }
    public int getDia() 
    {
        return dia;
    }
    public void setDia(int dia) 
    {
        this.dia = dia;
    }
    public int getMes() 
    {
        return mes;
    }
    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    public int getAno() 
    {
        return ano;
    }
    public void setAno(int ano) 
    {
        this.ano = ano;
    }
}