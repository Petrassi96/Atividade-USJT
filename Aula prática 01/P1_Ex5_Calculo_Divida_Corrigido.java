//(Página 1) Exercício 5 
import javax.swing.JOptionPane;
public class P1_Ex5_Calculo_Divida_Corrigido
{
   public static void main (String [] contaaa)
   { 
      double conta = 10.0 / 100;
      double resultado = 100 * Math.pow(1 + conta,8);
      
     JOptionPane.showMessageDialog (null, resultado);
   }
}