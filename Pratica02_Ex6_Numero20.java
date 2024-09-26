import javax.swing.JOptionPane;
public class Pratica02_Ex6_Numero20
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      double numero = Double.parseDouble(sNumero);
      
      if (numero > 20)
      {
         JOptionPane.showMessageDialog (null, "Maior que 20.");
      }
      
      if (numero == 20)
      {
         JOptionPane.showMessageDialog (null, "Igual a 20.");
      }
      
      if (numero < 20)
      {
         JOptionPane.showMessageDialog (null, "Menor que 20.");
      }
   }
}