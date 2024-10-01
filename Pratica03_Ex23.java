import javax.swing.JOptionPane;
public class Pratica03_Ex23
{
   public static void main (String [] args)
   {
      int numero = Integer.parseInt(JOptionPane.showInputDialog
      ("Digite um número."));
      
      int inicio = 2;
      String resultado = "";
      
      for (int i = 0; i < numero; i++)
      {
         resultado = resultado + inicio + " ";
         inicio = inicio + 2;
      }
      
         JOptionPane.showMessageDialog (null, resultado);
   }
}