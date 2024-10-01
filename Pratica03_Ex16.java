import javax.swing.JOptionPane;
public class Pratica03_Ex16
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      int numero = Integer.parseInt(sNumero);
      int contador = 1;
      int x1 = 0;
      int x2 = 1;
      int resultado = 0;
      
      while (contador < numero)
      {
         resultado = x1 + x2;
         x1 = x2;
         x2 = resultado;
         contador++;
      }
         JOptionPane.showMessageDialog (null, resultado);
   }
}