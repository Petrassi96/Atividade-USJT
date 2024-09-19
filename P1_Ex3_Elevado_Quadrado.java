//(Página 1) Exercício 3
import javax.swing.JOptionPane;
public class P1_Ex3_Elevado_Quadrado
{
   public static void main (String [] jsha)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número inteiro");
      
      int numero = Integer.parseInt (sNumero);
      
      double resultado = Math.pow(numero,2);
      
      JOptionPane.showMessageDialog (null, "Este número ao quadrado é: " + resultado);
   }
}