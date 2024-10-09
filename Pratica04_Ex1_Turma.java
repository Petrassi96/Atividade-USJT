public class Pratica04_Ex1_Turma
{
   //Atributos
   private String nome;
   private String curso;
   private int quantidadeAlunos;
   private int serie;
   
   //Construtor
   public Turma (String n, String c, int qA, int s)
   {
      nome = n;
      curso = c;
      quantidadeAlunos = qA;
      serie = s;
   }
   
   //Métodos de acesso
   public String getNome()
   {
      return nome;
   }
   public String getCurso()
   {
      return curso;
   }
   public int getQuantidadeAlunos()
   {
      return quantidadeAlunos;
   }
   public int getSerie()
   {
      return serie;
   }
   
   //Métodos modificadores
   public void setNome(String n)
   {
      nome = n;
   }
   public void setCurso(String c)
   {
      curso = c;
   }
   public void setQuantidadeAlunos(int qA)
   {
      quantidadeAlunos = qA;
   }
   public void setSerie(int s)
   {
      serie = s;
   }
}