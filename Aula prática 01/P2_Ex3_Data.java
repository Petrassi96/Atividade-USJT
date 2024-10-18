//(Página 2) Exercício 3 
import javax.swing.JOptionPane;
public class P2_Ex3_Data
{
   public static void main (String [] a)
   {
      //Criando as Strings
      String sDia = JOptionPane.showInputDialog
      ("Digite o dia");
      String sMes = JOptionPane.showInputDialog
      ("Digite o mês");
      String sAno = JOptionPane.showInputDialog
      ("Digite o ano");
      
      //Apresentando na tela
      JOptionPane.showMessageDialog (null, "A data é: " + sDia + "/" + sMes + "/" + sAno);
    }
}