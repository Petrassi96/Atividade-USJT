import javax.swing.JOptionPane;
public class Pratica03_Ex9_Soma
{
   public static void main (String [] gagsdv)
   {
      int resultado = 0;
      
      for (int inicio = 1; inicio <= 100; inicio++)
      {
         resultado = resultado + inicio;
         JOptionPane.showMessageDialog (null, "O número é: " + inicio
          + ". O resultado é: " + resultado + ".");
      }
   }
}