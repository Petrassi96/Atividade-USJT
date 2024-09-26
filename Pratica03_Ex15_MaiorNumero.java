import javax.swing.JOptionPane;
public class Pratica03_Ex15_MaiorNumero
{
   public static void main (String [] args)
   {
      int menor = Integer.MIN_VALUE;
      int numero;
      
      while (true)
      {
         numero = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite um número."));
         
         if (numero == -9999)
         {
            break;
         }
         
         if (numero > menor)
         {
            menor = numero;
         }
      }
         
         if (menor == Integer.MIN_VALUE) 
         {
            JOptionPane.showMessageDialog (null, "Nenhum número foi digitado.");
         } 
         else 
         {
            JOptionPane.showMessageDialog (null, "O maior número digitado foi: " + menor);
         }
   }
}
         
         