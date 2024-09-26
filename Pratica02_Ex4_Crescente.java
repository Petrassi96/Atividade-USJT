import javax.swing.JOptionPane;
public class Pratica02_Ex4_Crescente
{
   public static void main (String [] args)
   {
      //Lendo os daods
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número.");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número");
      
      //Convertendo para números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      int numero3 = Integer.parseInt(sNumero3);
      
      int primeiro = numero1;
      int segundo = numero2;
      int terceiro = numero3;
      
      //Condições
      if (numero2 < numero1 && numero2 < numero3)
      {
         primeiro = numero2;
      }
      
      if (numero3 < numero2 && numero3 < numero1)
      {
         primeiro = numero3;
      }
      
      if (numero1 > numero2 && numero1 < numero3)
      {
         segundo = numero1;
      }
      
      if (numero1 > numero3 && numero1 < numero2)
      {
         segundo = numero1;
      }
      
      if (numero2 > numero1 && numero2 < numero3)
      {
         segundo = numero2;
      }
      
      if (numero2 > numero3 && numero2 < numero1)
      {
         segundo = numero2;
      }
      
      if (numero3 > numero2 && numero3 < numero1)
      {
         segundo = numero3;
      }
      
      if (numero3 > numero1 && numero3 < numero2)
      {
         segundo = numero3;
      }
      
      if (numero2 > numero1 && numero2 > numero3)
      {
         terceiro = numero2;
      }
       if (numero1 > numero2 && numero1 > numero3)
       {
         terceiro = numero1;
       }
       
         JOptionPane.showMessageDialog (null, "A ordem crescente dos número é: " 
         + primeiro + " " + segundo + " " + terceiro);
   }
}