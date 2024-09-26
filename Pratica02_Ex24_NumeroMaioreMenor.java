import javax.swing.JOptionPane;
public class Pratica02_Ex24_NumeroMaioreMenor
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número");
      String sNumero4 = JOptionPane.showInputDialog
      ("Digite o quarto número");
      String sNumero5 = JOptionPane.showInputDialog
      ("Digite o quinto número");
      
      int n1 = Integer.parseInt(sNumero1);
      int n2 = Integer.parseInt(sNumero2);
      int n3 = Integer.parseInt(sNumero3);
      int n4 = Integer.parseInt(sNumero4);
      int n5 = Integer.parseInt(sNumero5);
      
      int maior = n1;
      int menor = n1;
      
      if (n2 > maior)
      {
         maior = n2;
      }
      if (n2 < menor)
      {
         menor = n2;
      }
      
      if (n3 > maior)
      {
         maior = n3;
      }
      if (n3 < menor)
      {
         menor = n3;
      }
      
      if (n4 > maior)
      {
         maior = n4;
      }
      if (n4 < menor)
      {
         menor = n4;
      }
      
      if (n5 > maior)
      {
         maior = n5;
      }
      if (n5 < menor)
      {
         menor = n5;
      }
           
         JOptionPane.showMessageDialog (null, "O maior número é: " + maior + 
         ". E o menor número é: " + menor);
   }
}