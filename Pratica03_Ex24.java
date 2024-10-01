import javax.swing.JOptionPane;
public class Pratica03_Ex24
{
   public static void main (String [] args)
   {
      double total = 0;
      
      while (true)
      {  
         double preco = Double.parseDouble(JOptionPane.showInputDialog
         ("Digite o preço."));
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite a quantidade."));
         
         if (preco == 0 || quantidade == 0)
         {
            break;
         }
         
         if (preco < 0 || quantidade < 0)
         {
            JOptionPane.showMessageDialog (null, "Digite um valor válido.");
            return;
         }
         
            total = total + preco * quantidade;
      }
      
         JOptionPane.showMessageDialog(null, total);
   }
}