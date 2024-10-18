//(Página 1) Exercício 4
import javax.swing.JOptionPane;
public class P1_Ex4_Somando_Strings
{
   public static void main (String [] ahras)
   {
      String sP1 = JOptionPane.showInputDialog
      ("Digite a primeira palavra");
      String sP2 = JOptionPane.showInputDialog
      ("Digite a segunda palavra");
      String sP3 = JOptionPane.showInputDialog
      ("Digite a terceira palavra");
      
      int palavra1 = sP1.length();
      int palavra2 = sP2.length();
      int palavra3 = sP3.length();
      
      int resultado = palavra1 + palavra2 + palavra3;
      
      
      JOptionPane.showMessageDialog (null, "A soma das palavras é: " + resultado);
    }
}