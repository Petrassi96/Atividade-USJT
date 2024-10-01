import javax.swing.JOptionPane;
public class Pratica03_Ex18
{
   public static void main (String [] args)
   {
      String sInferior = JOptionPane.showInputDialog
      ("Digite o limite inferior.");
      String sSuperior = JOptionPane.showInputDialog
      ("Digite o limite superior.");
      String sIncremento = JOptionPane.showInputDialog
      ("Digite o incremento.");
      
      int inferior = Integer.parseInt(sInferior);
      int superior = Integer.parseInt(sSuperior);
      int incremento = Integer.parseInt(sIncremento);
      
      
      
      while (inferior <= superior)
      {
         double conta = (inferior * 9.0/5) + 32;
         JOptionPane.showMessageDialog (null, inferior + "°C" + " = " + conta + "°F");
         inferior = inferior + incremento;
      }
   }
}