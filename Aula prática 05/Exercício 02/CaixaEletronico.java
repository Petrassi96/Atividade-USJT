import javax.swing.JOptionPane;
public class CaixaEletronico 
{
    public static void main (String [] args)
    {
        String nome = JOptionPane.showInputDialog
        ("Digite seu nome");
        String cpf = JOptionPane.showInputDialog
        ("Digite seu cpf");
        int numConta = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o número da conta, sem o dígito"));
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o número da agência, sem o dígito."));
        
        double saldo = 150.00;

        //Criando os objetos
        Agencia agencia = new Agencia (nome, numAgencia);
        ContaCorrente contaCorrente = new ContaCorrente (numConta, saldo, agencia);
        Cliente cliente = new Cliente (nome, cpf, contaCorrente);
        
        //Montando a mensagem
        String mensagem = "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf()
        + "\n" + contaCorrente.imprimirSaldo();

        //Mostrando a conta
        JOptionPane.showMessageDialog (null, mensagem);

        //Fazenddo o loop para operações
        while(true)
        {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada" + "\nOpção 1 - Fazer um saque"
            + "\nOpção 2 - Fazer um depósito" + "\nOpção 3 - Consultar saldo" + "\nOpção 0 - Encerrar"));

            if (opcao == 1)
            {
                double saque = Double.parseDouble(JOptionPane.showInputDialog
                (null, "Digite o valor do saque"));

                if(saque <= contaCorrente.getSaldo())
                {
                    JOptionPane.showMessageDialog (null, "Saque realizado com sucesso");
                    contaCorrente.sacar(saque);
                }
                else if (saque > contaCorrente.getSaldo())
                {
                    JOptionPane.showMessageDialog(null, "Saldo indisponível");
                }
            }

                if (opcao == 2)
                {
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
                    contaCorrente.depositar(deposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado");
                }

                if (opcao == 3)
                {
                    JOptionPane.showMessageDialog(null, contaCorrente.consultarSaldo());
                }

                if (opcao == 0)
                {
                    break;
                }

                if (opcao > 3 || opcao < 0)
                {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    continue;
                }
        }
            mensagem = "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf()
            + "\n" + contaCorrente.imprimirSaldo();

            //Apresentando final
            JOptionPane.showMessageDialog (null, mensagem);
    }
}
