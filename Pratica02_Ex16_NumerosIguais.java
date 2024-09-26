import javax.swing.JOptionPane;
public class Pratica02_Ex16_NumerosIguais
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número.");
      
      int n1 = Integer.parseInt(sNumero1);
      int n2 = Integer.parseInt(sNumero2);
      
      if (n1 == n2)
      {
         JOptionPane.showMessageDialog (null, "Esses números são iguais.");
      }
      
      if (n1 != n2)
      {
         JOptionPane.showMessageDialog (null, "Esses números são diferentes");
      }
   }
}