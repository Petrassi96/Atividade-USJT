import javax.swing.JOptionPane;
public class Pratica03_Ex14_VariosPrimos
{
   public static void main (String [] args)
   {
      int contador = 0;
      
      while (true)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite um número positivo. (Ou digite um número negativo para encerrar.)");
         
         int numero = Integer.parseInt(sNumero);
         int divisores = 0;
         
         if (numero < 0)
         {
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
            contador++;
         }
      }
         JOptionPane.showMessageDialog (null, "O total de números primos digitados foi: "
            + contador);
   }
}