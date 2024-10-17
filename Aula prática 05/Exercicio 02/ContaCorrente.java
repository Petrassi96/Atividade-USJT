public class ContaCorrente 
{
    private int numero;
    private int digito;
    private double saldo;
    private Agencia agencia;

    
    public ContaCorrente (int numero, double saldo, Agencia agencia)
    {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.digito = calcularDigito(numero);
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public int getDigito() 
    {
        return digito;
    }

    public void setDigito(int digito)
    {
        this.digito = digito;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public Agencia getAgencia() 
    {
        return agencia;
    }

    public void setAgencia(Agencia agencia) 
    {
        this.agencia = agencia;
    }

    public void depositar(double valor)
    {
        if(valor > 0)
        {
            saldo = saldo + valor;
        }
    }
    public boolean sacar(double valor)
    {
        if (valor > 0 && valor <= saldo)
        {
            saldo = saldo - valor;
            return true;
        }
        else
        {
            return false;
        }
    }

    public double consultarSaldo()
    {
        return saldo;
    }

    private int calcularDigito (int numero)
    {
        int n1 = (numero / 1000) % 10;
        int n2 = (numero / 100) % 10;
        int n3 = (numero / 10) % 10;
        int n4 = numero % 10;
        int soma = n1 * 4 + n2 * 6 + n3 * 8
        + n4 * 2;
        int digito = soma % 11;

        if(digito == 10)
        {
            return 0;
        }
        else
        {
            return digito;
        }
    }

    public String imprimirSaldo()
    {
        return "Número da conta: " + numero + " - " + digito + "\nAgência: " + agencia.getNumero()
        + " - " + agencia.getDigito() + "\nSaldo: " + saldo;
    }
}
