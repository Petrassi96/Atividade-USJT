import javax.swing.JOptionPane;
public class Pratica04_Ex2_TesteTurma
{
   //Iniciar com método main
   public static void main (String args[])
   {
      //Coletar dados 
      String nome = JOptionPane.showInputDialog
      ("Nome");
      String curso = JOptionPane.showInputDialog
      ("Curso");
      int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog
      ("Quantidade de Alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog
      ("Série"));
      
      //Criar o objeto
      Turma turma = new Turma (nome, curso, quantidadeAlunos, serie);
      
      //Montando a String de saída
      String fim = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
      + "\nQuantidade de alunos: " + turma.getQuantidadeAlunos() + "\nSérie: "
      + turma.getSerie();
      
      //Mostra o resultado
      JOptionPane.showMessageDialog (null, fim);
      
      //Alterando informações. (Não é necessário definir as variáveis novamente)
      quantidadeAlunos = Integer.parseInt (JOptionPane.showInputDialog
      ("Atualize a quantidade de alunos."));
      
      //Mudando com métodos modificadores
      turma.setQuantidadeAlunos(quantidadeAlunos);
      
      //Mostrando atualizado
      fim = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
      + "\nQuantidade de alunos: " + turma.getQuantidadeAlunos() + "\nSérie: "
      + turma.getSerie();
      
      //Mostra novamente
      JOptionPane.showMessageDialog (null, fim);
   }
}