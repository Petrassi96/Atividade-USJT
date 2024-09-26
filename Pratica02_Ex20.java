import javax.swing.JOptionPane;
public class Pratica02_Ex20
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número.");
      
      int n1 = Integer.parseInt(sNumero1);
      int n2 = Integer.parseInt(sNumero2);
      
      
      if (n1 > n2)
      {
         JOptionPane.showMessageDialog (null, Math.sqrt(n1));
         JOptionPane.showMessageDialog (null, Math.pow(n2,2));
      }
      else
      {
         JOptionPane.showMessageDialog (null, Math.sqrt(n2));
         JOptionPane.showMessageDialog(null, Math.pow(n1,2));
      }
   }
}
         
         
      