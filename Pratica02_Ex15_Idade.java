import javax.swing.JOptionPane;
public class Pratica02_Ex15_Idade
{
   public static void main (String [] args)
   {
      String sNascimento = JOptionPane.showInputDialog
      ("Digite seu ano de nascimento.");
      String sAtual = JOptionPane.showInputDialog
      ("Digite o ano atual.");
      
      int nascimento = Integer.parseInt(sNascimento);
      int atual = Integer.parseInt(sAtual);
      
      if (nascimento > atual)
      {
         JOptionPane.showMessageDialog (null, "Ano inválido.");
         return;
      }
      
      int idade = atual - nascimento;
      
      JOptionPane.showMessageDialog (null, "Você tem: " + idade + " anos de idade.");
   }
}