import javax.swing.JOptionPane;
public class Pratica03_Ex22
{
   public static void main (String [] args)
   {
      int numero = Integer.parseInt(JOptionPane.showInputDialog
      ("Digite um número."));
      
      int inicio = 1;
      String resultado = "";
            
      while (inicio < numero)
      {
         if (inicio % 2 == 1)
         {
            resultado = resultado + inicio + " ";
         }
         
         inicio++;
      }
      
         JOptionPane.showMessageDialog (null, "Os números ímpares até " + numero 
         + " são: " + resultado);
   }
}
            

