import javax.swing.JOptionPane;
public class Pratica03_Ex21
{
   public static void main (String [] args)
   {
      String resultado = "";
      
      for (int i = 1; i <= 20; i++)
      {
         String sNome = JOptionPane.showInputDialog
         ("Digite seu nome.");
         int idade = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite sua idade."));
         char sexo = JOptionPane.showInputDialog
         ("Digite o sexo.").charAt(0);
         
         if (idade > 21 && sexo == 'm' || sexo == 'M')
         {
               resultado = resultado + sNome + "\n";
         }
         else
         {
               continue;
         }
      }
         JOptionPane.showMessageDialog (null, resultado);
   }
}
