import javax.swing.JOptionPane;
public class Pratica02_Ex12_Divisivel10e5e2
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      int numero = Integer.parseInt(sNumero);
      
      if (numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0)
      {
         JOptionPane.showMessageDialog (null, "Este número é divisível por 10, 5 e 2.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Este número não é divisível por 10, 5 e 2.");
      }
   }
}