import javax.swing.JOptionPane;
public class Pratica02_Ex5_Entre20e90
{
   public static void main (String [] args)
   {
      //Lendo os dados
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número.");
      
      //Convertendo a String
      double numero = Double.parseDouble(sNumero);
      
      //Condições
      if (numero >= 20 && numero <= 90)
      {
         JOptionPane.showMessageDialog (null, "Este número está entre 20 e 90.");
      }
      else
      {
         JOptionPane.showMessageDialog (null, "Este número não está entre 20 e 90.");
      }
   }
}
      