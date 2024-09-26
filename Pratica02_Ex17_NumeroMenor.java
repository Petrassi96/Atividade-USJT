import javax.swing.JOptionPane;
public class Pratica02_Ex17_NumeroMenor
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      
      int n1 = Integer.parseInt(sNumero1);
      int n2 = Integer.parseInt(sNumero2);
      
      if (n1 < n2)
      {
         JOptionPane.showMessageDialog (null, n1);
      }
      
      if (n2 < n1)
      {
         JOptionPane.showMessageDialog (null, n2);
      }
   }
}