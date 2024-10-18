//(Página 1) Exercício 7
import javax.swing.JOptionPane;
public class P1_Ex7_Angulo
{
   public static void main (String [] blablabla)
   {
      String sAngulo = JOptionPane.showInputDialog
      ("Digite o ângulo");
      
      int angulo = Integer.parseInt(sAngulo);
      
      double seno = Math.sin (angulo);
      double cosseno = Math.cos (angulo);
      double tangente = Math.tan (angulo);
      double secante = (1/cosseno);
      double cossecante = (1/seno);
      double cotangente = (1/tangente);
      
      JOptionPane.showMessageDialog (null, "O Valor do seno é: " + seno);
      JOptionPane.showMessageDialog (null, "O Valor do cosseno é: " + cosseno);
      JOptionPane.showMessageDialog (null, "O Valor da tangente é: " + tangente);
      JOptionPane.showMessageDialog (null, "O Valor da secante é: " + secante);
      JOptionPane.showMessageDialog (null, "O Valor da cossecante é: " + cossecante);
      JOptionPane.showMessageDialog (null, "O Valor da cotangente é: " + cotangente);  
    }
}
  