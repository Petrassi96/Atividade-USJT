import javax.swing.JOptionPane;
public class Pratica03_Ex17
{
   public static void main (String [] args)
   {
      double resultado = 0;
      
      for (double polegada = 1; polegada <= 20; polegada++)
      {
         resultado = polegada * 2.54;
         
         JOptionPane.showMessageDialog (null, "Polegadas convertidas em cm de 1 a 20 são: "
         + resultado);
      }
   }
}