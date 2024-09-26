import javax.swing.JOptionPane;
public class Pratica02_Ex7_Aceita
{
   public static void main (String [] args)
   {
      String sNome = JOptionPane.showInputDialog
      ("Digite seu nome");
      String sSexo = JOptionPane.showInputDialog
      ("Digite o sexo");
      String sIdade = JOptionPane.showInputDialog
      ("Digite sua idade");
      
      char sexo = sSexo.charAt(0);
      int idade = Integer.parseInt(sIdade);
      
      if (idade < 25 && sexo == ('f') || sexo == ('F'))
      {
         JOptionPane.showMessageDialog (null, sNome + ":" + " Aceita");
      }
      else
      {
         JOptionPane.showMessageDialog (null, sNome + ":" + " Não aceita");
      }
   }
}