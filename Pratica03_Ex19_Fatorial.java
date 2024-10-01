import javax.swing.JOptionPane;
public class Pratica03_Ex19_Fatorial
{
   public static void main (String [] args)
   {
       int numero = Integer.parseInt(JOptionPane.showInputDialog
      ("Digite um numero."));
      
      int resultado = 0;
      int fatorial = 1;
      
      for (int i = 1; i <= numero; i++)
      {
         fatorial = fatorial * i;
      }
         JOptionPane.showMessageDialog (null, fatorial);
   }
}
      