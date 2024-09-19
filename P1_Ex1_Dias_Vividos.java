//(Página 1) Exercício 1 
import javax.swing.JOptionPane;
public class P1_Ex1_Dias_Vividos
{
   public static void main (String [] args)
   {
      String sIdade = JOptionPane.showInputDialog
      ("Digite quantos anos você tem");
      
      int dias = Integer.parseInt (sIdade);
      
      int diasvividos = dias * 365;
      
      JOptionPane.showMessageDialog (null, "Você viveu aproximadamente: " + diasvividos + " " + "dias.");
   }
} 