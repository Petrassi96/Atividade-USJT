import javax.swing.JOptionPane;
public class Pratica02_Ex8_DoisNumeros
{
   public static void main (String [] args)
   {
     String sNumero1 = JOptionPane.showInputDialog
     ("Digite o primeiro número");
     String sNumero2 = JOptionPane.showInputDialog
     ("Digite o segundo número");
     
     double n1 = Double.parseDouble(sNumero1);
     double n2 = Double.parseDouble(sNumero2);
     
     if (n1 > n2)
     {
      JOptionPane.showMessageDialog (null, n1);
     }
     if (n2 > n1)
     {
      JOptionPane.showMessageDialog (null, n2);
     }
   }
}