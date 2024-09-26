import javax.swing.JOptionPane;
public class Pratica03_Ex10_Divisores
{
    public static void main(String[] args) 
    {
        while (true)
        {
           String sNumero = JOptionPane.showInputDialog
           ("Digite um número. (Ou digite -999 para encerrar.");
           
           int numero = Integer.parseInt(sNumero);
           
           StringBuilder divisores = new StringBuilder("Divisores de " + numero + " são: ");
   
           for (int i = 1; i <= numero; i++) 
           {
               if (numero % i == 0) 
               {
                   divisores.append(i).append(" ");
               }
           }
           
           if (sNumero.equalsIgnoreCase ("-999"))
           {
               break;
           }
           else
           {
               JOptionPane.showMessageDialog(null, divisores.toString());
           }
        }
    }
}
