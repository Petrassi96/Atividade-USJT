//(Página 1) Exercício 9
import javax.swing.JOptionPane;
public class P1_Ex9_Logaritmo_com_base
{
   public static void main (String[] args)
   {
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número");
      String sBase = JOptionPane.showInputDialog
      ("Digite a base do logaritmo");
      
      int numero = Integer.parseInt(sNumero);
      int base = Integer.parseInt(sBase);
      
      
      double resultado = Math.log(numero) / Math.log(base);
            
      JOptionPane.showMessageDialog (null, "O logaritmo deste número é: " + resultado);
   }
}