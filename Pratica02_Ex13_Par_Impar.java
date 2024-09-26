import javax.swing.JOptionPane;
public class Pratica02_Ex13_Par_Impar
{
   public static void main (String [] args)
   {
      //Lendo os dados
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número com 3 casas decimais.");
      
      //Convertendo em número
      int numero = Integer.parseInt(sNumero);
      
      //Garantir que tenha 3 números
      if (numero < 99 || numero > 999)
      {
         JOptionPane.showMessageDialog (null, "O número deve conter 3 casas decimais.");
         return;
      }
      
      //Pegndo casa das dezenas
      char dezena = sNumero.charAt(1);
      
      //Condições
      if (dezena % 2 == 0)
      {
         JOptionPane.showMessageDialog (null, "O número " + dezena + " é par.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "O número " + dezena + " é impar.");
      }
   }
}