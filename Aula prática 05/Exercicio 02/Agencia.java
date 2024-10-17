public class Agencia 
{
    private String nome;
    private int numero;
    private int digito;

    //Construtor
    public Agencia (String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
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
}
