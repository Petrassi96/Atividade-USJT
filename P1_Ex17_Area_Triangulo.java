//(Página 1) Exercício 17 
import javax.swing.JOptionPane;
public class P1_Ex17_Area_Triangulo
{
   public static void main (String[] args)
   {
      String sBase = JOptionPane.showInputDialog
      ("Digite o valor da base");
      String sAltura = JOptionPane.showInputDialog
      ("Digite o valor da altura");
      
      double base = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
      
      double resultado = base * altura / 2;
      
      JOptionPane.showMessageDialog (null, "A área do triangulo é: " + resultado);
   }
}
      
