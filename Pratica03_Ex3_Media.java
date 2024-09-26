import javax.swing.JOptionPane;
public class Pratica03_Ex3_Media
{
   public static void main (String [] args)
   {
      int soma = 0;
      int contador = 0;
      String sNumeros;
      
      while (true)
      {
         sNumeros = JOptionPane.showInputDialog
         ("Digite um número. (Ou deixe em branco para terminar.)");
         
         if (sNumeros == null || sNumeros.isEmpty())
         {
            break;
         }
         
         try
         {
            int numero = Integer.parseInt(sNumeros);
            soma = soma + numero;
            contador++;
         }
         
         catch (NumberFormatException e)
         {
            JOptionPane.showMessageDialog (null, "Número inválido.");
         }
      }
      
         JOptionPane.showMessageDialog (null, "A média dos números digitados é: " + soma / contador);
   }
}   
         
