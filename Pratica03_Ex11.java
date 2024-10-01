import javax.swing.JOptionPane;
public class Pratica03_Ex11
{
   public static void main (String [] args)
   {
      int contador = 0;
      double total1 = 0;
      double total2 = 0;
      double total3 = 0;
      double totalConsumo = 0;
      double media = 0;
      double residencial = 0.3;
      double comercial = 0.5;
      double industrial = 0.7;
      
      while (true)
      {
         int codigo = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite o código do consumidor."));
         if (codigo < 0 || codigo > 3)
         {
            JOptionPane.showMessageDialog (null, "Consumidor inválido.");
            continue;
         }
         if (codigo == 0)
         {
            break;
         }
         
         double consumo = Double.parseDouble(JOptionPane.showInputDialog
         ("Digite a quantidade de kWh consumidas."));
         
         if (codigo == 1)
         {
            total1 = total1 + residencial * consumo;
            contador++;
         }
         if (codigo == 2)
         {
            total2 = total2 + comercial * consumo;
            contador++;
         }
         if (codigo == 3)
         {
            total3 = total3 + industrial * consumo;
            contador++;
         }
         
         totalConsumo = total1 + total2 + total3;
         media = (total1 + total2) / contador;
      }
      
         JOptionPane.showMessageDialog (null, "O custo total de cada consumidor foi: "
         + "\nResidêncial: " + total1 + "\nComercial: " + total2 + "\nIndustrial: "
         + total3 + "\nO total de consumo dos três tipos foi: " + totalConsumo +
         "\nA média de consumo do residência e do comercial foi: " + media);
   }
}