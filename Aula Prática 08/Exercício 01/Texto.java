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

public class Texto extends JFrame implements ActionListener
{
    private JTextField txtTexto;
    private JLabel lblTexto;
    private JButton btnMostrar, btnLimpa, btnSair;

    public Texto()
    {
        super("Texto");

        JPanel painelEntrada = new JPanel(new FlowLayout());
        txtTexto = new JTextField(10);
        lblTexto = new JLabel("Digite um texto");

        painelEntrada.add(lblTexto);
        painelEntrada.add(txtTexto);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnMostrar = new JButton("Mostrar");
        btnLimpa = new JButton("Limpar");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnLimpa);
        painelBotoes.add(btnSair);

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.CENTER);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        //Adicionando os listeners aos botões
        btnMostrar.addActionListener(this);
        btnLimpa.addActionListener(this);
        btnSair.addActionListener(this);

        setSize(710, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnMostrar)
        {
            String texto = txtTexto.getText();

            if(texto.length() > 0)
            {
                JOptionPane.showMessageDialog(this, texto, "Texto", 
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
            else if(e.getSource() == btnLimpa)
            {
                txtTexto.setText("");
            }
            else if(e.getSource() == btnSair)
            {
                System.exit(0);
            }
    }
}