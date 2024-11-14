import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener
{
    private JTextField txtNome, txtSobrenome, txtCpf;
    private JTextField txtValorHora, txtHoras, txtValorTarefa, txtTarefas, txtSalario, txtComissao, txtSeguro;

    private JLabel lblNome, lblSobrenome, lblCpf;
    private JLabel lblValorHora, lblHoras, lblValorTarefa, lblTarefas, lblSalario, lblComissao, lblSeguroDesemprego;
    private JLabel lblSalarioMensalista, lblSalarioComissionado,
    lblSalarioHorista, lblSalarioTarefeiro, lblDesempregado;
    private JButton btnCalcular, btnLimpar, btnSair;

    public Tela()
    {
        super("Empregados");

        //Painel de entrada
        JPanel painelDadosEntrada = new JPanel(new GridLayout(10, 1));
        JPanel painelEntrada = new JPanel(new FlowLayout());

        //Campo de texto
        txtNome = new JTextField(10);
        txtSobrenome = new JTextField(10);
        txtCpf = new JTextField(10);

        txtSalario = new JTextField(10);
        txtComissao = new JTextField(10);
        txtHoras = new JTextField(10);
        txtValorHora = new JTextField(10);
        txtTarefas = new JTextField(10);
        txtValorTarefa = new JTextField(10);
        txtSeguro = new JTextField(10);

        lblNome = new JLabel("Nome:");
        lblSobrenome = new JLabel("Sobrenome:");
        lblCpf = new JLabel("CPF:");
        lblSalario = new JLabel("Salário Mensalista:");
        lblComissao = new JLabel("Comissão:");
        lblHoras = new JLabel("Horas Trabalhadas:");
        lblTarefas = new JLabel("Tarefas Realizadas:");
        lblValorHora = new JLabel("Valor por Hora:");
        lblValorTarefa = new JLabel("Valor por Tarefa:");
        lblSeguroDesemprego = new JLabel("Valor do seguro desemprego");

        //Adicionando ao Painel de entrada
        //JTextField
        painelDadosEntrada.add(lblNome);
        painelDadosEntrada.add(txtNome);
        painelDadosEntrada.add(lblSobrenome);
        painelDadosEntrada.add(txtSobrenome);
        painelDadosEntrada.add(lblCpf);
        painelDadosEntrada.add(txtCpf);
        painelDadosEntrada.add(lblValorHora);
        painelDadosEntrada.add(txtValorHora);
        painelDadosEntrada.add(lblHoras);
        painelDadosEntrada.add(txtHoras);
        painelDadosEntrada.add(lblValorTarefa);
        painelDadosEntrada.add(txtValorTarefa);
        painelDadosEntrada.add(lblTarefas);
        painelDadosEntrada.add(txtTarefas);
        painelDadosEntrada.add(lblSalario);
        painelDadosEntrada.add(txtSalario);
        painelDadosEntrada.add(lblComissao);
        painelDadosEntrada.add(txtComissao);
        painelDadosEntrada.add(lblSeguroDesemprego);
        painelDadosEntrada.add(txtSeguro);
        
        painelEntrada.add(painelDadosEntrada);

        //Painel de saída das informações
        JPanel painelDadosSaida = new JPanel(new GridLayout(10,2));
        JPanel painelSaida = new JPanel(new FlowLayout());

        lblNome = new JLabel("Nome: ");
        lblSobrenome = new JLabel("Sobrenome: ");
        lblCpf = new JLabel("CPF: ");
        lblSalarioMensalista = new JLabel("Salário do Mensalista: ");
        lblSalarioComissionado = new JLabel("Salário do Comissionado: ");
        lblSalarioHorista = new JLabel("Salário do Horista: ");
        lblSalarioTarefeiro = new JLabel("Salário do Tarefeiro: ");
        lblSeguroDesemprego = new JLabel("Seguro desemprego: ");

        painelDadosSaida.add(lblNome);
        painelDadosSaida.add(lblSobrenome);
        painelDadosSaida.add(lblCpf);
        painelDadosSaida.add(lblSalarioMensalista);
        painelDadosSaida.add(lblSalarioComissionado);
        painelDadosSaida.add(lblSalarioHorista);
        painelDadosSaida.add(lblSalarioTarefeiro);
        painelDadosSaida.add(lblSeguroDesemprego);

        painelSaida.add(painelDadosSaida);

        //Painel dos botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnCalcular = new JButton("Calcular");
        btnLimpar= new JButton("Limpar");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnCalcular);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        //Montando a tela final
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.WEST);
        caixa.add(painelSaida, BorderLayout.EAST);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        //Atribuindo listeners aos botões
        btnCalcular.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        //Finalizações
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnCalcular)
        {
            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();

            String salarioMensalista = "";
            String salarioComissionado = "";
            String salarioHorista = "";
            String salarioTarefeiro = "";
            String seguroDesemprego = "";

            if(!txtSalario.getText().isEmpty())
            {
                double salario = Double.parseDouble(txtSalario.getText());
                Mensalista mensalista = new Mensalista(nome, sobrenome, cpf, salario);
                salarioMensalista = "R$:" + mensalista.getSalario(); 
            }
            else
            {
                salarioMensalista = "N/A";
            }

            if(!txtComissao.getText().isEmpty())
            {
                double salario = Double.parseDouble(txtSalario.getText());
                double comissao = Double.parseDouble(txtComissao.getText());
                Comissionado comissionado = new Comissionado(nome, sobrenome, cpf, salario, comissao);
                salarioComissionado = "R$:" + comissionado.getSalario();
            }
            else
            {
                salarioComissionado = "N/A";
            }

            if(!txtHoras.getText().isEmpty() && !txtValorHora.getText().isEmpty())
            {
                int horasTrabalhadas = Integer.parseInt(txtHoras.getText());
                double valorHora = Double.parseDouble(txtValorHora.getText());
                Horista horista = new Horista(nome, sobrenome, cpf);
                horista.setHorasTrabalhadas(horasTrabalhadas);
                horista.setValorHora(valorHora);
                salarioHorista = "R$: " + horista.getSalario();
            }
            else
            {
                salarioHorista = "N/A";
            }

            if(!txtTarefas.getText().isEmpty() && !txtValorTarefa.getText().isEmpty())
            {
                int tarefas = Integer.parseInt(txtTarefas.getText());
                double valorTarefa = Double.parseDouble(txtValorTarefa.getText());
                Tarefeiro tarefeiro = new Tarefeiro(nome, sobrenome, cpf, tarefas, valorTarefa);
                salarioTarefeiro = "R$: " + tarefeiro.getSalario();
            }
            else
            {
                salarioTarefeiro = "N/A";
            }

            if(!txtSeguro.getText().isEmpty())
            {
                double seguro = Double.parseDouble(txtSeguro.getText());
                Desempregado desempregado = new Desempregado(nome, sobrenome, cpf, seguro);
                seguroDesemprego = "R$: " + desempregado.getSeguroDesemprego();
            }
            else
            {
                seguroDesemprego = "N/A";
            }
            
            lblNome.setText("Nome: " + nome);
            lblSobrenome.setText("Sobrenome: " + sobrenome);
            lblCpf.setText("CPF: " + cpf);
            lblSalarioMensalista.setText("Salário do Mensalista: " + salarioMensalista);
            lblSalarioComissionado.setText("Salário do Comissionado: " + salarioComissionado);
            lblSalarioHorista.setText("Salário do Horista: " + salarioHorista);
            lblSalarioTarefeiro.setText("Salário do Tarefeiro: " + salarioTarefeiro);
            lblSeguroDesemprego.setText("Seguro desemprego" + seguroDesemprego);
        }

            if(e.getSource() == btnLimpar)
            {
                txtNome.setText("");
                txtSobrenome.setText("");
                txtCpf.setText("");
                txtSalario.setText("");
                txtComissao.setText("");
                txtValorHora.setText("");
                txtValorTarefa.setText("");
                txtHoras.setText("");
                txtTarefas.setText("");
            }
            else if(e.getSource() == btnSair)
            {
                System.exit(0);
            }
        }
    }
