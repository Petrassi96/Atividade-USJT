//(Página 2) Exercício 2 
import javax.swing.JOptionPane;
public class P2_Ex2_Mostrar_Numero
{
   public static void main (String [] args)
   {
   
      //Criando a String
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número inteiro");
      
      //Convertendo a string
      int numero = Integer.parseInt (sNumero);
      
      //Apresentando na tela
      JOptionPane.showMessageDialog (null, "O valor do número digitado é: " + numero);
    }
}