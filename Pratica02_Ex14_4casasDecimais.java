import javax.swing.JOptionPane;
public class Pratica02_Ex14_4casasDecimais
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número de 4 casas decimais");
      
      int numero = Integer.parseInt(sNumero);
      
      if (numero < 999 || numero > 9999)
      {
         JOptionPane.showMessageDialog (null, "O número deve conter 4 casas decimais.");
         return;
      }
      
      char milhar = sNumero.charAt(0);
      char centena = sNumero.charAt(1);
      
      if ((milhar + centena) % 4 == 0)
      {
         JOptionPane.showMessageDialog (null, "Este número é múltiplo de 4.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Este número não é múltiplo de 4.");
      }
   }
}
