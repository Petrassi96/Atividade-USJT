import javax.swing.JOptionPane;
public class Pratica03_Ex25
{
   public static void main (String [] args)
   {
      int contador = 0;
      int candidato1 = 0;
      int candidato2 = 0;
      int candidato3 = 0;
      int candidato4 = 0;
      double percentual1 = 0;
      double percentual2 = 0;
      double percentual3 = 0;
      double percentual4 = 0;
      
      while (true)
      {
         int voto = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite seu voto. (Ou digite -1 para encerrar)" + "\nCandidato 1 - 1" + "\nCandidato 2 - 2"
          + "\nCandidato 3 - 3" + "\nCandidato 4 - 4"));
         
         if (voto == -1)
         {
            break;
         }
         contador++;
         
         if (voto == 1)
         {
            candidato1++;
         }
         if (voto == 2)
         {
            candidato2++;
         }
         if (voto == 3)
         {
            candidato3++;
         }
         if (voto == 4)
         {
            candidato4++;
         }
         if (voto < 1 || voto > 4)
         {
            JOptionPane.showMessageDialog (null, "Candidato inválido.");
            contador--;
         }
      }
            percentual1 = (candidato1 / (double) contador) * 100;
            percentual2 = (candidato2 / (double) contador) * 100;
            percentual3 = (candidato3 / (double) contador) * 100;
            percentual4 = (candidato4 / (double) contador) * 100;
            
            String resultado = "O candidato 1 teve: " + percentual1 + "%" + "de votos."
                           + "\nO candidato 2 teve: " + percentual2 + "%" + " de votos."
                           + "\nO candidato 3 teve: " + percentual3 + "%" + " de votos."
                           + "\nO candidato 4 teve: " + percentual4 + "%" + " de votos."
                           + "\nO total de votos foram: " + contador;
            
            JOptionPane.showMessageDialog (null, resultado);
   }
}
         