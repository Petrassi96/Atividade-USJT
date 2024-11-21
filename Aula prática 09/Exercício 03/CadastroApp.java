import javax.swing.JOptionPane;

public class CadastroApp 
{
    public static void main (String [] args)
    {
        BancoDeClientes bancoDeClientes = new BancoDeClientes();

        int menu;
        String nome;
        String fone;
        int id;

        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções"
            + "\nOpção 1: Adicionar cliente" + "\nOpção 2: Remover cliente" + "\nOpção 3: Procurar cliente"
            + "\nOpção 4: Alterar cliente" + "\nOpção 5: Listar clientes"));

            if(menu == 1)
            {
                nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                fone = JOptionPane.showInputDialog("Telefone do cliente");
                id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente"));

                bancoDeClientes.addCliente(nome, fone, id);
            }

            else if(menu == 2)
            {
                nome = JOptionPane.showInputDialog("Nome do cliente");

                if(bancoDeClientes.removeCliente(nome))
                {
                    JOptionPane.showMessageDialog(null,"Cliente removido");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                }
            }
            else if(menu == 3)
            {
                nome = JOptionPane.showInputDialog("Nome do cliente");
                String clientes = bancoDeClientes.mostrarCliente(nome);

                JOptionPane.showMessageDialog(null, clientes);
            }
            else if(menu == 4)
            {
                nome = JOptionPane.showInputDialog("Nome do cliente");
                fone = JOptionPane.showInputDialog("Telefone do cliente");
                id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente"));

                if(bancoDeClientes.alterarCliente(nome, fone, id))
                {
                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                }
            }
            else if(menu == 5)
            {
                if(bancoDeClientes.listarClientes().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Não há clientes");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, bancoDeClientes.listarClientes());
                }
            }
        }
        while(menu != 0);
    }
}
