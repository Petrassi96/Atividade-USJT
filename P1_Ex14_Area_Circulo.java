//(Página 1) Exercício 14 
import javax.swing.JOptionPane;
public class P1_Ex14_Area_Circulo
{
   public static void main (String [] args)
   {
      String sRaio = JOptionPane.showInputDialog
      ("Digite o valor do raio");
      
      double raio = Double.parseDouble(sRaio);
      
      double resultado = Math.PI * Math.pow(raio,2);
      
      JOptionPane.showMessageDialog (null, "A área do círculo é: " + resultado);
   }
}