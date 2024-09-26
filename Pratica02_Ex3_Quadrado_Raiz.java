import javax.swing.JOptionPane;
public class Pratica02_Ex3_Quadrado_Raiz
{
   public static void main (String [] args)
   {
      //Lendo os dados
      String sNumero = JOptionPane.showInputDialog
      ("Digite um número positivo ou negativo");
      
      //Convertendo em número
      double numero = Double.parseDouble(sNumero);
      
      //Condições
      if (numero > 0)
         {
            JOptionPane.showMessageDialog (null, "A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
         }
      
      if (numero < 0)
         {
            JOptionPane.showMessageDialog (null, "Este número ao quadrado é: " + Math.pow(numero,2));
         }
    }
}