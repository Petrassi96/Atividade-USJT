import javax.swing.JOptionPane;
public class Pratica02_Ex9_Multiplo
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      int numero = Integer.parseInt(sNumero);
      
      if (numero % 3 == 0)
      {
         JOptionPane.showMessageDialog (null, "Esse número é múltiplo de 3.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Esse número não é múltiplo de 3.");
      }
   }
}