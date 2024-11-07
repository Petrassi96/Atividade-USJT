import javax.swing.JOptionPane;
public class Teste 
{
    public static void main (String args[])
    {
        String nome = JOptionPane.showInputDialog ("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String endereco = JOptionPane.showInputDialog ("Endereço");
        String telefone = JOptionPane.showInputDialog ("Telefone");

        Pessoa pessoa = new Pessoa(nome, idade, endereco, telefone);

        String msg = "Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade()
        + "\nEndereço: " + pessoa.getEndereco() + "\nTelefone: " + pessoa.getTelefone()
        + "\nMaior de idade: " + (pessoa.isMaiorDeIdade() ? "Sim" : "Não");

        JOptionPane.showMessageDialog(null, msg);
    }
}