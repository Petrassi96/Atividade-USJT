//(Página 1) Exercício 16
import javax.swing.JOptionPane;
public class P1_Ex16_Numero_Quadrado_Raiz
{
   public static void main (String [] jsbg)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número");
      
      double numero = Double.parseDouble(sNumero);
      
      double quadrado = Math.pow(numero,2);
      double raiz = Math.sqrt(numero);
      
      JOptionPane.showMessageDialog (null, "O número é: " + numero);
      JOptionPane.showMessageDialog (null, "Este número ao quadrado é: " + quadrado);
      JOptionPane.showMessageDialog (null, "A raiz quadrada é: " + raiz);
   }
}