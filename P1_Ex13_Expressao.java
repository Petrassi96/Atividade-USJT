//(Página 1) Exercício 13
import javax.swing.JOptionPane;
public class P1_Ex13_Expressao
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número");
      
      double n1 = Double.parseDouble(sNumero1);
      double n2 = Double.parseDouble(sNumero2);
      double n3 = Double.parseDouble(sNumero3);
      
      double resultado = 2 * ( (n1 - n3) / 8) - n2 * 5;
      
      JOptionPane.showMessageDialog (null, "O resultado da expressão é: " + resultado);
   }
}
   
   
   
   
   
   