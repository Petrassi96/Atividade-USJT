import javax.swing.JOptionPane;
public class Pratica03_Ex26
{
   public static void main (String [] args)
   {
      while (true)
      {
         int numero1 = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite um número inteiro."));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite um número inteiro."));
         int menu = Integer.parseInt(JOptionPane.showInputDialog
         ("Escolha uma das opções: \n" + "1 - Adição. \n" + "2 - Subtração. \n"
         + "3 - Multiplicação. \n" + "4 - Divisão. \n" + "9 - Sair do Programa."));
         
         int resultado = 0;
         
         if (menu == 1)
         {
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog (null, resultado);
         }
         if (menu == 2)
         {
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog (null, resultado);
         }
         if (menu == 3)
         {
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog (null, resultado);
         }
         if (menu == 4)
         {
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog (null, resultado);
         }
         if (menu == 9)
         {
            JOptionPane.showMessageDialog (null, "Encerrando sessão.");
            break;
         }
         if (menu == 0)
         {
            JOptionPane.showMessageDialog (null, "Opção inválida.");
            continue;
         }
      }
   }
}
      