import javax.swing.JOptionPane;
public class Pratica02_Ex23_NumerosNasVariaveis
{
   public static void main (String [] args)
   {
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número");
      
      double n1 = Double.parseDouble(sNumero1);
      double n2 = Double.parseDouble(sNumero2);
      double n3 = Double.parseDouble(sNumero3);
      
      double menor = n1;
      double intermediario = n2;
      double maior = n3;
      
      if (n2 < n1 && n2 < n3)
      {
         menor = n2;
      }
      
      if (n3 < n2 && n3 < n1)
      {
         menor = n3;
      }
      
      if (n1 > n2 && n1 < n3)
      {
         intermediario = n1;
      }
      
      if (n1 > n3 && n1 < n2)
      {
         intermediario = n1;
      }
      
      if (n2 > n1 && n2 < n3)
      {
         intermediario = n2;
      }
      
      if (n2 > n3 && n2 < n1)
      {
         intermediario = n2;
      }
      
      if (n3 > n2 && n3 < n1)
      {
         intermediario = n3;
      }
      
      if (n3 > n1 && n3 < n2)
      {
         intermediario = n3;
      }
      
      if (n2 > n1 && n2 > n3)
      {
         maior = n2;
      }
       if (n1 > n2 && n1 > n3)
       {
         maior = n1;
       }
      
      JOptionPane.showMessageDialog (null, "O menor número é: " + menor + " O número intermediário é: "
      + intermediario + " O maior número é: " + maior);
   }
}