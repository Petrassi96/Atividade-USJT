import javax.swing.JOptionPane;
public class Pratica03_Ex20
{
   public static void main (String [] arhs)
   {
      String sSuperior = JOptionPane.showInputDialog
      ("Digite um número superior.");
      String sIncremento = JOptionPane.showInputDialog
      ("Digite um incremento.");
      
      int inferior = 0;
      int superior = Integer.parseInt(sSuperior);
      int incremento = Integer.parseInt(sIncremento);
      String resultado = " ";
      
      
      while (inferior <= superior)
      {
         resultado = resultado + inferior + " ";
         inferior = inferior + incremento;
      }
      
      JOptionPane.showMessageDialog (null, "Todos os números de 0 ate: " 
         + superior + " são:" + resultado);
   }
}