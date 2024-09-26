import javax.swing.JOptionPane;
public class Pratica03_Ex5_Nomes
{
   public static void main (String [] args)
   {
      String sNome;
      
      while (true)
      {
         sNome = JOptionPane.showInputDialog
         ("Digite um nome. (Ou digite FIM para sair.)");
      
         if (sNome.endsWith("FIM"))
         {
         return;
         }
      
         JOptionPane.showMessageDialog (null, sNome);
      }
   }
}