public class Pratica04_Ex3_Produto
{
   //Atributos
   private String nome;
   private double preco;
   private int quantidade;
   
   //Construtor
   public Produto (String n, double p, int q)
   {
      nome = n;
      preco = p;
      quantidade = q;
   }
   
   //Métodos de acesso
   public String getNome()
   {
      return nome;
   }
   public double getPreco()
   {
      return preco;
   }
   public int getQuantidade()
   {
      return quantidade;
   }
   
   //Métodos modificadores
   public void setNome(String n)
   {
      nome = n;
   }
   public void setPreco(double p)
   {
      preco = p;
   }
   public void setQuantidade(int q)
   {
      quantidade = q;
   }
}