//(Página 1) Exercício 18 
import javax.swing.JOptionPane;
public class P1_Ex18_Area_Losango
{
   public static void main (String[] args)
   {
      String sDiagonal1 = JOptionPane.showInputDialog
      ("Digite a primeira diagonal");
      String sDiagonal2 = JOptionPane.showInputDialog
      ("Digite a segunda diagonal");
      
      double diagonal1 = Double.parseDouble(sDiagonal1);
      double diagonal2 = Double.parseDouble(sDiagonal2);
      
      double resultado = diagonal1 * diagonal2 / 2;
      
      JOptionPane.showMessageDialog (null, "A área do losango é: " + resultado);
   }
}