//(Página 1) Exercício 12
import javax.swing.JOptionPane;
public class P1_Ex12_Data_String
{
   public static void main (String[] agdbde)
   {
      String sDia = JOptionPane.showInputDialog
      ("Digite um dia do mês. Ex: 03,12,31...");
      String sMes = JOptionPane.showInputDialog
      ("Digite um mes. Ex: 08,10,12...");
      String sAno = JOptionPane.showInputDialog
      ("Digite um ano qualquer.");
      
      int dia = Integer.parseInt(sDia);
      int mes = Integer.parseInt(sMes);
      int ano = Integer.parseInt(sAno);
      
      JOptionPane.showMessageDialog (null, "O dia é: " + dia);
      JOptionPane.showMessageDialog (null, "O mês é: " + mes);
      JOptionPane.showMessageDialog (null, "O ano é: " + ano);
   }
}