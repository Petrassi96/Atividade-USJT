//(Página 1) Exercício 15
import javax.swing.JOptionPane;
public class P1_Ex15_Divisao
{
   public static void main (String [] snjv)
   {
      String  sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      
     int dividendo = Integer.parseInt(sNumero1);
     int divisor = Integer.parseInt(sNumero2);
     
     double quociente = dividendo / divisor;
     double resto = (dividendo % divisor);
     
     
     JOptionPane.showMessageDialog (null, "O dividendo é: " + dividendo);
     JOptionPane.showMessageDialog (null, "O divisor é: " + divisor);
     JOptionPane.showMessageDialog (null, "O quociente é: " + quociente);
     JOptionPane.showMessageDialog (null, "O resto é: " + resto);
   }
}
     