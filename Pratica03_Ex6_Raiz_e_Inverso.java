import javax.swing.JOptionPane;
public class Pratica03_Ex6_Raiz_e_Inverso
{
   public static void main (String [] args)
   {
      int contador = 0;
      String sNumero;
      
      while (true)
      {
         sNumero = JOptionPane.showInputDialog
         ("Digite um número. (-999 para encerrar.)");
         
         int numero = Integer.parseInt(sNumero);
         String inverso = new StringBuilder(sNumero).reverse().toString();

         
         if (sNumero == null || sNumero.equalsIgnoreCase("-999"))
         {
            break;
         }
         else
         {
            JOptionPane.showMessageDialog (null, "A raiz quadrada é: " + Math.sqrt(numero));
            JOptionPane.showMessageDialog (null, "O inverso do número é: " + inverso);
         }
         
      }
   }
}