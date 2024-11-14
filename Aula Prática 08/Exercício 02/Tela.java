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
    private JLabel lblRelogio;
    private JButton btnTicTac, btnMinuto, btnHora, btnSair;

    private Relogio relogio;
    
    public Tela()
    {
        super("Relógio");

        relogio = new Relogio();

        //Painel do relógio
        JPanel painelEntrada = new JPanel(new FlowLayout());
        lblRelogio = new JLabel();
        lblRelogio.setText(relogio.mostra());
        painelEntrada.add(lblRelogio);

        //Atribuindo os botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnMinuto = new JButton("Adicionar minutos");
        btnHora = new JButton("Adicionar horas");
        btnTicTac = new JButton("Aumentar 1 minuto");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnMinuto);
        painelBotoes.add(btnHora);
        painelBotoes.add(btnTicTac);
        painelBotoes.add(btnSair);

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.CENTER);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        //Adicionando Listeners aos botões
        btnMinuto.addActionListener(this);
        btnHora.addActionListener(this);
        btnTicTac.addActionListener(this);
        btnSair.addActionListener(this);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnTicTac)
            {
                relogio.ticTac();
                lblRelogio.setText(relogio.mostra());
            }
            else if(e.getSource() == btnMinuto)
            {
                int minuto = Integer.parseInt(JOptionPane.showInputDialog("Acrescente minutos."));
                for(int i = 0; i <= minuto; i++)
                {
                    relogio.minuto.incrementa();
                }
                lblRelogio.setText(relogio.mostra());
            }
            else if(e.getSource() == btnHora)
            {
                int hora = Integer.parseInt(JOptionPane.showInputDialog("Acrescente horas."));
                for (int i = 0; i < hora; i++) 
                {
                    relogio.hora.incrementa();
                }
                lblRelogio.setText(relogio.mostra());
            }
            else if(e.getSource() == btnSair)
            {
                System.exit(0);
            }
        }
}
