//(Página 2) Exercício 6 
import javax.swing.JOptionPane;
public class P2_Ex6_Ler_Inteiros
{
   public static void main (String[] aaaa)
   {
     // Criar string 
     String sN1 = JOptionPane.showInputDialog 
     ("Digite o primeiro número");
     String sN2 = JOptionPane.showInputDialog
     ("Digite o segundo número");
     String sN3 = JOptionPane.showInputDialog
     ("Digite o terceiro número");
     String sN4 = JOptionPane.showInputDialog
     ("Digite o quarto número");
     
     //Definindo o caractere
     char milhar = sN1.charAt (0);
     char centena = sN2.charAt (0);
     char dezena = sN3.charAt (0);
     char unidade = sN4.charAt (0);
     
     //Apresentando os resultdos
     JOptionPane.showMessageDialog (null, "O valor do número digitado é: " + milhar + centena + dezena + unidade);
   }
}