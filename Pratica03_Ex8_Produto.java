import javax.swing.JOptionPane;
public class Pratica03_Ex8_Produto
{
   public static void main (String [] asgr)
   {
      double resultado = 1;
      
      for (int inicio = 120; inicio <= 300; inicio++)
      {
         resultado = resultado * inicio;
         JOptionPane.showMessageDialog (null, "O número é: " + inicio + ". O resultado é: " + resultado);
      }
   }
}