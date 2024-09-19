//(Página 2) Exercício 1
import javax.swing.JOptionPane;
public class P2_Ex1_Palavras_Invertidas
{
   public static void main (String[] args)
   {
      //Criando as Strings
      String sPalavra1 = JOptionPane.showInputDialog
      ("Digite a primeira palavra");
      String sPalavra2 = JOptionPane.showInputDialog
      ("Digite a segunda palavra");
      String sPalavra3 = JOptionPane.showInputDialog
      ("Digite a terceira palavra");
      
      //Apresentando as palavras
      JOptionPane.showMessageDialog (null, "As palavras invertidas são: " + sPalavra3 + " " 
      + sPalavra2 + " " + sPalavra1);
    }
}