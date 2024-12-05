package main.model;

public class Aluno extends Usuario
{
    private int idade;
    private double peso;
    private String genero;
    private double pesoMeta;

    public Aluno(String id, String nome, String email, String senha,
    int tipo, int idade, String genero, double peso, double pesoMeta)
    {
        super(id, nome, email, senha, tipo);
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.pesoMeta = pesoMeta;
    }

    public Aluno(String id, String nome, String email, String senha,
                 int tipo, int idade, String genero, double peso)
    {
        super(id, nome, email, senha, tipo);
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
    }
    public Aluno(String nome, String email, String senha,
                 int tipo, int idade, String genero, double peso)
    {
        super(nome, email, senha, tipo);
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
    }

    public int getIdade() 
    {
        return idade;
    }
    public double getPeso() 
    {
        return peso;
    }
    public String getGenero() {
        return genero;
    }
    public double getPesoMeta()
    {
        return pesoMeta;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public void setPeso(double peso) 
    {
        this.peso = peso;
    }
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
    public void setPesoMeta(double pesoMeta)
    {
        this.pesoMeta = pesoMeta;
    }

    @Override
    public String toString()
    {
        return "\nNome: " + super.getNome() + "\nEmail: " + super.getEmail() 
        + "\nIdade: " + idade + "\nGênero: " + genero + "\npeso" + peso + "\npesoMeta" + pesoMeta;
    }
}
