import javax.swing.JOptionPane;
public class Pratica03_Ex12_Idade
{
   public static void main (String [] args)
   {
      int contador = 0;
      int numero = 0;
      
      do
      {
         numero = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite sua idade. (Ou digite um número menor que 0 ou maior que 120.)"));
         
         if (numero < 0 || numero > 120)
         {
            break;
         }
         
         if (numero < 21 || numero > 50)
         {
            contador++;
         }
       }
         while (numero > 0 || numero < 120);
    
            JOptionPane.showMessageDialog (null,contador);
   }
}
         
         