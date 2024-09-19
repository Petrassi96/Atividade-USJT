//(Página 1) Exercício 8
import javax.swing.JOptionPane;
public class P1_Ex8_Logaritmo
{
   public static void main (String [] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      double numero = Double.parseDouble (sNumero);
      
      double resultado = Math.log10(numero);
      
      JOptionPane.showMessageDialog (null, "O logaritmo deste número é: " + resultado );
   }
}