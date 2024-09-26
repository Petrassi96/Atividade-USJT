import javax.swing.JOptionPane;
public class Pratica02_Ex21_NumeroMaior_3
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número");
      
      double n1 = Double.parseDouble(sNumero1);
      double n2 = Double.parseDouble(sNumero2);
      double n3 = Double.parseDouble(sNumero3);      
      
      if (n1 > n2 && n1 > n3)
      {
         JOptionPane.showMessageDialog (null, n1);
      }
      
      if (n2 > n1 && n2 > n3)
      {
         JOptionPane.showMessageDialog (null, n2);
      }
      
      if (n3 > n1 && n3 > n2)
      {
         JOptionPane.showMessageDialog (null, n3);
      }
   }
}