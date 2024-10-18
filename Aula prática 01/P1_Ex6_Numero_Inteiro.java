//(Página 1) Exercício 6
import javax.swing.JOptionPane;
public class P1_Ex6_Numero_Inteiro
{
   public static void main (String [] asjaa)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número com 3 casas decimais");
      
      int numero = Integer.parseInt(sNumero);
          
      if (numero < 100 || numero > 999)
      {
         JOptionPane.showMessageDialog (null, "O número precisa ter 3 casas decimais");
         return;
      }
       
      char dezena = sNumero.charAt(1);
      
      JOptionPane.showMessageDialog (null, "O algorismo das dezenas é: " + dezena);
   }
}