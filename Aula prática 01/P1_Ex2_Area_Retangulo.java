//(Página 1) Exercício 2 
import javax.swing.JOptionPane;
public class P1_Ex2_Area_Retangulo
{
   public static void main (String [] hahgs)
   {
      String sBase = JOptionPane.showInputDialog
      ("Digite o comprimento da base do retângulo.");
      String sAltura = JOptionPane.showInputDialog
      ("Digite o comprimento da altura do retângulo");
      
      double base = Double.parseDouble (sBase);
      double altura = Double.parseDouble (sAltura);
      
      double resultado = base * altura;
      
      JOptionPane.showMessageDialog (null, "A área do retângulo é: " + resultado);
   }
}