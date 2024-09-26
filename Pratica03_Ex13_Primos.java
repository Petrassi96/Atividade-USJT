import javax.swing.JOptionPane;
public class Pratica03_Ex13_Primos
{
   public static void main (String [] args)
   {
      while (true)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite um número.");
         
         int numero = Integer.parseInt(sNumero);
         int divisores = 0;
         
         if (numero == 0)
         {
            JOptionPane.showMessageDialog (null, "Encerrndo o programa.");
            break;
         }
         
         for (int i = 1; i <= numero; i++)
         {
            if (numero % i == 0)
            {
               divisores++;
            }
         }
         
         if (divisores == 2)
         {
            JOptionPane.showMessageDialog (null, numero + " é um número primo.");
         }
         else
         {
            JOptionPane.showMessageDialog (null, numero + " não é um número primo.");
         }
      }
   }
}