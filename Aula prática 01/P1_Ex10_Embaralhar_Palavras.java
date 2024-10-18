//(Página 1) Exercício 10
import javax.swing.JOptionPane;
public class P1_Ex10_Embaralhar_Palavras
{
   public static void main (String [] abcb)
   {
      String sFrase1 = "A primeira frase, ";
      String sFrase2 = "A segunda frase, ";
      String sFrase3 = "A terceira frase. ";
      
      String metade1 = sFrase1.substring(0,8);
      String metade2 = sFrase1.substring(9,15);
      String metade1f2 = sFrase2.substring(0,7);
      String metade2f2 = sFrase2.substring(8,14);
      String metade1f3 = sFrase3.substring(0,8);
      String metade2f3 = sFrase3.substring(9,15);
      
      JOptionPane.showMessageDialog (null, "A frase original é: " + sFrase1 + sFrase2 + sFrase3);
      JOptionPane.showMessageDialog (null, "A frase embaralhada é: " + metade1f2 + metade2f3 + metade2f2 + metade1 +
         metade1f3 + metade2);
   }
}