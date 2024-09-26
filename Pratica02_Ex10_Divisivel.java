import javax.swing.JOptionPane;
public class Pratica02_Ex10_Divisivel
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      int numero = Integer.parseInt(sNumero);
      
      if (numero % 5 == 0)
      {
         JOptionPane.showMessageDialog (null, "Este número é divisível por 5.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Este número não é divisível por 5.");
      }
   }
}
      