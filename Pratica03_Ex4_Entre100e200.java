import javax.swing.JOptionPane;
public class Pratica03_Ex4_Entre100e200
{
   public static void main (String [] args)
   {
      int numero;
      int contador = 0;
      
      do
      {
        numero = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite um número entre 100 e 200. (Ou digite 0 para encerrar.)"));
         
      if (numero >= 100 && numero <= 200)
      {
         contador++;
      }

      }
      while (numero != 0);
      
         JOptionPane.showMessageDialog (null, "Os números digitados entre 100 e 200 foram: "
         + contador);
   }
}