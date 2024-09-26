import javax.swing.JOptionPane;
public class Pratica02_Ex22_NumeroMaior
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
      
      double maior = n1;
      
      if (n2 > maior && n2 > n3)
      {
         maior = n2;
      }
      
      if (n3 > maior && n3 > n2)
      {
         maior = n3;
      }
      
      JOptionPane.showMessageDialog (null, "O maior número é: " + maior);
   }
}