import javax.swing.JOptionPane;
public class Pratica03_Ex2_NumeroPar
{
   public static void main (String [] args)
   {
      int n = 2;
      
      while (n <= 100)
      {
         JOptionPane.showMessageDialog (null, n);
         n = n + 2;
      }
   }
}