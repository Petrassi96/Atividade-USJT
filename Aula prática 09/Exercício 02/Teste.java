import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste 
{
    public static void main (String [] args)
    {
        Deposito deposito = new Deposito();
        
        String dono;
        String corredor;
        int menu;
        int posicao;

        
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções"
            + "\nOpção 1: Adicionar caixa" + "\nOpção 2: Remover caixa" + "\nOpção 3: Procurar caixa"
            + "\nOpção 4: Alterar caixa" + "\nOpção 5: Listar caixas com mais de 10Kg"
            + "\nOpção 6: Sair"));

            if(menu == 1)
            {
                corredor = JOptionPane.showInputDialog("Informe o corredor");
                posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa"));
                dono = JOptionPane.showInputDialog("Dono");

                deposito.addCaixa(dono, corredor, peso);
            }
            else if(menu == 2)
            {
                dono = JOptionPane.showInputDialog("Nome do dono");
                if(deposito.removeCaixa(dono))
                {
                    JOptionPane.showMessageDialog(null, "Removido");
                }
            }
            else if(menu == 3)
            {
                dono = JOptionPane.showInputDialog("Nome do dono");
                posicao = deposito.encontraCaixa(dono);
                if(posicao >= 0)
                {
                    JOptionPane.showMessageDialog(null, "Encontrado em "
                    +posicao);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Nao encontrado");
                }
            }
            else if(menu == 4)
            {
                dono = JOptionPane.showInputDialog("Nome do dono");
                corredor = JOptionPane.showInputDialog("Novo corredor");
                int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Nova posição"));

                if(deposito.alterarCaixa(corredor, dono, novaPosicao))
                {
                    JOptionPane.showMessageDialog(null, "Corredor e posição alterados");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Não encontrada");
                }
            }
            else if(menu == 5)
            {
                double pesoLimite = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso limite"));

                ArrayList<Caixa> caixas = deposito.listarCaixas(pesoLimite);

                if(caixas.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Nenhuma caixa com peso maior que: "
                    + pesoLimite);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Caixas com mais de: "
                    + pesoLimite + caixas.toString());
                }
            }
        }
            while(menu != 6);
    }    
}
