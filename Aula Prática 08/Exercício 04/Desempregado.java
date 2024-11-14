public class Desempregado extends PessoaFisica
{
    private double seguroDesemprego;
    
    public Desempregado()
    {
        super();
        seguroDesemprego = 0.0;
    }
    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego)
    {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }
    public double getSeguroDesemprego() 
    {
        return seguroDesemprego;
    }
    public void setSeguroDesemprego(double seguro) 
    {
        seguroDesemprego = seguro;
    }
    public String dados()
    {
        return super.dados() + "\nValor do seguro: " + seguroDesemprego;
    }   
}