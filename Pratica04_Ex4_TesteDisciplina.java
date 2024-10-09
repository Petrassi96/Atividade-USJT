import javax.swing.JOptionPane;
public class Pratica04_Ex4_TesteDisciplina
{
   public static void main (String []arhs)
   {
      String nome = JOptionPane.showInputDialog
      ("Nome da disciplina.");
      String professor = JOptionPane.showInputDialog
      ("Nome do professor.");
      int semestre = Integer.parseInt(JOptionPane.showInputDialog
      ("Semestre."));
      String resposta = JOptionPane.showInputDialog
      ("Essa disciplina está disponível?");
      boolean ofertada = resposta.equalsIgnoreCase("sim");
      
      //Criar o objeto
      Disciplina disciplina = new Disciplina (nome, professor, semestre, ofertada);
      
      //String de saída
      String fim = "Disciplina: " + disciplina.getNome() + "\nProfessor: " 
      + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre();
      if (disciplina.getOfertada())
      {
         fim = fim + "\nDisciplina ofertada.";
      }
      else
      {
         fim = fim + "\nDisciplina não ofertada.";
      }
      
      JOptionPane.showMessageDialog (null, fim);
   }
}
      