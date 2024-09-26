import javax.swing.JOptionPane;
public class Pratica02_Ex11_Divisivel3e7
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      int numero = Integer.parseInt(sNumero);
      
      if (numero % 3 == 0 && numero % 7 == 0)
      {
         JOptionPane.showMessageDialog (null, "Este número é divisível por 3 e 7.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Este número não é divisível por 3 e 7.");
      }
   }
}