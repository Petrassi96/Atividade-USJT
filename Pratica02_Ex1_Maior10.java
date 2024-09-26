import javax.swing.JOptionPane;
public class Pratica02_Ex1_Maior10
{
   public static void main (String [] args)
   {
      //Lendo os dados
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      
      //Convertendo para inteiros
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      int resultado = numero1 + numero2;
      
      //Condições
      if (resultado > 10)
      {
         JOptionPane.showMessageDialog (null, resultado);
      }
   }
} 