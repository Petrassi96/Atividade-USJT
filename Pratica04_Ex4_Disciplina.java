public class Pratica04_Ex4_Disciplina
{
   private String nome;
   private String professor;
   private int semestre;
   private boolean ofertada;
   
   public Disciplina (String nome, String professor, int semestre, boolean ofertada)
   {
      this.nome = nome;
      this.professor = professor;
      this.semestre = semestre;
      this.ofertada = ofertada;
   }
   
   //Métodos de acesso
   public String getNome()
   {
      return nome;
   }
   public String getProfessor()
   {
      return professor;
   }
   public int getSemestre()
   {
      return semestre;
   }
   public boolean getOfertada()
   {  
      return ofertada;
   }
   
   //Métodos modificadores
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setProfessor(String professor)
   {
      this.professor = professor;
   }
   public void setSemestre(int semestre)
   {
      this.semestre = semestre;
   }
   public void setOfertada(boolean ofertada)
   {
      this.ofertada = ofertada;
   }
}