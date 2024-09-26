import javax.swing.JOptionPane;
public class Pratica02_Ex2_Menor_igual20
{
   public static void main (String [] args)
   {
       //Lendo os dados
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      
      //Convertendo
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Somando
      int resultado = numero1 + numero2;
      
      //Condições
      if (resultado <= 20)
      {
         JOptionPane.showMessageDialog (null, resultado - 5);
      }
   }
}
