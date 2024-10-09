import javax.swing.JOptionPane;
public class Pratica04_Ex3_TesteProduto
{
   public static void main (String [] arssg)
   {
      String nome = JOptionPane.showInputDialog
      ("Nome do produto.");
      double preco = Double.parseDouble(JOptionPane.showInputDialog
      ("Preço do produto."));
      int quantidade = Integer.parseInt(JOptionPane.showInputDialog
      ("Quantidade de produtos."));
      
      //Criar o objeto
      Produto produto = new Produto (nome, preco, quantidade);
      
      //Montando a String de saída
      String fim = "Produto: " + produto.getNome() + "\nPreço: R$"
      + produto.getPreco() + "\nQuantidade de produtos: " + produto.getQuantidade();
      
      //Mostrando na tela
      JOptionPane.showMessageDialog (null, fim);
   }
}